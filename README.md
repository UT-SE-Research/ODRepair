# ODRepair
scripts to run ODRepair

## Running ODRepair

The experiments directory contains all the necessary files to run the whole experiments. All the user need to provide is a file contains the corresponding test.

The victim file contains four column like the following example:

|  project  | sha | module | victim |
| ---- | ---- | ---- | ---- |
|  Thomas-S-B/visualee | 88732d9dbe5031dad9c9f85a4c4b35e5f1551f95 | .	| de.strullerbaumann.visualee.dependency.boundary.DependencyContainerTest.testFindAllDependenciesWith |
|  ...      | ... | ...    | ...    |

```shell
bash runAll.sh <path_to_intput_file>
```

After running the shell script, all the results file, files that contain generated tests and files that contain patches can be automatically output.
