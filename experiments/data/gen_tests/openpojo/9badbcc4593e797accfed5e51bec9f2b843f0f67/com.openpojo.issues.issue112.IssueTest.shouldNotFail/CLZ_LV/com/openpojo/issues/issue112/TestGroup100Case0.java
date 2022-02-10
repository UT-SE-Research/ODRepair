package com.openpojo.issues.issue112;

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
        com.openpojo.log.LoggerFactory.autoDetect();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("] with value [");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Logging subsystem initialized to [{0}]", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Logging subsystem initialized to [{0}]] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("should not be constructed!", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("UndefinedLogSource");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("Error creating new logger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String[] strArray6 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass7 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(pojoClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String[] strArray6 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass7 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray6);
        com.openpojo.reflection.PojoClass pojoClass8 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(pojoClass7);
        org.junit.Assert.assertNotNull(pojoClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str1 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("UndefinedLogSource", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Object obj0 = null;
        java.lang.String str1 = com.openpojo.log.utils.MessageFormatter.format(obj0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("Unable to retrieve logger constructor for class [");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.log.impl.Log4JLogger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.Log4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("Testing Field [");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Logging subsystem initialized to [{0}]", true, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.reflection.Parameterizable parameterizable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator2 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Error creating new logger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.JavaLogger");
        java.lang.Class<?> wildcardClass2 = reflectionException1.getClass();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("]", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("Unable to retrieve logger constructor for class [", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Unable to retrieve logger constructor for class [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Error creating new logger", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.JavaLogger");
        java.lang.Throwable[] throwableArray2 = reflectionException1.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str1 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray2 = reflectionException1.getSuppressed();
        java.lang.String str3 = reflectionException1.toString();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: Error creating new logger" + "'", str3, "com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("", pojoClassFilter1);
        org.junit.Assert.assertNotNull(pojoClassList2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String[] strArray5 = new java.lang.String[] { "]", "] with value [", "] with value [", "should not be constructed!", "]" };
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.reflection.PojoClass pojoClass6 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray5);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Unable to find suitable implementation among [[], ] with value [, ] with value [, should not be constructed!, ]]]");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.Log4JLogger", true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException7);
        java.lang.Throwable[] throwableArray14 = reflectionException3.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        java.lang.String str4 = reflectionException2.toString();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: Error creating new logger" + "'", str4, "com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("com.openpojo.log.impl.JavaLogger");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Unable to retrieve logger constructor for class [");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Unable to retrieve logger constructor for class [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("should not be constructed!");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [should not be constructed!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.log.impl.JavaLogger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.log.impl.JavaLogger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.SLF4JLogger");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("100");
        com.openpojo.log.Logger logger4 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.JavaLogger");
        java.lang.String[] strArray12 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass13 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray12);
        logger4.info("Logging subsystem initialized to [{0}]", (java.lang.Object[]) strArray12);
        logger1.trace("com.openpojo.random.service.impl.DefaultRandomGeneratorService", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(pojoClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        com.openpojo.reflection.Parameterizable parameterizable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator6 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator5 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Unable to retrieve logger constructor for class [", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str1 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("100", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [100] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("100");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.SLF4JLogger", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("", pojoClassFilter1);
// flaky:             org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [.git] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("com.openpojo.log.impl.SLF4JLogger");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("should not be constructed!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException10);
        java.lang.String str12 = reflectionException10.toString();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource" + "'", str12, "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray4 = reflectionException3.getSuppressed();
        java.lang.String str5 = com.openpojo.log.utils.MessageFormatter.format("Logging subsystem initialized to [{0}]", (java.lang.Object[]) throwableArray4);
        java.lang.String str6 = com.openpojo.log.utils.MessageFormatter.format("hi!", (java.lang.Object[]) throwableArray4);
        java.lang.Class<?> wildcardClass7 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Logging subsystem initialized to [{0}]" + "'", str5, "Logging subsystem initialized to [{0}]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String[] strArray6 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass7 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray6);
        java.lang.Class<?> wildcardClass8 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray6);
        com.openpojo.reflection.PojoClass pojoClass9 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(pojoClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(pojoClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("0", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [0] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.log.impl.Log4JLogger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.Log4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException11);
        java.lang.String str14 = reflectionException11.toString();
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource" + "'", str14, "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isErrorEnabled();
        java.lang.Class<?> wildcardClass3 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        com.openpojo.random.RandomGenerator randomGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Testing Field [", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Unable to retrieve logger constructor for class [", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Unable to retrieve logger constructor for class [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("4", true, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("100");
        com.openpojo.reflection.exception.ReflectionException reflectionException5 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException5);
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException9);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException9);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException9.addSuppressed((java.lang.Throwable) reflectionException13);
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException13);
        logger1.debug((java.lang.Object) reflectionException13);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(reflectionException5);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException9);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.JavaLogger");
        java.lang.String[] strArray9 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass10 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray9);
        logger1.info("Logging subsystem initialized to [{0}]", (java.lang.Object[]) strArray9);
        java.lang.String str12 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) "Logging subsystem initialized to [{0}]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(pojoClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Logging subsystem initialized to [{0}]" + "'", str12, "Logging subsystem initialized to [{0}]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.JavaLogger");
        java.lang.String[] strArray9 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass10 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray9);
        logger1.info("Logging subsystem initialized to [{0}]", (java.lang.Object[]) strArray9);
        com.openpojo.log.Logger logger14 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.JavaLogger");
        java.lang.String[] strArray22 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass23 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray22);
        logger14.info("Logging subsystem initialized to [{0}]", (java.lang.Object[]) strArray22);
        java.lang.Class<?> wildcardClass25 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray22);
        logger1.warn("should not be constructed!", (java.lang.Object[]) strArray22);
        boolean boolean27 = logger1.isErrorEnabled();
        com.openpojo.log.Logger logger29 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.JavaLogger");
        java.lang.String[] strArray37 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass38 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray37);
        logger29.info("Logging subsystem initialized to [{0}]", (java.lang.Object[]) strArray37);
        com.openpojo.log.Logger logger42 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.JavaLogger");
        java.lang.String[] strArray50 = new java.lang.String[] { "com.openpojo.log.impl.Log4JLogger", "]", "UndefinedLogSource", "Unable to retrieve logger constructor for class [", "] with value [", "Error creating new logger" };
        com.openpojo.reflection.PojoClass pojoClass51 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray50);
        logger42.info("Logging subsystem initialized to [{0}]", (java.lang.Object[]) strArray50);
        java.lang.Class<?> wildcardClass53 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray50);
        logger29.warn("should not be constructed!", (java.lang.Object[]) strArray50);
        logger1.info((java.lang.Object) strArray50);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(pojoClass10);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(pojoClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(pojoClass38);
        org.junit.Assert.assertNotNull(logger42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(pojoClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        java.lang.String str5 = null; // flaky: serviceRegistrar0.toString();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("com.openpojo.log.impl.JavaLogger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger");
        java.lang.Throwable[] throwableArray2 = reflectionException1.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Error creating new logger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("com.openpojo.log.impl.Log4JLogger");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.SLF4JLogger", true, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: Error creating new logger", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Testing Field [");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("Logging subsystem initialized to [{0}]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        java.lang.Throwable[] throwableArray10 = reflectionException7.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException18);
        reflectionException15.addSuppressed((java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException27);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException31);
        reflectionException28.addSuppressed((java.lang.Throwable) reflectionException31);
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException35);
        reflectionException24.addSuppressed((java.lang.Throwable) reflectionException31);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException24);
        java.lang.Throwable[] throwableArray39 = reflectionException7.getSuppressed();
        java.lang.Throwable[] throwableArray40 = reflectionException7.getSuppressed();
        java.lang.String str41 = com.openpojo.log.utils.MessageFormatter.format("] with value [", (java.lang.Object[]) throwableArray40);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "] with value [" + "'", str41, "] with value [");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException4);
        java.lang.Class<?> wildcardClass9 = reflectionException4.getClass();
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.SLF4JLogger", false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isTraceEnabled();
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException15);
        reflectionException12.addSuppressed((java.lang.Throwable) reflectionException15);
        reflectionException8.addSuppressed((java.lang.Throwable) reflectionException12);
        java.lang.Throwable[] throwableArray19 = reflectionException12.getSuppressed();
        logger1.trace("] with value [", (java.lang.Object[]) throwableArray19);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        com.openpojo.random.RandomGenerator randomGenerator3 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator3);
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        com.openpojo.reflection.Parameterizable parameterizable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator7 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("] with value [", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [] with value [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClasses("4", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [4] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.reflection.PojoClass pojoClass1 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray14 = reflectionException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = reflectionException13.getSuppressed();
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        java.lang.Throwable[] throwableArray9 = reflectionException6.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException13);
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException17);
        reflectionException14.addSuppressed((java.lang.Throwable) reflectionException17);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException17.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException30);
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException34 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException30.addSuppressed((java.lang.Throwable) reflectionException34);
        reflectionException23.addSuppressed((java.lang.Throwable) reflectionException30);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException23);
        java.lang.Throwable[] throwableArray38 = reflectionException6.getSuppressed();
        java.lang.String str39 = reflectionException6.toString();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: Error creating new logger" + "'", str39, "com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.random.service.impl.DefaultRandomGeneratorService");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.random.service.impl.DefaultRandomGeneratorService] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String[] strArray4 = new java.lang.String[] { "100", "Logging subsystem initialized to [{0}]", "Error creating new logger", "Testing Field [" };
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.reflection.PojoClass pojoClass5 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray4);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Unable to find suitable implementation among [[100, Logging subsystem initialized to [{0}], Error creating new logger, Testing Field []]");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("100", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [100] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClasses("Logging subsystem initialized to [{0}]", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Logging subsystem initialized to [{0}]] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("100", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Testing Field [", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Testing Field [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClassesRecursively("]", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package []] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.random.service.impl.DefaultRandomGeneratorService", true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.log.impl.SLF4JLogger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.SLF4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("hi!", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [hi!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String[] strArray0 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("0", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.random.RandomGenerator randomGenerator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService5.registerRandomGenerator(randomGenerator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("0", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [0] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("] with value [", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [] with value [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isWarnEnabled();
        java.lang.Class<?> wildcardClass4 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClasses("Error creating new logger", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.String str2 = reflectionException1.toString();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: Error creating new logger" + "'", str2, "com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService1.registerRandomGenerator(randomGenerator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection3 = defaultRandomGeneratorService0.getRegisteredTypes();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNotNull(wildcardClassCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        java.lang.Class<?> wildcardClass4 = defaultRandomGeneratorService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isTraceEnabled();
        boolean boolean4 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClasses("hi!", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [hi!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Testing Field [", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("");
        org.junit.Assert.assertNotNull(pojoClassList1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService1 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList4 = pojoClassLookupService1.getPojoClasses("com.openpojo.log.impl.JavaLogger", pojoClassFilter3);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClassesRecursively("] with value [", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [] with value [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService1 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList4 = pojoClassLookupService1.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: Error creating new logger", pojoClassFilter3);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Logging subsystem initialized to [{0}]");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        java.lang.String str8 = randomGeneratorService7.getName();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str8, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray3 = reflectionException2.getSuppressed();
        java.lang.String str4 = com.openpojo.log.utils.MessageFormatter.format("", (java.lang.Object[]) throwableArray3);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClassesRecursively("Logging subsystem initialized to [{0}]", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Logging subsystem initialized to [{0}]] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService1 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList4 = pojoClassLookupService1.getPojoClasses("UndefinedLogSource", pojoClassFilter3);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException2);
        java.lang.Throwable[] throwableArray4 = reflectionException2.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        java.lang.Throwable[] throwableArray13 = reflectionException10.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException17);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException21);
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException25 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException21.addSuppressed((java.lang.Throwable) reflectionException25);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException25);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException34 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException34);
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException34);
        com.openpojo.reflection.exception.ReflectionException reflectionException38 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException34.addSuppressed((java.lang.Throwable) reflectionException38);
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException34);
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException27);
        java.lang.Throwable[] throwableArray42 = reflectionException10.getSuppressed();
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException47 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException48 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException47);
        com.openpojo.reflection.exception.ReflectionException reflectionException51 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException52 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException51);
        reflectionException48.addSuppressed((java.lang.Throwable) reflectionException51);
        com.openpojo.reflection.exception.ReflectionException reflectionException55 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException51.addSuppressed((java.lang.Throwable) reflectionException55);
        com.openpojo.reflection.exception.ReflectionException reflectionException57 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException55);
        com.openpojo.reflection.exception.ReflectionException reflectionException60 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException61 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException60);
        com.openpojo.reflection.exception.ReflectionException reflectionException64 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException65 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException64);
        reflectionException61.addSuppressed((java.lang.Throwable) reflectionException64);
        com.openpojo.reflection.exception.ReflectionException reflectionException68 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException64.addSuppressed((java.lang.Throwable) reflectionException68);
        reflectionException57.addSuppressed((java.lang.Throwable) reflectionException64);
        com.openpojo.reflection.exception.ReflectionException reflectionException72 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException64.addSuppressed((java.lang.Throwable) reflectionException72);
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException64);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException25);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException34);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(reflectionException38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(reflectionException47);
        org.junit.Assert.assertNotNull(reflectionException48);
        org.junit.Assert.assertNotNull(reflectionException51);
        org.junit.Assert.assertNotNull(reflectionException52);
        org.junit.Assert.assertNotNull(reflectionException55);
        org.junit.Assert.assertNotNull(reflectionException57);
        org.junit.Assert.assertNotNull(reflectionException60);
        org.junit.Assert.assertNotNull(reflectionException61);
        org.junit.Assert.assertNotNull(reflectionException64);
        org.junit.Assert.assertNotNull(reflectionException65);
        org.junit.Assert.assertNotNull(reflectionException68);
        org.junit.Assert.assertNotNull(reflectionException72);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClassesRecursively("com.openpojo.log.impl.SLF4JLogger", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.SLF4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Unable to retrieve logger constructor for class [");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService7.getPojoClasses("]", pojoClassFilter9);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package []] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClassesRecursively("com.openpojo.random.service.impl.DefaultRandomGeneratorService", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.random.service.impl.DefaultRandomGeneratorService] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService8 = serviceRegistrar0.getPojoCoverageFilterService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNull(pojoCoverageFilterService8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = null;
        serviceRegistrar0.setRandomGeneratorService(randomGeneratorService7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("Testing Field [");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Testing Field [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("should not be constructed!", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [should not be constructed!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService7.getPojoClasses("Logging subsystem initialized to [{0}]", pojoClassFilter9);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Logging subsystem initialized to [{0}]] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService5 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        serviceRegistrar0.initializeRandomGeneratorService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(randomGeneratorService5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClasses("UndefinedLogSource", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList11 = pojoClassLookupService8.getPojoClasses("100", pojoClassFilter10);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [100] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        java.lang.Throwable[] throwableArray10 = reflectionException7.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException18);
        reflectionException15.addSuppressed((java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException27);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException31);
        reflectionException28.addSuppressed((java.lang.Throwable) reflectionException31);
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException35);
        reflectionException24.addSuppressed((java.lang.Throwable) reflectionException31);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException24);
        java.lang.Throwable[] throwableArray39 = reflectionException7.getSuppressed();
        java.lang.String str40 = com.openpojo.log.utils.MessageFormatter.format("]", (java.lang.Object[]) throwableArray39);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "]" + "'", str40, "]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService1 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList3 = pojoClassLookupService1.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService7.getPojoClasses("com.openpojo.log.impl.Log4JLogger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.Log4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isWarnEnabled();
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException11);
        reflectionException8.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException11.addSuppressed((java.lang.Throwable) reflectionException15);
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException15);
        logger1.fatal((java.lang.Object) reflectionException17);
        java.lang.Throwable[] throwableArray19 = reflectionException17.getSuppressed();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("4");
        org.junit.Assert.assertNotNull(reflectionException1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService2 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializePojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.SLF4JLogger");
        java.lang.String str2 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) "com.openpojo.log.impl.SLF4JLogger");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.log.impl.SLF4JLogger" + "'", str2, "com.openpojo.log.impl.SLF4JLogger");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = null;
        serviceRegistrar0.setRandomGeneratorService(randomGeneratorService7);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService9);
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("should not be constructed!", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("com.openpojo.log.impl.SLF4JLogger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.SLF4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection6 = defaultRandomGeneratorService1.getRegisteredTypes();
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = defaultRandomGeneratorService1.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService1.setDefaultRandomGenerator(randomGenerator8);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(wildcardClassCollection6);
        org.junit.Assert.assertNotNull(wildcardClassCollection7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("0");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [0] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("] with value [", false, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        java.lang.Throwable[] throwableArray2 = reflectionException1.getSuppressed();
        java.lang.String str3 = reflectionException1.toString();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource" + "'", str3, "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("hi!");
        boolean boolean2 = logger1.isErrorEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection4 = defaultRandomGeneratorService0.getRegisteredTypes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertNotNull(wildcardClassCollection4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("] with value [", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String str1 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) "Error creating new logger");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Error creating new logger" + "'", str1, "Error creating new logger");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        java.lang.Throwable[] throwableArray9 = reflectionException6.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException13);
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException17);
        reflectionException14.addSuppressed((java.lang.Throwable) reflectionException17);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException17.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException30);
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException34 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException30.addSuppressed((java.lang.Throwable) reflectionException34);
        reflectionException23.addSuppressed((java.lang.Throwable) reflectionException30);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException23);
        java.lang.Throwable[] throwableArray38 = reflectionException6.getSuppressed();
        java.lang.Throwable[] throwableArray39 = reflectionException6.getSuppressed();
        java.lang.Class<?> wildcardClass40 = reflectionException6.getClass();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList11 = pojoClassLookupService8.getPojoClassesRecursively("100", pojoClassFilter10);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [100] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection6 = defaultRandomGeneratorService1.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator7 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(wildcardClassCollection6);
        org.junit.Assert.assertNull(randomGenerator7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) defaultRandomGeneratorService0);
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection6 = defaultRandomGeneratorService0.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNotNull(wildcardClassCollection6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService8.getPojoClasses("Testing Field [");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Testing Field [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService7.getPojoClassesRecursively("com.openpojo.log.impl.Log4JLogger", pojoClassFilter9);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.Log4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("0");
        com.openpojo.reflection.exception.ReflectionException reflectionException5 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException5);
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException9);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException9);
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]", (java.lang.Throwable) reflectionException6);
        reflectionException1.addSuppressed((java.lang.Throwable) reflectionException12);
        java.lang.String str14 = reflectionException1.toString();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(reflectionException5);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException9);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: 0" + "'", str14, "com.openpojo.reflection.exception.ReflectionException: 0");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: 0", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNull(pojoCoverageFilterService6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException7);
        java.lang.String str14 = reflectionException3.toString();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.SLF4JLogger" + "'", str14, "com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.SLF4JLogger");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("0");
        java.lang.Throwable[] throwableArray2 = reflectionException1.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("Error creating new logger", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("com.openpojo.random.service.impl.DefaultRandomGeneratorService", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.random.service.impl.DefaultRandomGeneratorService] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("]");
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource", (java.lang.Throwable) reflectionException14);
        reflectionException2.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("should not be constructed!", (java.lang.Throwable) reflectionException2);
        java.lang.Throwable[] throwableArray19 = reflectionException2.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray3 = reflectionException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = reflectionException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = reflectionException2.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.reflection.exception.ReflectionException: 0", (java.lang.Throwable) reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(reflectionException6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("]");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        boolean boolean1 = com.openpojo.reflection.java.load.ClassUtil.isClassLoaded("UndefinedLogSource");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException11);
        reflectionException8.addSuppressed((java.lang.Throwable) reflectionException11);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException8);
        java.lang.Throwable[] throwableArray15 = reflectionException8.getSuppressed();
        java.lang.String str16 = com.openpojo.log.utils.MessageFormatter.format("0", (java.lang.Object[]) throwableArray15);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService5 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        serviceRegistrar0.initializeRandomGeneratorService();
        serviceRegistrar0.initializePojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) serviceRegistrar0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(randomGeneratorService5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService8 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNull(pojoCoverageFilterService8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService6 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str7 = defaultRandomGeneratorService6.getName();
        java.lang.String str8 = defaultRandomGeneratorService6.getName();
        com.openpojo.random.RandomGenerator randomGenerator9 = defaultRandomGeneratorService6.getDefaultRandomGenerator();
        java.lang.String str10 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) defaultRandomGeneratorService6);
        java.lang.String str11 = defaultRandomGeneratorService6.getName();
        com.openpojo.random.RandomGenerator randomGenerator12 = null;
        defaultRandomGeneratorService6.setDefaultRandomGenerator(randomGenerator12);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService6);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str7, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str8, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str11, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        com.openpojo.reflection.Parameterizable parameterizable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(randomGenerator1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray2 = reflectionException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = reflectionException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = reflectionException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = reflectionException1.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("hi!", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("] with value [");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClassesRecursively("UndefinedLogSource", pojoClassFilter8);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService8.getPojoClasses("]");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package []] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService8.getPojoClasses("should not be constructed!");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [should not be constructed!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        java.lang.String str2 = reflectionException1.toString();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource" + "'", str2, "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService11 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService11);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService13 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService13);
        serviceRegistrar0.initializeRandomGeneratorService();
        java.lang.Class<?> wildcardClass16 = serviceRegistrar0.getClass();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService9);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection6 = defaultRandomGeneratorService1.getRegisteredTypes();
        java.lang.Class<?> wildcardClass7 = wildcardClassCollection6.getClass();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(wildcardClassCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("100", true, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService7);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService10 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService10);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.Throwable throwable1 = null;
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("should not be constructed!", throwable1);
        org.junit.Assert.assertNotNull(reflectionException2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.reflection.Parameterizable parameterizable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator8 = defaultRandomGeneratorService5.getRandomGeneratorByParameterizable(parameterizable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.reflection.Parameterizable parameterizable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator12 = defaultRandomGeneratorService5.getRandomGeneratorByParameterizable(parameterizable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        java.lang.Throwable[] throwableArray5 = reflectionException4.getSuppressed();
        logger1.fatal("com.openpojo.log.impl.SLF4JLogger", (java.lang.Object[]) throwableArray5);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        reflectionException11.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException14.addSuppressed((java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException20 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException23);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException27);
        reflectionException24.addSuppressed((java.lang.Throwable) reflectionException27);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException31);
        reflectionException20.addSuppressed((java.lang.Throwable) reflectionException27);
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException35);
        logger1.debug((java.lang.Object) reflectionException27);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException20);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException35);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        com.openpojo.random.RandomGenerator randomGenerator3 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator3);
        java.lang.Class<?> wildcardClass5 = defaultRandomGeneratorService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("hi!", false);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = null;
        serviceRegistrar0.setRandomGeneratorService(randomGeneratorService7);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService9);
        serviceRegistrar0.initializePojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList11 = pojoClassLookupService8.getPojoClasses("Unable to retrieve logger constructor for class [", pojoClassFilter10);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [Unable to retrieve logger constructor for class [] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.JavaLogger");
        java.lang.String str2 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class com.openpojo.log.impl.JavaLogger" + "'", str2, "class com.openpojo.log.impl.JavaLogger");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException16);
        com.openpojo.reflection.exception.ReflectionException reflectionException20 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException20);
        reflectionException17.addSuppressed((java.lang.Throwable) reflectionException20);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException20.addSuppressed((java.lang.Throwable) reflectionException24);
        reflectionException13.addSuppressed((java.lang.Throwable) reflectionException20);
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException20.addSuppressed((java.lang.Throwable) reflectionException28);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException34 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException34);
        com.openpojo.reflection.exception.ReflectionException reflectionException38 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException39 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException38);
        reflectionException35.addSuppressed((java.lang.Throwable) reflectionException38);
        java.lang.Throwable[] throwableArray41 = reflectionException38.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException45 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException46 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException45);
        com.openpojo.reflection.exception.ReflectionException reflectionException49 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException50 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException49);
        reflectionException46.addSuppressed((java.lang.Throwable) reflectionException49);
        com.openpojo.reflection.exception.ReflectionException reflectionException53 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException49.addSuppressed((java.lang.Throwable) reflectionException53);
        com.openpojo.reflection.exception.ReflectionException reflectionException55 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException53);
        com.openpojo.reflection.exception.ReflectionException reflectionException58 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException59 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException58);
        com.openpojo.reflection.exception.ReflectionException reflectionException62 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException63 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException62);
        reflectionException59.addSuppressed((java.lang.Throwable) reflectionException62);
        com.openpojo.reflection.exception.ReflectionException reflectionException66 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException62.addSuppressed((java.lang.Throwable) reflectionException66);
        reflectionException55.addSuppressed((java.lang.Throwable) reflectionException62);
        reflectionException38.addSuppressed((java.lang.Throwable) reflectionException55);
        java.lang.Throwable[] throwableArray70 = reflectionException38.getSuppressed();
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException38);
        reflectionException20.addSuppressed((java.lang.Throwable) reflectionException38);
        java.lang.Throwable[] throwableArray73 = reflectionException38.getSuppressed();
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException20);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException34);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(reflectionException38);
        org.junit.Assert.assertNotNull(reflectionException39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(reflectionException45);
        org.junit.Assert.assertNotNull(reflectionException46);
        org.junit.Assert.assertNotNull(reflectionException49);
        org.junit.Assert.assertNotNull(reflectionException50);
        org.junit.Assert.assertNotNull(reflectionException53);
        org.junit.Assert.assertNotNull(reflectionException55);
        org.junit.Assert.assertNotNull(reflectionException58);
        org.junit.Assert.assertNotNull(reflectionException59);
        org.junit.Assert.assertNotNull(reflectionException62);
        org.junit.Assert.assertNotNull(reflectionException63);
        org.junit.Assert.assertNotNull(reflectionException66);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService8 = serviceRegistrar0.getRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
        org.junit.Assert.assertNotNull(randomGeneratorService8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("]");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("]", (java.lang.Throwable) reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String[] strArray0 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray0);
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray0);
        java.lang.String str3 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) strArray0);
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]" + "'", str3, "[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService8 = serviceRegistrar0.getRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(randomGeneratorService8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        java.lang.Throwable[] throwableArray9 = reflectionException6.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException13);
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException17);
        reflectionException14.addSuppressed((java.lang.Throwable) reflectionException17);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException17.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException30);
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException34 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException30.addSuppressed((java.lang.Throwable) reflectionException34);
        reflectionException23.addSuppressed((java.lang.Throwable) reflectionException30);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException23);
        java.lang.Throwable[] throwableArray38 = reflectionException6.getSuppressed();
        java.lang.Throwable[] throwableArray39 = reflectionException6.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException41 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        java.lang.Throwable[] throwableArray42 = reflectionException41.getSuppressed();
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException41);
        com.openpojo.reflection.exception.ReflectionException reflectionException46 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException47 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException46);
        com.openpojo.reflection.exception.ReflectionException reflectionException50 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException51 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException50);
        reflectionException47.addSuppressed((java.lang.Throwable) reflectionException50);
        java.lang.Throwable[] throwableArray53 = reflectionException50.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException57 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException58 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException57);
        com.openpojo.reflection.exception.ReflectionException reflectionException61 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException62 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException61);
        reflectionException58.addSuppressed((java.lang.Throwable) reflectionException61);
        com.openpojo.reflection.exception.ReflectionException reflectionException65 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException61.addSuppressed((java.lang.Throwable) reflectionException65);
        com.openpojo.reflection.exception.ReflectionException reflectionException67 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException65);
        com.openpojo.reflection.exception.ReflectionException reflectionException70 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException71 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException70);
        com.openpojo.reflection.exception.ReflectionException reflectionException74 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException75 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException74);
        reflectionException71.addSuppressed((java.lang.Throwable) reflectionException74);
        com.openpojo.reflection.exception.ReflectionException reflectionException78 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException74.addSuppressed((java.lang.Throwable) reflectionException78);
        reflectionException67.addSuppressed((java.lang.Throwable) reflectionException74);
        reflectionException50.addSuppressed((java.lang.Throwable) reflectionException67);
        java.lang.Throwable[] throwableArray82 = reflectionException50.getSuppressed();
        java.lang.Throwable[] throwableArray83 = reflectionException50.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException85 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        java.lang.Throwable[] throwableArray86 = reflectionException85.getSuppressed();
        reflectionException50.addSuppressed((java.lang.Throwable) reflectionException85);
        java.lang.Throwable[] throwableArray88 = reflectionException85.getSuppressed();
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException85);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(reflectionException41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(reflectionException46);
        org.junit.Assert.assertNotNull(reflectionException47);
        org.junit.Assert.assertNotNull(reflectionException50);
        org.junit.Assert.assertNotNull(reflectionException51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(reflectionException57);
        org.junit.Assert.assertNotNull(reflectionException58);
        org.junit.Assert.assertNotNull(reflectionException61);
        org.junit.Assert.assertNotNull(reflectionException62);
        org.junit.Assert.assertNotNull(reflectionException65);
        org.junit.Assert.assertNotNull(reflectionException67);
        org.junit.Assert.assertNotNull(reflectionException70);
        org.junit.Assert.assertNotNull(reflectionException71);
        org.junit.Assert.assertNotNull(reflectionException74);
        org.junit.Assert.assertNotNull(reflectionException75);
        org.junit.Assert.assertNotNull(reflectionException78);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(reflectionException85);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        com.openpojo.reflection.Parameterizable parameterizable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator6 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService8 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService10 = serviceRegistrar0.getRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNull(pojoCoverageFilterService8);
        org.junit.Assert.assertNotNull(randomGeneratorService10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        com.openpojo.reflection.Parameterizable parameterizable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator5 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        reflectionException2.addSuppressed((java.lang.Throwable) reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList11 = pojoClassLookupService8.getPojoClassesRecursively("hi!", pojoClassFilter10);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [hi!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        java.lang.String str7 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) pojoClassLookupService6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService6.getPojoClasses("com.openpojo.random.service.impl.DefaultRandomGeneratorService");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.random.service.impl.DefaultRandomGeneratorService] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList9 = pojoClassLookupService7.getPojoClasses("com.openpojo.log.impl.JavaLogger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService9 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList11 = pojoClassLookupService9.getPojoClasses("UndefinedLogSource");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
        org.junit.Assert.assertNotNull(pojoClassLookupService9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException11);
        reflectionException8.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException11.addSuppressed((java.lang.Throwable) reflectionException15);
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException15);
        com.openpojo.reflection.exception.ReflectionException reflectionException20 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException20);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException25 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException24);
        reflectionException21.addSuppressed((java.lang.Throwable) reflectionException24);
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException24.addSuppressed((java.lang.Throwable) reflectionException28);
        reflectionException17.addSuppressed((java.lang.Throwable) reflectionException24);
        reflectionException2.addSuppressed((java.lang.Throwable) reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException20);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException25);
        org.junit.Assert.assertNotNull(reflectionException28);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.JavaLogger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Unable to retrieve logger constructor for class [", (java.lang.Throwable) reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService9 = serviceRegistrar0.getPojoClassLookupService();
        java.lang.String str10 = pojoClassLookupService9.getName();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
        org.junit.Assert.assertNotNull(pojoClassLookupService9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.openpojo.reflection.service.impl.DefaultPojoClassLookupService" + "'", str10, "com.openpojo.reflection.service.impl.DefaultPojoClassLookupService");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("]");
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource", (java.lang.Throwable) reflectionException14);
        reflectionException2.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("should not be constructed!", (java.lang.Throwable) reflectionException2);
        java.lang.String str19 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) "should not be constructed!");
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "should not be constructed!" + "'", str19, "should not be constructed!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService5 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = serviceRegistrar0.getPojoCoverageFilterService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(randomGeneratorService5);
        org.junit.Assert.assertNull(pojoCoverageFilterService9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        java.lang.Throwable[] throwableArray4 = reflectionException3.getSuppressed();
        java.lang.String str5 = reflectionException3.toString();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.SLF4JLogger" + "'", str5, "com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.SLF4JLogger");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) defaultRandomGeneratorService0);
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        com.openpojo.reflection.Parameterizable parameterizable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.openpojo.random.RandomGenerator randomGenerator7 = defaultRandomGeneratorService0.getRandomGeneratorByParameterizable(parameterizable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService9 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList12 = pojoClassLookupService9.getPojoClasses("com.openpojo.log.impl.SLF4JLogger", pojoClassFilter11);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.SLF4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
        org.junit.Assert.assertNotNull(pojoClassLookupService9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService11 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService11);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService13 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService13);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService15 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = serviceRegistrar0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException2);
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("0");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException15);
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException20 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException19);
        reflectionException16.addSuppressed((java.lang.Throwable) reflectionException19);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]", (java.lang.Throwable) reflectionException16);
        reflectionException11.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("]", (java.lang.Throwable) reflectionException11);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException20);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException24);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService9);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.log.impl.JavaLogger", true, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException5 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException5);
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException9);
        reflectionException6.addSuppressed((java.lang.Throwable) reflectionException9);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException9.addSuppressed((java.lang.Throwable) reflectionException13);
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException13);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException22);
        reflectionException19.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException22.addSuppressed((java.lang.Throwable) reflectionException26);
        reflectionException15.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException22.addSuppressed((java.lang.Throwable) reflectionException30);
        reflectionException1.addSuppressed((java.lang.Throwable) reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertNotNull(reflectionException5);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException9);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException30);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.openpojo.reflection.exception.ReflectionException reflectionException1 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.JavaLogger");
        java.lang.String str2 = reflectionException1.toString();
        org.junit.Assert.assertNotNull(reflectionException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.JavaLogger" + "'", str2, "com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.JavaLogger");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException16);
        com.openpojo.reflection.exception.ReflectionException reflectionException20 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException20);
        reflectionException17.addSuppressed((java.lang.Throwable) reflectionException20);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException20.addSuppressed((java.lang.Throwable) reflectionException24);
        reflectionException13.addSuppressed((java.lang.Throwable) reflectionException20);
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException20.addSuppressed((java.lang.Throwable) reflectionException28);
        java.lang.Throwable[] throwableArray30 = reflectionException20.getSuppressed();
        java.lang.Class<?> wildcardClass31 = throwableArray30.getClass();
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException20);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = null;
        serviceRegistrar0.setRandomGeneratorService(randomGeneratorService7);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService9 = serviceRegistrar0.getRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(randomGeneratorService9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        java.lang.String str7 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) pojoClassLookupService6);
        com.openpojo.reflection.PojoClassFilter pojoClassFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService6.getPojoClasses("hi!", pojoClassFilter9);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [hi!] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("should not be constructed!");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList1 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("] with value [");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        java.lang.String str6 = defaultRandomGeneratorService0.getName();
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = defaultRandomGeneratorService0.getRegisteredTypes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str6, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNotNull(wildcardClassCollection7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter9 = null;
        java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService7.getPojoClasses("", pojoClassFilter9);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
        org.junit.Assert.assertNotNull(pojoClassList10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively("[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter10 = null;
        java.util.List<com.openpojo.reflection.PojoClass> pojoClassList11 = pojoClassLookupService8.getPojoClasses("", pojoClassFilter10);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
        org.junit.Assert.assertNotNull(pojoClassList11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = defaultRandomGeneratorService5.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator8 = defaultRandomGeneratorService5.getDefaultRandomGenerator();
        java.lang.String str9 = defaultRandomGeneratorService5.getName();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(wildcardClassCollection7);
        org.junit.Assert.assertNull(randomGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str9, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("should not be constructed!");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        java.lang.Throwable[] throwableArray5 = reflectionException4.getSuppressed();
        logger1.fatal("com.openpojo.log.impl.Log4JLogger", (java.lang.Object[]) throwableArray5);
        boolean boolean7 = logger1.isErrorEnabled();
        logger1.trace((java.lang.Object) "should not be constructed!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("UndefinedLogSource");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        java.lang.Throwable[] throwableArray10 = reflectionException7.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException18);
        reflectionException15.addSuppressed((java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException27);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException31);
        reflectionException28.addSuppressed((java.lang.Throwable) reflectionException31);
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException35);
        reflectionException24.addSuppressed((java.lang.Throwable) reflectionException31);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException24);
        java.lang.Throwable[] throwableArray39 = reflectionException24.getSuppressed();
        java.lang.String str40 = com.openpojo.log.utils.MessageFormatter.format("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource", (java.lang.Object[]) throwableArray39);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource" + "'", str40, "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("hi!");
        boolean boolean2 = logger1.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService3 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList6 = pojoClassLookupService3.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.JavaLogger", pojoClassFilter5);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService7 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService9 = serviceRegistrar0.getRandomGeneratorService();
        serviceRegistrar0.initializePojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(randomGeneratorService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
        org.junit.Assert.assertNotNull(randomGeneratorService9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        com.openpojo.log.Logger logger4 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean5 = logger4.isTraceEnabled();
        java.lang.String[] strArray7 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        logger4.warn("com.openpojo.log.impl.SLF4JLogger", (java.lang.Object[]) strArray7);
        logger1.trace("com.openpojo.log.impl.SLF4JLogger", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService11 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService11);
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService14 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService14);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService1.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService1.setDefaultRandomGenerator(randomGenerator8);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("UndefinedLogSource", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [UndefinedLogSource] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        com.openpojo.random.RandomGenerator randomGenerator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.SLF4JLogger");
        com.openpojo.log.Logger logger3 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean4 = logger3.isErrorEnabled();
        boolean boolean5 = logger3.isWarnEnabled();
        boolean boolean6 = logger3.isWarnEnabled();
        logger1.fatal((java.lang.Object) boolean6);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService3 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList6 = null; // flaky: pojoClassLookupService3.getPojoClassesRecursively("", pojoClassFilter5);
// flaky:             org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [.git] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = defaultRandomGeneratorService5.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator8 = defaultRandomGeneratorService5.getDefaultRandomGenerator();
        com.openpojo.random.RandomGenerator randomGenerator9 = defaultRandomGeneratorService5.getDefaultRandomGenerator();
        com.openpojo.random.RandomGenerator randomGenerator10 = defaultRandomGeneratorService5.getDefaultRandomGenerator();
        java.lang.String str11 = defaultRandomGeneratorService5.getName();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(wildcardClassCollection7);
        org.junit.Assert.assertNull(randomGenerator8);
        org.junit.Assert.assertNull(randomGenerator9);
        org.junit.Assert.assertNull(randomGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str11, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.openpojo.reflection.PojoClassFilter pojoClassFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList2 = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: Error creating new logger", pojoClassFilter1);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        serviceRegistrar0.initializePojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService9 = null;
        serviceRegistrar0.setRandomGeneratorService(randomGeneratorService9);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.service.impl.DefaultPojoClassLookupService", false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        serviceRegistrar0.initializePojoClassLookupService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(randomGeneratorService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService3 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList6 = pojoClassLookupService3.getPojoClasses("com.openpojo.log.impl.Log4JLogger", pojoClassFilter5);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.log.impl.Log4JLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isWarnEnabled();
        boolean boolean4 = logger1.isWarnEnabled();
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException8);
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException12);
        reflectionException9.addSuppressed((java.lang.Throwable) reflectionException12);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException12.addSuppressed((java.lang.Throwable) reflectionException16);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException16);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException25 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException25);
        reflectionException22.addSuppressed((java.lang.Throwable) reflectionException25);
        com.openpojo.reflection.exception.ReflectionException reflectionException29 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException25.addSuppressed((java.lang.Throwable) reflectionException29);
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException25);
        com.openpojo.reflection.exception.ReflectionException reflectionException33 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException25.addSuppressed((java.lang.Throwable) reflectionException33);
        com.openpojo.reflection.exception.ReflectionException reflectionException36 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException39 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException40 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException39);
        com.openpojo.reflection.exception.ReflectionException reflectionException43 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException44 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException43);
        reflectionException40.addSuppressed((java.lang.Throwable) reflectionException43);
        java.lang.Throwable[] throwableArray46 = reflectionException43.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException50 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException51 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException50);
        com.openpojo.reflection.exception.ReflectionException reflectionException54 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException55 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException54);
        reflectionException51.addSuppressed((java.lang.Throwable) reflectionException54);
        com.openpojo.reflection.exception.ReflectionException reflectionException58 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException54.addSuppressed((java.lang.Throwable) reflectionException58);
        com.openpojo.reflection.exception.ReflectionException reflectionException60 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException58);
        com.openpojo.reflection.exception.ReflectionException reflectionException63 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException64 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException63);
        com.openpojo.reflection.exception.ReflectionException reflectionException67 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException68 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException67);
        reflectionException64.addSuppressed((java.lang.Throwable) reflectionException67);
        com.openpojo.reflection.exception.ReflectionException reflectionException71 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException67.addSuppressed((java.lang.Throwable) reflectionException71);
        reflectionException60.addSuppressed((java.lang.Throwable) reflectionException67);
        reflectionException43.addSuppressed((java.lang.Throwable) reflectionException60);
        java.lang.Throwable[] throwableArray75 = reflectionException43.getSuppressed();
        reflectionException36.addSuppressed((java.lang.Throwable) reflectionException43);
        reflectionException25.addSuppressed((java.lang.Throwable) reflectionException43);
        logger1.fatal((java.lang.Object) reflectionException43);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException9);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException25);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException29);
        org.junit.Assert.assertNotNull(reflectionException33);
        org.junit.Assert.assertNotNull(reflectionException36);
        org.junit.Assert.assertNotNull(reflectionException39);
        org.junit.Assert.assertNotNull(reflectionException40);
        org.junit.Assert.assertNotNull(reflectionException43);
        org.junit.Assert.assertNotNull(reflectionException44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(reflectionException50);
        org.junit.Assert.assertNotNull(reflectionException51);
        org.junit.Assert.assertNotNull(reflectionException54);
        org.junit.Assert.assertNotNull(reflectionException55);
        org.junit.Assert.assertNotNull(reflectionException58);
        org.junit.Assert.assertNotNull(reflectionException60);
        org.junit.Assert.assertNotNull(reflectionException63);
        org.junit.Assert.assertNotNull(reflectionException64);
        org.junit.Assert.assertNotNull(reflectionException67);
        org.junit.Assert.assertNotNull(reflectionException68);
        org.junit.Assert.assertNotNull(reflectionException71);
        org.junit.Assert.assertNotNull(throwableArray75);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService1 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList3 = pojoClassLookupService1.getPojoClasses("100");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [100] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(pojoClassLookupService1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        java.lang.String str6 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator7 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator7);
        com.openpojo.random.RandomGenerator randomGenerator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str6, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService3 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService3);
        serviceRegistrar0.initializeRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.openpojo.reflection.exception.ReflectionException reflectionException2 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.Log4JLogger", (java.lang.Throwable) reflectionException2);
        java.lang.Class<?> wildcardClass4 = reflectionException2.getClass();
        org.junit.Assert.assertNotNull(reflectionException2);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.PojoClassFilter pojoClassFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList10 = pojoClassLookupService7.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: Error creating new logger", pojoClassFilter9);
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: Error creating new logger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNotNull(pojoClassLookupService7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isInfoEnabled();
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        logger1.fatal((java.lang.Object) "com.openpojo.log.impl.SLF4JLogger");
        com.openpojo.log.Logger logger20 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.Log4JLogger");
        java.lang.String[] strArray22 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        logger20.error("Error creating new logger", (java.lang.Object[]) strArray22);
        java.lang.Class<?> wildcardClass24 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray22);
        logger1.debug("", (java.lang.Object[]) strArray22);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) serviceRegistrar0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        java.lang.String str3 = defaultRandomGeneratorService0.getName();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        java.lang.Throwable[] throwableArray13 = reflectionException10.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException17);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException21);
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException25 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException21.addSuppressed((java.lang.Throwable) reflectionException25);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException25);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException34 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException34);
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException34);
        com.openpojo.reflection.exception.ReflectionException reflectionException38 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException34.addSuppressed((java.lang.Throwable) reflectionException38);
        reflectionException27.addSuppressed((java.lang.Throwable) reflectionException34);
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException27);
        java.lang.Throwable[] throwableArray42 = reflectionException10.getSuppressed();
        reflectionException3.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException44 = com.openpojo.reflection.exception.ReflectionException.getInstance("] with value [", (java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException45 = com.openpojo.reflection.exception.ReflectionException.getInstance("0", (java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException47 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException50 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException51 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException50);
        com.openpojo.reflection.exception.ReflectionException reflectionException54 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException55 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException54);
        reflectionException51.addSuppressed((java.lang.Throwable) reflectionException54);
        java.lang.Throwable[] throwableArray57 = reflectionException54.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException61 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException62 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException61);
        com.openpojo.reflection.exception.ReflectionException reflectionException65 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException66 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException65);
        reflectionException62.addSuppressed((java.lang.Throwable) reflectionException65);
        com.openpojo.reflection.exception.ReflectionException reflectionException69 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException65.addSuppressed((java.lang.Throwable) reflectionException69);
        com.openpojo.reflection.exception.ReflectionException reflectionException71 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException69);
        com.openpojo.reflection.exception.ReflectionException reflectionException74 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException75 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException74);
        com.openpojo.reflection.exception.ReflectionException reflectionException78 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException79 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException78);
        reflectionException75.addSuppressed((java.lang.Throwable) reflectionException78);
        com.openpojo.reflection.exception.ReflectionException reflectionException82 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException78.addSuppressed((java.lang.Throwable) reflectionException82);
        reflectionException71.addSuppressed((java.lang.Throwable) reflectionException78);
        reflectionException54.addSuppressed((java.lang.Throwable) reflectionException71);
        java.lang.Throwable[] throwableArray86 = reflectionException54.getSuppressed();
        reflectionException47.addSuppressed((java.lang.Throwable) reflectionException54);
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException54);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException25);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException34);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(reflectionException38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(reflectionException44);
        org.junit.Assert.assertNotNull(reflectionException45);
        org.junit.Assert.assertNotNull(reflectionException47);
        org.junit.Assert.assertNotNull(reflectionException50);
        org.junit.Assert.assertNotNull(reflectionException51);
        org.junit.Assert.assertNotNull(reflectionException54);
        org.junit.Assert.assertNotNull(reflectionException55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(reflectionException61);
        org.junit.Assert.assertNotNull(reflectionException62);
        org.junit.Assert.assertNotNull(reflectionException65);
        org.junit.Assert.assertNotNull(reflectionException66);
        org.junit.Assert.assertNotNull(reflectionException69);
        org.junit.Assert.assertNotNull(reflectionException71);
        org.junit.Assert.assertNotNull(reflectionException74);
        org.junit.Assert.assertNotNull(reflectionException75);
        org.junit.Assert.assertNotNull(reflectionException78);
        org.junit.Assert.assertNotNull(reflectionException79);
        org.junit.Assert.assertNotNull(reflectionException82);
        org.junit.Assert.assertNotNull(throwableArray86);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        defaultRandomGeneratorService5.setDefaultRandomGenerator(randomGenerator8);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService11 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService11);
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService13 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService13);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService16 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService17 = serviceRegistrar0.getPojoCoverageFilterService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNull(pojoCoverageFilterService16);
        org.junit.Assert.assertNull(pojoCoverageFilterService17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator1 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator1);
        com.openpojo.random.RandomGenerator randomGenerator3 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator3);
        com.openpojo.random.RandomGenerator randomGenerator5 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        org.junit.Assert.assertNull(randomGenerator5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = defaultRandomGeneratorService5.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService5.registerRandomGenerator(randomGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(wildcardClassCollection7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.registry.ServiceRegistrar serviceRegistrar9 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService10 = null;
        serviceRegistrar9.setPojoCoverageFilterService(pojoCoverageFilterService10);
        serviceRegistrar9.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService13 = serviceRegistrar9.getPojoCoverageFilterService();
        serviceRegistrar9.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService15 = serviceRegistrar9.getPojoClassLookupService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService16 = serviceRegistrar9.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService17 = serviceRegistrar9.getPojoClassLookupService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService18 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        com.openpojo.random.RandomGenerator randomGenerator19 = null;
        defaultRandomGeneratorService18.setDefaultRandomGenerator(randomGenerator19);
        com.openpojo.random.RandomGenerator randomGenerator21 = null;
        defaultRandomGeneratorService18.setDefaultRandomGenerator(randomGenerator21);
        serviceRegistrar9.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService18);
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService18);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
        org.junit.Assert.assertNotNull(serviceRegistrar9);
        org.junit.Assert.assertNull(pojoCoverageFilterService13);
        org.junit.Assert.assertNotNull(pojoClassLookupService15);
        org.junit.Assert.assertNotNull(randomGeneratorService16);
        org.junit.Assert.assertNotNull(pojoClassLookupService17);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource", (java.lang.Throwable) reflectionException11);
        java.lang.String str14 = reflectionException13.toString();
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource" + "'", str14, "com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService3 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNotNull(randomGeneratorService3);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("should not be constructed!");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        java.lang.Throwable[] throwableArray5 = reflectionException4.getSuppressed();
        logger1.info("]", (java.lang.Object[]) throwableArray5);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.openpojo.reflection.PojoClass> pojoClassList8 = pojoClassLookupService6.getPojoClasses("com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.JavaLogger");
            org.junit.Assert.fail("Expected exception of type com.openpojo.reflection.exception.ReflectionException; message: Package [com.openpojo.reflection.exception.ReflectionException: com.openpojo.log.impl.JavaLogger] is not valid");
        } catch (com.openpojo.reflection.exception.ReflectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str3, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("should not be constructed!");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        java.lang.Throwable[] throwableArray5 = reflectionException4.getSuppressed();
        logger1.fatal("com.openpojo.log.impl.Log4JLogger", (java.lang.Object[]) throwableArray5);
        boolean boolean7 = logger1.isErrorEnabled();
        boolean boolean8 = logger1.isWarnEnabled();
        boolean boolean9 = logger1.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isInfoEnabled();
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        logger1.fatal((java.lang.Object) "com.openpojo.log.impl.SLF4JLogger");
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException26);
        reflectionException23.addSuppressed((java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException26.addSuppressed((java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource", (java.lang.Throwable) reflectionException30);
        java.lang.Throwable[] throwableArray33 = reflectionException32.getSuppressed();
        logger1.error("]", (java.lang.Object[]) throwableArray33);
        java.lang.String[] strArray37 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        java.lang.Class<?> wildcardClass38 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray37);
        java.lang.String str39 = com.openpojo.log.utils.MessageFormatter.format("com.openpojo.log.impl.Log4JLogger", (java.lang.Object[]) strArray37);
        java.lang.Class<?> wildcardClass40 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray37);
        logger1.info("Error creating new logger", (java.lang.Object[]) strArray37);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.openpojo.log.impl.Log4JLogger" + "'", str39, "com.openpojo.log.impl.Log4JLogger");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) defaultRandomGeneratorService0);
        com.openpojo.random.RandomGenerator randomGenerator5 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertNull(randomGenerator5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.lang.ClassLoader classLoader2 = null;
        java.lang.Class<?> wildcardClass3 = com.openpojo.reflection.java.load.ClassUtil.loadClass("com.openpojo.reflection.exception.ReflectionException: Error creating new logger", true, classLoader2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService6 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService6);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService8 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.registry.ServiceRegistrar serviceRegistrar9 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService10 = null;
        serviceRegistrar9.setPojoCoverageFilterService(pojoCoverageFilterService10);
        serviceRegistrar9.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService13 = serviceRegistrar9.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService14 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar9.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService14);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection16 = defaultRandomGeneratorService14.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator17 = defaultRandomGeneratorService14.getDefaultRandomGenerator();
        com.openpojo.random.RandomGenerator randomGenerator18 = defaultRandomGeneratorService14.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService14);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(randomGeneratorService8);
        org.junit.Assert.assertNotNull(serviceRegistrar9);
        org.junit.Assert.assertNull(pojoCoverageFilterService13);
        org.junit.Assert.assertNotNull(wildcardClassCollection16);
        org.junit.Assert.assertNull(randomGenerator17);
        org.junit.Assert.assertNull(randomGenerator18);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.Log4JLogger");
        java.lang.String[] strArray3 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        logger1.error("Error creating new logger", (java.lang.Object[]) strArray3);
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        java.lang.Throwable[] throwableArray9 = reflectionException8.getSuppressed();
        java.lang.String str10 = com.openpojo.log.utils.MessageFormatter.format("Logging subsystem initialized to [{0}]", (java.lang.Object[]) throwableArray9);
        logger1.trace("com.openpojo.log.impl.SLF4JLogger", (java.lang.Object[]) throwableArray9);
        logger1.warn((java.lang.Object) "com.openpojo.reflection.exception.ReflectionException: Error creating new logger");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Logging subsystem initialized to [{0}]" + "'", str10, "Logging subsystem initialized to [{0}]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException5 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException4);
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException8);
        reflectionException5.addSuppressed((java.lang.Throwable) reflectionException8);
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException8.addSuppressed((java.lang.Throwable) reflectionException12);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException12);
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException17);
        com.openpojo.reflection.exception.ReflectionException reflectionException21 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException21);
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException25 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException21.addSuppressed((java.lang.Throwable) reflectionException25);
        reflectionException14.addSuppressed((java.lang.Throwable) reflectionException21);
        com.openpojo.reflection.exception.ReflectionException reflectionException29 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        reflectionException21.addSuppressed((java.lang.Throwable) reflectionException29);
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("Logging subsystem initialized to [{0}]");
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException36 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException35);
        com.openpojo.reflection.exception.ReflectionException reflectionException39 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException40 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException39);
        reflectionException36.addSuppressed((java.lang.Throwable) reflectionException39);
        java.lang.Throwable[] throwableArray42 = reflectionException39.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException46 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException47 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException46);
        com.openpojo.reflection.exception.ReflectionException reflectionException50 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException51 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException50);
        reflectionException47.addSuppressed((java.lang.Throwable) reflectionException50);
        com.openpojo.reflection.exception.ReflectionException reflectionException54 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException50.addSuppressed((java.lang.Throwable) reflectionException54);
        com.openpojo.reflection.exception.ReflectionException reflectionException56 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException54);
        com.openpojo.reflection.exception.ReflectionException reflectionException59 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException60 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException59);
        com.openpojo.reflection.exception.ReflectionException reflectionException63 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException64 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException63);
        reflectionException60.addSuppressed((java.lang.Throwable) reflectionException63);
        com.openpojo.reflection.exception.ReflectionException reflectionException67 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException63.addSuppressed((java.lang.Throwable) reflectionException67);
        reflectionException56.addSuppressed((java.lang.Throwable) reflectionException63);
        reflectionException39.addSuppressed((java.lang.Throwable) reflectionException56);
        java.lang.Throwable[] throwableArray71 = reflectionException39.getSuppressed();
        reflectionException32.addSuppressed((java.lang.Throwable) reflectionException39);
        reflectionException21.addSuppressed((java.lang.Throwable) reflectionException39);
        com.openpojo.reflection.exception.ReflectionException reflectionException74 = com.openpojo.reflection.exception.ReflectionException.getInstance("]", (java.lang.Throwable) reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException5);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException9);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException21);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException25);
        org.junit.Assert.assertNotNull(reflectionException29);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(reflectionException36);
        org.junit.Assert.assertNotNull(reflectionException39);
        org.junit.Assert.assertNotNull(reflectionException40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(reflectionException46);
        org.junit.Assert.assertNotNull(reflectionException47);
        org.junit.Assert.assertNotNull(reflectionException50);
        org.junit.Assert.assertNotNull(reflectionException51);
        org.junit.Assert.assertNotNull(reflectionException54);
        org.junit.Assert.assertNotNull(reflectionException56);
        org.junit.Assert.assertNotNull(reflectionException59);
        org.junit.Assert.assertNotNull(reflectionException60);
        org.junit.Assert.assertNotNull(reflectionException63);
        org.junit.Assert.assertNotNull(reflectionException64);
        org.junit.Assert.assertNotNull(reflectionException67);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(reflectionException74);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService5 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService5);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = defaultRandomGeneratorService5.getRegisteredTypes();
        com.openpojo.random.RandomGenerator randomGenerator8 = defaultRandomGeneratorService5.getDefaultRandomGenerator();
        com.openpojo.random.RandomGenerator randomGenerator9 = defaultRandomGeneratorService5.getDefaultRandomGenerator();
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection10 = defaultRandomGeneratorService5.getRegisteredTypes();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(wildcardClassCollection7);
        org.junit.Assert.assertNull(randomGenerator8);
        org.junit.Assert.assertNull(randomGenerator9);
        org.junit.Assert.assertNotNull(wildcardClassCollection10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = defaultRandomGeneratorService0.getName();
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        java.lang.String str6 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator7 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator7);
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection9 = defaultRandomGeneratorService0.getRegisteredTypes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str4, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str6, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNotNull(wildcardClassCollection9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService8 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService10 = serviceRegistrar0.getRandomGeneratorService();
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
        org.junit.Assert.assertNotNull(randomGeneratorService8);
        org.junit.Assert.assertNull(pojoCoverageFilterService9);
        org.junit.Assert.assertNotNull(randomGeneratorService10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.java.load.ClassUtil.loadClass("[com.openpojo.log.impl.SLF4JLogger, com.openpojo.log.impl.Log4JLogger, com.openpojo.log.impl.JavaLogger]");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        boolean boolean2 = logger1.isFatalEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService1 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService1);
        serviceRegistrar0.initializeRandomGeneratorService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService4 = serviceRegistrar0.getPojoCoverageFilterService();
        serviceRegistrar0.initializePojoClassLookupService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService7 = serviceRegistrar0.getPojoCoverageFilterService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService8 = serviceRegistrar0.getPojoClassLookupService();
        com.openpojo.reflection.coverage.service.PojoCoverageFilterService pojoCoverageFilterService9 = null;
        serviceRegistrar0.setPojoCoverageFilterService(pojoCoverageFilterService9);
        org.junit.Assert.assertNotNull(serviceRegistrar0);
        org.junit.Assert.assertNull(pojoCoverageFilterService4);
        org.junit.Assert.assertNotNull(pojoClassLookupService6);
        org.junit.Assert.assertNull(pojoCoverageFilterService7);
        org.junit.Assert.assertNotNull(pojoClassLookupService8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService0 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str1 = defaultRandomGeneratorService0.getName();
        java.lang.String str2 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator3 = defaultRandomGeneratorService0.getDefaultRandomGenerator();
        java.lang.String str4 = com.openpojo.log.utils.MessageFormatter.format((java.lang.Object) defaultRandomGeneratorService0);
        java.lang.String str5 = defaultRandomGeneratorService0.getName();
        com.openpojo.random.RandomGenerator randomGenerator6 = null;
        defaultRandomGeneratorService0.setDefaultRandomGenerator(randomGenerator6);
        com.openpojo.random.RandomGenerator randomGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultRandomGeneratorService0.registerRandomGenerator(randomGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str1, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str2, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
        org.junit.Assert.assertNull(randomGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.openpojo.random.service.impl.DefaultRandomGeneratorService" + "'", str5, "com.openpojo.random.service.impl.DefaultRandomGeneratorService");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.java.load.ClassUtil.loadClass("UndefinedLogSource", true);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("com.openpojo.log.impl.Log4JLogger");
        java.lang.String[] strArray3 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        logger1.error("Error creating new logger", (java.lang.Object[]) strArray3);
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException8);
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException12);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException17 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException16);
        reflectionException13.addSuppressed((java.lang.Throwable) reflectionException16);
        reflectionException9.addSuppressed((java.lang.Throwable) reflectionException13);
        java.lang.Throwable[] throwableArray20 = reflectionException13.getSuppressed();
        logger1.error("com.openpojo.reflection.service.impl.DefaultPojoClassLookupService", (java.lang.Object[]) throwableArray20);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException9);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(reflectionException13);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException17);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException7);
        java.lang.Throwable[] throwableArray10 = reflectionException7.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException15 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException18);
        reflectionException15.addSuppressed((java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException18.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException24 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException27);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException31);
        reflectionException28.addSuppressed((java.lang.Throwable) reflectionException31);
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException31.addSuppressed((java.lang.Throwable) reflectionException35);
        reflectionException24.addSuppressed((java.lang.Throwable) reflectionException31);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException24);
        java.lang.Throwable[] throwableArray39 = reflectionException7.getSuppressed();
        java.lang.Throwable[] throwableArray40 = reflectionException7.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException41 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.JavaLogger", (java.lang.Throwable) reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException15);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException24);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(reflectionException41);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isInfoEnabled();
        com.openpojo.reflection.exception.ReflectionException reflectionException6 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException6);
        com.openpojo.reflection.exception.ReflectionException reflectionException10 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException10);
        reflectionException7.addSuppressed((java.lang.Throwable) reflectionException10);
        com.openpojo.reflection.exception.ReflectionException reflectionException14 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException10.addSuppressed((java.lang.Throwable) reflectionException14);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException14);
        logger1.fatal((java.lang.Object) "com.openpojo.log.impl.SLF4JLogger");
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException27 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException26);
        reflectionException23.addSuppressed((java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException30 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException26.addSuppressed((java.lang.Throwable) reflectionException30);
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource", (java.lang.Throwable) reflectionException30);
        java.lang.Throwable[] throwableArray33 = reflectionException32.getSuppressed();
        logger1.error("]", (java.lang.Object[]) throwableArray33);
        boolean boolean35 = logger1.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(reflectionException6);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException10);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException14);
        org.junit.Assert.assertNotNull(reflectionException16);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException27);
        org.junit.Assert.assertNotNull(reflectionException30);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.openpojo.reflection.exception.ReflectionException reflectionException3 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException4 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException3);
        com.openpojo.reflection.exception.ReflectionException reflectionException7 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException7);
        com.openpojo.reflection.exception.ReflectionException reflectionException11 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException11);
        reflectionException8.addSuppressed((java.lang.Throwable) reflectionException11);
        java.lang.Throwable[] throwableArray14 = reflectionException11.getSuppressed();
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException19 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException18);
        com.openpojo.reflection.exception.ReflectionException reflectionException22 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException23 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException22);
        reflectionException19.addSuppressed((java.lang.Throwable) reflectionException22);
        com.openpojo.reflection.exception.ReflectionException reflectionException26 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException22.addSuppressed((java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException28 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException26);
        com.openpojo.reflection.exception.ReflectionException reflectionException31 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException32 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException31);
        com.openpojo.reflection.exception.ReflectionException reflectionException35 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException36 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException35);
        reflectionException32.addSuppressed((java.lang.Throwable) reflectionException35);
        com.openpojo.reflection.exception.ReflectionException reflectionException39 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException35.addSuppressed((java.lang.Throwable) reflectionException39);
        reflectionException28.addSuppressed((java.lang.Throwable) reflectionException35);
        reflectionException11.addSuppressed((java.lang.Throwable) reflectionException28);
        java.lang.Throwable[] throwableArray43 = reflectionException11.getSuppressed();
        reflectionException4.addSuppressed((java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException45 = com.openpojo.reflection.exception.ReflectionException.getInstance("4", (java.lang.Throwable) reflectionException11);
        com.openpojo.reflection.exception.ReflectionException reflectionException47 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.reflection.exception.ReflectionException: UndefinedLogSource");
        reflectionException11.addSuppressed((java.lang.Throwable) reflectionException47);
        org.junit.Assert.assertNotNull(reflectionException3);
        org.junit.Assert.assertNotNull(reflectionException4);
        org.junit.Assert.assertNotNull(reflectionException7);
        org.junit.Assert.assertNotNull(reflectionException8);
        org.junit.Assert.assertNotNull(reflectionException11);
        org.junit.Assert.assertNotNull(reflectionException12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(reflectionException18);
        org.junit.Assert.assertNotNull(reflectionException19);
        org.junit.Assert.assertNotNull(reflectionException22);
        org.junit.Assert.assertNotNull(reflectionException23);
        org.junit.Assert.assertNotNull(reflectionException26);
        org.junit.Assert.assertNotNull(reflectionException28);
        org.junit.Assert.assertNotNull(reflectionException31);
        org.junit.Assert.assertNotNull(reflectionException32);
        org.junit.Assert.assertNotNull(reflectionException35);
        org.junit.Assert.assertNotNull(reflectionException36);
        org.junit.Assert.assertNotNull(reflectionException39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(reflectionException45);
        org.junit.Assert.assertNotNull(reflectionException47);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Unable to retrieve logger constructor for class [");
        boolean boolean2 = logger1.isErrorEnabled();
        boolean boolean3 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}
