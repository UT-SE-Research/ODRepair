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
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("config loaded from classpath for \001", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig(".json", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("IOException", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("sql2", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".json", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("def$g", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found configLoaderClass={}", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as map.", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("password", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql1", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Exception", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("C", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found configLoaderClass={}", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("config loaded from classpath for \001", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("found configLoaderClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("hi!", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config file cannot be found.", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found configLoaderClass={}", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("hi!", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("config loaded from classpath for \001", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("C", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("hi!", "loaded config from file {}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("def$g", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql2", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("\001 in \001", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Exception", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as object.", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("\001 in \001", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("found decryptorClass={}", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Config loaded from default folder for \001", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".json", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found decryptorClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("abc$defg", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig("config loaded from classpath for \001", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found decryptorClass={}", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql1", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("config\001", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("def$g", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("loaded config from file {}", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig(".", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("def$g", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("password", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql1", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("abc$defg", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("decryptorClass", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql2", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("password", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("${password:abc$defg}", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yaml", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yaml", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("value", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("found configLoaderClass={}", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config loaded from classpath for \001", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("sql1", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("\001 in \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("config\001", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("sql1", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config loaded from classpath for \001", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("sql1", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("def$g", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql1", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig(".yml", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("config file cannot be found.", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Exception", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config file cannot be found.", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql1", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Unable to load \001 as map.", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("sql1", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("found configLoaderClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found decryptorClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Exception", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("\001 in \001", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config loaded from classpath for \001", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("hi!", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("abc$defg", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("def$g", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".yaml", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig(".yaml", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = config0.getJsonMapConfig("found decryptorClass={}", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = config0.getJsonMapConfig("hi!", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNull(strMap36);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("IOException", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".", ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".yaml", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("abc$defg", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found configLoaderClass={}", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("sql2", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("${password:abc$defg}", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("decryptorClass", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".yaml", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Unable to load \001 as map.", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("found configLoaderClass={}", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql2", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("password", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("value", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from default folder for \001", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found decryptorClass={}", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load \001 as object.", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yaml", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("config loaded from classpath for \001", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("def$g", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("config", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("decryptorClass", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yml", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".json", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("hi!", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Exception", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yaml", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig(".json", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from default folder for \001", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "loaded config from file {}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql1", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig(".yaml", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = config0.getJsonMapConfig("found decryptorClass={}", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNull(strMap36);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load \001 as object.", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("def$g", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".json", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yml", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("C", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Exception", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("hi!", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("hi!", "loaded config from file {}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig("Unable to load \001 as object.", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("found decryptorClass={}", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("hi!", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config loaded from classpath for \001", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("decryptorClass", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found configLoaderClass={}", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config file cannot be found.", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("config file cannot be found.", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found decryptorClass={}", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql1", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("password", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yml", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load \001 as object.", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("config", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig(".yaml", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = config0.getJsonMapConfig("found decryptorClass={}", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = config0.getJsonMapConfig("loaded config from file {}", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNull(strMap36);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("hi!", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("hi!", "loaded config from file {}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".yaml", ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yaml", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("IOException", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Config loaded from default folder for \001", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config file cannot be found.", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "Unable to load \001 as map.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("${password:abc$defg}", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("found configLoaderClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("\001 in \001", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "Unable to load \001 as map.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found decryptorClass={}", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Exception", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Exception", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config file cannot be found.", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Unable to load \001 as object.", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql1", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".json", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("${password:abc$defg}", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("found configLoaderClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("found configLoaderClass={}", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found configLoaderClass={}", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as map.", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql1", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "Unable to load \001 as map.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yaml", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql1", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("abc$defg", "loaded config from file {}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config\001", "Unable to load \001 as map.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("C", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("C", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql1", ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found decryptorClass={}", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("def$g", "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Config loaded from default folder for \001", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("IOException", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".json", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config loaded from classpath for \001", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("hi!", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yaml", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config\001", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Unable to load \001 as object.", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found decryptorClass={}", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("def$g", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config\001", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("sql2", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig(".", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("\001 in \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".yml", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("config", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found decryptorClass={}", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as object.", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("${password:abc$defg}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Config loaded from default folder for \001", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("${password:abc$defg}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig(".yaml", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = config0.getJsonMapConfig(".yaml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = config0.getJsonMapConfig("${password:abc$defg}", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNull(strMap39);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("hi!", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("config\001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("loaded config from file {}", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config file cannot be found.", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = config0.getJsonMapConfig("", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap33);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load \001 as map.", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yaml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("found decryptorClass={}", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yaml", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("${password:abc$defg}", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("found decryptorClass={}", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("C", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql1", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Exception", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig("config\001", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found decryptorClass={}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("def$g", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".yml", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config file cannot be found.", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("loaded config from file {}", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".json", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("def$g", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("hi!", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("loaded config from file {}", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config file cannot be found.", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("password", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("decryptorClass", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("def$g", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("decryptorClass", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("sql1", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yaml", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension json...", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Unable to load \001 as object.", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("found configLoaderClass={}", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("${password:abc$defg}", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("IOException", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Unable to load \001 as map.", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("\001 in \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("light-4j-config-dir", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config \001. Looking for the same file name with extension yaml...", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("\001 in \001", ".json");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".yml", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("decryptorClass", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("hi!", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("password", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("found decryptorClass={}", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("found configLoaderClass={}", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("def$g", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config\001", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("C", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("C", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("light-4j-config-dir", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".yml", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("loaded config from file {}", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Unable to load \001 as map.", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("found decryptorClass={}", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("\001 in \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig(".yml", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("config\001", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "config file cannot be found.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yml", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("light-4j-config-dir", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "found decryptorClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("found configLoaderClass={}", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig(".yml", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap33);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as object.", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("password", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("decryptorClass", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config\001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Config loaded from default folder for \001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("def$g", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("sql2", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("Unable to load \001 as object.", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("hi!", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("abc$defg", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("hi!", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("config file cannot be found.", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config loaded from classpath for \001", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("light-4j-config-dir", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load config from externalized folder for \001", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("abc$defg", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "config\001");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "value");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("value", "IOException");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("config file cannot be found.", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".json", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig("value", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("Unable to load \001 as object.", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("found configLoaderClass={}", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "Exception");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("${password:abc$defg}", ".json");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config file cannot be found.", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".", "sql1");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("", "Unable to load config from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = config0.getJsonMapConfig(".yml", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("sql1", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("hi!", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config", "sql2");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql1", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "def$g");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("password", "decryptorClass");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("config loaded from classpath for \001", "Config loaded from externalized folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig(".", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig(".yaml", "Unable to load config \001. Looking for the same file name with extension json...");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("config\001", "\001 in \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig(".json", "C");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("def$g", "${password:abc$defg}");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig(".yaml", "Config loaded from default folder for \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("Unable to load \001 as map.", ".yaml");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Config loaded from default folder for \001", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("loaded config from file {}", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql2", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("Unable to load \001 as map.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig(".", "password");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("light-4j-config-dir", "found configLoaderClass={}");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("Trying to load config from classpath directory for file \001", "Trying to load config from classpath directory for file \001");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("C", "config");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("IOException", "abc$defg");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("decryptorClass", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = config0.getJsonMapConfig("sql2", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = config0.getJsonMapConfig("Config loaded from externalized folder for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = config0.getJsonMapConfig("config loaded from classpath for \001", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig(".", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("", ".yml");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("${password:abc$defg}", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("config", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("value", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = config0.getJsonMapConfig("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = config0.getJsonMapConfig("abc$defg", ".");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = config0.getJsonMapConfig("value", "light-4j-config-dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = config0.getJsonMapConfig("sql1", "Unable to load \001 as object.");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = config0.getJsonMapConfig("", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
    }
}

