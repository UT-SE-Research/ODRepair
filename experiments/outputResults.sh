#!/usr/bin/env bash

if [[ $1 == "" ]] || [[ $2 == "" ]] || [[ $3 == "" ]]; then
    echo "arg1 - rootFold"
    echo "arg2 - allFieldsFold"
    echo "arg3 - diffFieldsFold"
    exit
fi

rootFold=$1
allFieldsFold=$2
diffFieldsFold=$3

root1=$rootFold"/1.txt"
field1=$allFieldsFold"/1.txt"
diffF=$diffFieldsFold"/0.txt"

getnum(){
  local arg1=$1
  if [ -f "$arg1" ]; then
    local num=$(grep "" -c $arg1)
    echo "$num"
  else 
    local num="null"
    echo "null"
  fi
}


root1num=$(getnum $root1)
field1num=$(getnum $field1)
diffFnum=$(getnum $diffF)

result=$field1num","$root1num","$diffFnum
echo "$result"

