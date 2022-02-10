package org.apache.batchee.cli;

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
        java.lang.String str0 = org.apache.batchee.jmx.BatchEEMBean.DEFAULT_OBJECT_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.batchee:type=batchee,name=operator" + "'", str0, "org.apache.batchee:type=batchee,name=operator");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objectName3.isPropertyValuePattern("Batch status: FAILED");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("Batch 'long-sample' started with id #", "Executions of sample for instance");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Executions of sample for instance" + "'", str2, "Executions of sample for instance");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.Throwable throwable0 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable0);
        java.lang.Throwable throwable2 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable2);
        // The following exception was thrown during execution in test generation
        try {
            batchContainerRuntimeException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = new javax.management.ObjectName("user2");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("sample");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str1 = javax.management.ObjectName.quote("evict");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"evict\"" + "'", str1, "\"evict\"");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("", "sample has");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sample has" + "'", str2, "sample has");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.Hashtable<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = javax.management.ObjectName.getInstance("Available commands:", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: key property list cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.String str2 = batchContainerRuntimeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped" + "'", str2, "org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getDomain();
        javax.management.ObjectName objectName5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = objectName3.compareTo(objectName5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objectName3.isPropertyValuePattern("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("start: start a batch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.apache.batchee.container.services.ServicesManager servicesManager0 = org.apache.batchee.container.services.ServicesManager.find();
        java.lang.Class<?> wildcardClass1 = servicesManager0.getClass();
        org.junit.Assert.assertNotNull(servicesManager0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = javax.management.ObjectName.getInstance("running: list running batches", "", "abandon: abandon a batch from its id");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: running: list running batches");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobInstance((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.Hashtable<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = javax.management.ObjectName.getInstance("Batch status: COMPLETED", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: key property list cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.stop((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getParameters((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str1 = javax.management.ObjectName.quote("status: list last batches statuses");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"status: list last batches statuses\"" + "'", str1, "\"status: list last batches statuses\"");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.restart((long) (short) 100, "start stop");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.start("No job started", "help");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        java.util.Properties properties2 = null;
        servicesManager1.init(properties2);
        servicesManager1.close();
        org.junit.Assert.assertNotNull(servicesManager1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobInstance(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE1.getJobExecutions((long) (short) 0, "user2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.stop((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE1.getJobExecutions((long) '4', "stop: stop a batch from its id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getParameters((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE1.getJobInstances("\"evict\"", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = batchEE1.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE1.getJobInstances("start: start a batch", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getParameters((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str1 = javax.management.ObjectName.quote("names: list known batches");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"names: list known batches\"" + "'", str1, "\"names: list known batches\"");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getStepExecutions((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("running: list running batches");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        org.junit.Assert.assertNotNull(servicesManager2);
        org.junit.Assert.assertNotNull(servicesManager3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("Batch status: FAILED", "Batch 'sample' started with id #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Batch 'sample' started with id #" + "'", str2, "Batch 'sample' started with id #");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.stop((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = new javax.management.ObjectName("called");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("Stopped", "long-sample");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long-sample" + "'", str2, "long-sample");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = batchEE1.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobExecution((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.start("start: start a batch", "executions: list executions");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("\"status: list last batches statuses\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobExecution((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("stop: stop a batch from its id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = javax.management.ObjectName.getInstance("No job started");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.abandon((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        java.lang.String str8 = objectName7.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str8, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = batchEE2.restart((long) (byte) 1, "long-sample");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobExecution((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.stop(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("sample-step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.start("-name", "Stopped");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobInstance((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.stop((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getDomain();
        java.lang.Class<?> wildcardClass5 = objectName3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.apache.batchee.container.services.ServicesManager servicesManager0 = org.apache.batchee.container.services.ServicesManager.find();
        java.util.Properties properties1 = null;
        servicesManager0.init(properties1);
        // The following exception was thrown during execution in test generation
        try {
            servicesManager0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servicesManager0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getStepExecutions((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = batchEE2.restart(0L, "COMPLETED");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("restart: restart a batch", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.abandon(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.apache.batchee.container.services.ServicesManager servicesManager0 = org.apache.batchee.container.services.ServicesManager.find();
        java.util.Properties properties1 = null;
        servicesManager0.init(properties1);
        java.lang.Class<?> wildcardClass3 = servicesManager0.getClass();
        org.junit.Assert.assertNotNull(servicesManager0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.start("Batch status: FAILED", "executions: list executions");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobInstance((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.restart((long) (short) 100, "-lifecycle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getStepExecutions(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.util.Hashtable<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = new javax.management.ObjectName("\"evict\"", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: key property list cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("start: start a batch");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.abandon((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        javax.management.ObjectName objectName11 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str13 = objectName11.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        int int14 = objectName3.compareTo(objectName11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = objectName11.isPropertyValuePattern("executions: list executions");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE1.getJobExecutions((long) (byte) 100, "evict: remove old data, uses embedded configuration (no JAXRS support yet)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.abandon(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("sample has", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobInstance((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobInstance((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getParameters(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("restart: restart a batch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        boolean boolean6 = objectName3.isPropertyListPattern();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str8 = objectName3.toString();
        java.lang.Class<?> wildcardClass9 = objectName3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str8, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String str1 = javax.management.ObjectName.quote("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = batchEE2.restart(1L, "User");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("Available commands:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getStepExecutions((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("OK", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("instance id", "restart: restart a batch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "restart: restart a batch" + "'", str2, "restart: restart a batch");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.Throwable throwable1 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException2 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable1);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable1);
        java.lang.String str4 = batchContainerRuntimeException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED" + "'", str4, "org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getParameters((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getCanonicalName();
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        java.lang.String str12 = objectName9.toString();
        javax.management.ObjectName objectName13 = javax.management.ObjectName.getInstance(objectName9);
        int int14 = objectName3.compareTo(objectName9);
        boolean boolean15 = objectName9.isPropertyListPattern();
        boolean boolean16 = objectName9.isPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str5, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str12, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE10.stop((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobExecution((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable3 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException5);
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException6);
        java.lang.Throwable[] throwableArray8 = batchContainerRuntimeException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.Throwable throwable2 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("sample has", (java.lang.Throwable) batchContainerRuntimeException4);
        java.lang.Throwable throwable7 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException8 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException9);
        batchContainerRuntimeException5.addSuppressed((java.lang.Throwable) batchContainerRuntimeException9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean5 = objectName4.isPattern();
        boolean boolean6 = objectName4.isPropertyValuePattern();
        boolean boolean7 = objectName4.isPropertyValuePattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap8 = objectName4.getKeyPropertyList();
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName9 = new javax.management.ObjectName("usage: evict -until <arg>", strMap8);
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: usage: evict -until <arg>");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.stop((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getParameters((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        int int12 = objectName3.compareTo(objectName9);
        boolean boolean13 = objectName9.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap14 = objectName9.getKeyPropertyList();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap15 = objectName9.getKeyPropertyList();
        boolean boolean16 = objectName9.isPropertyPattern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getStepExecutions((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobExecution((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE10.stop((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objectName3.isPropertyValuePattern("sample has");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getJobExecution((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.Throwable throwable1 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException2 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable1);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable1);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException3);
        java.lang.String str5 = batchContainerRuntimeException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED" + "'", str5, "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray13 = batchEE10.getRunningExecutions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getStepExecutions((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE10.getJobInstances("Stopped", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE1.getJobExecutions(0L, "YYYYMMDD format");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = batchEE10.start("No job started", "Executions of sample for instance");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = batchEE2.getJobInstanceCount("User");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray3 = batchEE1.getRunningExecutions("OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        boolean boolean8 = objectName3.isPropertyPattern();
        java.lang.String str9 = objectName3.getDomain();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objectName3.isPropertyValuePattern("Batch status: FAILED");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.restart(1L, "-lifecycle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getStepExecutions((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str6 = objectName4.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean11 = objectName10.isPattern();
        java.lang.String str12 = objectName10.getCanonicalKeyPropertyListString();
        int int13 = objectName4.compareTo(objectName10);
        boolean boolean14 = objectName10.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap15 = objectName10.getKeyPropertyList();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap16 = objectName10.getKeyPropertyList();
        javax.management.ObjectName objectName17 = new javax.management.ObjectName("instance id", strMap16);
        java.lang.String str18 = objectName17.getKeyPropertyListString();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap19 = objectName17.getKeyPropertyList();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str12, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str18, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.restart((long) ' ', "instance id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("instances: list instances");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = batchEE10.start("running: list running batches", "evict: remove old data, uses embedded configuration (no JAXRS support yet)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE1.getJobInstances("sample-step", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        boolean boolean6 = objectName3.isDomainPattern();
        javax.management.MBeanServer mBeanServer7 = null;
        objectName3.setMBeanServer(mBeanServer7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.stop((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = javax.management.ObjectName.getInstance("sample");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        boolean boolean8 = objectName3.isPropertyPattern();
        java.lang.String str10 = objectName3.getKeyProperty("sample");
        java.lang.String str11 = objectName3.getCanonicalKeyPropertyListString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objectName3.isPropertyValuePattern("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.equals((java.lang.Object) (short) 0);
        boolean boolean7 = objectName3.isPropertyValuePattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getJobExecution(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = batchEE2.getJobInstanceCount("sample\t|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = new javax.management.ObjectName("sample-step", "status=ok", "executions: list executions");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid character in value: `='");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getParameters((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("\"status: list last batches statuses\"", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getJobInstance((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE2.getJobExecutions(100L, "user2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getJobInstance((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getParameters((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE10.restart(1L, "-name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        boolean boolean7 = objectName3.isPattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecutions((long) (short) -1, "Batch 'sample' started with id #");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = new javax.management.ObjectName("hi!");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = batchEE2.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getCanonicalName();
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        java.lang.String str12 = objectName9.toString();
        javax.management.ObjectName objectName13 = javax.management.ObjectName.getInstance(objectName9);
        int int14 = objectName3.compareTo(objectName9);
        java.lang.String str15 = objectName3.getCanonicalName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str5, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str12, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str15, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable3 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException5);
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException6);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException8 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException6);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable12 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException13 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable12);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException14 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable12);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException15 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException14);
        batchContainerRuntimeException10.addSuppressed((java.lang.Throwable) batchContainerRuntimeException15);
        batchContainerRuntimeException8.addSuppressed((java.lang.Throwable) batchContainerRuntimeException10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.apache.batchee.container.services.ServicesManagerLocator servicesManagerLocator0 = org.apache.batchee.container.services.locator.SingletonLocator.INSTANCE;
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator(servicesManagerLocator0);
        org.junit.Assert.assertNotNull(servicesManagerLocator0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = batchEE12.getJobInstanceCount("status: list last batches statuses");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getCanonicalName();
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        java.lang.String str12 = objectName9.toString();
        javax.management.ObjectName objectName13 = javax.management.ObjectName.getInstance(objectName9);
        int int14 = objectName3.compareTo(objectName9);
        boolean boolean16 = objectName9.equals((java.lang.Object) "");
        boolean boolean17 = objectName9.isDomainPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str5, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str12, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.abandon((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("Batch 'long-sample' started with id #");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = batchEE12.getJobInstanceCount("instance id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.abandon((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.Throwable throwable0 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable0);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable8 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable8);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable8);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException11 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException10);
        batchContainerRuntimeException6.addSuppressed((java.lang.Throwable) batchContainerRuntimeException11);
        batchContainerRuntimeException3.addSuppressed((java.lang.Throwable) batchContainerRuntimeException11);
        java.lang.String str14 = batchContainerRuntimeException11.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED" + "'", str14, "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.isPropertyValuePattern();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray14 = batchEE12.getRunningExecutions("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        boolean boolean6 = objectName3.isDomainPattern();
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str12 = objectName10.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName16 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean17 = objectName16.isPattern();
        java.lang.String str18 = objectName16.getCanonicalKeyPropertyListString();
        int int19 = objectName10.compareTo(objectName16);
        boolean boolean20 = objectName16.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap21 = objectName16.getKeyPropertyList();
        java.lang.String str22 = objectName16.getCanonicalName();
        boolean boolean23 = objectName3.apply(objectName16);
        boolean boolean24 = objectName3.isPattern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str18, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str22, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecutions((long) (-1), "start: start a batch");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        javax.management.ObjectName objectName1 = new javax.management.ObjectName(":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray15 = batchEE13.getRunningExecutions("Batch status: FAILED");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getCanonicalName();
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        java.lang.String str12 = objectName9.toString();
        javax.management.ObjectName objectName13 = javax.management.ObjectName.getInstance(objectName9);
        int int14 = objectName3.compareTo(objectName9);
        boolean boolean15 = objectName9.isPropertyValuePattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str5, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str12, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = batchEE12.start("start stop", "-lifecycle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE12.start("start: start a batch", "stepExecutions: list step executions for a particular execution");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str7 = objectName3.getKeyProperty("called");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("user1", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = new javax.management.ObjectName("Available commands:", "", "");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: Available commands:");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getStepExecutions(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getCanonicalName();
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        java.lang.String str12 = objectName9.toString();
        javax.management.ObjectName objectName13 = javax.management.ObjectName.getInstance(objectName9);
        int int14 = objectName3.compareTo(objectName9);
        java.lang.String str15 = objectName3.getDomain();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str5, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str12, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE12.getJobExecution((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.restart((long) 10, "status: list last batches statuses");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = new javax.management.ObjectName("Batch 'sample' started with id #");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.Throwable throwable0 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable0);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable8 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable8);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable8);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException11 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException10);
        batchContainerRuntimeException6.addSuppressed((java.lang.Throwable) batchContainerRuntimeException11);
        batchContainerRuntimeException3.addSuppressed((java.lang.Throwable) batchContainerRuntimeException11);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException14 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE10.getJobInstances("sample-step", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE10.getParameters((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE12.getStepExecutions((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = batchEE10.getJobInstanceCount("long-sample");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.isPropertyValuePattern();
        javax.management.MBeanServer mBeanServer7 = null;
        objectName3.setMBeanServer(mBeanServer7);
        boolean boolean9 = objectName3.isPropertyValuePattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        java.lang.String str8 = objectName3.getCanonicalName();
        java.lang.String str9 = objectName3.getCanonicalKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str8, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str9, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = batchEE12.getJobInstanceCount("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE13.getJobInstance((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = batchEE12.restart((long) 'a', "restart: restart a batch");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = javax.management.ObjectName.getInstance("Stopped");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        javax.management.ObjectName objectName6 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str8 = objectName6.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        int int15 = objectName6.compareTo(objectName12);
        boolean boolean16 = objectName12.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap17 = objectName12.getKeyPropertyList();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap18 = objectName12.getKeyPropertyList();
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("instance id", strMap18);
        javax.management.ObjectName objectName20 = new javax.management.ObjectName("-id", strMap18);
        javax.management.ObjectName objectName21 = javax.management.ObjectName.getInstance("instance id", strMap18);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(objectName21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.junit.Assert.assertNotNull(servicesManager1);
        org.junit.Assert.assertNotNull(servicesManager2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.stop((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        javax.management.ObjectName objectName6 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str8 = objectName6.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        int int15 = objectName6.compareTo(objectName12);
        boolean boolean16 = objectName12.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap17 = objectName12.getKeyPropertyList();
        javax.management.ObjectName objectName18 = new javax.management.ObjectName("hi!", strMap17);
        javax.management.ObjectName objectName19 = javax.management.ObjectName.getInstance("sample", strMap17);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName20 = new javax.management.ObjectName("executions: list executions", strMap17);
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: executions: list executions");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(objectName19);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("-lifecycle", "hi!", "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.abandon(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE2.getJobExecutions((long) (short) 100, "org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = batchEE1.getJobInstanceCount("org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.Hashtable<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = new javax.management.ObjectName("long-sample -> [", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: key property list cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = batchEE12.start("long-sample -> [", "executions: list executions");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        javax.management.ObjectName objectName11 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str13 = objectName11.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        int int14 = objectName3.compareTo(objectName11);
        javax.management.MBeanServer mBeanServer15 = null;
        objectName11.setMBeanServer(mBeanServer15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = batchEE13.getJobInstanceCount("org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("running: list running batches", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = batchEE10.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = new javax.management.ObjectName("-name");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        javax.management.ObjectName objectName0 = javax.management.ObjectName.WILDCARD;
        org.junit.Assert.assertNotNull(objectName0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobExecution((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = javax.management.ObjectName.getInstance("stop: stop a batch from its id", "", "Batch 'long-sample' started with id #");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: stop: stop a batch from its id");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData17 = batchEE12.getJobInstances("\"evict\"", (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.abandon((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = new javax.management.ObjectName("sample-step", "sample\t|", "Batch 'sample' started with id #=sample-step");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid character `=' in value");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.abandon((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        java.lang.String str9 = objectName3.getKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str9, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray3 = batchEE1.getRunningExecutions("-lifecycle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.getKeyProperty("org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean11 = objectName10.isPattern();
        java.lang.String str12 = objectName10.getCanonicalKeyPropertyListString();
        java.lang.String str13 = objectName10.getCanonicalName();
        boolean boolean14 = objectName3.apply(objectName10);
        java.lang.Class<?> wildcardClass15 = objectName10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str12, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str13, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE12.restart((long) 1, "-until <arg>   date until when the eviction will occur (excluded),");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.stop((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str6 = objectName4.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean11 = objectName10.isPattern();
        java.lang.String str12 = objectName10.getCanonicalKeyPropertyListString();
        int int13 = objectName4.compareTo(objectName10);
        boolean boolean14 = objectName10.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap15 = objectName10.getKeyPropertyList();
        javax.management.ObjectName objectName16 = javax.management.ObjectName.getInstance("OK", strMap15);
        boolean boolean17 = objectName16.isPropertyPattern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str12, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(objectName16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.equals((java.lang.Object) (short) 0);
        javax.management.MBeanServer mBeanServer7 = null;
        objectName3.setMBeanServer(mBeanServer7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        java.lang.String str15 = objectName12.toString();
        java.lang.String str16 = objectName12.getDomain();
        java.lang.String str17 = objectName12.getCanonicalName();
        boolean boolean18 = objectName3.apply(objectName12);
        java.lang.String str19 = objectName12.getKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str15, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str17, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str19, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str6 = objectName4.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean11 = objectName10.isPattern();
        java.lang.String str12 = objectName10.getCanonicalKeyPropertyListString();
        int int13 = objectName4.compareTo(objectName10);
        boolean boolean14 = objectName10.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap15 = objectName10.getKeyPropertyList();
        javax.management.ObjectName objectName16 = new javax.management.ObjectName("hi!", strMap15);
        boolean boolean17 = objectName16.isPropertyPattern();
        java.lang.String str18 = objectName16.getKeyPropertyListString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str12, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str18, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        boolean boolean8 = objectName3.isPropertyPattern();
        java.lang.String str10 = objectName3.getKeyProperty("start: start a batch");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE10.stop((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.isPropertyValuePattern();
        boolean boolean7 = objectName3.isPropertyValuePattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = batchEE12.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        java.lang.String str8 = objectName7.getKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str8, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecutions(0L, "User");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = javax.management.ObjectName.getInstance("Batch 'sample' started with id #", "instances: list instances", "step id\t|\t step name\t|\t    start time   \t|\t     end time    \t|\texit status\t|\tbatch status\t|\tREAD_COUNT\t|\tWRITE_COUNT\t|\tCOMMIT_COUNT\t|\tROLLBACK_COUNT\t|\tREAD_SKIP_COUNT\t|\tPROCESS_SKIP_COUNT\t|\tFILTER_COUNT\t|\tWRITE_SKIP_COUNT");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid character in key: `:'");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE10.stop((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getStepExecutions((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = new javax.management.ObjectName("No job started");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecutions((long) 'a', "abandon: abandon a batch from its id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String str1 = javax.management.ObjectName.quote("\"evict\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"evict\\\"\"" + "'", str1, "\"\\\"evict\\\"\"");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobExecution((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray14 = batchEE12.getRunningExecutions("help");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE10.restart((long) 1, "-lifecycle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.stop((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE1.getJobExecutions((long) (short) -1, ":Batch 'sample' started with id #=sample-step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        boolean boolean6 = objectName3.isDomainPattern();
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str12 = objectName10.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName16 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean17 = objectName16.isPattern();
        java.lang.String str18 = objectName16.getCanonicalKeyPropertyListString();
        int int19 = objectName10.compareTo(objectName16);
        boolean boolean20 = objectName16.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap21 = objectName16.getKeyPropertyList();
        java.lang.String str22 = objectName16.getCanonicalName();
        boolean boolean23 = objectName3.apply(objectName16);
        java.lang.String str24 = objectName3.getCanonicalKeyPropertyListString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str18, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str22, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str24, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE12.start("running: list running batches", "called");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.Hashtable<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = new javax.management.ObjectName("step id\t|\t step name\t|\t    start time   \t|\t     end time    \t|\texit status\t|\tbatch status\t|\tREAD_COUNT\t|\tWRITE_COUNT\t|\tCOMMIT_COUNT\t|\tROLLBACK_COUNT\t|\tREAD_SKIP_COUNT\t|\tPROCESS_SKIP_COUNT\t|\tFILTER_COUNT\t|\tWRITE_SKIP_COUNT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: key property list cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("status: list last batches statuses");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.Throwable throwable3 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("sample has", (java.lang.Throwable) batchContainerRuntimeException5);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException7 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("stepExecutions: list step executions for a particular execution", (java.lang.Throwable) batchContainerRuntimeException5);
        java.lang.String str8 = batchContainerRuntimeException5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED" + "'", str8, "org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE2.getJobExecutions(1L, "sample");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.stop(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE10.getJobExecutions((long) (byte) 1, "\"names: list known batches\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.getCanonicalName();
        java.lang.String str7 = objectName3.getDomain();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.start("\"\\\"evict\\\"\"", "user2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = javax.management.ObjectName.getInstance("remove old data, uses embedded configuration (no JAXRS support yet)");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Key properties cannot be empty");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable3 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException5);
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException6);
        java.lang.String str8 = batchContainerRuntimeException1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped" + "'", str8, "org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData17 = batchEE12.getJobInstances("abandon: abandon a batch from its id", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobExecution((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.Throwable throwable2 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("sample has", (java.lang.Throwable) batchContainerRuntimeException4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException4);
        java.lang.Throwable[] throwableArray7 = batchContainerRuntimeException6.getSuppressed();
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException8 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.String str2 = org.apache.batchee.container.services.ServicesManager.value("long-sample -> [", "1236");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1236" + "'", str2, "1236");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getDomain();
        javax.management.ObjectName objectName8 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean9 = objectName8.isPattern();
        java.lang.String str10 = objectName8.getCanonicalKeyPropertyListString();
        boolean boolean11 = objectName8.isPropertyListPattern();
        boolean boolean12 = objectName8.isPropertyValuePattern();
        boolean boolean13 = objectName3.apply(objectName8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str10, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray3 = batchEE1.getRunningExecutions("Batch 'sample' started with id #");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.String str1 = javax.management.ObjectName.quote("remove old data, uses embedded configuration (no JAXRS support yet)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"remove old data, uses embedded configuration (no JAXRS support yet)\"" + "'", str1, "\"remove old data, uses embedded configuration (no JAXRS support yet)\"");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getStepExecutions(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getJobExecution((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException0 = new org.apache.batchee.container.exception.BatchContainerRuntimeException();
        java.lang.Throwable[] throwableArray1 = batchContainerRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = batchContainerRuntimeException0.getSuppressed();
        java.lang.Throwable throwable4 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException7 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        batchContainerRuntimeException5.addSuppressed((java.lang.Throwable) batchContainerRuntimeException7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable12 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException13 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable12);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException14 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable12);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException15 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException14);
        batchContainerRuntimeException10.addSuppressed((java.lang.Throwable) batchContainerRuntimeException15);
        batchContainerRuntimeException7.addSuppressed((java.lang.Throwable) batchContainerRuntimeException15);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException18 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("-name", (java.lang.Throwable) batchContainerRuntimeException15);
        batchContainerRuntimeException0.addSuppressed((java.lang.Throwable) batchContainerRuntimeException18);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecutions((long) ' ', "Batch 'sample' started with id #");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        int int12 = objectName3.compareTo(objectName9);
        boolean boolean13 = objectName9.isPattern();
        boolean boolean14 = objectName9.isPropertyListPattern();
        java.lang.String str15 = objectName9.getDomain();
        java.lang.String str16 = objectName9.getCanonicalName();
        boolean boolean17 = objectName9.isPropertyListPattern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str16, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray14 = batchEE10.getRunningExecutions("Executions of sample for instance");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.getCanonicalName();
        boolean boolean7 = objectName3.isPattern();
        boolean boolean8 = objectName3.isPropertyPattern();
        java.lang.String str9 = objectName3.getCanonicalName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str9, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.abandon((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.Class<?> wildcardClass10 = objectName9.getClass();
        boolean boolean11 = objectName3.equals((java.lang.Object) objectName9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objectName9.isPropertyValuePattern("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        java.lang.String str8 = objectName7.getCanonicalName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str8, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getKeyPropertyListString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.stop((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.apache.batchee.container.services.ServicesManager servicesManager0 = new org.apache.batchee.container.services.ServicesManager();
        servicesManager0.close();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager4 = singletonLocator0.find();
        org.junit.Assert.assertNotNull(servicesManager2);
        org.junit.Assert.assertNotNull(servicesManager3);
        org.junit.Assert.assertNotNull(servicesManager4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Hashtable<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = new javax.management.ObjectName("COMPLETED", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: key property list cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = new javax.management.ObjectName("user1", "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED", "step id\t|\t step name\t|\t    start time   \t|\t     end time    \t|\texit status\t|\tbatch status\t|\tREAD_COUNT\t|\tWRITE_COUNT\t|\tCOMMIT_COUNT\t|\tROLLBACK_COUNT\t|\tREAD_SKIP_COUNT\t|\tPROCESS_SKIP_COUNT\t|\tFILTER_COUNT\t|\tWRITE_SKIP_COUNT");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid character in key: `:'");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.toString();
        java.lang.String str8 = objectName3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str7, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str8, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        org.junit.Assert.assertNotNull(servicesManager1);
        org.junit.Assert.assertNotNull(servicesManager2);
        org.junit.Assert.assertNotNull(servicesManager3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        boolean boolean8 = objectName3.isDomainPattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("instances: list instances");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE10.getJobExecution((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName4.getDomain();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap6 = objectName4.getKeyPropertyList();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance("User", strMap6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(objectName7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.junit.Assert.assertNotNull(servicesManager1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE10.getStepExecutions((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE10.start("usage: evict -until <arg>", "Executions of sample for instance");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        int int12 = objectName3.compareTo(objectName9);
        boolean boolean13 = objectName9.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap14 = objectName9.getKeyPropertyList();
        java.lang.String str15 = objectName9.getCanonicalName();
        boolean boolean16 = objectName9.isPropertyValuePattern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str15, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException();
        java.lang.Throwable[] throwableArray2 = batchContainerRuntimeException1.getSuppressed();
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("instances: list instances", (java.lang.Throwable) batchContainerRuntimeException1);
        java.lang.String str4 = batchContainerRuntimeException3.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: instances: list instances" + "'", str4, "org.apache.batchee.container.exception.BatchContainerRuntimeException: instances: list instances");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        javax.management.ObjectName objectName6 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str8 = objectName6.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        int int15 = objectName6.compareTo(objectName12);
        boolean boolean16 = objectName12.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap17 = objectName12.getKeyPropertyList();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap18 = objectName12.getKeyPropertyList();
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("instance id", strMap18);
        javax.management.ObjectName objectName20 = new javax.management.ObjectName("-id", strMap18);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName21 = javax.management.ObjectName.getInstance("org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED", strMap18);
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str5 = objectName3.getDomain();
        java.lang.String str6 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str7 = objectName3.getDomain();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str6, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException();
        java.lang.Throwable[] throwableArray2 = batchContainerRuntimeException1.getSuppressed();
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("instances: list instances", (java.lang.Throwable) batchContainerRuntimeException1);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = batchEE10.getJobInstanceCount("names: list known batches");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData17 = batchEE13.getJobInstances("", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("sample-step");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.abandon((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.isPropertyValuePattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap7 = objectName3.getKeyPropertyList();
        java.lang.String str8 = objectName3.toString();
        java.lang.String str10 = objectName3.getKeyProperty("\"evict\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str8, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = batchEE1.start("org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped", "User");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str7, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        boolean boolean8 = objectName3.isPropertyPattern();
        java.lang.String str10 = objectName3.getKeyProperty("sample");
        javax.management.ObjectName objectName14 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean15 = objectName14.isPattern();
        boolean boolean16 = objectName14.isPropertyValuePattern();
        java.lang.String str17 = objectName14.toString();
        java.lang.String str18 = objectName14.getCanonicalKeyPropertyListString();
        javax.management.ObjectName objectName22 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str24 = objectName22.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        int int25 = objectName14.compareTo(objectName22);
        int int26 = objectName3.compareTo(objectName22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str17, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str18, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        java.lang.Class<?> wildcardClass2 = servicesManager1.getClass();
        org.junit.Assert.assertNotNull(servicesManager1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = javax.management.ObjectName.getInstance("Batch status: COMPLETED", "org.apache.batchee.container.exception.BatchContainerRuntimeException: instances: list instances", "status=ok");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: Batch status: COMPLETED");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = batchEE12.getJobInstanceCount("long-sample -> [");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecutions(0L, "instances: list instances");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        java.lang.String str15 = objectName12.toString();
        java.lang.String str16 = objectName12.getDomain();
        java.lang.String str17 = objectName12.getCanonicalName();
        boolean boolean18 = objectName3.apply(objectName12);
        java.util.Hashtable<java.lang.String, java.lang.String> strMap19 = objectName3.getKeyPropertyList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str15, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str17, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE12.abandon((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException2 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable4 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException7 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException6);
        batchContainerRuntimeException2.addSuppressed((java.lang.Throwable) batchContainerRuntimeException7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException7);
        java.lang.Throwable[] throwableArray10 = batchContainerRuntimeException9.getSuppressed();
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException12 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        batchContainerRuntimeException9.addSuppressed((java.lang.Throwable) batchContainerRuntimeException12);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException14 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException12);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException15 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("line.separator", (java.lang.Throwable) batchContainerRuntimeException14);
        java.lang.String str16 = batchContainerRuntimeException14.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped" + "'", str16, "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE10.restart((long) (byte) 10, "status=fail");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String str1 = javax.management.ObjectName.quote("start stop");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"start stop\"" + "'", str1, "\"start stop\"");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        java.lang.String str15 = objectName12.toString();
        java.lang.String str16 = objectName12.getDomain();
        java.lang.String str17 = objectName12.getCanonicalName();
        boolean boolean18 = objectName3.apply(objectName12);
        java.lang.String str19 = objectName12.getCanonicalKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str15, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str17, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str19, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobExecution((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getCanonicalKeyPropertyListString();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.isPropertyListPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str4, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.getCanonicalName();
        boolean boolean7 = objectName3.isPattern();
        boolean boolean8 = objectName3.isPropertyPattern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objectName3.isPropertyValuePattern(":Batch 'sample' started with id #=sample-step");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        javax.management.ObjectName objectName6 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str8 = objectName6.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        int int15 = objectName6.compareTo(objectName12);
        boolean boolean16 = objectName12.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap17 = objectName12.getKeyPropertyList();
        javax.management.ObjectName objectName18 = javax.management.ObjectName.getInstance("OK", strMap17);
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("called", strMap17);
        javax.management.ObjectName objectName20 = new javax.management.ObjectName("long-sample -> [", strMap17);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(objectName18);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.lang.String str1 = javax.management.ObjectName.quote("stop: stop a batch from its id");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"stop: stop a batch from its id\"" + "'", str1, "\"stop: stop a batch from its id\"");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData17 = batchEE13.getJobInstances("Batch status: FAILED", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        java.lang.String str9 = objectName3.getKeyProperty("COMPLETED");
        javax.management.MBeanServer mBeanServer10 = null;
        objectName3.setMBeanServer(mBeanServer10);
        boolean boolean12 = objectName3.isPropertyPattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = batchEE12.start("org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        boolean boolean6 = objectName3.isPropertyValuePattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap7 = objectName3.getKeyPropertyList();
        javax.management.ObjectName objectName8 = javax.management.ObjectName.getInstance(objectName3);
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        java.lang.String str15 = objectName12.toString();
        javax.management.ObjectName objectName16 = javax.management.ObjectName.getInstance(objectName12);
        boolean boolean17 = objectName12.isPattern();
        javax.management.ObjectName objectName21 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean22 = objectName21.isPattern();
        java.lang.String str23 = objectName21.getCanonicalKeyPropertyListString();
        java.lang.String str24 = objectName21.toString();
        java.lang.String str25 = objectName21.getDomain();
        java.lang.String str26 = objectName21.getCanonicalName();
        boolean boolean27 = objectName12.apply(objectName21);
        int int28 = objectName3.compareTo(objectName21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(objectName8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str15, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str23, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str24, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str26, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.Throwable throwable1 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException2 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable1);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable1);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException3);
        java.lang.String str6 = batchContainerRuntimeException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED" + "'", str6, "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        org.junit.Assert.assertNotNull(servicesManager3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.Throwable throwable2 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("sample has", (java.lang.Throwable) batchContainerRuntimeException4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException4);
        java.lang.Throwable[] throwableArray7 = batchContainerRuntimeException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        java.util.Properties properties3 = null;
        servicesManager2.init(properties3);
        java.util.Properties properties5 = null;
        servicesManager2.init(properties5);
        org.junit.Assert.assertNotNull(servicesManager2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray4 = batchEE2.getRunningExecutions("-name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        javax.management.ObjectName objectName11 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str13 = objectName11.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        int int14 = objectName3.compareTo(objectName11);
        javax.management.ObjectName objectName18 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str19 = objectName18.getCanonicalKeyPropertyListString();
        java.lang.String str20 = objectName18.getCanonicalName();
        javax.management.ObjectName objectName24 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean25 = objectName24.isPattern();
        java.lang.String str26 = objectName24.getCanonicalKeyPropertyListString();
        java.lang.String str27 = objectName24.toString();
        javax.management.ObjectName objectName28 = javax.management.ObjectName.getInstance(objectName24);
        int int29 = objectName18.compareTo(objectName24);
        boolean boolean30 = objectName24.isPropertyListPattern();
        boolean boolean31 = objectName3.apply(objectName24);
        java.lang.String str32 = objectName3.getKeyPropertyListString();
        boolean boolean33 = objectName3.isPattern();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str19, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str20, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str26, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str27, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str32, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("long-sample", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = batchEE13.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String str1 = javax.management.ObjectName.quote("running: list running batches");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"running: list running batches\"" + "'", str1, "\"running: list running batches\"");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean5 = objectName4.isPattern();
        boolean boolean6 = objectName4.isPropertyValuePattern();
        java.lang.String str7 = objectName4.toString();
        java.lang.String str8 = objectName4.getCanonicalKeyPropertyListString();
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str14 = objectName12.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        int int15 = objectName4.compareTo(objectName12);
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str20 = objectName19.getCanonicalKeyPropertyListString();
        java.lang.String str21 = objectName19.getCanonicalName();
        javax.management.ObjectName objectName25 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean26 = objectName25.isPattern();
        java.lang.String str27 = objectName25.getCanonicalKeyPropertyListString();
        java.lang.String str28 = objectName25.toString();
        javax.management.ObjectName objectName29 = javax.management.ObjectName.getInstance(objectName25);
        int int30 = objectName19.compareTo(objectName25);
        boolean boolean31 = objectName25.isPropertyListPattern();
        boolean boolean32 = objectName4.apply(objectName25);
        java.lang.String str33 = objectName4.getKeyPropertyListString();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap34 = objectName4.getKeyPropertyList();
        javax.management.ObjectName objectName35 = new javax.management.ObjectName("Batch 'sample' started with id #=sample-step", strMap34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str7, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str8, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str20, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str21, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str27, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str28, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str33, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE2.getJobExecutions((long) (short) 1, "Batch status: COMPLETED");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData6 = batchEE2.getJobInstances("status=fail", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.String str1 = javax.management.ObjectName.quote("sample\t|");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"sample\t|\"" + "'", str1, "\"sample\t|\"");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE10.abandon((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE1.getJobInstances("-socket", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        javax.management.ObjectName objectName4 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str6 = objectName4.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName10 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean11 = objectName10.isPattern();
        java.lang.String str12 = objectName10.getCanonicalKeyPropertyListString();
        int int13 = objectName4.compareTo(objectName10);
        boolean boolean14 = objectName10.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap15 = objectName10.getKeyPropertyList();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap16 = objectName10.getKeyPropertyList();
        javax.management.ObjectName objectName17 = new javax.management.ObjectName("instance id", strMap16);
        java.lang.String str18 = objectName17.getCanonicalKeyPropertyListString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str12, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str18, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        javax.management.ObjectName objectName6 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str8 = objectName6.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        int int15 = objectName6.compareTo(objectName12);
        boolean boolean16 = objectName12.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap17 = objectName12.getKeyPropertyList();
        javax.management.ObjectName objectName18 = javax.management.ObjectName.getInstance("OK", strMap17);
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("called", strMap17);
        javax.management.ObjectName objectName20 = javax.management.ObjectName.getInstance("remove old data, uses embedded configuration (no JAXRS support yet)", strMap17);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(objectName18);
        org.junit.Assert.assertNotNull(objectName20);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData3 = batchEE1.getParameters((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE1.abandon(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        int int12 = objectName3.compareTo(objectName9);
        boolean boolean13 = objectName9.isPattern();
        boolean boolean14 = objectName9.isPropertyListPattern();
        java.lang.String str15 = objectName9.getDomain();
        boolean boolean16 = objectName9.isPropertyListPattern();
        boolean boolean17 = objectName9.isPropertyListPattern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getStepExecutions(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        java.util.Properties properties4 = null;
        servicesManager3.init(properties4);
        org.junit.Assert.assertNotNull(servicesManager1);
        org.junit.Assert.assertNotNull(servicesManager2);
        org.junit.Assert.assertNotNull(servicesManager3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        java.util.Properties properties4 = null;
        servicesManager3.init(properties4);
        org.junit.Assert.assertNotNull(servicesManager1);
        org.junit.Assert.assertNotNull(servicesManager2);
        org.junit.Assert.assertNotNull(servicesManager3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobExecution((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            batchEE2.abandon((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        int int12 = objectName3.compareTo(objectName9);
        boolean boolean13 = objectName9.isPattern();
        boolean boolean14 = objectName9.isPropertyListPattern();
        javax.management.ObjectName objectName15 = javax.management.ObjectName.getInstance(objectName9);
        java.lang.String str16 = objectName9.getKeyPropertyListString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectName15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str16, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("long-sample -> [");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable3 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException5);
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException6);
        java.lang.String str8 = batchContainerRuntimeException6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED" + "'", str8, "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData15 = batchEE12.getJobInstance(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        org.junit.Assert.assertNotNull(servicesManager1);
        org.junit.Assert.assertNotNull(servicesManager2);
        org.junit.Assert.assertNotNull(servicesManager3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = batchEE12.getJobInstanceCount("\"evict\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        javax.management.ObjectName objectName6 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str8 = objectName6.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName12 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean13 = objectName12.isPattern();
        java.lang.String str14 = objectName12.getCanonicalKeyPropertyListString();
        int int15 = objectName6.compareTo(objectName12);
        boolean boolean16 = objectName12.isPattern();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap17 = objectName12.getKeyPropertyList();
        java.util.Hashtable<java.lang.String, java.lang.String> strMap18 = objectName12.getKeyPropertyList();
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("instance id", strMap18);
        javax.management.ObjectName objectName20 = new javax.management.ObjectName("-id", strMap18);
        javax.management.ObjectName objectName21 = javax.management.ObjectName.getInstance("", strMap18);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str14, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(objectName21);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        boolean boolean8 = objectName3.isPropertyPattern();
        java.lang.String str9 = objectName3.getKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str9, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getDomain();
        java.lang.String str9 = objectName3.getKeyProperty("COMPLETED");
        javax.management.ObjectName objectName10 = javax.management.ObjectName.getInstance(objectName3);
        java.lang.String str11 = objectName3.getCanonicalName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(objectName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str11, ":Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getJobExecution(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData17 = batchEE12.getJobInstances(":Batch 'sample' started with id #=sample-step", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE10.restart((long) (short) 0, "usage: evict -until <arg>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        javax.management.ObjectName objectName15 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean16 = objectName15.isPattern();
        java.lang.String str17 = objectName15.getCanonicalKeyPropertyListString();
        java.lang.String str18 = objectName15.toString();
        java.lang.String str19 = objectName15.getDomain();
        java.lang.String str21 = objectName15.getKeyProperty("COMPLETED");
        javax.management.ObjectName objectName22 = javax.management.ObjectName.getInstance(objectName15);
        int int23 = objectName3.compareTo(objectName15);
        java.lang.String str24 = objectName15.getDomain();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str17, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str18, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(objectName22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objectName3.isPropertyValuePattern("-name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key property not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[] longArray3 = batchEE1.getRunningExecutions("\"status: list last batches statuses\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = batchEE10.start("status=fail", "org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = batchEE10.start("start: start a batch", "restart: restart a batch");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.junit.Assert.assertNotNull(servicesManager1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("line.separator");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = batchEE12.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        boolean boolean5 = objectName3.isPropertyValuePattern();
        java.lang.String str6 = objectName3.toString();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        javax.management.ObjectName objectName11 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str13 = objectName11.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        int int14 = objectName3.compareTo(objectName11);
        javax.management.ObjectName objectName18 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str19 = objectName18.getCanonicalKeyPropertyListString();
        java.lang.String str20 = objectName18.getCanonicalName();
        javax.management.ObjectName objectName24 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean25 = objectName24.isPattern();
        java.lang.String str26 = objectName24.getCanonicalKeyPropertyListString();
        java.lang.String str27 = objectName24.toString();
        javax.management.ObjectName objectName28 = javax.management.ObjectName.getInstance(objectName24);
        int int29 = objectName18.compareTo(objectName24);
        boolean boolean30 = objectName24.isPropertyListPattern();
        boolean boolean31 = objectName3.apply(objectName24);
        boolean boolean32 = objectName24.isPropertyValuePattern();
        javax.management.MBeanServer mBeanServer33 = null;
        objectName24.setMBeanServer(mBeanServer33);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str19, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str20, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str26, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str27, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException0 = new org.apache.batchee.container.exception.BatchContainerRuntimeException();
        java.lang.Throwable[] throwableArray1 = batchContainerRuntimeException0.getSuppressed();
        java.lang.String str2 = batchContainerRuntimeException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.batchee.container.exception.BatchContainerRuntimeException" + "'", str2, "org.apache.batchee.container.exception.BatchContainerRuntimeException");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData5 = batchEE1.getJobInstances("Batch status: COMPLETED", 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException0 = new org.apache.batchee.container.exception.BatchContainerRuntimeException();
        java.lang.Throwable[] throwableArray1 = batchContainerRuntimeException0.getSuppressed();
        java.lang.Throwable throwable5 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable5);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException7 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable5);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException8 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("sample has", (java.lang.Throwable) batchContainerRuntimeException7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("stepExecutions: list step executions for a particular execution", (java.lang.Throwable) batchContainerRuntimeException7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException7);
        batchContainerRuntimeException0.addSuppressed((java.lang.Throwable) batchContainerRuntimeException10);
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = new javax.management.ObjectName("org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED", "remove old data, uses embedded configuration (no JAXRS support yet)", "line.separator");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid domain: org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getParameters((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = javax.management.ObjectName.getInstance("org.apache.batchee.container.exception.BatchContainerRuntimeException: org.apache.batchee.container.exception.BatchContainerRuntimeException: Stopped");
            org.junit.Assert.fail("Expected exception of type javax.management.MalformedObjectNameException; message: Invalid character ':' in key part of property");
        } catch (javax.management.MalformedObjectNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.lang.Throwable throwable2 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException4 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable2);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("org.apache.batchee.container.exception.BatchContainerRuntimeException: Batch status: FAILED", (java.lang.Throwable) batchContainerRuntimeException5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        boolean boolean6 = objectName3.isPropertyListPattern();
        java.lang.String str7 = objectName3.getCanonicalKeyPropertyListString();
        boolean boolean9 = objectName3.equals((java.lang.Object) "stepExecutions: list step executions for a particular execution");
        java.lang.String str10 = objectName3.getKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str7, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str10, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str5 = objectName3.getKeyProperty("org.apache.batchee:type=batchee,name=operator");
        javax.management.ObjectName objectName9 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean10 = objectName9.isPattern();
        java.lang.String str11 = objectName9.getCanonicalKeyPropertyListString();
        int int12 = objectName3.compareTo(objectName9);
        boolean boolean13 = objectName9.isPattern();
        boolean boolean14 = objectName9.isPropertyListPattern();
        java.lang.String str15 = objectName9.getDomain();
        javax.management.ObjectName objectName19 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean20 = objectName9.equals((java.lang.Object) "sample-step");
        boolean boolean21 = objectName9.isPropertyValuePattern();
        javax.management.ObjectName objectName22 = javax.management.ObjectName.getInstance(objectName9);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str11, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectName22);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE13 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = batchEE13.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData14 = batchEE10.getJobExecutions((long) '#', "user1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            batchEE10.stop((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getJobInstance((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        org.apache.batchee.jmx.BatchEE batchEE12 = new org.apache.batchee.jmx.BatchEE((org.apache.batchee.jmx.BatchEEMBean) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = batchEE12.getJobNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.lang.Throwable throwable0 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable0);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException3 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        batchContainerRuntimeException1.addSuppressed((java.lang.Throwable) batchContainerRuntimeException3);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable8 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable8);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException10 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable8);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException11 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException10);
        batchContainerRuntimeException6.addSuppressed((java.lang.Throwable) batchContainerRuntimeException11);
        batchContainerRuntimeException3.addSuppressed((java.lang.Throwable) batchContainerRuntimeException11);
        java.lang.Throwable throwable15 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException16 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable15);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException17 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable15);
        // The following exception was thrown during execution in test generation
        try {
            batchContainerRuntimeException3.addSuppressed(throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData13 = batchEE10.getStepExecutions((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException1 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("status: list last batches statuses");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = javax.management.ObjectName.unquote("No job started");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument not quoted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        javax.management.ObjectName objectName15 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean16 = objectName15.isPattern();
        java.lang.String str17 = objectName15.getCanonicalKeyPropertyListString();
        java.lang.String str18 = objectName15.toString();
        java.lang.String str19 = objectName15.getDomain();
        java.lang.String str21 = objectName15.getKeyProperty("COMPLETED");
        javax.management.ObjectName objectName22 = javax.management.ObjectName.getInstance(objectName15);
        int int23 = objectName3.compareTo(objectName15);
        java.lang.String str24 = objectName15.getKeyPropertyListString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str17, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str18, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(objectName22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str24, "Batch 'sample' started with id #=sample-step");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        java.lang.String str4 = objectName3.getDomain();
        boolean boolean5 = objectName3.isPropertyPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean0 = null;
        org.apache.batchee.jmx.BatchEE batchEE1 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        org.apache.batchee.jmx.BatchEE batchEE2 = new org.apache.batchee.jmx.BatchEE(batchEEMBean0);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.openmbean.TabularData tabularData4 = batchEE2.getParameters((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        javax.management.ObjectName objectName3 = new javax.management.ObjectName("", "Batch 'sample' started with id #", "sample-step");
        boolean boolean4 = objectName3.isPattern();
        java.lang.String str5 = objectName3.getCanonicalKeyPropertyListString();
        java.lang.String str6 = objectName3.toString();
        javax.management.ObjectName objectName7 = javax.management.ObjectName.getInstance(objectName3);
        boolean boolean8 = objectName3.isPattern();
        org.apache.batchee.jmx.BatchEEMBean batchEEMBean9 = null;
        org.apache.batchee.jmx.BatchEE batchEE10 = new org.apache.batchee.jmx.BatchEE(batchEEMBean9);
        boolean boolean11 = objectName3.equals((java.lang.Object) batchEE10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = batchEE10.getJobInstanceCount("abandon: abandon a batch from its id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Batch 'sample' started with id #=sample-step" + "'", str5, "Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":Batch 'sample' started with id #=sample-step" + "'", str6, ":Batch 'sample' started with id #=sample-step");
        org.junit.Assert.assertNotNull(objectName7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException2 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Stopped");
        java.lang.Throwable throwable4 = null;
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException5 = new org.apache.batchee.container.exception.BatchContainerRuntimeException(throwable4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException6 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("Batch status: FAILED", throwable4);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException7 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException6);
        batchContainerRuntimeException2.addSuppressed((java.lang.Throwable) batchContainerRuntimeException7);
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException9 = new org.apache.batchee.container.exception.BatchContainerRuntimeException((java.lang.Throwable) batchContainerRuntimeException7);
        java.lang.Throwable[] throwableArray10 = batchContainerRuntimeException7.getSuppressed();
        org.apache.batchee.container.exception.BatchContainerRuntimeException batchContainerRuntimeException11 = new org.apache.batchee.container.exception.BatchContainerRuntimeException("\"stop: stop a batch from its id\"", (java.lang.Throwable) batchContainerRuntimeException7);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.lang.String str1 = javax.management.ObjectName.quote("Batch 'sample' started with id #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"Batch 'sample' started with id #\"" + "'", str1, "\"Batch 'sample' started with id #\"");
    }
}

