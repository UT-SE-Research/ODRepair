#!/usr/bin/env bash

# NOTE: Use repository https://github.com/ChopinLi-cp/iDFlakies and branch idflakies4iFixPlus
# NOTE: Use repository https://github.com/ChopinLi-cp/testrunner and branch testrunner4iFixPlus
# NOTE: Use repository https://github.com/ChopinLi-cp/xstream and branch borrowState

echo "run ODRepair based on the input file which contains the victim."

currentDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
echo "$currentDir"

if [[ $1 == "" ]]; then
    echo "arg1 - full path to the victim csv file (eg. data/victim.csv)"
    exit
fi

chmod +x $currentDir/runAll_new.sh

chmod +x $currentDir/run.py

chmod +x $currentDir/run-ifixflakies.sh

mkdir -p $currentDir/output

for t in $(cat $1)
do
    echo $t > $currentDir/tmp_victim.csv
    touch $currentDir/output/result.csv
    bash runAll_new.sh $currentDir/tmp_victim.csv
    cat $currentDir/output/result.csv >> $currentDir/output/overall_results.csv
    python3 run.py
    bash run-ifixflakies.sh
    rm $currentDir/output/result.csv
    echo $t > $currentDir/tmp_victim.csv
done
