#!/usr/bin/env bash

if [[ $1 == "" ]] || [[ $2 == "" ]] || [[ $3 == "" ]]; then
    echo "arg1 - GitHub SLUG"
    echo "arg2 - Test name"
    echo "arg3 - xmls or dtjsons or roots or pkg or subxmls?"
    exit
fi

slug=$1
testName=$2

#get the root directory
rootDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
echo "rootdir: $rootDir"

projDir=$rootDir"/$3/"$slug

 if [ ! -d "$projDir" ]; then
      echo "projDir: $projDir dose not exit"
      IFS='/'
      #Read the split words into an array based on comma delimiter
      read -a strarr <<< "$slug"
      rootProj=$rootDir"/$3/"${strarr[0]}
      if [ -d "$rootProj" ]; then
        echo "rootProj $rootProj exits "
        mkdir -p "$projDir"
      else
        echo "rootProj $rootProj dose not exit"
        mkdir -p "$rootProj"
        mkdir -p "$projDir"
      fi
 fi
 
xmlTestDir=$projDir"/"$testName
 if [ -d "$xmlTestDir" ]; then
      echo "xmlTestDir: $xmlTestDir exits"
      rm -rf "$xmlTestDir"      
      mkdir -p "$xmlTestDir"
 else  
      echo "xmlTestDir: $xmlTestDir dose not exit"
      mkdir -p "$xmlTestDir"
 fi

