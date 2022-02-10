package org.apache.karaf.main;

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
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_BASE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.base" + "'", str0, "karaf.base");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.ENV_KARAF_HOME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KARAF_HOME" + "'", str0, "KARAF_HOME");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.DEFAULT_LOCK_DELAY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1000" + "'", str0, "1000");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.ConfigProperties configProperties0 = new org.apache.karaf.main.ConfigProperties();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.apache.karaf.main.StartupListener startupListener0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener.BundleStats bundleStats1 = startupListener0.new BundleStats();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.karaf.main.StartupListener$BundleStats with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_DATA_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.data.uri" + "'", str0, "karaf.data.uri");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.ENV_KARAF_BASE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KARAF_BASE" + "'", str0, "KARAF_BASE");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_INSTANCES_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.instances.uri" + "'", str0, "karaf.instances.uri");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_INSTANCES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.instances" + "'", str0, "karaf.instances");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList3 = main1.readBundlesFromStartupProperties(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        boolean boolean2 = main1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.io.File[] fileArray0 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> fileList1 = new java.util.ArrayList<java.io.File>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.io.File>) fileList1, fileArray0);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver3 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        java.lang.Class<?> wildcardClass4 = simpleMavenResolver3.getClass();
        org.junit.Assert.assertNotNull(fileArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.ENV_KARAF_INSTANCES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KARAF_INSTANCES" + "'", str0, "KARAF_INSTANCES");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_ETC_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.etc.uri" + "'", str0, "karaf.etc.uri");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        boolean boolean2 = main1.destroy();
        java.lang.Class<?> wildcardClass3 = main1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_HOME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.home" + "'", str0, "karaf.home");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.version" + "'", str0, "karaf.version");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.ENV_KARAF_DATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KARAF_DATA" + "'", str0, "KARAF_DATA");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.SYSTEM_PROPERTIES_FILE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "system.properties" + "'", str0, "system.properties");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.io.File[] fileArray0 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> fileList1 = new java.util.ArrayList<java.io.File>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.io.File>) fileList1, fileArray0);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver3 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        java.net.URI uRI4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = simpleMavenResolver3.resolve(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Could not resolve null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROPERTY_LOCK_DELAY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.lock.delay" + "'", str0, "karaf.lock.delay");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        // The following exception was thrown during execution in test generation
        try {
            main1.setStartLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        org.apache.karaf.main.lock.Lock lock5 = main1.getLock();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = lock5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(lock5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_BASE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.base.uri" + "'", str0, "karaf.base.uri");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROPERTY_LOCK_LOST_THRESHOLD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.lock.lostThreshold" + "'", str0, "karaf.lock.lostThreshold");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList5 = main1.readBundlesFromStartupProperties(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.DEFAULT_LOCK_LOST_THRESHOLD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0" + "'", str0, "0");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_DATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.data" + "'", str0, "karaf.data");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = org.apache.karaf.main.Main.STARTUP_PROPERTIES_FILE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startup.properties" + "'", str0, "startup.properties");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveBase("Error installing bundle listed in startup.properties with url:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file3 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = serverInfoImpl2.resolveBase(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.resolveHome("KARAF_DATA");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file3 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serverInfoImpl2.resolveHomePath("Systemd sd_notify failed with error code:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file3 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveHome("karaf.lock.lostThreshold");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.io.File[] fileArray0 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> fileList1 = new java.util.ArrayList<java.io.File>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.io.File>) fileList1, fileArray0);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver3 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver4 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI6 = simpleMavenResolver4.resolve(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Could not resolve null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.resolveBase("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.ENV_KARAF_ETC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KARAF_ETC" + "'", str0, "KARAF_ETC");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file3 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList4 = main1.readBundlesFromStartupProperties(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.net.URI uRI4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = serverInfoImpl2.resolveHome(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI6 = serverInfoImpl2.resolveBase(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI6 = serverInfoImpl2.resolveHome(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_HOME_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.home.uri" + "'", str0, "karaf.home.uri");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList4 = main1.readBundlesFromStartupProperties(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str0 = org.apache.karaf.main.ConfigProperties.PROP_KARAF_ETC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "karaf.etc" + "'", str0, "karaf.etc");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file3 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serverInfoImpl2.resolveBasePath("test-karaf-home");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl5.resolveBase("m_logger");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.net.URI uRI4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = serverInfoImpl2.resolveHome(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        java.lang.Class<?> wildcardClass4 = main1.getClass();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serverInfoImpl2.resolveBasePath("karaf.etc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl5.resolveHomePath("karaf.restart.jvm");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serverInfoImpl2.resolveHomePath("Unable to register security provider:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file3 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveBasePath("KARAF_HOME");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveHomePath("Could not launch framework");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.resolveHome("\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI9 = serverInfoImpl6.resolveBase(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serverInfoImpl6.resolveHomePath("Karaf Lock Monitor Thread");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl6.resolveHomePath("3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.lang.ClassLoader classLoader4 = null;
        org.osgi.framework.launch.Framework framework5 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager6 = new org.apache.karaf.main.KarafActivatorManager(classLoader4, framework5);
        karafActivatorManager6.stopKarafActivators();
        java.util.logging.Logger logger8 = karafActivatorManager6.LOG;
        karafActivatorManager2.LOG = logger8;
        org.osgi.framework.BundleContext bundleContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener startupListener11 = new org.apache.karaf.main.StartupListener(logger8, bundleContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertEquals(logger8.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger8.getResourceBundleName() == null", logger8.getResourceBundleName());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.resolveHome("org.apache.karaf.main.MockLock");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveHome("karaf.etc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.lock.Lock lock4 = main2.getLock();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(lock4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveBasePath("karaf.base.uri");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveBase("Bundle-Activator");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList4 = main2.readBundlesFromStartupProperties(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        org.apache.karaf.main.ConfigProperties configProperties4 = main1.getConfig();
        main1.setExitCode((int) (byte) 0);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(configProperties4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        int int6 = main1.getExitCode();
        boolean boolean7 = main1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveHome("Installing and starting initial bundles");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveHome("foo");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl5.resolveBasePath("All initial bundles installed and set to start");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl5.resolveBase("m_logger");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        java.util.logging.Logger logger3 = karafActivatorManager2.LOG;
        org.osgi.framework.BundleContext bundleContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener startupListener5 = new org.apache.karaf.main.StartupListener(logger3, bundleContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertEquals(logger3.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger3.getResourceBundleName() == null", logger3.getResourceBundleName());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.resolveBase("handle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main2.setShutdownCallback(shutdownCallback4);
        // The following exception was thrown during execution in test generation
        try {
            main2.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager2.LOG = logger9;
        org.osgi.framework.BundleContext bundleContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener startupListener12 = new org.apache.karaf.main.StartupListener(logger9, bundleContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl5.resolveBase("Could not launch framework");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI6 = serverInfoImpl2.resolveHome(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        org.apache.karaf.main.ConfigProperties configProperties4 = main1.getConfig();
        boolean boolean5 = main1.destroy();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(configProperties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        main1.awaitShutdown();
        int int7 = main1.getExitCode();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveHome("Error stopping karaf:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveHome("Karaf Lock Monitor Thread");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl5.resolveHomePath("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl2.resolveBasePath("\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        karafActivatorManager2.stopKarafActivators();
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        karafActivatorManager2.stopKarafActivators();
        java.lang.Class<?> wildcardClass6 = karafActivatorManager2.getClass();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveBase("karaf.log");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = serverInfoImpl2.resolveHome(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger5 = karafActivatorManager2.LOG;
        org.osgi.framework.BundleContext bundleContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener startupListener7 = new org.apache.karaf.main.StartupListener(logger5, bundleContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertEquals(logger5.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger5.getResourceBundleName() == null", logger5.getResourceBundleName());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        main1.setExitCode((int) (short) 1);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveBase("handle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl2.resolveBase(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager2.LOG = logger9;
        java.util.logging.Logger logger11 = karafActivatorManager2.LOG;
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertEquals(logger11.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger11.getResourceBundleName() == null", logger11.getResourceBundleName());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        main1.setConfig(configProperties5);
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl5.resolveBase("Exception instantiating lock class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.resolveHome("1000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serverInfoImpl10.resolveHomePath("test-karaf.pid");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI6 = serverInfoImpl2.resolveHome(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        java.net.URI uRI11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI12 = serverInfoImpl10.resolveBase(uRI11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveBasePath("Could not launch framework");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serverInfoImpl2.resolveHomePath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager2.LOG = logger9;
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        main1.awaitShutdown();
        org.apache.karaf.main.lock.Lock lock7 = main1.getLock();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(lock7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl6.resolveHome(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        int int3 = main1.getExitCode();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl2.resolveHome(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl6.resolveBasePath("Can't lock (another instance is running), and lock is exclusive");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl2.resolveBase("0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveBase("59");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        int int8 = main1.getExitCode();
        org.apache.karaf.main.ShutdownCallback shutdownCallback9 = null;
        main1.setShutdownCallback(shutdownCallback9);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        int int8 = main1.getExitCode();
        org.osgi.framework.launch.Framework framework9 = main1.getFramework();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(framework9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serverInfoImpl2.resolveHomePath("karaf.lock.lostThreshold");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveBasePath("KARAF_BASE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl6.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        org.apache.karaf.main.lock.Lock lock5 = main1.getLock();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList7 = main1.readBundlesFromStartupProperties(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(lock5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl2.resolveHomePath("Error stopping karaf:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager2.LOG = logger9;
        java.util.logging.Logger logger11 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader12 = null;
        org.osgi.framework.launch.Framework framework13 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager14 = new org.apache.karaf.main.KarafActivatorManager(classLoader12, framework13);
        karafActivatorManager14.stopKarafActivators();
        java.util.logging.Logger logger16 = karafActivatorManager14.LOG;
        java.util.logging.Logger logger17 = karafActivatorManager14.LOG;
        karafActivatorManager2.LOG = logger17;
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertEquals(logger11.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger11.getResourceBundleName() == null", logger11.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertEquals(logger16.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger16.getResourceBundleName() == null", logger16.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertEquals(logger17.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger17.getResourceBundleName() == null", logger17.getResourceBundleName());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl5.resolveBase(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl2.resolveBasePath(".jar");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI9 = serverInfoImpl6.resolveBase(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.apache.karaf.main.lock.Lock lock2 = main1.getLock();
        java.lang.String[] strArray3 = main1.getArgs();
        int int4 = main1.getExitCode();
        org.junit.Assert.assertNull(lock2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file12 = serverInfoImpl10.resolveHome("Installing and starting initial bundles");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl6.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveHome("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.net.URI uRI4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI5 = serverInfoImpl2.resolveHome(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        org.apache.karaf.main.ShutdownCallback shutdownCallback8 = null;
        main1.setShutdownCallback(shutdownCallback8);
        org.osgi.framework.launch.Framework framework10 = main1.getFramework();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl6.resolveBase("lib");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveHome("karaf.home.uri");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl6.resolveBase(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        int int3 = main1.getExitCode();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        org.apache.karaf.main.ShutdownCallback shutdownCallback8 = null;
        main1.setShutdownCallback(shutdownCallback8);
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl5.resolveBasePath("Can't lock, and lock is exclusive");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        main1.setConfig(configProperties5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        int int4 = main1.getExitCode();
        main1.awaitShutdown();
        main1.setExitCode((int) (byte) 0);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        org.apache.karaf.main.ShutdownCallback shutdownCallback8 = null;
        main1.setShutdownCallback(shutdownCallback8);
        org.osgi.framework.launch.Framework framework10 = main1.getFramework();
        main1.setExitCode((int) (short) -1);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl2.resolveHomePath("sun.misc.SignalHandler");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList6 = main1.readBundlesFromStartupProperties(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl2.resolveBase(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl6.resolveHomePath("reference:file:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl10.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveHomePath("karaf.home.uri");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveBase("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        karafActivatorManager2.stopKarafActivators();
        java.lang.ClassLoader classLoader6 = null;
        org.osgi.framework.launch.Framework framework7 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager8 = new org.apache.karaf.main.KarafActivatorManager(classLoader6, framework7);
        karafActivatorManager8.stopKarafActivators();
        java.util.logging.Logger logger10 = karafActivatorManager8.LOG;
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        karafActivatorManager8.LOG = logger15;
        karafActivatorManager2.LOG = logger15;
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertEquals(logger10.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger10.getResourceBundleName() == null", logger10.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.String str0 = org.apache.karaf.main.KarafActivatorManager.KARAF_ACTIVATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Karaf-Activator" + "'", str0, "Karaf-Activator");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        main1.setExitCode((int) (byte) 0);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl5.resolveHomePath("Systemd sd_notify failed with error code:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        int int3 = main2.getExitCode();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        main2.setConfig(configProperties4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main4 = new org.apache.karaf.main.Main(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl2.resolveHomePath("KARAF_INSTANCES");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveBase("Exception instantiating lock class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager7.stopKarafActivators();
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        java.lang.ClassLoader classLoader16 = null;
        org.osgi.framework.launch.Framework framework17 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager18 = new org.apache.karaf.main.KarafActivatorManager(classLoader16, framework17);
        karafActivatorManager18.stopKarafActivators();
        java.util.logging.Logger logger20 = karafActivatorManager18.LOG;
        karafActivatorManager13.LOG = logger20;
        karafActivatorManager7.LOG = logger20;
        karafActivatorManager2.LOG = logger20;
        karafActivatorManager2.stopKarafActivators();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertEquals(logger20.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger20.getResourceBundleName() == null", logger20.getResourceBundleName());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serverInfoImpl6.resolveHomePath("org.apache.karaf.main.MockLock");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file12 = serverInfoImpl10.resolveHome("Can't lock, and lock is exclusive");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveBase("0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        main1.setExitCode((int) '#');
        boolean boolean6 = main1.destroy();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        java.net.URI uRI9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI10 = serverInfoImpl6.resolveHome(uRI9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        java.lang.String[] strArray3 = main1.getArgs();
        int int4 = main1.getExitCode();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        org.osgi.framework.launch.Framework framework3 = main1.getFramework();
        main1.setExitCode(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(framework3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        main1.awaitShutdown();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList10 = main1.readBundlesFromStartupProperties(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager7.stopKarafActivators();
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        java.lang.ClassLoader classLoader16 = null;
        org.osgi.framework.launch.Framework framework17 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager18 = new org.apache.karaf.main.KarafActivatorManager(classLoader16, framework17);
        karafActivatorManager18.stopKarafActivators();
        java.util.logging.Logger logger20 = karafActivatorManager18.LOG;
        karafActivatorManager13.LOG = logger20;
        karafActivatorManager7.LOG = logger20;
        karafActivatorManager2.LOG = logger20;
        java.util.logging.Logger logger24 = karafActivatorManager2.LOG;
        karafActivatorManager2.stopKarafActivators();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertEquals(logger20.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger20.getResourceBundleName() == null", logger20.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertEquals(logger24.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger24.getResourceBundleName() == null", logger24.getResourceBundleName());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager7.stopKarafActivators();
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        java.lang.ClassLoader classLoader16 = null;
        org.osgi.framework.launch.Framework framework17 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager18 = new org.apache.karaf.main.KarafActivatorManager(classLoader16, framework17);
        karafActivatorManager18.stopKarafActivators();
        java.util.logging.Logger logger20 = karafActivatorManager18.LOG;
        karafActivatorManager13.LOG = logger20;
        karafActivatorManager7.LOG = logger20;
        karafActivatorManager2.LOG = logger20;
        java.util.logging.Logger logger24 = karafActivatorManager2.LOG;
        org.osgi.framework.BundleContext bundleContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener startupListener26 = new org.apache.karaf.main.StartupListener(logger24, bundleContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertEquals(logger20.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger20.getResourceBundleName() == null", logger20.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertEquals(logger24.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger24.getResourceBundleName() == null", logger24.getResourceBundleName());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        main1.awaitShutdown();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveHome("Could not launch framework");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        java.lang.String[] strArray3 = main1.getArgs();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList5 = main1.readBundlesFromStartupProperties(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serverInfoImpl6.resolveHomePath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        // The following exception was thrown during execution in test generation
        try {
            main1.setStartLevel(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl5.resolveBasePath("Bundle location");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        int int6 = main1.getExitCode();
        boolean boolean7 = main1.destroy();
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = main2.getConfig();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(configProperties4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.Main main5 = new org.apache.karaf.main.Main(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            main5.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveHome(".class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI9 = serverInfoImpl6.resolveHome(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        java.lang.String[] strArray4 = main1.getArgs();
        boolean boolean5 = main1.destroy();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager2.LOG = logger9;
        karafActivatorManager2.stopKarafActivators();
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        org.apache.karaf.main.lock.Lock lock5 = main1.getLock();
        boolean boolean6 = main1.destroy();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(lock5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        java.net.URI uRI10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI11 = serverInfoImpl9.resolveBase(uRI10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serverInfoImpl9.resolveBasePath("karaf.lock");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        int int5 = main1.getExitCode();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl6.resolveHome(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl6.resolveHomePath("Error stopping karaf:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        java.lang.String[] strArray4 = main1.getArgs();
        main1.awaitShutdown();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl5.resolveBase(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl6.resolveBase("karaf.lock.delay");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.apache.karaf.main.lock.Lock lock2 = main1.getLock();
        boolean boolean3 = main1.destroy();
        org.junit.Assert.assertNull(lock2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl6.resolveHome(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serverInfoImpl2.resolveHomePath("sun.misc.SignalHandler");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.apache.karaf.main.ShutdownCallback shutdownCallback2 = null;
        main1.setShutdownCallback(shutdownCallback2);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList5 = main1.readBundlesFromStartupProperties(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.apache.karaf.main.lock.Lock lock2 = main1.getLock();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(lock2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl6.resolveHomePath("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        org.osgi.framework.launch.Framework framework3 = main1.getFramework();
        org.osgi.framework.launch.Framework framework4 = main1.getFramework();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(framework3);
        org.junit.Assert.assertNull(framework4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger5 = karafActivatorManager2.LOG;
        karafActivatorManager2.stopKarafActivators();
        // The following exception was thrown during execution in test generation
        try {
            karafActivatorManager2.startKarafActivators();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertEquals(logger5.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger5.getResourceBundleName() == null", logger5.getResourceBundleName());
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        main1.awaitShutdown();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.resolveHome("KARAF_INSTANCES");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl9.resolveHome("karaf.data");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl2.resolveHomePath("karaf.lock.delay");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger5 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader6 = null;
        org.osgi.framework.launch.Framework framework7 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager8 = new org.apache.karaf.main.KarafActivatorManager(classLoader6, framework7);
        karafActivatorManager8.stopKarafActivators();
        java.util.logging.Logger logger10 = karafActivatorManager8.LOG;
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        karafActivatorManager13.stopKarafActivators();
        java.lang.ClassLoader classLoader17 = null;
        org.osgi.framework.launch.Framework framework18 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager19 = new org.apache.karaf.main.KarafActivatorManager(classLoader17, framework18);
        karafActivatorManager19.stopKarafActivators();
        java.util.logging.Logger logger21 = karafActivatorManager19.LOG;
        java.lang.ClassLoader classLoader22 = null;
        org.osgi.framework.launch.Framework framework23 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager24 = new org.apache.karaf.main.KarafActivatorManager(classLoader22, framework23);
        karafActivatorManager24.stopKarafActivators();
        java.util.logging.Logger logger26 = karafActivatorManager24.LOG;
        karafActivatorManager19.LOG = logger26;
        karafActivatorManager13.LOG = logger26;
        karafActivatorManager8.LOG = logger26;
        java.util.logging.Logger logger30 = karafActivatorManager8.LOG;
        java.util.logging.Logger logger31 = karafActivatorManager8.LOG;
        karafActivatorManager2.LOG = logger31;
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertEquals(logger5.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger5.getResourceBundleName() == null", logger5.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertEquals(logger10.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger10.getResourceBundleName() == null", logger10.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertEquals(logger21.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger21.getResourceBundleName() == null", logger21.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertEquals(logger26.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger26.getResourceBundleName() == null", logger26.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertEquals(logger30.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger30.getResourceBundleName() == null", logger30.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertEquals(logger31.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger31.getResourceBundleName() == null", logger31.getResourceBundleName());
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl5.resolveHome(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serverInfoImpl6.resolveHomePath("karaf.lock.delay");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI6 = serverInfoImpl2.resolveBase(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl10.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serverInfoImpl10.resolveHomePath("Bundle-Activator");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveBase("Unable to register security provider:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        int int4 = main1.getExitCode();
        main1.awaitShutdown();
        // The following exception was thrown during execution in test generation
        try {
            main1.setStartLevel((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl2.resolveHome(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager7.stopKarafActivators();
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        java.lang.ClassLoader classLoader16 = null;
        org.osgi.framework.launch.Framework framework17 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager18 = new org.apache.karaf.main.KarafActivatorManager(classLoader16, framework17);
        karafActivatorManager18.stopKarafActivators();
        java.util.logging.Logger logger20 = karafActivatorManager18.LOG;
        karafActivatorManager13.LOG = logger20;
        karafActivatorManager7.LOG = logger20;
        karafActivatorManager2.LOG = logger20;
        java.util.logging.Logger logger24 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger25 = karafActivatorManager2.LOG;
        java.lang.Class<?> wildcardClass26 = logger25.getClass();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertEquals(logger20.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger20.getResourceBundleName() == null", logger20.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertEquals(logger24.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger24.getResourceBundleName() == null", logger24.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertEquals(logger25.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger25.getResourceBundleName() == null", logger25.getResourceBundleName());
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = serverInfoImpl2.resolveHome(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl5.resolveHome(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.resolveBase("org.apache.karaf.main.MockLock");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        java.lang.Class<?> wildcardClass3 = main1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.osgi.framework.launch.Framework framework4 = main3.getFramework();
        main3.setExitCode((int) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(framework4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl5.resolveBase("false");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        boolean boolean5 = main1.destroy();
        main1.awaitShutdown();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList8 = main1.readBundlesFromStartupProperties(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveBase("karaf.framework.factory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        java.lang.String[] strArray4 = main1.getArgs();
        boolean boolean5 = main1.destroy();
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(framework6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.osgi.framework.launch.Framework framework4 = main3.getFramework();
        // The following exception was thrown during execution in test generation
        try {
            main3.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(framework4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.lock.Lock lock4 = main3.getLock();
        int int5 = main3.getExitCode();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(lock4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        main1.setConfig(configProperties4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        org.apache.karaf.main.ConfigProperties configProperties8 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback9 = null;
        main1.setShutdownCallback(shutdownCallback9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList12 = main1.readBundlesFromStartupProperties(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(configProperties8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.resolveHome("Error occurred shutting down framework:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI9 = serverInfoImpl6.resolveBase(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serverInfoImpl6.resolveBasePath("Systemd sd_notify failed with error code:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        int int3 = main2.getExitCode();
        java.lang.String[] strArray4 = main2.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl6.resolveHome("org.apache.felix.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveHomePath("karaf.lock.class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl9.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.resolveBase("Could not launch framework");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        java.lang.String[] strArray10 = serverInfoImpl9.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl9.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serverInfoImpl2.resolveBasePath("Systemd sd_notify failed with error code:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        boolean boolean4 = main1.destroy();
        int int5 = main1.getExitCode();
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(framework6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.lock.Lock lock4 = main3.getLock();
        // The following exception was thrown during execution in test generation
        try {
            main3.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(lock4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl6.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        org.apache.karaf.main.ConfigProperties configProperties10 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl11 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file12 = serverInfoImpl11.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl6.resolveHome("handle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl7 = new org.apache.karaf.main.ServerInfoImpl(strArray5, configProperties6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl7.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveHomePath("karaf.etc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl2.resolveHome(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray8, configProperties9);
        java.net.URI uRI11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI12 = serverInfoImpl10.resolveHome(uRI11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        main1.setConfig(configProperties4);
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray7 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl2.resolveHome("startup.properties");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.resolveBase("system repo folder not found:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray8 = serverInfoImpl6.getArgs();
        java.lang.String[] strArray9 = serverInfoImpl6.getArgs();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl9.resolveHome("3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        boolean boolean3 = main1.destroy();
        org.apache.karaf.main.ConfigProperties configProperties4 = main1.getConfig();
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(configProperties4);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = serverInfoImpl2.resolveHome(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl9.resolveBase("Bundle location");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serverInfoImpl2.resolveHomePath("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.osgi.framework.launch.Framework framework4 = main3.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        main3.setConfig(configProperties5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(framework4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl6.resolveBase("karaf.home");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.lang.String[] strArray3 = new java.lang.String[] { "\"", "test-karaf.pid", "karaf.log" };
        org.apache.karaf.main.Main main4 = new org.apache.karaf.main.Main(strArray3);
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties5);
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl6.resolveHome(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray7 = serverInfoImpl2.getArgs();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI9 = serverInfoImpl2.resolveHome(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl7 = new org.apache.karaf.main.ServerInfoImpl(strArray5, configProperties6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = serverInfoImpl7.resolveBase("0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.Main main8 = new org.apache.karaf.main.Main(strArray7);
        org.apache.karaf.main.ConfigProperties configProperties9 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl10 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties9);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        java.lang.String[] strArray10 = serverInfoImpl9.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serverInfoImpl9.resolveHomePath("karaf.data");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serverInfoImpl2.resolveBasePath("system repo folder not found:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        main1.setExitCode((int) (byte) 1);
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        boolean boolean7 = main1.destroy();
        main1.awaitShutdown();
        org.apache.karaf.main.ConfigProperties configProperties9 = main1.getConfig();
        java.lang.String[] strArray10 = main1.getArgs();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(configProperties9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        main1.setExitCode((int) (byte) 1);
        org.apache.karaf.main.ShutdownCallback shutdownCallback6 = null;
        main1.setShutdownCallback(shutdownCallback6);
        int int8 = main1.getExitCode();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.Main main5 = new org.apache.karaf.main.Main(strArray4);
        org.apache.karaf.main.ShutdownCallback shutdownCallback6 = null;
        main5.setShutdownCallback(shutdownCallback6);
        main5.awaitShutdown();
        org.osgi.framework.launch.Framework framework9 = main5.getFramework();
        org.osgi.framework.launch.Framework framework10 = main5.getFramework();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(framework9);
        org.junit.Assert.assertNull(framework10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        java.lang.String[] strArray7 = main1.getArgs();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(framework6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getInstancesDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        org.apache.karaf.main.lock.Lock lock5 = main1.getLock();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(lock5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.apache.karaf.main.ShutdownCallback shutdownCallback2 = null;
        main1.setShutdownCallback(shutdownCallback2);
        int int4 = main1.getExitCode();
        java.lang.String[] strArray5 = main1.getArgs();
        org.apache.karaf.main.lock.Lock lock6 = main1.getLock();
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(lock6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.lang.String[] strArray3 = new java.lang.String[] { "\"", "test-karaf.pid", "karaf.log" };
        org.apache.karaf.main.Main main4 = new org.apache.karaf.main.Main(strArray3);
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties5);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl6.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager7.stopKarafActivators();
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        java.lang.ClassLoader classLoader16 = null;
        org.osgi.framework.launch.Framework framework17 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager18 = new org.apache.karaf.main.KarafActivatorManager(classLoader16, framework17);
        karafActivatorManager18.stopKarafActivators();
        java.util.logging.Logger logger20 = karafActivatorManager18.LOG;
        karafActivatorManager13.LOG = logger20;
        karafActivatorManager7.LOG = logger20;
        karafActivatorManager2.LOG = logger20;
        java.lang.ClassLoader classLoader24 = null;
        org.osgi.framework.launch.Framework framework25 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager26 = new org.apache.karaf.main.KarafActivatorManager(classLoader24, framework25);
        karafActivatorManager26.stopKarafActivators();
        java.util.logging.Logger logger28 = karafActivatorManager26.LOG;
        java.lang.ClassLoader classLoader29 = null;
        org.osgi.framework.launch.Framework framework30 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager31 = new org.apache.karaf.main.KarafActivatorManager(classLoader29, framework30);
        karafActivatorManager31.stopKarafActivators();
        java.util.logging.Logger logger33 = karafActivatorManager31.LOG;
        karafActivatorManager26.LOG = logger33;
        java.util.logging.Logger logger35 = karafActivatorManager26.LOG;
        karafActivatorManager2.LOG = logger35;
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger38 = karafActivatorManager2.LOG;
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertEquals(logger20.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger20.getResourceBundleName() == null", logger20.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertEquals(logger28.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger28.getResourceBundleName() == null", logger28.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger33);
        org.junit.Assert.assertEquals(logger33.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger33.getResourceBundleName() == null", logger33.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertEquals(logger35.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger35.getResourceBundleName() == null", logger35.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertEquals(logger38.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger38.getResourceBundleName() == null", logger38.getResourceBundleName());
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        main1.setConfig(configProperties4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        org.apache.karaf.main.ConfigProperties configProperties8 = main1.getConfig();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.karaf.main.BundleInfo> bundleInfoList10 = main1.readBundlesFromStartupProperties(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error loading properties from null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(configProperties8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        boolean boolean2 = main1.destroy();
        int int3 = main1.getExitCode();
        main1.awaitShutdown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = serverInfoImpl2.getBaseDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader5 = null;
        org.osgi.framework.launch.Framework framework6 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager7 = new org.apache.karaf.main.KarafActivatorManager(classLoader5, framework6);
        karafActivatorManager7.stopKarafActivators();
        java.util.logging.Logger logger9 = karafActivatorManager7.LOG;
        karafActivatorManager2.LOG = logger9;
        java.util.logging.Logger logger11 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger12 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger13 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader14 = null;
        org.osgi.framework.launch.Framework framework15 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager16 = new org.apache.karaf.main.KarafActivatorManager(classLoader14, framework15);
        karafActivatorManager16.stopKarafActivators();
        java.lang.ClassLoader classLoader18 = null;
        org.osgi.framework.launch.Framework framework19 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager20 = new org.apache.karaf.main.KarafActivatorManager(classLoader18, framework19);
        karafActivatorManager20.stopKarafActivators();
        java.util.logging.Logger logger22 = karafActivatorManager20.LOG;
        karafActivatorManager16.LOG = logger22;
        java.lang.ClassLoader classLoader24 = null;
        org.osgi.framework.launch.Framework framework25 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager26 = new org.apache.karaf.main.KarafActivatorManager(classLoader24, framework25);
        karafActivatorManager26.stopKarafActivators();
        java.lang.ClassLoader classLoader28 = null;
        org.osgi.framework.launch.Framework framework29 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager30 = new org.apache.karaf.main.KarafActivatorManager(classLoader28, framework29);
        karafActivatorManager30.stopKarafActivators();
        java.util.logging.Logger logger32 = karafActivatorManager30.LOG;
        karafActivatorManager26.LOG = logger32;
        java.util.logging.Logger logger34 = karafActivatorManager26.LOG;
        karafActivatorManager16.LOG = logger34;
        karafActivatorManager2.LOG = logger34;
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertEquals(logger9.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger9.getResourceBundleName() == null", logger9.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertEquals(logger11.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger11.getResourceBundleName() == null", logger11.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertEquals(logger12.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger12.getResourceBundleName() == null", logger12.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertEquals(logger13.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger13.getResourceBundleName() == null", logger13.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertEquals(logger22.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger22.getResourceBundleName() == null", logger22.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertEquals(logger32.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger32.getResourceBundleName() == null", logger32.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertEquals(logger34.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger34.getResourceBundleName() == null", logger34.getResourceBundleName());
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        java.lang.String[] strArray3 = main1.getArgs();
        org.apache.karaf.main.ShutdownCallback shutdownCallback4 = null;
        main1.setShutdownCallback(shutdownCallback4);
        int int6 = main1.getExitCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        java.lang.String[] strArray10 = serverInfoImpl9.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = serverInfoImpl9.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        // The following exception was thrown during execution in test generation
        try {
            main1.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties7 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl8 = new org.apache.karaf.main.ServerInfoImpl(strArray6, configProperties7);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        org.osgi.framework.BundleContext bundleContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.karaf.main.StartupListener startupListener6 = new org.apache.karaf.main.StartupListener(logger4, bundleContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ShutdownCallback shutdownCallback3 = null;
        main1.setShutdownCallback(shutdownCallback3);
        org.apache.karaf.main.ConfigProperties configProperties5 = main1.getConfig();
        main1.awaitShutdown();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        boolean boolean2 = main1.destroy();
        org.apache.karaf.main.ShutdownCallback shutdownCallback3 = null;
        main1.setShutdownCallback(shutdownCallback3);
        // The following exception was thrown during execution in test generation
        try {
            main1.setStartLevel(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.lang.String[] strArray3 = new java.lang.String[] { "\"", "test-karaf.pid", "karaf.log" };
        org.apache.karaf.main.Main main4 = new org.apache.karaf.main.Main(strArray3);
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties5);
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI8 = serverInfoImpl6.resolveBase(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray7 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl9.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        main1.setExitCode((int) ' ');
        org.apache.karaf.main.ConfigProperties configProperties5 = main1.getConfig();
        org.osgi.framework.launch.Framework framework6 = main1.getFramework();
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties5);
        org.junit.Assert.assertNull(framework6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI4 = serverInfoImpl2.resolveBase(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.io.File[] fileArray0 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> fileList1 = new java.util.ArrayList<java.io.File>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.io.File>) fileList1, fileArray0);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver3 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver4 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver5 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver6 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        org.apache.karaf.main.util.SimpleMavenResolver simpleMavenResolver7 = new org.apache.karaf.main.util.SimpleMavenResolver((java.util.List<java.io.File>) fileList1);
        org.junit.Assert.assertNotNull(fileArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray7 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = serverInfoImpl2.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.getDataDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.lang.ClassLoader classLoader0 = null;
        org.osgi.framework.launch.Framework framework1 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager2 = new org.apache.karaf.main.KarafActivatorManager(classLoader0, framework1);
        karafActivatorManager2.stopKarafActivators();
        java.util.logging.Logger logger4 = karafActivatorManager2.LOG;
        java.util.logging.Logger logger5 = karafActivatorManager2.LOG;
        java.lang.ClassLoader classLoader6 = null;
        org.osgi.framework.launch.Framework framework7 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager8 = new org.apache.karaf.main.KarafActivatorManager(classLoader6, framework7);
        karafActivatorManager8.stopKarafActivators();
        java.util.logging.Logger logger10 = karafActivatorManager8.LOG;
        java.lang.ClassLoader classLoader11 = null;
        org.osgi.framework.launch.Framework framework12 = null;
        org.apache.karaf.main.KarafActivatorManager karafActivatorManager13 = new org.apache.karaf.main.KarafActivatorManager(classLoader11, framework12);
        karafActivatorManager13.stopKarafActivators();
        java.util.logging.Logger logger15 = karafActivatorManager13.LOG;
        karafActivatorManager8.LOG = logger15;
        karafActivatorManager8.stopKarafActivators();
        java.util.logging.Logger logger18 = karafActivatorManager8.LOG;
        karafActivatorManager2.LOG = logger18;
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals(logger4.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger4.getResourceBundleName() == null", logger4.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertEquals(logger5.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger5.getResourceBundleName() == null", logger5.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertEquals(logger10.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger10.getResourceBundleName() == null", logger10.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertEquals(logger15.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger15.getResourceBundleName() == null", logger15.getResourceBundleName());
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertEquals(logger18.getName(), "org.apache.karaf.main.KarafActivatorManager");
        org.junit.Assert.assertNull("logger18.getResourceBundleName() == null", logger18.getResourceBundleName());
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        java.lang.String[] strArray3 = main1.getArgs();
        java.lang.String[] strArray4 = main1.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        main1.setConfig(configProperties5);
        org.apache.karaf.main.ConfigProperties configProperties7 = main1.getConfig();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(configProperties7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl5 = new org.apache.karaf.main.ServerInfoImpl(strArray3, configProperties4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl5.getHomeDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl7 = new org.apache.karaf.main.ServerInfoImpl(strArray5, configProperties6);
        java.lang.String[] strArray8 = serverInfoImpl7.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = serverInfoImpl7.resolveHome(".class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        int int2 = main1.getExitCode();
        java.lang.String[] strArray3 = main1.getArgs();
        java.lang.String[] strArray4 = main1.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        main1.setConfig(configProperties5);
        main1.setExitCode((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serverInfoImpl2.resolveBasePath("and startlevel:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        java.lang.String[] strArray4 = new java.lang.String[] { "karaf.lock.class", "handle", "Exception instantiating lock class", "does not exist or is not a directory." };
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI9 = serverInfoImpl6.resolveHome(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray6 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray7 = serverInfoImpl2.getArgs();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.lock.Lock lock4 = main3.getLock();
        main3.setExitCode((int) (short) 1);
        org.osgi.framework.launch.Framework framework7 = main3.getFramework();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(lock4);
        org.junit.Assert.assertNull(framework7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.Main main5 = new org.apache.karaf.main.Main(strArray4);
        org.apache.karaf.main.ShutdownCallback shutdownCallback6 = null;
        main5.setShutdownCallback(shutdownCallback6);
        main5.awaitShutdown();
        int int9 = main5.getExitCode();
        // The following exception was thrown during execution in test generation
        try {
            main5.updateInstancePidAfterShutdown();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file7 = serverInfoImpl2.resolveBase("m_logger");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray5 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.Main main6 = new org.apache.karaf.main.Main(strArray5);
        org.apache.karaf.main.Main main7 = new org.apache.karaf.main.Main(strArray5);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        main1.awaitShutdown();
        org.apache.karaf.main.ConfigProperties configProperties3 = null;
        main1.setConfig(configProperties3);
        boolean boolean5 = main1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            main1.launch();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The Karaf install directory could not be determined.  Please set the karaf.home system property or the KARAF_HOME environment variable.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = serverInfoImpl2.resolveHome("karaf.lock.delay");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        org.apache.karaf.main.ConfigProperties configProperties3 = main1.getConfig();
        org.apache.karaf.main.ConfigProperties configProperties4 = null;
        main1.setConfig(configProperties4);
        org.apache.karaf.main.ConfigProperties configProperties6 = null;
        main1.setConfig(configProperties6);
        org.apache.karaf.main.ConfigProperties configProperties8 = main1.getConfig();
        org.apache.karaf.main.ShutdownCallback shutdownCallback9 = null;
        main1.setShutdownCallback(shutdownCallback9);
        org.apache.karaf.main.ShutdownCallback shutdownCallback11 = null;
        main1.setShutdownCallback(shutdownCallback11);
        main1.setExitCode((int) (short) 100);
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(configProperties3);
        org.junit.Assert.assertNull(configProperties8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.lang.String[] strArray0 = null;
        org.apache.karaf.main.Main main1 = new org.apache.karaf.main.Main(strArray0);
        org.osgi.framework.launch.Framework framework2 = main1.getFramework();
        java.lang.String[] strArray3 = main1.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            main1.setStartLevel((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(framework2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.karaf.main.ConfigProperties configProperties1 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl2 = new org.apache.karaf.main.ServerInfoImpl(strArray0, configProperties1);
        java.lang.String[] strArray3 = serverInfoImpl2.getArgs();
        java.lang.String[] strArray4 = serverInfoImpl2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties5 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl6 = new org.apache.karaf.main.ServerInfoImpl(strArray4, configProperties5);
        java.lang.String[] strArray7 = serverInfoImpl6.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties8 = null;
        org.apache.karaf.main.ServerInfoImpl serverInfoImpl9 = new org.apache.karaf.main.ServerInfoImpl(strArray7, configProperties8);
        java.lang.String[] strArray10 = serverInfoImpl9.getArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serverInfoImpl9.resolveBasePath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
    }
}

