#!/usr/bin/env bash

#get the root directory
rootDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
echo "rootdir: $rootDir"

rootdiffs=$rootDir"/diffs"
rootdtjsons=$rootDir"/dtjsons"
rootlogs=$rootDir"/logs"
rootmodule=$rootDir"/module"
rootoutput=$rootDir"/output"
rootpkg=$rootDir"/pkg"
rootroots=$rootDir"/roots"
rootsubdiffs=$rootDir"/subdiffs"
rootsubxmls=$rootDir"/subxmls"
rootreflection=$rootDir"/reflection"
rootxmls=$rootDir"/xmls"
rootallFields=$rootDir"/allFields"
rootdiffFields=$rootDir"/diffFields"

 if [ ! -d "$rootdiffs" ]; then
      echo "rootdiffs: $rootdiffs dose not exit"
      mkdir -p "$rootdiffs"
 fi

 if [ ! -d "$rootdtjsons" ]; then
      echo "rootdtjsons: $rootdtjsons dose not exit"
      mkdir -p "$rootdtjsons"
 fi

 if [ ! -d "$rootlogs" ]; then
      echo "rootlogs: $rootlogs dose not exit"
      mkdir -p "$rootlogs"
 fi

 if [ ! -d "$rootmodule" ]; then
      echo "rootmodule: $rootmodule dose not exit"
      mkdir -p "$rootmodule"
 fi

 if [ ! -d "$rootoutput" ]; then
      echo "rootoutput: $rootoutput dose not exit"
      mkdir -p "$rootoutput"
 fi

 if [ ! -d "$rootpkg" ]; then
      echo "rootpkg: $rootpkg dose not exit"
      mkdir -p "$rootpkg"
 fi

 if [ ! -d "$rootroots" ]; then
      echo "rootroots: $rootroots dose not exit"
      mkdir -p "$rootroots"
 fi

 if [ ! -d "$rootsubdiffs" ]; then
      echo "rootsubdiffs: $rootsubdiffs dose not exit"
      mkdir -p "$rootsubdiffs"
 fi

 if [ ! -d "$rootsubxmls" ]; then
      echo "rootsubxmls: $rootsubxmls dose not exit"
      mkdir -p "$rootsubxmls"
 fi

 if [ ! -d "$rootreflection" ]; then
      echo "rootreflection: $rootreflection dose not exit"
      mkdir -p "$rootreflection"
 fi

 if [ ! -d "$rootxmls" ]; then
      echo "rootxmls: $rootxmls dose not exit"
      mkdir -p "$rootxmls"
 fi

 if [ ! -d "$rootallFields" ]; then
      echo "rootallFields: $rootallFields dose not exit"
      mkdir -p "$rootallFields"
 fi

 if [ ! -d "$rootdiffFields" ]; then
      echo "rootdiffFields: $rootdiffFields dose not exit"
      mkdir -p "$rootdiffFields"
 fi



 

