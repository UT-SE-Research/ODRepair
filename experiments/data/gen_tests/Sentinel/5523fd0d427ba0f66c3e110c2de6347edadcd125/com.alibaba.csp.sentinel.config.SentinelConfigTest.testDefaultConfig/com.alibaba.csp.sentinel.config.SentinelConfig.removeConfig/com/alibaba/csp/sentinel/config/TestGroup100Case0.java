package com.alibaba.csp.sentinel.config;

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
        java.lang.String str0 = com.alibaba.csp.sentinel.config.SentinelConfig.charset();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = com.alibaba.csp.sentinel.config.SentinelConfig.totalMetricFileCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sun.java.command", "123");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "\\");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.spi.classloader");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.metric.file.total.count");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        int int0 = com.alibaba.csp.sentinel.config.SentinelConfig.coldFactor();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sun.java.command", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("gbk", "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = com.alibaba.csp.sentinel.config.SentinelConfig.statisticMaxRt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5000 + "'", int0 == 5000);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("s");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig(".jar");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("Cannot resolve default appName from property sun.java.command", "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "value cannot be null");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6000", "csp.sentinel.app.type");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sentinel-propertiesTest.properties", "user.dir");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("Cannot resolve default appName from property sun.java.command", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("project.name");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        long long0 = com.alibaba.csp.sentinel.config.SentinelConfig.singleMetricFileSize();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 52428800L + "'", long0 == 52428800L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("gbk", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("value cannot be null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("UTF-8", "project.name");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\" + "'", str1, "\\");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "6");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Parse coldFactor fail, use default value: 3");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.metric.file.single.size");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52428800" + "'", str1, "52428800");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "sentinel_test");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("20", "\\");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "20");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("0.5", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig(", should be larger than 1, use default value:");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "UTF-8");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "value cannot be null" + "'", str1, "value cannot be null");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("Cannot resolve default appName from property sun.java.command", "=");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.metric.flush.interval" + "'", str1, "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("sun.java.command");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cannot resolve default appName from property sun.java.command" + "'", str1, "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("=");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "5");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "project.name");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("0.5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800" + "'", str1, "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("value cannot be null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.app.name");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("5", "csp.sentinel.app.name");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("6");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.name", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from default: {}", "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("0.5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800" + "'", str1, "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel_test", "App name resolved from property {}: {}");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(", should be larger than 1, use default value:", "0.5");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("App name resolved from system env {}: {}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("key cannot be null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "utf-8");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("\\");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("gbk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800" + "'", str1, "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("sun.java.command");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("user.dir");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel" + "'", str1, "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "20");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from system env {}: {}", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("key cannot be null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("user.dir", "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("4", "gbk");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("\\");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("key cannot be null", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("52428800");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("utf-8", "csp.sentinel.charset");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("1");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6", "123");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("123");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utf-8" + "'", str1, "utf-8");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("App name resolved from property {}: {}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("utf-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.charset" + "'", str1, "csp.sentinel.charset");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "project.name");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "gbk");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Failed to initialize");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sentinel_test", "context");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("UTF-8", "App name resolved from property {}: {}");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("52428800", "App name resolved from system env {}: {}");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("key cannot be null", "App name resolved from default: {}");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Application type resolved: {}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Parse coldFactor fail, use default value: 3");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("4", "6000");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("52428800", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "csp.sentinel.metric.file.single.size");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("cold factor=");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "UTF-8");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("context", "2");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "gbk");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(", should be larger than 1, use default value:", "UTF-8");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("sentinel-propertiesTest.properties");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "user.dir" + "'", str1, "user.dir");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel-propertiesTest.properties", "=");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "=");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sentinel_test", "4");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("App name resolved from default: {}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "1");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig(".jar");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(", should be larger than 1, use default value:", "csp.sentinel.metric.file.single.size");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "4");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.flush.interval", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "key cannot be null");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("6000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.app.type" + "'", str1, "csp.sentinel.app.type");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.metric.flush.interval");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("1000");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("s", "utf-8");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse coldFactor fail, use default value: 3", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1", "1000");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("value cannot be null", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("Cannot resolve default appName from property sun.java.command");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000" + "'", str1, "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1", ".jar");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "20");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.app.type", "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000", "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel-propertiesTest.properties", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("cold factor=", "6000");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("1", "123");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("20");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\" + "'", str1, "\\");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6000" + "'", str1, "6000");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("1", "value cannot be null");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("52428800", "gbk");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("context", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel", "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("gbk", "key cannot be null");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from system env {}: {}", "6");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.app.name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Failed to initialize" + "'", str1, "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sentinel_test", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sun.java.command", "cold factor=");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "csp.sentinel.app.name");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6", "1");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("=", "cold factor=");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("s", "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("key cannot be null", "sun.java.command");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("context", "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig(", should be larger than 1, use default value:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.metric.file.single.size" + "'", str1, "csp.sentinel.metric.file.single.size");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "App name resolved from property {}: {}" + "'", str1, "App name resolved from property {}: {}");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("s", "csp.sentinel.charset");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1", "0.5");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.metric.file.total.count");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("project.name");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("hi!", "s");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", ".jar");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("s", "5");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("Cannot resolve default appName from property sun.java.command", "123");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.spi.classloader", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.statistic.max.rt", "\\");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.charset");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("context", "csp.sentinel.charset");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.app.name" + "'", str1, "csp.sentinel.app.name");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("utf-8", "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1000", "s");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.type", "cold factor=");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from property {}: {}", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.charset", "123");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("2", "App name resolved from property {}: {}");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sun.java.command", "cold factor=");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("user.dir", ".jar");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "csp.sentinel.statistic.max.rt");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from default: {}", "project.name");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("value cannot be null", "App name resolved from property {}: {}");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.flow.cold.factor", "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(".jar", "context");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("sentinel_test");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.metric.file.total.count" + "'", str1, "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("utf-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.flow.cold.factor" + "'", str1, "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from default: {}", ", should be larger than 1, use default value:");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("20", "UTF-8");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.app.name" + "'", str1, "csp.sentinel.app.name");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("user.dir", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse coldFactor fail, use default value: 3", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("user.dir", "value cannot be null");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.name", "project.name");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sentinel_test", "sun.java.command");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("user.dir");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".jar" + "'", str1, ".jar");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("value cannot be null", "UTF-8");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("context", "1000");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("cold factor=", "csp.sentinel.statistic.max.rt");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6000" + "'", str1, "6000");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", ", should be larger than 1, use default value:");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("sentinel-propertiesTest.properties");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "user.dir" + "'", str1, "user.dir");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("4", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "App name resolved from property {}: {}");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.spi.classloader", "project.name");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.charset", "cold factor=");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "sentinel-propertiesTest.properties");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("4", "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from default: {}", "6");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(", should be larger than 1, use default value:", "sun.java.command");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from system env {}: {}", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6000", "csp.sentinel.app.type");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.app.name", "value cannot be null");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("hi!", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("cold factor=", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("key cannot be null", "context");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sun.java.command", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "cold factor=");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("sentinel_test");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sun.java.command" + "'", str1, "sun.java.command");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("context", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("key cannot be null", "=");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("123", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000", "UTF-8");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6000", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("hi!", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.statistic.max.rt", "6");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("=", "utf-8");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sun.java.command", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("123");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.metric.flush.interval" + "'", str1, "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "App name resolved from property {}: {}" + "'", str1, "App name resolved from property {}: {}");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Application type resolved: {}", "csp.sentinel.app.type");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("UTF-8", "App name resolved from system env {}: {}");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.statistic.max.rt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Application type resolved: {}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.app.type" + "'", str1, "csp.sentinel.app.type");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("Cannot resolve default appName from property sun.java.command");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000" + "'", str1, "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "52428800");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("6000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse coldFactor fail, use default value: 3" + "'", str1, "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("2", "csp.sentinel.charset");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("s", "0.5");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("52428800", "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6", "csp.sentinel.app.type");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("cold factor=", "123");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("4", "\\");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.app.type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.flow.cold.factor" + "'", str1, "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel_test", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("App name resolved from property {}: {}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000" + "'", str1, "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("Cannot resolve default appName from property sun.java.command", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from default: {}", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.flow.cold.factor", "sun.java.command");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "=");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.file.single.size", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("4", "5");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.charset");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "123" + "'", str1, "123");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "context");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel" + "'", str1, "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "value cannot be null");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "52428800");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1" + "'", str1, "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1" + "'", str1, "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.app.type", "App name resolved from property {}: {}");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1000", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("123", "6");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "6");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("=", "6000");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.spi.classloader", "0.5");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.charset" + "'", str1, "csp.sentinel.charset");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.flow.cold.factor");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6", "\\");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("hi!", "\\");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("1", "sun.java.command");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("4", "csp.sentinel.app.type");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Failed to initialize", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel_test", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel", "value cannot be null");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.charset", "utf-8");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", ", should be larger than 1, use default value:");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("5", "");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse coldFactor fail, use default value: 3" + "'", str1, "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.spi.classloader");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "project.name" + "'", str1, "project.name");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("20");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.flush.interval", "5");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.flush.interval", "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Application type resolved: {}", "utf-8");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.metric.file.single.size");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1" + "'", str1, "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.app.name", "UTF-8");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("20", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "utf-8");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("=");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6000" + "'", str1, "6000");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6", "1000");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000" + "'", str1, "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("2", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("user.dir", "utf-8");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "utf-8");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("s", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "cold factor=");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "6");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("key cannot be null", "1");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("5", "\\");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("123", "sun.java.command");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "1");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(".jar", "key cannot be null");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("cold factor=", "csp.sentinel.metric.file.single.size");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("key cannot be null", ", should be larger than 1, use default value:");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.flow.cold.factor", "\\");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from default: {}", "s");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from property {}: {}", "project.name");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "csp.sentinel.metric.file.single.size");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("2", ".jar");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("project.name", "1");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.charset", "App name resolved from system env {}: {}");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.statistic.max.rt", "1000");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(".jar", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6000", "123");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000", "20");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("4", "App name resolved from property {}: {}");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "sentinel-propertiesTest.properties");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from system env {}: {}", "\\");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "App name resolved from property {}: {}");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("Cannot resolve default appName from property sun.java.command", "csp.sentinel.metric.file.single.size");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(".jar", "App name resolved from system env {}: {}");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("project.name", "=");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.total.count", "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from system env {}: {}", "App name resolved from property {}: {}");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("UTF-8", ".jar");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.app.type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "App name resolved from property {}: {}" + "'", str1, "App name resolved from property {}: {}");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.flow.cold.factor", "project.name");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("s", "52428800");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("App name resolved from default: {}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s" + "'", str1, "s");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("UTF-8", "value cannot be null");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("hi!", "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("gbk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "key cannot be null" + "'", str1, "key cannot be null");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("project.name", "csp.sentinel.statistic.max.rt");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(", should be larger than 1, use default value:", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1000", "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("cold factor=", "52428800");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("=", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("cold factor=", "csp.sentinel.app.name");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("4", "1000");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "App name resolved from system env {}: {}");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sun.java.command", "0.5");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("5", "1000");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("UTF-8", "123");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(".jar", "sentinel_test");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("csp.sentinel.statistic.max.rt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000" + "'", str1, "1000");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.type", "key cannot be null");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(".jar", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("gbk", "");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from default: {}", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.statistic.max.rt", "UTF-8");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sun.java.command", "\\");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse coldFactor fail, use default value: 3", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "123" + "'", str1, "123");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Application type resolved: {}", "s");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("project.name", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from system env {}: {}", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("\\", "6000");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.file.total.count", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sentinel-propertiesTest.properties", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.total.count", "App name resolved from property {}: {}");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("key cannot be null", "4");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("52428800");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gbk" + "'", str1, "gbk");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("123", "UTF-8");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "cold factor=");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "UTF-8");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Application type resolved: {}", "");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "hi!");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.file.total.count", "gbk");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("1000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "sentinel-propertiesTest.properties");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("s", ".jar");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.file.total.count", "2");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("20", "App name resolved from system env {}: {}");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("project.name", "csp.sentinel.app.name");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "123");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("[SentinelConfig] Failed to initialize");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "csp.sentinel.metric.flush.interval" + "'", str1, "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("key cannot be null", "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("cold factor=", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("52428800", "6");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6", "sun.java.command");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel_test", "1");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(".jar", "context");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel", "52428800");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("user.dir", "hi!");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "sentinel-propertiesTest.properties");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.charset", "4");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(", should be larger than 1, use default value:", "gbk");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "1000");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("value cannot be null", "\\");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "key cannot be null");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.name", "context");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("5", "key cannot be null");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000", "4");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("project.name", "s");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("1", "UTF-8");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.flush.interval", "App name resolved from system env {}: {}");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from default: {}", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("hi!", "0.5");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Application type resolved: {}", "App name resolved from property {}: {}");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6", ".jar");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.metric.file.single.size", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.file.total.count", "5");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.flow.cold.factor", "5");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(".jar", "csp.sentinel.app.type");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("UTF-8", "6000");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test422");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("Cannot resolve default appName from property sun.java.command", "s");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test423");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Application type resolved: {}", "1000");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test424");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.flow.cold.factor", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test425");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.name", "csp.sentinel.app.name");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test426");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("key cannot be null", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test427");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("6", "csp.sentinel.flow.cold.factor");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test428");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6000", "csp.sentinel.charset");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test429");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.app.name", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test430");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.app.type", "App name resolved from default: {}");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test431");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("Cannot resolve default appName from property sun.java.command", "cold factor=");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test432");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "sentinel_test");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test433");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("key cannot be null", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test434");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("utf-8", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test435");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.charset", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test436");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1", "key cannot be null");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test437");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("UTF-8", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test438");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("0.5", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test439");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from property {}: {}", "csp.sentinel.app.name");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test440");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.statistic.max.rt", "key cannot be null");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test441");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.app.name", "App name resolved from property {}: {}");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test442");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("cold factor=", "/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test443");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("hi!", "project.name");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test444");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "0.5");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test445");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("key cannot be null", "csp.sentinel.statistic.max.rt");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test446");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("value cannot be null", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test447");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("cold factor=", "\\");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test448");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("s", "20");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test449");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("context", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test450");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "sentinel-propertiesTest.properties");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test451");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("2", "6");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test452");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel", "5");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test453");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("Cannot resolve default appName from property sun.java.command", "1000");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test454");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "20");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test455");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6000", "key cannot be null");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test456");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("utf-8", "UTF-8");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test457");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent(".jar", "UTF-8");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test458");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test459");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("context", "4");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test460");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("App name resolved from default: {}", "0.5");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test461");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(".jar", "[SentinelConfig] Application type resolved: {}");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test462");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800", "user.dir");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test463");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Application type resolved: {}", "hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test464");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("1", "[SentinelConfig] Parse totalMetricFileCount fail, use default value: 6");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test465");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Parse coldFactor fail, use default value: 3", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test466");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("s", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test467");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.removeConfig("App name resolved from system env {}: {}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1" + "'", str1, "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test468");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sentinel-propertiesTest.properties", "sun.java.command");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test469");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("=", "csp.sentinel.app.name");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test470");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6000", "[SentinelConfig] Failed to initialize");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test471");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig(", should be larger than 1, use default value:", "\\");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test472");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("cold factor=", "\\");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test473");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test474");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("/home/anonymous/projects/tools/reseter-finder/exp/_downloads/Sentinel", "=");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test475");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.file.total.count", "csp.sentinel.charset");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test476");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("[SentinelConfig] Application type resolved: {}", "Cannot resolve default appName from property sun.java.command");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test477");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("1000", "[SentinelConfig] Invalid statisticMaxRt value: {}, using the default value instead: 5000");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test478");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Failed to initialize", "csp.sentinel.metric.file.total.count");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test479");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test480");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("52428800", "csp.sentinel.metric.flush.interval");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test481");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("cold factor=", "4");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test482");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("1", "[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test483");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("0.5", "csp.sentinel.app.name");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test484");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("", "value cannot be null");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test485");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("value cannot be null", "1");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test486");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Parse the metricLogFlushInterval fail, use default value: 1", "App name resolved from property {}: {}");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test487");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("sun.java.command", "sentinel_test");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test488");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("", "csp.sentinel.app.name");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test489");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("6", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test490");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("4", "s");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test491");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("gbk", "\\");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test492");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("123", "[SentinelConfig] Parse singleMetricFileSize fail, use default value: 52428800");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test493");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("csp.sentinel.metric.flush.interval", "key cannot be null");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test494");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("App name resolved from property {}: {}", "");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test495");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("2", "csp.sentinel.spi.classloader");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test496");
        java.lang.String str1 = com.alibaba.csp.sentinel.config.SentinelConfig.getConfig("csp.sentinel.metric.flush.interval");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "key cannot be null" + "'", str1, "key cannot be null");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test497");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("sun.java.command", "key cannot be null");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test498");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfig("UTF-8", "key cannot be null");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test499");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("csp.sentinel.statistic.max.rt", "App name resolved from default: {}");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test500");
        com.alibaba.csp.sentinel.config.SentinelConfig.setConfigIfAbsent("[SentinelConfig] Failed to initialize", "[SentinelConfig] Parse coldFactor fail, use default value: 3");
    }
}
