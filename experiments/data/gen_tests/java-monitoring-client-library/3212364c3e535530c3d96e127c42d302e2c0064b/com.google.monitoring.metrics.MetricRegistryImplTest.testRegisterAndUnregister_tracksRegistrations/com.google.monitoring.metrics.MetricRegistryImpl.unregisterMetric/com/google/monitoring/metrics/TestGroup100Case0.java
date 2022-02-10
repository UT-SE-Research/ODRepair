package com.google.monitoring.metrics;

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
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_description");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("foo");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Unregistered metric:");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new callback metric:");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("test_description");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("hi!");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("test_valuedisplayname");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name");
        metricRegistryImpl0.unregisterMetric("");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.google.monitoring.metrics.MetricRegistryImpl metricRegistryImpl0 = com.google.monitoring.metrics.MetricRegistryImpl.getDefault();
        metricRegistryImpl0.unregisterMetric("hi!");
        metricRegistryImpl0.unregisterMetric("test_labelname");
        metricRegistryImpl0.unregisterMetric("foo");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Duplicate metric of same name: %s");
        metricRegistryImpl0.unregisterMetric("test_labeldescription");
        metricRegistryImpl0.unregisterMetric("Registered new event metric:");
        metricRegistryImpl0.unregisterMetric("Registered new stored metric:");
        metricRegistryImpl0.unregisterMetric("Registered new counter:");
        metricRegistryImpl0.unregisterMetric("");
        org.junit.Assert.assertNotNull(metricRegistryImpl0);
    }
}

