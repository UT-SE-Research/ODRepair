package com.networknt.config;

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
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class14, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("config", class18, ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("password", class2, "config file cannot be found.");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Exception", class10, "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("def$g", class22, "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("decryptorClass", class18, ".yml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class22, "loaded config from file {}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("C", class26, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "found decryptorClass={}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Exception", class22, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class6, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("", class22, ".");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("password", class22, "config\001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "IOException");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("\001 in \001", class26, ".json");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig(".", class30, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class22, "loaded config from file {}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config\001", class26, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class18, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, ".yml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("abc$defg", class14, "Config loaded from default folder for \001");
        java.lang.Class class18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("password", class18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, ".yml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("abc$defg", class14, "Config loaded from default folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class18, "");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("C", class22, "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("", class10, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class10, "config\001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yaml", class18, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("decryptorClass", class18, "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class26, "Config loaded from default folder for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class30, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "hi!");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config\001", class26, "value");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Exception", class30, ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class18, "config loaded from classpath for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("value", class26, "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class18, ".json");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "decryptorClass");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "hi!");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "sql2");
        java.lang.Class class18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("password", class18, "Exception");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, "Config loaded from externalized folder for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig(".yml", class26, "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class18, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class22, "loaded config from file {}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "config\001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class30, "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class22, "config file cannot be found.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("IOException", class26, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "IOException");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("\001 in \001", class26, ".json");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class30, "config");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class34, "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("config\001", class18, "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "def$g");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("hi!", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class26, "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class26, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "def$g");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Exception", class30, "Unable to load config from externalized folder for \001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("IOException", class34, "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class26, "Config loaded from default folder for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig(".json", class30, "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("decryptorClass", class26, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class30, "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class22, "Unable to load \001 as map.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class26, "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("value", class6, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class22, "decryptorClass");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("C", class26, "loaded config from file {}");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class30, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, "Config loaded from externalized folder for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("C", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class26, "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "IOException");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "Config loaded from default folder for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig(".json", class30, "sql2");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("value", class34, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("decryptorClass", class6, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class26, "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".json", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "config file cannot be found.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "config loaded from classpath for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class30, "Trying to load config from classpath directory for file \001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class34, "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "decryptorClass");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "hi!");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("sql2", class22, "decryptorClass");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".", class18, "\001 in \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("IOException", class22, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class6, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("def$g", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql2", class18, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class22, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "Config loaded from default folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class14, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "decryptorClass");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "hi!");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("sql2", class22, "decryptorClass");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("decryptorClass", class26, "config loaded from classpath for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class30, "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class6, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("def$g", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yaml", class18, "def$g");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Exception", class22, "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("decryptorClass", class22, "password");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class26, "config");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class30, ".yaml");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("\001 in \001", class34, "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, ".");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class26, "sql1");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("abc$defg", class30, "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "config file cannot be found.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "Unable to load config from externalized folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config\001", class26, "Config loaded from externalized folder for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class30, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql2", class18, "loaded config from file {}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class22, ".yml");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class26, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class6, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("def$g", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yaml", class18, "def$g");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("value", class22, ".yml");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("value", class26, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("hi!", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class22, ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class6, "\001 in \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("", class10, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql2", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("password", class22, "config\001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class6, "\001 in \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("", class10, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("\001 in \001", class18, "config loaded from classpath for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".", class22, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class10, "config\001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class14, "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("IOException", class18, "loaded config from file {}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("sql2", class22, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class18, "");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("", class26, "config file cannot be found.");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class30, "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("IOException", class18, "loaded config from file {}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class22, "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class18, "abc$defg");
        java.lang.Class class22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("password", class22, ".yaml");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, ".");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class26, "sql1");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class30, "");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class34, "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "config file cannot be found.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "config loaded from classpath for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class30, "Trying to load config from classpath directory for file \001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("IOException", class34, "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("hi!", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Exception", class26, "Unable to load \001 as map.");
        java.lang.Class class30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("password", class30, "found configLoaderClass={}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "found configLoaderClass={}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class14, "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("IOException", class10, "Config loaded from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class14, "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql2", class18, "config file cannot be found.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("hi!", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class22, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("C", class26, "password");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("value", class30, "def$g");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("def$g", class34, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("IOException", class26, "config");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class30, "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class22, "config file cannot be found.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("def$g", class26, "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("hi!", class10, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class18, ".");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("def$g", class26, ".yaml");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("\001 in \001", class30, "\001 in \001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class34, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("sql1", class30, ".json");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class34, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class26, "found configLoaderClass={}");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("", class30, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class18, "abc$defg");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("def$g", class26, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class30, "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "def$g");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".", class22, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class18, ".json");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class22, "def$g");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Exception", class26, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class18, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, "Config loaded from externalized folder for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class26, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, ".yml");
        java.lang.Class class26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("password", class26, "config\001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("sql1", class10, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("\001 in \001", class14, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("IOException", class18, "loaded config from file {}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("sql1", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql2", class26, "loaded config from file {}");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class30, "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "loaded config from file {}");
        java.lang.Class class26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("password", class26, "Unable to load \001 as map.");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("decryptorClass", class22, "config loaded from classpath for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class26, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class18, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class22, "password");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("sql2", class22, "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("abc$defg", class10, "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class6, "\001 in \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Exception", class10, "sql2");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class14, ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class26, "config\001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig(".", class30, "${password:abc$defg}");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class34, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "def$g");
        java.lang.Class class30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("password", class30, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class22, "loaded config from file {}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("\001 in \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class30, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("IOException", class22, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class26, "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class18, ".json");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class26, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("decryptorClass", class18, ".yml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("C", class22, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class18, "config loaded from classpath for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("IOException", class26, "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "hi!");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config\001", class26, "value");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("", class30, ".");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class34, "");
        java.lang.Class class38 = null;
        java.lang.Object obj40 = config0.getDefaultJsonObjectConfig(".yml", class38, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("sql1", class10, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("decryptorClass", class18, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("hi!", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("IOException", class26, "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".json", class22, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class6, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class10, "sql1");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("decryptorClass", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class18, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("C", class6, "hi!");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config\001", class10, "config\001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("sql2", class14, "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("sql1", class14, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("", class26, "config\001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class30, ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class6, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("\001 in \001", class10, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class22, "Unable to load \001 as map.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class26, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "sql2");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("abc$defg", class18, "Trying to load config from classpath directory for file \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class18, "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class18, "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class18, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class22, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class26, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class18, "found decryptorClass={}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "Unable to load config from externalized folder for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("", class26, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class18, "");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class26, "hi!");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("config", class30, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("def$g", class14, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Exception", class26, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class18, "abc$defg");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("def$g", class26, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class30, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("decryptorClass", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("decryptorClass", class18, ".yml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("value", class22, "");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("value", class26, "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "found decryptorClass={}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql2", class26, "Exception");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class30, "config\001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class34, "\001 in \001");
        java.lang.Class class38 = null;
        java.lang.Object obj40 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class38, ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "decryptorClass");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Exception", class22, "def$g");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class26, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("", class22, ".");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class26, "\001 in \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class30, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "def$g");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class22, "loaded config from file {}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "config\001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("config", class30, "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class6, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("def$g", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql2", class18, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("password", class22, "Trying to load config from classpath directory for file \001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("sql1", class14, "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class6, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("def$g", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yaml", class18, "def$g");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("value", class22, ".yml");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, "\001 in \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class22, "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("", class26, "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "decryptorClass");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "hi!");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class22, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql2", class26, "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("C", class6, "hi!");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config\001", class10, "config\001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class14, "");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class18, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "\001 in \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class26, "config\001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("hi!", class30, "${password:abc$defg}");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("sql1", class34, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class18, "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class22, "config file cannot be found.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig(".yml", class26, "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("IOException", class18, "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("hi!", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class22, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("C", class26, "password");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("value", class30, "def$g");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class34, "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("hi!", class22, "value");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config\001", class26, "config loaded from classpath for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("\001 in \001", class30, "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".yaml", class6, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig(".yml", class26, "found configLoaderClass={}");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("value", class30, "sql1");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("def$g", class34, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class30, "abc$defg");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("hi!", class34, "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("sql1", class30, ".json");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig(".json", class34, ".yml");
        java.lang.Class class38 = null;
        java.lang.Object obj40 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class38, "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("abc$defg", class14, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("\001 in \001", class10, "C");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yml", class14, "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "sql2");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("abc$defg", class18, "Trying to load config from classpath directory for file \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("value", class22, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class26, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class30, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".json", class6, "loaded config from file {}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("IOException", class10, "Config loaded from externalized folder for \001");
        java.lang.Class class14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("password", class14, "config");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".json", class22, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("password", class26, "Config loaded from default folder for \001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class14, ".yaml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class14, ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "IOException");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "Config loaded from default folder for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class30, "loaded config from file {}");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("hi!", class34, "abc$defg");
        java.lang.Class class38 = null;
        java.lang.Object obj40 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class38, "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class2, "config");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class10, "config");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("def$g", class14, "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".json", class22, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "found decryptorClass={}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql2", class26, "Exception");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class30, "Exception");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig(".", class34, "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yml", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("sql2", class14, "IOException");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class18, ".yml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("def$g", class22, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("IOException", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("sql1", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig(".yml", class26, "found configLoaderClass={}");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("value", class30, "sql1");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("decryptorClass", class34, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "def$g");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Exception", class30, "Unable to load config from externalized folder for \001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("sql2", class34, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class22, "config loaded from classpath for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class26, "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("", class22, ".");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig(".yaml", class26, "C");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class30, ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class22, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class22, "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, ".");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class26, "sql1");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("sql1", class30, "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config file cannot be found.", class22, "value");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class26, ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("IOException", class10, "Config loaded from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class14, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class14, "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class18, "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, ".yml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("sql1", class14, "Config loaded from default folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class18, "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class26, "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, ".yaml");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("password", class30, "${password:abc$defg}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load password.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("", class22, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class18, ".");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".yaml", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql2", class26, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class10, "def$g");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Exception", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("config", class18, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("config\001", class26, "\001 in \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class30, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class10, "def$g");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("hi!", class14, "light-4j-config-dir");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class18, "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("", class14, ".yml");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, "sql2");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql2", class26, "");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("C", class30, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("IOException", class26, "config");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class30, "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "config");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Exception", class18, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class22, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "def$g");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class30, "IOException");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig(".", class34, "");
        java.lang.Class class38 = null;
        java.lang.Object obj40 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class38, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".yml", class10, "");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class18, "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class22, "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class10, "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Trying to load config from classpath directory for file \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "light-4j-config-dir");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("def$g", class22, "Exception");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig(".yml", class26, "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "Unable to load config from externalized folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class22, "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "IOException");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", class26, "Config loaded from default folder for \001");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig(".json", class30, "sql2");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("decryptorClass", class34, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("config", class2, "password");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("abc$defg", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class10, "light-4j-config-dir");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("def$g", class14, "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class18, "password");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class22, "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Config loaded from externalized folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class18, "Config loaded from default folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class22, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class18, "");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", class22, "${password:abc$defg}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("found decryptorClass={}", class26, "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "Config loaded from externalized folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("hi!", class22, "config loaded from classpath for \001");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("value", class26, "Unable to load \001 as object.");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("C", class30, "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig(".", class10, "config file cannot be found.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "Unable to load \001 as object.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class18, "abc$defg");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("config", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("def$g", class26, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("config\001", class30, "config loaded from classpath for \001");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class34, "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("config\001", class6, "value");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "C");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension json...", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".yml", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("value", class22, "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("hi!", class18, "sql2");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class22, ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "decryptorClass");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("Exception", class22, "def$g");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".json", class2, "");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class6, "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("loaded config from file {}", class10, "${password:abc$defg}");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("decryptorClass", class14, "value");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("found configLoaderClass={}", class18, ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".yaml", class6, "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("IOException", class10, "Config loaded from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("sql2", class14, "config file cannot be found.");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class14, "sql1");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("value", class18, "Config loaded from externalized folder for \001");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("sql2", class22, "found decryptorClass={}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Config loaded from default folder for \001", class26, "IOException");
        java.lang.Class class30 = null;
        java.lang.Object obj32 = config0.getDefaultJsonObjectConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", class30, "");
        java.lang.Class class34 = null;
        java.lang.Object obj36 = config0.getDefaultJsonObjectConfig("def$g", class34, "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "Unable to load config from externalized folder for \001");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("C", class18, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("IOException", class22, "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class6, "");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config", class10, ".yaml");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("\001 in \001", class18, "${password:abc$defg}");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("C", class22, ".json");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class26, "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{exclusionConfigFileList=[openapi, swagger, values, status], decryptorClass=com.networknt.decrypt.AESDecryptor}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("${password:abc$defg}", class14, "hi!");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig(".json", class18, "value");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig(".", class22, "password");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Unable to load \001 as object.", class26, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("IOException", class10, "Config loaded from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig(".yaml", class14, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("C", class6, "hi!");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("config\001", class10, "config\001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("value", class14, "password");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("config loaded from classpath for \001", class18, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("Unable to load config \001. Looking for the same file name with extension yaml...", class6, "\001 in \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Exception", class10, "sql2");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("abc$defg", class14, ".json");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("def$g", class18, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig(".yml", class2, "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig(".", class6, "Config loaded from externalized folder for \001");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("Unable to load \001 as map.", class10, "Unable to load \001 as map.");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("C", class14, "${password:abc$defg}");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("Config loaded from externalized folder for \001", class18, "Unable to load \001 as map.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("\001 in \001", class22, "found decryptorClass={}");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("Trying to load config from classpath directory for file \001", class26, "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("", class6, "found decryptorClass={}");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("decryptorClass", class10, "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("Unable to load config from externalized folder for \001", class14, "abc$defg");
        java.lang.Class class18 = null;
        java.lang.Object obj20 = config0.getDefaultJsonObjectConfig("", class18, "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.Class class22 = null;
        java.lang.Object obj24 = config0.getDefaultJsonObjectConfig("abc$defg", class22, "IOException");
        java.lang.Class class26 = null;
        java.lang.Object obj28 = config0.getDefaultJsonObjectConfig("sql1", class26, "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Class class2 = null;
        java.lang.Object obj4 = config0.getDefaultJsonObjectConfig("def$g", class2, ".");
        java.lang.Class class6 = null;
        java.lang.Object obj8 = config0.getDefaultJsonObjectConfig("config\001", class6, "value");
        java.lang.Class class10 = null;
        java.lang.Object obj12 = config0.getDefaultJsonObjectConfig("value", class10, "Unable to load config from externalized folder for \001");
        java.lang.Class class14 = null;
        java.lang.Object obj16 = config0.getDefaultJsonObjectConfig("light-4j-config-dir", class14, "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }
}

