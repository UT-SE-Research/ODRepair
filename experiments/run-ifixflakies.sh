#!/bin/bash

# Setup the necessary versions of iFixFlakies + dependencies accordingly
function setup() {
    mkdir -p repos/ # Stored in directory repos/
    (
        cd repos/

        # Get right branch of testrunner
        if [[ ! -d testrunner ]]; then
            git clone https://github.com/TestingResearchIllinois/testrunner
            (
                cd testrunner/
                git checkout -f interleave
                mvn clean install -DskipTests
            )
        fi

        # Get current version of iDFlakies
        if [[ ! -d iDFlakies ]]; then
            git clone https://github.com/idflakies/iDFlakies
            (
                cd iDFlakies/
                mvn clean install -DskipTests
            )
        fi

        # Get version of iFixFlakies that uses all the latest SNAPSHOT versions
        if [[ ! -d iFixFlakies ]]; then
            git clone https://github.com/TestingResearchIllinois/iFixFlakies
            (
                cd iFixFlakies/
                git checkout using-snapshot-versions
                mvn clean install -DskipTests
            )
        fi
    )
}

setup
CURRENTDIR=$(pwd)
MVNOPTIONS="-DskipTests -Dgpg.skip -Dcheckstyle.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true"

#python3 run.py # Do not rerun generation part, just use what is already there

for l in $(cat x-results.csv); do
    # Skip if header
    if [[ ${l} == \#* ]]; then
        continue
    fi

    url=$(echo ${l} | cut -d',' -f1)
    projdir=$(echo ${url} | cut -d'/' -f2)
    sha=$(echo ${l} | cut -d',' -f2)
    module=$(echo ${l} | cut -d',' -f3)
    victim=$(echo ${l} | cut -d',' -f4)
    polluter=$(echo ${l} | cut -d',' -f5)
    pkg=$(echo ${victim} | rev | cut -d'.' -f3- | rev)

    echo "$(date) ===> Running "${url}" "${victim}

    if [[ $(find gen_tests/${projdir} -name ${victim}) == "" ]]; then
        echo "NO GEN TESTS FOR ${victim}"
        continue
    fi
    (cd _downloads/${projdir}/; git checkout -f ${sha}; mvn clean install ${MVNOPTIONS} -pl ${module} -am;)
    for t in $(find $(find gen_tests/${projdir}/ -name ${victim}) -name TestGroup100Case0.java); do
        resetter=$(echo $t | cut -d'/' -f5)
        cp ${t} $(dirname $(find _downloads/${projdir}/${module}/ -name $(echo ${victim} | rev | cut -d'.' -f2 | rev).java))
        # Hack to remove the new JUnit stuff that's unneeded
        sed -i 's/import org.junit.FixMethodOrder;//' $(find _downloads/${projdir}/${module}/ -name TestGroup100Case0.java)
        sed -i 's/import org.junit.runners.MethodSorters;//' $(find _downloads/${projdir}/${module}/ -name TestGroup100Case0.java)
        sed -i 's/@FixMethodOrder(MethodSorters.NAME_ASCENDING)//' $(find _downloads/${projdir}/${module}/ -name TestGroup100Case0.java)

        # Modify project to include the testrunner and iFixFlakies
        (
            cd _downloads/${projdir}/
            git checkout -f ${sha}
            ${CURRENTDIR}/repos/iFixFlakies/pom-modify/modify-project.sh ${module}/

            if [[ ${projdir} == 'geronimo-batchee' ]]; then
                sed -i 's;<version>0.10;<version>0.11;' pom.xml
            fi

            if [[ ${projdir} == 'spring-boot' ]]; then
                sed -i 's;${disable.checks};true;' pom.xml
            fi

            # Set up the list of tests
            rm -rf ${module}/.dtfixingtools/    # In case of re-running in same place, remove prior data runs and start fresh
            mkdir -p ${module}/.dtfixingtools/
            echo "${victim}" > ${module}/.dtfixingtools/original-order
            echo "${polluter}" >> ${module}/.dtfixingtools/original-order

            # Run iDFlakies with just known polluter and victim
            mvn testrunner:testplugin ${MVNOPTIONS} -pl ${module}/ -Dtestplugin.className=edu.illinois.cs.dt.tools.detection.DetectorPlugin -Ddt.detector.original_order.all_must_pass=false -Ddt.randomize.rounds=5 |& tee id-log

            # Get all the generated tests into the list
            echo "${victim}" > ${module}/.dtfixingtools/original-order  # Writing again because prior run of iDFlakies would somehow eat some newline...
            echo "${polluter}" >> ${module}/.dtfixingtools/original-order
            for t in $(grep "void test" $(find ${module} -name TestGroup100Case0.java) | cut -d' ' -f7 | sed 's;(;;' | sed 's;);;'); do
                echo "${pkg}.TestGroup100Case0.${t}" >> ${module}/.dtfixingtools/original-order
            done

            # Run iFixFlakies with the interleave option, only finding first one
            mvn testrunner:testplugin ${MVNOPTIONS} -pl ${module}/ -Dtestplugin.className=edu.illinois.cs.dt.tools.fixer.CleanerFixerPlugin -Ddt.detector.original_order.all_must_pass=false -Dtestrunner.interleave=true -Ddt.find_all=false |& tee ifix-log

            rm -rf ${module}/.dtfixingtools-${victim}-${resetter}
            cp -r ${module}/.dtfixingtools/ ${module}/.dtfixingtools-${victim}-${resetter}
        )
        # copy patches out
        if [ -d "_downloads/${projdir}/${module}/.dtfixingtools-${victim}-${resetter}/fixer" ]; then
            if [[ $(find _downloads/${projdir}/${module}/.dtfixingtools-${victim}-${resetter}/fixer/ -name "*.patch" | xargs grep 'INLINE SUCCESSFUL' ) != "" ]]; then
                echo "*PATCH FOUND*";
                mkdir -p patches/${projdir}/${sha}/${victim}/${resetter}
                cp -r _downloads/${projdir}/${module}/.dtfixingtools-${victim}-${resetter} patches/${projdir}/${sha}/${victim}/${resetter}
                break
            fi
        fi
    done
done
