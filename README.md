# ODRepair
scripts to run ODRepair

## Running ODRepair

The experiments directory contains all the necessary files to run the whole experiments. All the user need to provide is a file contains the corresponding test.

The victim file contains four column like the following example:

```
Thomas-S-B/visualee,88732d9dbe5031dad9c9f85a4c4b35e5f1551f95,.,de.strullerbaumann.visualee.dependency.boundary.DependencyContainerTest.testFindAllDependenciesWith
```

The input file that our experiments use is under /experiments/data/victim.csv. This file contains all the 327 tests in our experiments. We also provide a file named /data/test.csv which contains only 2 tests for simple use.

```shell
bash runAll.sh <path_to_input_file>
```

After running the shell script, all the results file, files that contain generated tests and files that contain patches can be automatically output.

## files generated for reference

* repos: contain all the necessaey tools with their correponding branch.
* output: store the result file that contains the polluter, time, polluted field (output/overall_results.csv); output/result.csv is the file that only contains the results for one vicim to fed to the next step.
* allFields: store the fields that exist in the passing order/failing order.
* diffFields: store the fields whose values are different between passing order and failing order.
* gen_tests: store the generated tests through Randoop.
* resetters: store the potential reset-methods found by Randoop.
* patches: store the patches that Patcher generates.
