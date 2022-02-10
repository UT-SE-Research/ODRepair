package org.apache.hadoop.mapred;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta0 = null;
        org.apache.hadoop.conf.Configuration.DeprecationDelta[] deprecationDeltaArray1 = new org.apache.hadoop.conf.Configuration.DeprecationDelta[] { deprecationDelta0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.addDeprecations(deprecationDeltaArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deprecationDeltaArray1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.REDUCEMEMORY_MB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str0, "mapreduce.cluster.reducememory.mb");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.local.dir", path1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.CLASSIC_FRAMEWORK_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classic" + "'", str0, "classic");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.DELEGATION_TOKEN_RENEW_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.delegation.token.renew-interval" + "'", str0, "mapreduce.cluster.delegation.token.renew-interval");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.local.dir", "mapreduce.task.progress-report.interval", "java.io.tmpdir");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: mapreduce.cluster.local.dir://mapreduce.task.progress-report.interval./java.io.tmpdir");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_VIRTUAL_MEMORY_BYTES_MAX;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_VIRTUAL_MEMORY_BYTES_MAX + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_VIRTUAL_MEMORY_BYTES_MAX));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.job.local-fs.single-disk-limit.check.kill-limit-exceed", "", "mapreduce.cluster.local.dir");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: mapreduce.job.local-fs.single-disk-limit.check.kill-limit-exceed://./mapreduce.cluster.local.dir");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        boolean boolean0 = org.apache.hadoop.mapreduce.MRConfig.DEFAULT_MASTER_WEBAPP_UI_ACTIONS_ENABLED;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Object, java.lang.Enum<org.apache.hadoop.mapred.Task.Counter>> objCombineOutputCollector3 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Object, java.lang.Enum<org.apache.hadoop.mapred.Task.Counter>>(counter0, progressable1, configuration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MASTER_USER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.jobtracker.kerberos.principal" + "'", str0, "mapreduce.jobtracker.kerberos.principal");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MAPREDUCE_APP_SUBMISSION_CROSS_PLATFORM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.app-submission.cross-platform" + "'", str0, "mapreduce.app-submission.cross-platform");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        boolean boolean2 = org.apache.hadoop.fs.Path.isWindowsAbsolutePath("java.io.tmpdir", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        boolean boolean1 = org.apache.hadoop.conf.Configuration.isDeprecated("mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.WORKFLOW_TAGS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.workflow.tags" + "'", str0, "mapreduce.workflow.tags");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.TASK_LOCAL_OUTPUT_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.task.local.output.class" + "'", str0, "mapreduce.task.local.output.class");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        long long0 = org.apache.hadoop.mapreduce.MRConfig.DELEGATION_TOKEN_RENEW_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 86400000L + "'", long0 == 86400000L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.TEMP_DIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.temp.dir" + "'", str0, "mapreduce.cluster.temp.dir");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapred.Task.CombineOutputCollector<org.apache.hadoop.mapred.Task.Counter, java.lang.Comparable<java.lang.String>> counterCombineOutputCollector3 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<org.apache.hadoop.mapred.Task.Counter, java.lang.Comparable<java.lang.String>>(counter0, progressable1, configuration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.COMBINE_OUTPUT_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.COMBINE_OUTPUT_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.COMBINE_OUTPUT_RECORDS));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.WORKFLOW_ADJACENCY_PREFIX_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.workflow.adjacency." + "'", str0, "mapreduce.workflow.adjacency.");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_INPUT_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_INPUT_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_INPUT_RECORDS));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_VIRTUAL_MEMORY_BYTES_MAX;
        java.lang.Class<?> wildcardClass1 = counter0.getClass();
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_VIRTUAL_MEMORY_BYTES_MAX + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_VIRTUAL_MEMORY_BYTES_MAX));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MAPRED_IFILE_READAHEAD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.ifile.readahead" + "'", str0, "mapreduce.ifile.readahead");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        boolean boolean0 = org.apache.hadoop.mapreduce.MRConfig.SHUFFLE_SSL_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_SKIPPED_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_SKIPPED_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_SKIPPED_RECORDS));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        int int1 = org.apache.hadoop.mapred.JobConf.parseMaximumHeapSizeMB("mapreduce.cluster.delegation.token.renew-interval");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration(configuration0, writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        long long1 = org.apache.hadoop.mapred.JobConf.normalizeMemoryConfigValue((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPREDUCE_RECOVER_JOB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.job.restart.recover" + "'", str0, "mapreduce.job.restart.recover");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = org.apache.hadoop.fs.Path.CUR_DIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "." + "'", str0, ".");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.YARN_FRAMEWORK_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yarn" + "'", str0, "yarn");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.DEFAULT_MAPRED_TASK_JAVA_OPTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        int int0 = org.apache.hadoop.mapreduce.MRConfig.PROGRESS_STATUS_LEN_LIMIT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MAPREDUCE_MINICLUSTER_CONTROL_RESOURCE_MONITORING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.minicluster.control-resource-monitoring" + "'", str0, "mapreduce.minicluster.control-resource-monitoring");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.LOCAL_FRAMEWORK_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path7 = jobConf4.getLocalPath("mapreduce.minicluster.control-resource-monitoring", "mapreduce.minicluster.control-resource-monitoring");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No valid local directories in property: mapreduce.minicluster.control-resource-monitoring");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_PHYSICAL_MEMORY_BYTES_MAX;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_PHYSICAL_MEMORY_BYTES_MAX + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_PHYSICAL_MEMORY_BYTES_MAX));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.SPLIT_RAW_BYTES;
        java.lang.Class<?> wildcardClass1 = counter0.getClass();
        java.lang.String str2 = org.apache.hadoop.mapred.JobConf.findContainingJar((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.SPLIT_RAW_BYTES + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.SPLIT_RAW_BYTES));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar" + "'", str2, "/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        long long0 = org.apache.hadoop.mapreduce.MRConfig.DELEGATION_KEY_UPDATE_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 86400000L + "'", long0 == 86400000L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        boolean boolean2 = org.apache.hadoop.fs.Path.isWindowsAbsolutePath("mapreduce.task.progress-report.interval", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MR_ADMINS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.administrators" + "'", str0, "mapreduce.cluster.administrators");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        java.lang.String str2 = path1.getName();
        java.util.Optional<org.apache.hadoop.fs.Path> pathOptional3 = path1.getOptionalParentPath();
        org.apache.hadoop.fs.FileSystem fileSystem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path5 = path1.makeQualified(fileSystem4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str2, "mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertNotNull(pathOptional3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges8 = jobConf4.getRange("mapreduce.cluster.administrators", ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_RECORDS));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.addResource(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.apache.hadoop.conf.Configuration.addDeprecation("mapreduce.cluster.reducememory.mb", "mapreduce.cluster.temp.dir", "mapreduce.app-submission.cross-platform");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.lang.String str7 = jobConf4.getSessionId();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress11 = jobConf4.getSocketAddr("mapreduce.cluster.administrators", ".", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Does not contain a valid host:port authority: . (configuration property 'mapreduce.cluster.administrators')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_SKIPPED_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_SKIPPED_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_SKIPPED_RECORDS));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        boolean boolean11 = jobConf4.onlyKeyExists("mapreduce.jobtracker.kerberos.principal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jobConf4.getTimeDurationHelper("mapreduce.minicluster.control-resource-monitoring", "hi!", timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        boolean boolean2 = org.apache.hadoop.fs.Path.isWindowsAbsolutePath("mapreduce.workflow.tags", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.Class class6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.setJarByClass(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        org.apache.hadoop.conf.StorageUnit storageUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = jobConf4.getStorageSize("mapreduce.cluster.delegation.token.renew-interval", (double) (short) 1, storageUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Conversion unit cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.WORKFLOW_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.workflow.id" + "'", str0, "mapreduce.workflow.id");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_MAP_TASK_LOG_LEVEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.map.log.level" + "'", str0, "mapreduce.map.log.level");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        java.lang.String str2 = path1.getName();
        java.util.Optional<org.apache.hadoop.fs.Path> pathOptional3 = path1.getOptionalParentPath();
        int int4 = path1.depth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str2, "mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertNotNull(pathOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.util.Comparator, java.lang.String> comparatorCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.util.Comparator, java.lang.String>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MR_ACLS_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.acls.enabled" + "'", str0, "mapreduce.cluster.acls.enabled");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.apache.hadoop.conf.Configuration.dumpDeprecatedKeys();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.apache.hadoop.mapred.Reporter reporter0 = org.apache.hadoop.mapred.Reporter.NULL;
        org.junit.Assert.assertNotNull(reporter0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.fs.Path path5 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean6 = path5.isRoot();
        int int7 = path5.depth();
        int int8 = path1.compareTo(path5);
        int int9 = path5.depth();
        path5.validateObject();
        org.apache.hadoop.fs.Path path12 = path5.suffix("mapreduce.cluster.acls.enabled");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(path12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.Class<?> wildcardClass6 = jobConf5.getOutputKeyClass();
        jobConf5.setQueueName("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.tmpdir", "mapreduce.cluster.temp.dir" };
        jobConf5.setStrings("mapreduce.cluster.reducememory.mb", strArray12);
        java.lang.String str14 = org.apache.hadoop.mapred.Task.normalizeStatus("mapreduce.cluster.reducememory.mb", (org.apache.hadoop.conf.Configuration) jobConf5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str14, "mapreduce.cluster.reducememory.mb");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.apache.hadoop.conf.Configuration.addDefaultResource("mapreduce.app-submission.cross-platform");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.DEFAULT_QUEUE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setNumMapTasks(0);
        org.apache.hadoop.mapred.Task.Counter counter9 = org.apache.hadoop.mapred.Task.Counter.REDUCE_SKIPPED_GROUPS;
        jobConf4.setEnum("mapreduce.workflow.id", counter9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + counter9 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_SKIPPED_GROUPS + "'", counter9.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_SKIPPED_GROUPS));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_MAP_TASK_ENV;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.map.env" + "'", str0, "mapreduce.map.env");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.PROGRESS_STATUS_LEN_LIMIT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.task.max.status.length" + "'", str0, "mapreduce.task.max.status.length");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_INPUT_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_INPUT_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_INPUT_RECORDS));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        boolean boolean0 = org.apache.hadoop.mapreduce.MRConfig.DEFAULT_MAPREDUCE_APP_SUBMISSION_CROSS_PLATFORM;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_OUTPUT_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_OUTPUT_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_OUTPUT_RECORDS));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        int int0 = org.apache.hadoop.mapreduce.MRConfig.DEFAULT_MAPRED_IFILE_READAHEAD_BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4194304 + "'", int0 == 4194304);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.apache.hadoop.conf.Configuration.setRestrictSystemPropertiesDefault(false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_BYTES;
        java.lang.Class<?> wildcardClass1 = counter0.getClass();
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_BYTES + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_BYTES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.COMBINE_INPUT_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.COMBINE_INPUT_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.COMBINE_INPUT_RECORDS));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        org.apache.hadoop.fs.Path path10 = jobConf4.getLocalPath("local");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.WORKFLOW_ADJACENCY_PREFIX_PATTERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "^mapreduce\\.workflow\\.adjacency\\..+" + "'", str0, "^mapreduce\\.workflow\\.adjacency\\..+");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.SPILLED_RECORDS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.SPILLED_RECORDS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.SPILLED_RECORDS));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_SHUFFLE_BYTES;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_SHUFFLE_BYTES + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_SHUFFLE_BYTES));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        boolean boolean1 = org.apache.hadoop.conf.Configuration.hasWarnedDeprecation("^mapreduce\\.workflow\\.adjacency\\..+");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        jobConf4.setBooleanIfUnset("mapreduce.workflow.tags", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.net.InetSocketAddress inetSocketAddress13 = jobConf4.getSocketAddr("", "classic", (int) (short) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "mapreduce.ifile.readahead", "mapreduce.workflow.adjacency.", "mapreduce.job.restart.recover", "mapreduce.cluster.temp.dir", "mapreduce.cluster.reducememory.mb", "java.io.tmpdir", "mapreduce.workflow.adjacency.", "", "mapreduce.cluster.reducememory.mb", "mapreduce.cluster.temp.dir", "default", "mapreduce.cluster.local.dir" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Properties properties29 = jobConf4.getAllPropertiesByTags((java.util.List<java.lang.String>) strList27);
        long long30 = jobConf4.getMaxVirtualMemoryForTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1073741824L + "'", long30 == 1073741824L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_REDUCE_TASK_LOG_LEVEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.reduce.log.level" + "'", str0, "mapreduce.reduce.log.level");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        long long0 = org.apache.hadoop.mapred.Task.DEFAULT_COMBINE_RECORDS_BEFORE_PROGRESS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 10000L + "'", long0 == 10000L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        jobConf4.setMaxVirtualMemoryForTask((long) 10);
        org.apache.hadoop.mapred.JobPriority jobPriority12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.setJobPriority(jobPriority12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.FRAMEWORK_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.framework.name" + "'", str0, "mapreduce.framework.name");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setNumMapTasks(0);
        java.lang.String str8 = jobConf4.getJobName();
        jobConf4.setKeyFieldComparatorOptions("mapreduce.cluster.reducememory.mb");
        org.apache.hadoop.conf.Configuration configuration11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.addResource(configuration11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isAbsolute();
        org.apache.hadoop.mapred.JobConf jobConf3 = new org.apache.hadoop.mapred.JobConf(path1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration((org.apache.hadoop.conf.Configuration) jobConf3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.apache.hadoop.conf.Configuration.setRestrictSystemPropertiesDefault(true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.addResource(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        jobConf6.setMemoryForReduceTask((-1L));
        org.apache.hadoop.mapreduce.TaskType taskType13 = null;
        int int14 = jobConf6.getMemoryRequired(taskType13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1024 + "'", int14 == 1024);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.fs.Path path5 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean6 = path5.isRoot();
        int int7 = path5.depth();
        int int8 = path1.compareTo(path5);
        int int9 = path5.depth();
        path5.validateObject();
        int int11 = path5.depth();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        boolean boolean15 = jobConf6.getKeepFailedTaskFiles();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        boolean boolean0 = org.apache.hadoop.fs.Path.WINDOWS;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.DELEGATION_KEY_UPDATE_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.delegation.key.update-interval" + "'", str0, "mapreduce.cluster.delegation.key.update-interval");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.lang.String str7 = jobConf4.getSessionId();
        jobConf4.setInt("test.build.data", (int) (short) 100);
        boolean boolean11 = jobConf4.getReduceSpeculativeExecution();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        jobConf4.setKeyFieldComparatorOptions("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        boolean boolean23 = jobConf6.getCompressMapOutput();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        int int15 = jobConf6.getNumTasksToExecutePerJvm();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.WORKFLOW_NODE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.workflow.node.name" + "'", str0, "mapreduce.workflow.node.name");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setNumMapTasks(0);
        jobConf4.setMaxMapTaskFailuresPercent(0);
        org.apache.hadoop.fs.Path path11 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean12 = path11.isRoot();
        path11.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf14 = new org.apache.hadoop.mapred.JobConf(path11);
        org.apache.hadoop.io.RawComparator rawComparator15 = jobConf14.getOutputValueGroupingComparator();
        jobConf14.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass19 = jobConf14.getMapperClass();
        java.util.regex.Pattern pattern20 = jobConf14.getJarUnpackPattern();
        java.io.InputStream inputStream22 = jobConf14.getConfResourceAsInputStream(".");
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.addResource(inputStream22, "mapreduce.map.log.level", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character '.' (code 46) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rawComparator15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(pattern20);
        org.junit.Assert.assertEquals(pattern20.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_TASK_MAXVMEM_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapred.task.maxvmem" + "'", str0, "mapred.task.maxvmem");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        jobConf4.setDouble("mapreduce.reduce.log.level", (double) 86400000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_INPUT_BYTES;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_INPUT_BYTES + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_INPUT_BYTES));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        org.apache.hadoop.fs.Path path24 = new org.apache.hadoop.fs.Path(path16, "^mapreduce\\.workflow\\.adjacency\\..+");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.apache.hadoop.mapred.TestTaskProgressReporter testTaskProgressReporter0 = new org.apache.hadoop.mapred.TestTaskProgressReporter();
        testTaskProgressReporter0.testBytesWrittenRespectingLimit();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.task.max.status.length", "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: -agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%25s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.net.InetSocketAddress inetSocketAddress13 = jobConf4.getSocketAddr("", "classic", (int) (short) 100);
        java.lang.ClassLoader classLoader14 = null;
        jobConf4.setClassLoader(classLoader14);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration((org.apache.hadoop.conf.Configuration) jobConf4, "mapreduce.cluster.administrators", writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property mapreduce.cluster.administrators not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        long long0 = org.apache.hadoop.mapred.JobConf.DISABLED_MEMORY_LIMIT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        jobConf4.setMaxVirtualMemoryForTask((long) 10);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jobConf4.getTimeDurationHelper("mapreduce.minicluster.control-resource-monitoring", "mapreduce.minicluster.control-resource-monitoring", timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"mapreduce.minicluster.control-resource-monitoring\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.io.InputStream inputStream12 = jobConf4.getConfResourceAsInputStream(".");
        org.apache.hadoop.fs.Path path15 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean16 = path15.isRoot();
        path15.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf18 = new org.apache.hadoop.mapred.JobConf(path15);
        org.apache.hadoop.io.RawComparator rawComparator19 = jobConf18.getOutputValueGroupingComparator();
        jobConf18.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass23 = jobConf18.getMapperClass();
        java.util.regex.Pattern pattern24 = jobConf18.getJarUnpackPattern();
        jobConf4.setPattern("mapreduce.framework.name", pattern24);
        jobConf4.setUser("mapreduce.cluster.temp.dir");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rawComparator19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(pattern24);
        org.junit.Assert.assertEquals(pattern24.toString(), "(?:classes/|lib/).*");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setNumMapTasks(0);
        java.lang.String str8 = jobConf4.getJobName();
        jobConf4.setKeyFieldComparatorOptions("mapreduce.cluster.reducememory.mb");
        org.apache.hadoop.conf.StorageUnit storageUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.setStorageSize("yarn", (double) '#', storageUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MASTER_ADDRESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.jobtracker.address" + "'", str0, "mapreduce.jobtracker.address");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.apache.hadoop.mapred.Task.TaskReporter taskReporter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapred.Task.TaskReporter.TaskLimitException taskLimitException2 = taskReporter0.new TaskLimitException("mapreduce.cluster.delegation.key.update-interval");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.hadoop.mapred.Task$TaskReporter$TaskLimitException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str0 = org.apache.hadoop.fs.Path.SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.UPPER_LIMIT_ON_TASK_VMEM_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapred.task.limit.maxvmem" + "'", str0, "mapred.task.limit.maxvmem");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MASTER_WEBAPP_UI_ACTIONS_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.webapp.ui-actions.enabled" + "'", str0, "mapreduce.webapp.ui-actions.enabled");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.SHUFFLE_CONSUMER_PLUGIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.job.reduce.shuffle.consumer.plugin.class" + "'", str0, "mapreduce.job.reduce.shuffle.consumer.plugin.class");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getStrings("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        int int8 = jobConf4.size();
        org.apache.hadoop.mapred.JobPriority jobPriority9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.setJobPriority(jobPriority9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1466 + "'", int8 == 1466);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_JOB_MAP_MEMORY_MB_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapred.job.map.memory.mb" + "'", str0, "mapred.job.map.memory.mb");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_MAP_TASK_JAVA_OPTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.map.java.opts" + "'", str0, "mapreduce.map.java.opts");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        int int11 = jobConf4.getInt("hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<?> wildcardClass24 = jobConf6.getClassByNameOrNull("default");
        boolean boolean25 = jobConf6.getUseNewReducer();
        java.lang.Class<?> wildcardClass27 = jobConf6.getClassByNameOrNull("mapred.task.limit.maxvmem");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(wildcardClass27);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.io.InputStream inputStream12 = jobConf4.getConfResourceAsInputStream(".");
        java.lang.Class<?> wildcardClass13 = jobConf4.getOutputValueClass();
        jobConf4.setMaxMapTaskFailuresPercent(100);
        jobConf4.setNumMapTasks((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MR_SUPERGROUP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.permissions.supergroup" + "'", str0, "mapreduce.cluster.permissions.supergroup");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        long long9 = jobConf4.getMaxPhysicalMemoryForTask();
        long long10 = jobConf4.getMaxPhysicalMemoryForTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        char[] charArray7 = jobConf4.getPasswordFromCredentialProviders("mapreduce.workflow.tags");
        java.net.URL uRL9 = jobConf4.getResource("^mapreduce\\.workflow\\.adjacency\\..+");
        boolean boolean10 = jobConf4.getReduceSpeculativeExecution();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_TASK_ENV;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapred.child.env" + "'", str0, "mapred.child.env");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        jobConf6.setMemoryForReduceTask((-1L));
        boolean boolean14 = jobConf6.isPropertyTag("mapreduce.workflow.id");
        jobConf6.setJobPriorityAsInteger((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.apache.hadoop.mapred.JobConf.findContainingJar((java.lang.Class) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar" + "'", str7, "/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        int int6 = jobConf4.getJobPriorityAsInteger();
        jobConf4.setRestrictSystemProperties(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        boolean boolean2 = org.apache.hadoop.fs.Path.isWindowsAbsolutePath("hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        int int0 = org.apache.hadoop.mapreduce.MRConfig.MAX_BLOCK_LOCATIONS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.io.InputStream inputStream12 = jobConf4.getConfResourceAsInputStream(".");
        java.lang.Class<?> wildcardClass13 = jobConf4.getOutputValueClass();
        long long14 = jobConf4.getMemoryForReduceTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1024L + "'", long14 == 1024L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.net.InetSocketAddress inetSocketAddress13 = jobConf4.getSocketAddr("", "classic", (int) (short) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "mapreduce.ifile.readahead", "mapreduce.workflow.adjacency.", "mapreduce.job.restart.recover", "mapreduce.cluster.temp.dir", "mapreduce.cluster.reducememory.mb", "java.io.tmpdir", "mapreduce.workflow.adjacency.", "", "mapreduce.cluster.reducememory.mb", "mapreduce.cluster.temp.dir", "default", "mapreduce.cluster.local.dir" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Properties properties29 = jobConf4.getAllPropertiesByTags((java.util.List<java.lang.String>) strList27);
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = jobConf4.getTimeDuration("mapreduce.task.local.output.class", "classic", timeUnit32);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"classic\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = jobConf4.getTimeDuration("mapred.task.limit.maxvmem", (long) 4, timeUnit7, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.hadoop.mapred.JobConf jobConf1 = new org.apache.hadoop.mapred.JobConf(false);
        jobConf1.setMaxReduceAttempts((int) '#');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        float float8 = jobConf4.getFloat("mapreduce.cluster.reducememory.mb", (float) '4');
        jobConf4.setReduceDebugScript("mapreduce.task.local.output.class");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.apache.hadoop.mapred.Task.MERGED_OUTPUT_PREFIX = "^mapreduce\\.workflow\\.adjacency\\..+";
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        org.apache.hadoop.fs.Path path13 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        java.lang.String str14 = path13.getName();
        java.util.Optional<org.apache.hadoop.fs.Path> pathOptional15 = path13.getOptionalParentPath();
        jobConf6.setWorkingDirectory(path13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str14, "mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertNotNull(pathOptional15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration((org.apache.hadoop.conf.Configuration) jobConf4, "mapreduce.workflow.adjacency.", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property mapreduce.workflow.adjacency. not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isAbsolute();
        org.apache.hadoop.mapred.JobConf jobConf3 = new org.apache.hadoop.mapred.JobConf(path1);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        long[] longArray6 = jobConf3.getTimeDurations("default", timeUnit5);
        org.apache.hadoop.io.RawComparator rawComparator7 = jobConf3.getCombinerKeyGroupingComparator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(rawComparator7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        long long0 = org.apache.hadoop.mapreduce.MRConfig.DELEGATION_TOKEN_MAX_LIFETIME_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 604800000L + "'", long0 == 604800000L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.net.InetSocketAddress inetSocketAddress13 = jobConf4.getSocketAddr("", "classic", (int) (short) 100);
        java.lang.ClassLoader classLoader14 = null;
        jobConf4.setClassLoader(classLoader14);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress19 = jobConf4.getSocketAddr("mapred.task.maxvmem", "mapreduce.cluster.delegation.token.renew-interval", 4194304);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:4194304");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass23 = jobConf6.getMapperClass();
        java.lang.String str24 = jobConf6.getJobEndNotificationURI();
        int int25 = jobConf6.getNumTasksToExecutePerJvm();
        org.apache.hadoop.mapred.InputFormat inputFormat26 = jobConf6.getInputFormat();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(inputFormat26);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getStrings("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        jobConf4.setJar("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        java.io.File file12 = jobConf4.getFile("mapreduce.job.local-fs.single-disk-limit.bytes", "mapreduce.cluster.delegation.token.renew-interval");
        java.lang.Class<? extends org.apache.hadoop.mapred.MapRunnable> wildcardClass13 = jobConf4.getMapRunnerClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "-1");
        org.junit.Assert.assertEquals(file12.toString(), "-1/mapreduce.cluster.delegation.token.renew-interval");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        org.apache.hadoop.fs.Path path10 = jobConf4.getWorkingDirectory();
        java.lang.String str11 = jobConf4.getKeepTaskFilesPattern();
        java.lang.String str13 = jobConf4.get("mapreduce.map.log.level");
        org.apache.hadoop.mapred.Task.Counter counter15 = org.apache.hadoop.mapred.Task.Counter.MAP_VIRTUAL_MEMORY_BYTES_MAX;
        java.lang.Class<?> wildcardClass16 = counter15.getClass();
        org.apache.hadoop.mapred.Task.Counter counter17 = org.apache.hadoop.mapred.Task.Counter.SPLIT_RAW_BYTES;
        java.lang.Class<?> wildcardClass18 = counter17.getClass();
        java.lang.Class[] classArray20 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass16;
        wildcardClassArray21[1] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray26 = jobConf4.getClasses("mapred.task.limit.maxvmem", wildcardClassArray21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "INFO" + "'", str13, "INFO");
        org.junit.Assert.assertTrue("'" + counter15 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_VIRTUAL_MEMORY_BYTES_MAX + "'", counter15.equals(org.apache.hadoop.mapred.Task.Counter.MAP_VIRTUAL_MEMORY_BYTES_MAX));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + counter17 + "' != '" + org.apache.hadoop.mapred.Task.Counter.SPLIT_RAW_BYTES + "'", counter17.equals(org.apache.hadoop.mapred.Task.Counter.SPLIT_RAW_BYTES));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        jobConf6.setBoolean("mapreduce.workflow.id", false);
        jobConf6.addResource("mapred.child.env");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        int int15 = jobConf6.getMaxTaskFailuresPerTracker();
        org.apache.hadoop.mapred.OutputCommitter outputCommitter16 = jobConf6.getOutputCommitter();
        org.apache.hadoop.fs.Path path18 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean19 = path18.isRoot();
        path18.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf21 = new org.apache.hadoop.mapred.JobConf(path18);
        org.apache.hadoop.io.RawComparator rawComparator22 = jobConf21.getOutputValueGroupingComparator();
        jobConf21.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass26 = jobConf21.getMapperClass();
        java.net.InetSocketAddress inetSocketAddress30 = jobConf21.getSocketAddr("", "classic", (int) (short) 100);
        java.lang.String[] strArray43 = new java.lang.String[] { "mapreduce.ifile.readahead", "mapreduce.workflow.adjacency.", "mapreduce.job.restart.recover", "mapreduce.cluster.temp.dir", "mapreduce.cluster.reducememory.mb", "java.io.tmpdir", "mapreduce.workflow.adjacency.", "", "mapreduce.cluster.reducememory.mb", "mapreduce.cluster.temp.dir", "default", "mapreduce.cluster.local.dir" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Properties properties46 = jobConf21.getAllPropertiesByTags((java.util.List<java.lang.String>) strList44);
        java.util.Properties properties47 = jobConf6.getAllPropertiesByTags((java.util.List<java.lang.String>) strList44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(outputCommitter16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rawComparator22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(inetSocketAddress30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String str6 = jobConf4.getProfileParams();
        java.util.regex.Pattern pattern7 = jobConf4.getJarUnpackPattern();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s" + "'", str6, "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s");
        org.junit.Assert.assertNotNull(pattern7);
        org.junit.Assert.assertEquals(pattern7.toString(), "(?:classes/|lib/).*");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        int int15 = jobConf6.getMaxTaskFailuresPerTracker();
        org.apache.hadoop.mapred.OutputCommitter outputCommitter16 = jobConf6.getOutputCommitter();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = jobConf6.getValByRegex("mapreduce.webapp.ui-actions.enabled");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(outputCommitter16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.apache.hadoop.mapred.JobConf jobConf1 = new org.apache.hadoop.mapred.JobConf("java.io.tmpdir");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        org.apache.hadoop.fs.Path path24 = new org.apache.hadoop.fs.Path("yarn");
        org.apache.hadoop.mapred.Counters.Counter counter25 = null;
        org.apache.hadoop.util.Progressable progressable26 = null;
        org.apache.hadoop.fs.Path path28 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean29 = path28.isRoot();
        path28.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf31 = new org.apache.hadoop.mapred.JobConf(path28);
        java.lang.Class<?> wildcardClass32 = jobConf31.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector33 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter25, progressable26, (org.apache.hadoop.conf.Configuration) jobConf31);
        jobConf31.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path37 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean38 = path37.isRoot();
        path37.validateObject();
        org.apache.hadoop.fs.Path path41 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean42 = path41.isRoot();
        int int43 = path41.depth();
        int int44 = path37.compareTo(path41);
        int int45 = path41.depth();
        jobConf31.addResource(path41, true);
        boolean boolean48 = path24.equals((java.lang.Object) true);
        int int49 = path16.compareTo(path24);
        org.apache.hadoop.fs.Path path51 = new org.apache.hadoop.fs.Path(path16, "yarn");
        org.apache.hadoop.fs.Path path53 = new org.apache.hadoop.fs.Path(path16, "mapreduce.map.env");
        java.util.Optional<org.apache.hadoop.fs.Path> pathOptional54 = path53.getOptionalParentPath();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-12) + "'", int49 == (-12));
        org.junit.Assert.assertNotNull(pathOptional54);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.regex.Pattern pattern0 = org.apache.hadoop.mapred.JobConf.UNPACK_JAR_PATTERN_DEFAULT;
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "(?:classes/|lib/).*");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getStrings("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        int int8 = jobConf4.size();
        jobConf4.setMapSpeculativeExecution(false);
        jobConf4.setIfUnset("mapreduce.workflow.adjacency.", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1466 + "'", int8 == 1466);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        boolean boolean0 = org.apache.hadoop.mapred.JobConf.DEFAULT_MAPREDUCE_RECOVER_JOB;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("yarn");
        org.apache.hadoop.mapred.Counters.Counter counter2 = null;
        org.apache.hadoop.util.Progressable progressable3 = null;
        org.apache.hadoop.fs.Path path5 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean6 = path5.isRoot();
        path5.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf8 = new org.apache.hadoop.mapred.JobConf(path5);
        java.lang.Class<?> wildcardClass9 = jobConf8.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector10 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter2, progressable3, (org.apache.hadoop.conf.Configuration) jobConf8);
        jobConf8.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path14 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean15 = path14.isRoot();
        path14.validateObject();
        org.apache.hadoop.fs.Path path18 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean19 = path18.isRoot();
        int int20 = path18.depth();
        int int21 = path14.compareTo(path18);
        int int22 = path18.depth();
        jobConf8.addResource(path18, true);
        boolean boolean25 = path1.equals((java.lang.Object) true);
        java.net.URI uRI26 = path1.toUri();
        org.apache.hadoop.fs.FileSystem fileSystem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path28 = path1.makeQualified(fileSystem27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(uRI26);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.lang.Class<?> wildcardClass7 = jobConf4.getOutputValueClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getTrimmedStrings("mapreduce.cluster.local.dir");
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.setMaxVirtualMemoryForTask((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Task memory allocation may not be < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        java.util.Set<java.lang.String> strSet8 = jobConf4.getFinalParameters();
        char[] charArray10 = jobConf4.getPasswordFromCredentialProviders("mapreduce.minicluster.control-resource-monitoring");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_MATERIALIZED_BYTES;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_MATERIALIZED_BYTES + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.MAP_OUTPUT_MATERIALIZED_BYTES));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.apache.hadoop.mapred.Task.Counter counter0 = org.apache.hadoop.mapred.Task.Counter.REDUCE_INPUT_GROUPS;
        org.junit.Assert.assertTrue("'" + counter0 + "' != '" + org.apache.hadoop.mapred.Task.Counter.REDUCE_INPUT_GROUPS + "'", counter0.equals(org.apache.hadoop.mapred.Task.Counter.REDUCE_INPUT_GROUPS));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Reducer> wildcardClass8 = jobConf4.getCombinerClass();
        jobConf4.setMaxTaskFailuresPerTracker((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.String str6 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf5);
        long long7 = jobConf5.getMemoryForMapTask();
        jobConf5.setNumMapTasks((int) 'a');
        jobConf5.setCompressMapOutput(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test.build.data" + "'", str6, "test.build.data");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1024L + "'", long7 == 1024L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isAbsolute();
        java.lang.String str4 = path2.toString();
        org.apache.hadoop.fs.Path path6 = new org.apache.hadoop.fs.Path("yarn");
        org.apache.hadoop.mapred.Counters.Counter counter7 = null;
        org.apache.hadoop.util.Progressable progressable8 = null;
        org.apache.hadoop.fs.Path path10 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean11 = path10.isRoot();
        path10.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf13 = new org.apache.hadoop.mapred.JobConf(path10);
        java.lang.Class<?> wildcardClass14 = jobConf13.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector15 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter7, progressable8, (org.apache.hadoop.conf.Configuration) jobConf13);
        jobConf13.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path19 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean20 = path19.isRoot();
        path19.validateObject();
        org.apache.hadoop.fs.Path path23 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean24 = path23.isRoot();
        int int25 = path23.depth();
        int int26 = path19.compareTo(path23);
        int int27 = path23.depth();
        jobConf13.addResource(path23, true);
        boolean boolean30 = path6.equals((java.lang.Object) true);
        java.net.URI uRI31 = path6.toUri();
        org.apache.hadoop.fs.Path path33 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean34 = path33.isRoot();
        path33.validateObject();
        boolean boolean36 = path33.isAbsoluteAndSchemeAuthorityNull();
        org.apache.hadoop.fs.Path path37 = path2.makeQualified(uRI31, path33);
        org.apache.hadoop.fs.Path path38 = new org.apache.hadoop.fs.Path("mapreduce.cluster.acls.enabled", path2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str4, "mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(uRI31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(path37);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MAPMEMORY_MB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.mapmemory.mb" + "'", str0, "mapreduce.cluster.mapmemory.mb");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.apache.hadoop.conf.Configuration.reloadExistingConfigurations();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        jobConf6.setMemoryForReduceTask((-1L));
        float float15 = jobConf6.getFloat("mapreduce.minicluster.control-resource-monitoring", (float) 15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 15.0f + "'", float15 == 15.0f);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        org.apache.hadoop.fs.Path path10 = jobConf4.getWorkingDirectory();
        jobConf4.setQueueName("mapreduce.map.java.opts");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        org.apache.hadoop.io.RawComparator rawComparator9 = jobConf4.getCombinerKeyGroupingComparator();
        int int10 = jobConf4.getMaxReduceTaskFailuresPercent();
        java.lang.String str13 = jobConf4.get("mapred.task.limit.maxvmem", "mapred.child.env");
        java.lang.Class<?> wildcardClass14 = jobConf4.getOutputValueClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(rawComparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mapred.child.env" + "'", str13, "mapred.child.env");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.LOCAL_DIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.local.dir" + "'", str0, "mapreduce.cluster.local.dir");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<?> wildcardClass24 = jobConf6.getClassByNameOrNull("default");
        jobConf6.setSpeculativeExecution(true);
        java.net.InetSocketAddress inetSocketAddress30 = jobConf6.getSocketAddr("mapreduce.webapp.ui-actions.enabled", "mapreduce.jobtracker.address", 1024);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(inetSocketAddress30);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        int int10 = jobConf4.getMaxTaskFailuresPerTracker();
        jobConf4.setJar("mapreduce.cluster.delegation.token.renew-interval");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        long long9 = jobConf4.getMaxPhysicalMemoryForTask();
        java.net.InetSocketAddress inetSocketAddress13 = jobConf4.getSocketAddr("mapreduce.task.local.output.class", "mapreduce.map.log.level", (int) (byte) 1);
        jobConf4.setBoolean("mapreduce.cluster.reducememory.mb", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(inetSocketAddress13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        int int10 = jobConf4.getMaxTaskFailuresPerTracker();
        jobConf4.setNumReduceTasks((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.util.Spliterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntrySpliterator11 = jobConf4.spliterator();
        boolean boolean12 = jobConf4.getProfileEnabled();
        int int13 = jobConf4.getJobPriorityAsInteger();
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf4.write(dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(strEntrySpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.util.Spliterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntrySpliterator11 = jobConf4.spliterator();
        jobConf4.set("/", "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(strEntrySpliterator11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        int int10 = jobConf4.getMaxTaskFailuresPerTracker();
        jobConf4.setDouble("mapred.job.map.memory.mb", (double) 86400000L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        float float10 = jobConf4.getFloat("/", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass23 = jobConf6.getMapperClass();
        jobConf6.unset("mapreduce.cluster.permissions.supergroup");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.String str6 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf5);
        java.lang.Class<?> wildcardClass8 = jobConf5.getClassByNameOrNull("mapreduce.task.local.output.class");
        jobConf5.set("java.io.tmpdir", "test.build.data", "hi!");
        long long13 = jobConf5.getMemoryForReduceTask();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = jobConf5.getValByRegex("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test.build.data" + "'", str6, "test.build.data");
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1024L + "'", long13 == 1024L);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.hadoop.mapred.JobConf jobConf1 = new org.apache.hadoop.mapred.JobConf("mapreduce.cluster.administrators");
        java.lang.String str2 = jobConf1.getJobLocalDir();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<?> wildcardClass24 = jobConf6.getClassByNameOrNull("default");
        boolean boolean25 = jobConf6.getUseNewReducer();
        jobConf6.setMaxMapTaskFailuresPercent(15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.apache.hadoop.mapred.JobConf jobConf1 = new org.apache.hadoop.mapred.JobConf("mapreduce.job.local-fs.single-disk-limit.bytes");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        org.apache.hadoop.io.RawComparator rawComparator9 = jobConf4.getCombinerKeyGroupingComparator();
        int int10 = jobConf4.getMaxReduceTaskFailuresPercent();
        java.lang.String str13 = jobConf4.get("mapred.task.limit.maxvmem", "mapred.child.env");
        org.apache.hadoop.fs.Path path15 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean16 = path15.isRoot();
        path15.validateObject();
        boolean boolean18 = path15.isAbsolute();
        java.lang.String str19 = path15.getName();
        org.apache.hadoop.fs.Path path21 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean22 = path21.isRoot();
        int int23 = path21.depth();
        int int24 = path21.depth();
        int int25 = path15.compareTo(path21);
        jobConf4.addResource(path15, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(rawComparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mapred.child.env" + "'", str13, "mapred.child.env");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mapreduce.cluster.reducememory.mb" + "'", str19, "mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.String str6 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf5);
        java.lang.Class<?> wildcardClass8 = jobConf5.getClassByNameOrNull("mapreduce.task.local.output.class");
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf5.writeXml(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test.build.data" + "'", str6, "test.build.data");
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.fs.Path path5 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean6 = path5.isRoot();
        int int7 = path5.depth();
        int int8 = path1.compareTo(path5);
        boolean boolean9 = path5.isAbsolute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_MAP_TASK_ULIMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.map.ulimit" + "'", str0, "mapreduce.map.ulimit");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.apache.hadoop.mapred.Task.TaskReporter taskReporter0 = null;
        org.apache.hadoop.mapred.Counters.Counter counter1 = null;
        org.apache.hadoop.util.Progressable progressable2 = null;
        org.apache.hadoop.fs.Path path4 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean5 = path4.isRoot();
        path4.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf7 = new org.apache.hadoop.mapred.JobConf(path4);
        java.lang.Class<?> wildcardClass8 = jobConf7.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector9 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter1, progressable2, (org.apache.hadoop.conf.Configuration) jobConf7);
        jobConf7.setProfileEnabled(true);
        jobConf7.addResource("mapreduce.task.progress-report.interval");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapred.Task.TaskReporter.DiskLimitCheck diskLimitCheck14 = taskReporter0.new DiskLimitCheck(jobConf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.hadoop.mapred.Task$TaskReporter$DiskLimitCheck with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        jobConf4.reloadConfiguration();
        org.apache.hadoop.mapred.JobPriority jobPriority9 = jobConf4.getJobPriority();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + jobPriority9 + "' != '" + org.apache.hadoop.mapred.JobPriority.DEFAULT + "'", jobPriority9.equals(org.apache.hadoop.mapred.JobPriority.DEFAULT));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("yarn");
        org.apache.hadoop.mapred.Counters.Counter counter3 = null;
        org.apache.hadoop.util.Progressable progressable4 = null;
        org.apache.hadoop.fs.Path path6 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean7 = path6.isRoot();
        path6.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf9 = new org.apache.hadoop.mapred.JobConf(path6);
        java.lang.Class<?> wildcardClass10 = jobConf9.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector11 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter3, progressable4, (org.apache.hadoop.conf.Configuration) jobConf9);
        jobConf9.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path15 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean16 = path15.isRoot();
        path15.validateObject();
        org.apache.hadoop.fs.Path path19 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean20 = path19.isRoot();
        int int21 = path19.depth();
        int int22 = path15.compareTo(path19);
        int int23 = path19.depth();
        jobConf9.addResource(path19, true);
        boolean boolean26 = path2.equals((java.lang.Object) true);
        java.net.URI uRI27 = path2.toUri();
        org.apache.hadoop.fs.Path path28 = new org.apache.hadoop.fs.Path(uRI27);
        org.apache.hadoop.fs.Path path29 = new org.apache.hadoop.fs.Path(uRI27);
        org.apache.hadoop.fs.Path path30 = new org.apache.hadoop.fs.Path("local", path29);
        org.apache.hadoop.fs.Path path32 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean33 = path32.isRoot();
        path32.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf35 = new org.apache.hadoop.mapred.JobConf(path32);
        java.lang.Class<?> wildcardClass36 = jobConf35.getOutputKeyClass();
        jobConf35.setNumMapTasks(0);
        jobConf35.setMaxMapTaskFailuresPercent(0);
        org.apache.hadoop.fs.FileSystem fileSystem41 = path29.getFileSystem((org.apache.hadoop.conf.Configuration) jobConf35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(uRI27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(fileSystem41);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        org.apache.hadoop.fs.Path path24 = new org.apache.hadoop.fs.Path("yarn");
        org.apache.hadoop.mapred.Counters.Counter counter25 = null;
        org.apache.hadoop.util.Progressable progressable26 = null;
        org.apache.hadoop.fs.Path path28 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean29 = path28.isRoot();
        path28.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf31 = new org.apache.hadoop.mapred.JobConf(path28);
        java.lang.Class<?> wildcardClass32 = jobConf31.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector33 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter25, progressable26, (org.apache.hadoop.conf.Configuration) jobConf31);
        jobConf31.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path37 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean38 = path37.isRoot();
        path37.validateObject();
        org.apache.hadoop.fs.Path path41 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean42 = path41.isRoot();
        int int43 = path41.depth();
        int int44 = path37.compareTo(path41);
        int int45 = path41.depth();
        jobConf31.addResource(path41, true);
        boolean boolean48 = path24.equals((java.lang.Object) true);
        int int49 = path16.compareTo(path24);
        org.apache.hadoop.fs.Path path51 = new org.apache.hadoop.fs.Path(path16, "yarn");
        org.apache.hadoop.fs.Path path53 = new org.apache.hadoop.fs.Path(path16, "mapreduce.map.env");
        int int54 = path53.depth();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-12) + "'", int49 == (-12));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        boolean boolean10 = jobConf4.getKeepFailedTaskFiles();
        jobConf4.setFloat("mapreduce.minicluster.control-resource-monitoring", 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges16 = jobConf4.getRange("default", "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"agentlib:hprof=cpu=samples\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        int int3 = path1.depth();
        org.apache.hadoop.fs.Path path4 = path1.getParent();
        path4.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(path4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.apache.hadoop.fs.Path path4 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean5 = path4.isRoot();
        path4.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf7 = new org.apache.hadoop.mapred.JobConf(path4);
        java.lang.String str8 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf7);
        java.lang.String[] strArray9 = jobConf7.getLocalDirs();
        org.apache.hadoop.conf.Configuration.addDeprecation("mapreduce.cluster.permissions.supergroup", strArray9);
        org.apache.hadoop.conf.Configuration.addDeprecation("java.io.tmpdir", strArray9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test.build.data" + "'", str8, "test.build.data");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        boolean boolean1 = org.apache.hadoop.conf.Configuration.isDeprecated("mapreduce.map.ulimit");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.lang.String str7 = jobConf4.getSessionId();
        jobConf4.setInt("test.build.data", (int) (short) 100);
        jobConf4.setMaxMapTaskFailuresPercent((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.io.Reader reader13 = jobConf6.getConfResourceAsReader("default");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(reader13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.util.Spliterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntrySpliterator11 = jobConf4.spliterator();
        boolean boolean12 = jobConf4.getProfileEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress17 = jobConf4.getSocketAddr("mapreduce.map.log.level", "mapreduce.minicluster.control-resource-monitoring", ".", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Does not contain a valid host:port authority: . (configuration property 'mapreduce.minicluster.control-resource-monitoring')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(strEntrySpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.Class<?> wildcardClass6 = jobConf5.getOutputKeyClass();
        jobConf5.setQueueName("hi!");
        java.lang.String str9 = org.apache.hadoop.mapred.Task.normalizeStatus("mapreduce.cluster.acls.enabled", (org.apache.hadoop.conf.Configuration) jobConf5);
        java.lang.String str10 = jobConf5.getJobName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mapreduce.cluster.acls.enabled" + "'", str9, "mapreduce.cluster.acls.enabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("yarn");
        java.lang.String str2 = path1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yarn" + "'", str2, "yarn");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.apache.hadoop.mapred.Task.TaskReporter taskReporter0 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.String str7 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray8 = jobConf6.getLocalDirs();
        jobConf6.setMaxTaskFailuresPerTracker((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = jobConf6.getMapOutputValueClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapred.Task.TaskReporter.DiskLimitCheck diskLimitCheck12 = taskReporter0.new DiskLimitCheck(jobConf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.hadoop.mapred.Task$TaskReporter$DiskLimitCheck with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test.build.data" + "'", str7, "test.build.data");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.apache.hadoop.mapred.JobConf jobConf1 = new org.apache.hadoop.mapred.JobConf("mapreduce.cluster.administrators");
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.fs.Path path7 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean8 = path7.isRoot();
        int int9 = path7.depth();
        int int10 = path3.compareTo(path7);
        int int11 = path7.depth();
        path7.validateObject();
        java.util.Optional<org.apache.hadoop.fs.Path> pathOptional13 = path7.getOptionalParentPath();
        jobConf1.addResource(path7);
        boolean boolean15 = jobConf1.getUseNewReducer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(pathOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_LOCAL_DIR_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.cluster.local.dir" + "'", str0, "mapreduce.cluster.local.dir");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.String str6 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf5);
        java.lang.Class<?> wildcardClass8 = jobConf5.getClassByNameOrNull("mapreduce.task.local.output.class");
        jobConf5.setMaxMapTaskFailuresPercent(1466);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test.build.data" + "'", str6, "test.build.data");
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<?> wildcardClass24 = jobConf6.getClassByNameOrNull("default");
        jobConf6.setSpeculativeExecution(true);
        org.apache.hadoop.mapred.OutputCommitter outputCommitter27 = jobConf6.getOutputCommitter();
        jobConf6.setUseNewMapper(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(outputCommitter27);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass23 = jobConf6.getMapperClass();
        java.lang.Class<?> wildcardClass25 = jobConf6.getClassByNameOrNull("mapreduce.map.log.level");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges27 = jobConf6.getProfileTaskRange(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(integerRanges27);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getStrings("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        jobConf4.addResource("mapreduce.framework.name");
        jobConf4.setNumReduceTasks((int) 'a');
        java.lang.Class<? extends org.apache.hadoop.mapred.MapRunnable> wildcardClass12 = jobConf4.getMapRunnerClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.io.InputStream inputStream12 = jobConf4.getConfResourceAsInputStream(".");
        java.lang.Class<?> wildcardClass13 = jobConf4.getOutputValueClass();
        jobConf4.setMaxMapTaskFailuresPercent(100);
        java.lang.String str16 = jobConf4.getJobEndNotificationURI();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        org.apache.hadoop.fs.Path path10 = jobConf4.getWorkingDirectory();
        java.lang.String str11 = jobConf4.getJar();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.apache.hadoop.mapred.JobConf jobConf1 = new org.apache.hadoop.mapred.JobConf(true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        java.util.Spliterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntrySpliterator11 = jobConf4.spliterator();
        boolean boolean12 = jobConf4.getProfileEnabled();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = jobConf4.getInts("mapreduce.app-submission.cross-platform");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"false\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertNotNull(strEntrySpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.String str6 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf5);
        java.lang.String[] strArray7 = jobConf5.getLocalDirs();
        jobConf5.setMaxTaskFailuresPerTracker((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = jobConf5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test.build.data" + "'", str6, "test.build.data");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<?> wildcardClass24 = jobConf6.getClassByNameOrNull("default");
        jobConf6.setSpeculativeExecution(true);
        org.apache.hadoop.mapred.OutputCommitter outputCommitter27 = jobConf6.getOutputCommitter();
        jobConf6.setKeepFailedTaskFiles(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNotNull(outputCommitter27);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        jobConf6.setReduceDebugScript("mapreduce.cluster.acls.enabled");
        int int17 = jobConf6.getNumReduceTasks();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("/");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        long long9 = jobConf4.getMaxPhysicalMemoryForTask();
        java.lang.String str12 = jobConf4.get("mapreduce.app-submission.cross-platform", "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "false" + "'", str12, "false");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.fs.Path path12 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean13 = path12.isRoot();
        path12.validateObject();
        org.apache.hadoop.fs.Path path16 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean17 = path16.isRoot();
        int int18 = path16.depth();
        int int19 = path12.compareTo(path16);
        int int20 = path16.depth();
        jobConf6.addResource(path16, true);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass23 = jobConf6.getMapperClass();
        jobConf6.setBooleanIfUnset("", false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jobConf6.getTimeDurationHelper("INFO", "mapreduce.cluster.delegation.token.renew-interval", timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"mapreduce.cluster.delegation.token.renew-interval\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean3 = path2.isRoot();
        path2.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf5 = new org.apache.hadoop.mapred.JobConf(path2);
        java.lang.Class<?> wildcardClass6 = jobConf5.getOutputKeyClass();
        jobConf5.setQueueName("hi!");
        java.lang.String str9 = org.apache.hadoop.mapred.Task.normalizeStatus("mapreduce.cluster.acls.enabled", (org.apache.hadoop.conf.Configuration) jobConf5);
        long long10 = jobConf5.getMemoryForMapTask();
        org.apache.hadoop.conf.StorageUnit storageUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf5.setStorageSize("java.io.tmpdir", (double) 10, storageUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mapreduce.cluster.acls.enabled" + "'", str9, "mapreduce.cluster.acls.enabled");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1024L + "'", long10 == 1024L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.net.InetSocketAddress inetSocketAddress13 = jobConf4.getSocketAddr("", "classic", (int) (short) 100);
        jobConf4.setMaxMapTaskFailuresPercent((int) (short) 10);
        org.apache.hadoop.fs.Path path19 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean20 = path19.isRoot();
        path19.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf22 = new org.apache.hadoop.mapred.JobConf(path19);
        java.lang.String str23 = org.apache.hadoop.mapred.Task.normalizeStatus("test.build.data", (org.apache.hadoop.conf.Configuration) jobConf22);
        java.lang.String[] strArray24 = jobConf22.getLocalDirs();
        java.lang.String[] strArray25 = jobConf4.getTrimmedStrings("mapreduce.task.local-fs.write-limit.bytes", strArray24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "test.build.data" + "'", str23, "test.build.data");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        java.io.InputStream inputStream6 = null;
        jobConf4.addResource(inputStream6, "mapreduce.job.local-fs.single-disk-limit.bytes");
        long long9 = jobConf4.getMaxPhysicalMemoryForTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        jobConf4.reloadConfiguration();
        int int9 = jobConf4.getMaxMapAttempts();
        jobConf4.addResource("mapred.child.env");
        jobConf4.setUseNewMapper(true);
        jobConf4.setJar("mapreduce.cluster.temp.dir");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isAbsolute();
        org.apache.hadoop.mapred.JobConf jobConf3 = new org.apache.hadoop.mapred.JobConf(path1);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        long[] longArray6 = jobConf3.getTimeDurations("default", timeUnit5);
        boolean boolean7 = jobConf3.getUseNewReducer();
        java.lang.String str8 = jobConf3.getJobLocalDir();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.apache.hadoop.fs.Path path0 = null;
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapreduce.task.local.output.class");
        path2.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path4 = org.apache.hadoop.fs.Path.mergePaths(path0, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        jobConf6.setProfileEnabled(true);
        org.apache.hadoop.io.RawComparator rawComparator11 = jobConf6.getOutputValueGroupingComparator();
        jobConf6.setProfileParams("local");
        java.io.DataInput dataInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf6.readFields(dataInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(rawComparator11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        jobConf4.setMaxVirtualMemoryForTask((long) 10);
        jobConf4.setMaxMapAttempts((-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setNumMapTasks(0);
        java.lang.String str8 = jobConf4.getJobName();
        jobConf4.setIfUnset("mapreduce.cluster.local.dir", "mapreduce.workflow.tags");
        jobConf4.setMaxMapTaskFailuresPercent((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_TASK_MAXPMEM_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapred.task.maxpmem" + "'", str0, "mapred.task.maxpmem");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.Class class9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobConf6.setJarByClass(class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String str6 = jobConf4.getProfileParams();
        jobConf4.setJobPriorityAsInteger((-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s" + "'", str6, "-agentlib:hprof=cpu=samples,heap=sites,force=n,thread=y,verbose=n,file=%s");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setQueueName("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.tmpdir", "mapreduce.cluster.temp.dir" };
        jobConf4.setStrings("mapreduce.cluster.reducememory.mb", strArray11);
        boolean boolean15 = jobConf4.getBoolean("mapreduce.job.restart.recover", false);
        int int16 = jobConf4.getJobPriorityAsInteger();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isAbsolute();
        org.apache.hadoop.mapred.JobConf jobConf3 = new org.apache.hadoop.mapred.JobConf(path1);
        boolean boolean4 = jobConf3.getCompressMapOutput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("INFO", "mapreduce.task.max.status.length", "mapreduce.webapp.ui-actions.enabled");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: INFO://mapreduce.task.max.status.length./mapreduce.webapp.ui-actions.enabled");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        jobConf6.setLong("yarn", (long) 15);
        java.lang.Class<? extends org.apache.hadoop.mapred.Partitioner> wildcardClass14 = jobConf6.getPartitionerClass();
        jobConf6.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setQueueName("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.tmpdir", "mapreduce.cluster.temp.dir" };
        jobConf4.setStrings("mapreduce.cluster.reducememory.mb", strArray11);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass13 = jobConf4.getMapperClass();
        org.apache.hadoop.mapred.JobConf jobConf14 = new org.apache.hadoop.mapred.JobConf((java.lang.Class) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getTrimmedStrings("mapreduce.cluster.local.dir");
        jobConf4.addResource("mapreduce.jobtracker.address", true);
        jobConf4.setNumReduceTasks(1024);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.apache.hadoop.fs.Path path2 = new org.apache.hadoop.fs.Path("mapred.child.env", "mapreduce.cluster.administrators");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String str0 = org.apache.hadoop.mapreduce.MRConfig.MAX_BLOCK_LOCATIONS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.job.max.split.locations" + "'", str0, "mapreduce.job.max.split.locations");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        char char0 = org.apache.hadoop.fs.Path.SEPARATOR_CHAR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        jobConf4.setBoolean("mapreduce.cluster.delegation.token.renew-interval", false);
        java.lang.Class<? extends org.apache.hadoop.mapred.Mapper> wildcardClass9 = jobConf4.getMapperClass();
        java.util.regex.Pattern pattern10 = jobConf4.getJarUnpackPattern();
        jobConf4.setMaxPhysicalMemoryForTask((long) (byte) -1);
        long long13 = jobConf4.getMaxPhysicalMemoryForTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "(?:classes/|lib/).*");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        jobConf4.reloadConfiguration();
        boolean boolean9 = jobConf4.getKeepFailedTaskFiles();
        jobConf4.setBooleanIfUnset("mapreduce.cluster.acls.enabled", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setNumMapTasks(0);
        jobConf4.setMaxMapTaskFailuresPercent(0);
        jobConf4.deleteLocalFiles("classic");
        jobConf4.setQueueName("mapreduce.workflow.tags");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        jobConf6.setLong("yarn", (long) 15);
        java.lang.Class<? extends org.apache.hadoop.mapred.Partitioner> wildcardClass14 = jobConf6.getPartitionerClass();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = jobConf6.getTimeDuration("", 10000L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        jobConf4.setMapSpeculativeExecution(false);
        jobConf4.reloadConfiguration();
        int int9 = jobConf4.getMaxMapAttempts();
        jobConf4.addResource("mapred.child.env");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges14 = jobConf4.getRange("mapreduce.job.max.split.locations", "false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(integerRanges14);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        long long9 = jobConf4.getLong("mapreduce.cluster.reducememory.mb", (-1L));
        org.apache.hadoop.fs.Path path10 = jobConf4.getWorkingDirectory();
        jobConf4.setMapDebugScript("mapreduce.workflow.node.name");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        java.lang.Class<?> wildcardClass5 = jobConf4.getOutputKeyClass();
        int int6 = jobConf4.getJobPriorityAsInteger();
        java.util.Spliterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntrySpliterator7 = jobConf4.spliterator();
        jobConf4.setQueueName("mapreduce.cluster.delegation.token.renew-interval");
        jobConf4.setRestrictSystemProperties(false);
        org.apache.hadoop.fs.Path path15 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean16 = path15.isRoot();
        path15.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf18 = new org.apache.hadoop.mapred.JobConf(path15);
        org.apache.hadoop.io.RawComparator rawComparator19 = jobConf18.getOutputValueGroupingComparator();
        java.lang.String[] strArray21 = jobConf18.getTrimmedStrings("mapreduce.cluster.local.dir");
        org.apache.hadoop.conf.Configuration.addDeprecation("INFO", strArray21, "mapreduce.task.local.output.class");
        java.lang.String[] strArray24 = jobConf4.getTrimmedStrings("mapreduce.workflow.id", strArray21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strEntrySpliterator7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rawComparator19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.apache.hadoop.fs.Path path1 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean2 = path1.isRoot();
        path1.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf4 = new org.apache.hadoop.mapred.JobConf(path1);
        org.apache.hadoop.io.RawComparator rawComparator5 = jobConf4.getOutputValueGroupingComparator();
        java.lang.String[] strArray7 = jobConf4.getStrings("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        jobConf4.setJar("/tmp/jars/hadoop-client-api-3.4.0-SNAPSHOT.jar");
        java.io.File file12 = jobConf4.getFile("mapreduce.job.local-fs.single-disk-limit.bytes", "mapreduce.cluster.delegation.token.renew-interval");
        jobConf4.setKeyFieldPartitionerOptions("mapreduce.cluster.reducememory.mb");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rawComparator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "-1");
        org.junit.Assert.assertEquals(file12.toString(), "-1/mapreduce.cluster.delegation.token.renew-interval");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.String str0 = org.apache.hadoop.mapred.JobConf.MAPRED_REDUCE_TASK_ULIMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mapreduce.reduce.ulimit" + "'", str0, "mapreduce.reduce.ulimit");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.apache.hadoop.mapred.Counters.Counter counter0 = null;
        org.apache.hadoop.util.Progressable progressable1 = null;
        org.apache.hadoop.fs.Path path3 = new org.apache.hadoop.fs.Path("mapreduce.cluster.reducememory.mb");
        boolean boolean4 = path3.isRoot();
        path3.validateObject();
        org.apache.hadoop.mapred.JobConf jobConf6 = new org.apache.hadoop.mapred.JobConf(path3);
        java.lang.Class<?> wildcardClass7 = jobConf6.getOutputKeyClass();
        org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator> wildcardClassCombineOutputCollector8 = new org.apache.hadoop.mapred.Task.CombineOutputCollector<java.lang.Class<?>, java.util.Comparator>(counter0, progressable1, (org.apache.hadoop.conf.Configuration) jobConf6);
        java.lang.String[] strArray10 = jobConf6.getPropertySources("");
        java.lang.String str11 = jobConf6.getKeepTaskFilesPattern();
        java.lang.String str14 = jobConf6.get("mapreduce.cluster.administrators", "mapreduce.task.max.status.length");
        jobConf6.setBoolean("mapreduce.workflow.id", false);
        boolean boolean18 = jobConf6.getSpeculativeExecution();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mapreduce.task.max.status.length" + "'", str14, "mapreduce.task.max.status.length");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }
}

