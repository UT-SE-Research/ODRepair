#!/usr/bin/env bash

echo "*******************IFIXPLUS************************"
echo "Starting run_debugging_tools.sh"

git rev-parse HEAD
date

if [[ $1 == "" ]] || [[ $2 == "" ]] || [[ $3 == "" ]] || [[ $4 == "" ]]; then
    echo "arg1 - GitHub SLUG"
    echo "arg2 - sha"
    echo "arg3 - Test name"
    echo "arg4 - module name"
    exit
fi

slug=$1
sha=$2
testName=$3
moduleName0=$4

rootScriptDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )/"
echo "rootScriptDir: $rootScriptDir"
download_json_script=$rootScriptDir"/download-minimizer-results.sh"
createfolder_script=$rootScriptDir"/createfolders.sh"
createrootfolder_script=$rootScriptDir"/createrootfolders.sh"
pkg_filter_script=$rootScriptDir"/package_finder.py"
module_script=$rootScriptDir"/get_module_name.py"
outputResult_script=$rootScriptDir"/outputResults.sh"
echo "pkg_filter_script: $pkg_filter_script"

# create the root folders
bash $createrootfolder_script

# create the sub folders for the specific slug
bash $createfolder_script $slug $testName "xmls"
#bash $createfolder_script $slug $testName "dtjsons"
bash $createfolder_script $slug $testName "roots"
bash $createfolder_script $slug $testName "diffs"
bash $createfolder_script $slug $testName "pkg"
bash $createfolder_script $slug $testName "subxmls"
bash $createfolder_script $slug $testName "reflection"
bash $createfolder_script $slug $testName "logs"
bash $createfolder_script $slug $testName "module"
bash $createfolder_script $slug $testName "allFields"
bash $createfolder_script $slug $testName "diffFields"
bash $createfolder_script $slug $testName "subdiffs"

jsonFold=$rootScriptDir"/jsonFiles_0/"$testName 
echo "json folder: $jsonFold"
xmlFold=$rootScriptDir"/xmls/"$slug"/"$testName 
echo "xml folder: $xmlFold"
rootFold=$rootScriptDir"/roots/"$slug"/"$testName 
diffFold=$rootScriptDir"/diffs/"$slug"/"$testName 
pkgFold=$rootScriptDir"/pkg/"$slug"/"$testName
subxmlFold=$rootScriptDir"/subxmls/"$slug"/"$testName
reflectionFold=$rootScriptDir"/reflection/"$slug"/"$testName
output=$rootScriptDir"/output/result.csv"
logFold=$rootScriptDir"/logs/"$slug"/"$testName
logFile=$logFold"/log"
moduleFold=$rootScriptDir"/module/"$slug"/"$testName
moduleFile=$moduleFold"/module"
allFieldsFold=$rootScriptDir"/allFields/"$slug"/"$testName 
diffFieldsFold=$rootScriptDir"/diffFields/"$slug"/"$testName 
subdiffsFold=$rootScriptDir"/subdiffs/"$slug"/"$testName 
interleave=true

# this json has just the polluter for the failing order
json=$jsonFold"/flaky-lists.json"
#cd $jsonFold"/minimized/"
json2=""
#echo "json2: $json2"

# dir of the input project which is downloaded and whose pom.xml has been modified
rootDir=${rootScriptDir%/*}
# echo "ROOTDIR:",$rootDir
inputProjDir=$rootDir"/projectsInstall/projects/"$slug
# echo "INPUTPROJDIR:",$inputProjDir

# generate the package-filter file
# Used as whitelist to restrict capturing only classes in these packages, but not used right now
pkgFile=$pkgFold"/package-filter"
python $pkg_filter_script $inputProjDir > $pkgFile
echo "generated package-filter file $pkgFile"

if [[ ${moduleName0} == "." ]]; then
  moduleName=${inputProjDir}
else
  moduleName=${inputProjDir}/${moduleName0}
fi

# go to the input project directory
cd $moduleName
echo "moduleName: $moduleName"

# print header to the result file
printf '%s' "$slug,$sha,$moduleName0,$testName," >> $output

tmpfile=$rootScriptDir"/tmp"
# execute iFixPlus
MVNOPTIONS="-Ddependency-check.skip=true -Denforcer.skip=true -Drat.skip=true -Dmdep.analyze.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip -Dlicense.skip=true"
TESTRUNNERVERSION="1.3-SNAPSHOT"

mvn testrunner:testplugin ${MVNOPTIONS} -Ddetector.detector_type=random-class-method -Ddt.detector.original_order.all_must_pass=false -Dtestplugin.runner.capture_state=true -Dtestplugin.javaagent="${HOME}/.m2/repository/edu/illinois/cs/testrunner-running/${TESTRUNNERVERSION}/testrunner-running-${TESTRUNNERVERSION}.jar=$xmlFold,$subxmlFold,$rootFold,$pkgFile,$diffFold,$slug,$testName,$output,$allFieldsFold,$diffFieldsFold,$subdiffsFold,$tmpfile,$reflectionFold" -Dtestplugin.className=edu.illinois.cs.dt.tools.utility.iFixPlusPlugin -Dreplay.path=$json -Dreplay.path2=$json2 -Dreplay.dtname=$testName -Dreplay.subxmlFold=$subxmlFold -Dreplay.slug=$slug -Dreplay.output=$output -Dreplay.module=$moduleName -Dreplay.tmpfile=$tmpfile -Dreplay.diffFieldsFold=$diffFieldsFold -Dreplay.reflectionFold=$reflectionFold -Dtestrunner.interleave=$interleave > $logFile 2>&1

# output results
bash $outputResult_script $rootFold $allFieldsFold $diffFieldsFold >> $output


echo "*******************IFIXPLUS************************"
echo "Finished run_debugging_tools.sh"
date

