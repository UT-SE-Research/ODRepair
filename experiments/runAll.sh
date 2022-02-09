#!/usr/bin/env bash

# NOTE: Use repository https://github.com/ChopinLi-cp/iDFlakies and branch idflakies4iFixPlus
# NOTE: Use repository https://github.com/ChopinLi-cp/testrunner and branch testrunner4iFixPlus
# NOTE: Use repository https://github.com/ChopinLi-cp/xstream and branch borrowState

echo "run iFixFlakies on all the projects in inputProj folder, based on the ifixflakies-testdata-uniqueodtest.csv"

currentDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
echo "$currentDir"

if [[ $1 == "" ]]; then
    echo "arg1 - full path to the victim csv file (eg. odtest_0.csv)"
    exit
fi

chmod +x $currentDir/runAll_new.sh

chmod +x $currentDir/run.py

chmod +x $currentDir/run-ifixflakies.sh

for t in $(cat $1)
do
  echo $t > $currentDir/tmp_victim.csv
  echo -n "" > $currentDir/output/result.csv
  bash runAll_new.sh $currentDir/tmp_victim.csv
  cat $currentDir/output/result.csv >> $currentDir/output/overall_results.csv
  python3 run.py
  bash run-ifixflakies.sh
  rm $currentDir/output/result.csv
  echo $t > $currentDir/tmp_victim.csv
done
