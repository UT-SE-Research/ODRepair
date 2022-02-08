#!/usr/bin/env bash

# NOTE: Use repository https://github.com/ChopinLi-cp/iDFlakies and branch idflakies4iFixPlus
# NOTE: Use repository https://github.com/ChopinLi-cp/testrunner and branch testrunner4iFixPlus
# NOTE: Use repository https://github.com/ChopinLi-cp/xstream and branch borrowState

echo "run iFixFlakies on all the projects in inputProj folder, based on the ifixflakies-testdata-uniqueodtest.csv"

if [[ $1 == "" ]]; then
    echo "arg1 - full path to the victim csv file (eg. odtest_0.csv)"
    exit
fi

chmod +x $currentDir/runAll_new.sh

chmod +x $currentDir/run.py

chmod +x $currentDir/run-ifixflakies.py

bash runAll_new.sh $1

python3 run.py

bash run-ifixflakies.sh

