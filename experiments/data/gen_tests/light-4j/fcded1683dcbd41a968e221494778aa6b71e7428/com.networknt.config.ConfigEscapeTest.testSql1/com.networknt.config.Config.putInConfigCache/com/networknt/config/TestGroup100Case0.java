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
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache(".", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Config loaded from externalized folder for \001", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Trying to load config from classpath directory for file \001", obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache("C", (java.lang.Object) 100L);
        config17.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config17.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache("Exception", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Exception");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("C", (java.lang.Object) 100L);
        config20.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config20.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config66.putInConfigCache(".yaml", (java.lang.Object) ".");
        config55.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("Exception", (java.lang.Object) ".");
        config20.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) ".");
        config0.putInConfigCache("\001 in \001", (java.lang.Object) config20);
        config0.putInConfigCache("hi!", (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config11);
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj46 = new java.lang.Object();
        config17.putInConfigCache("found configLoaderClass={}", obj46);
        config0.putInConfigCache("abc$defg", obj46);
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("found configLoaderClass={}", obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        config0.putInConfigCache("", (java.lang.Object) config20);
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) ".yml");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache("C", (java.lang.Object) 100L);
        config38.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config38.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config38.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        config20.putInConfigCache("loaded config from file {}", (java.lang.Object) config38);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) 0L);
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config50.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config50.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config50);
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) ".");
        config74.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config74.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config74.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config74.putInConfigCache(".json", (java.lang.Object) ".");
        config0.putInConfigCache("value", (java.lang.Object) ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config50);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config35.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config66);
        config35.putInConfigCache("", (java.lang.Object) config55);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) config35);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) (byte) 100);
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) ".");
        config74.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config74.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config74.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config0.putInConfigCache("\001 in \001", (java.lang.Object) "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (byte) -1);
        config0.putInConfigCache("hi!", (java.lang.Object) "abc$defg");
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config62.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config79.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config79.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config");
        config62.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "Config loaded from default folder for \001");
        config62.putInConfigCache("decryptorClass", (java.lang.Object) 10.0d);
        config29.putInConfigCache("sql1", (java.lang.Object) "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache(".yml", (java.lang.Object) config32);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache(".yml", (java.lang.Object) ' ');
        config47.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config32.putInConfigCache(".json", (java.lang.Object) "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config11);
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("C", (java.lang.Object) 100L);
        config23.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config55.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config23.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config23.putInConfigCache("found configLoaderClass={}", (java.lang.Object) 0L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config55);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache("C", (java.lang.Object) 100L);
        config47.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config47.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config47.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config47);
        com.networknt.config.Config config86 = com.networknt.config.Config.getInstance();
        config86.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config86.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config86.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config47.putInConfigCache(".", (java.lang.Object) "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config86);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config41.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config41.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config41.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config41);
        config0.putInConfigCache("sql1", (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config41);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        config29.putInConfigCache("", (java.lang.Object) false);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        config0.putInConfigCache("", (java.lang.Object) "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("config", (java.lang.Object) config58);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "config");
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config14);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config32.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        java.lang.Object obj59 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache(".yml", obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config53.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config53.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config23.putInConfigCache("", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config23.putInConfigCache("abc$defg", (java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config53);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yaml", (java.lang.Object) ".");
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config59.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config59.putInConfigCache("Exception", (java.lang.Object) 100);
        config0.putInConfigCache(".", (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("config", (java.lang.Object) config58);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "config");
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config35.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config66);
        config35.putInConfigCache("", (java.lang.Object) config55);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) config35);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config20);
        config20.putInConfigCache("value", (java.lang.Object) 0L);
        java.lang.Object obj83 = null;
        // The following exception was thrown during execution in test generation
        try {
            config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", obj83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        config0.putInConfigCache("config", (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config28);
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config31.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config31.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config28.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNotNull(config31);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config38.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config38.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config66.putInConfigCache(".yaml", (java.lang.Object) ".");
        config55.putInConfigCache("hi!", (java.lang.Object) ".");
        config55.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj84 = new java.lang.Object();
        config55.putInConfigCache("found configLoaderClass={}", obj84);
        config38.putInConfigCache("abc$defg", obj84);
        config38.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) 1);
        config0.putInConfigCache(".json", (java.lang.Object) config38);
        config38.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("hi!", (java.lang.Object) ".");
        config35.putInConfigCache("C", (java.lang.Object) 100L);
        config35.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config35.putInConfigCache("loaded config from file {}", (java.lang.Object) "IOException");
        config0.putInConfigCache("config", (java.lang.Object) config35);
        config35.putInConfigCache("hi!", (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config46);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yaml", (java.lang.Object) ".");
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config59.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config90 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config90);
        config59.putInConfigCache("", (java.lang.Object) config79);
        config79.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) ".yml");
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config59);
        org.junit.Assert.assertNotNull(config79);
        org.junit.Assert.assertNotNull(config90);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config20);
        config20.putInConfigCache("value", (java.lang.Object) 0L);
        java.lang.Object obj83 = null;
        // The following exception was thrown during execution in test generation
        try {
            config20.putInConfigCache("Unable to load \001 as object.", obj83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("password", (java.lang.Object) config23);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config35.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config52.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj81 = new java.lang.Object();
        config52.putInConfigCache("found configLoaderClass={}", obj81);
        config35.putInConfigCache("abc$defg", obj81);
        config23.putInConfigCache("password", (java.lang.Object) config35);
        config35.putInConfigCache("Exception", (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config26);
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) "");
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) true);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config31);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config29.putInConfigCache("light-4j-config-dir", (java.lang.Object) 0);
        config0.putInConfigCache("def$g", (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config52.putInConfigCache("C", (java.lang.Object) 100L);
        config52.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config23.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config52);
        config0.putInConfigCache(".json", (java.lang.Object) config52);
        config52.putInConfigCache("", (java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config20);
        config20.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config23.putInConfigCache(".yml", (java.lang.Object) config37);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        config23.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config37);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config60 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config60);
        config29.putInConfigCache("", (java.lang.Object) config49);
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) config29);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config60);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config11);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config14.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config11.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config38);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        config0.putInConfigCache(".json", (java.lang.Object) 0);
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) 10.0f);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config47.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config47.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config47);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("found decryptorClass={}", obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("config", (java.lang.Object) config47);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config64);
        com.networknt.config.Config config67 = com.networknt.config.Config.getInstance();
        config67.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config67.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config67.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config67.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config67.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config67.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config67.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config64.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config91 = com.networknt.config.Config.getInstance();
        config91.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("sql2", (java.lang.Object) config64);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config53);
        org.junit.Assert.assertNotNull(config64);
        org.junit.Assert.assertNotNull(config67);
        org.junit.Assert.assertNotNull(config91);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("C", (java.lang.Object) 100L);
        config23.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config58.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config58.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config78 = com.networknt.config.Config.getInstance();
        config78.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config78.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config78.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config89 = com.networknt.config.Config.getInstance();
        config78.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config89);
        config58.putInConfigCache("", (java.lang.Object) config78);
        config23.putInConfigCache("\001 in \001", (java.lang.Object) config58);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("sql2", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config78);
        org.junit.Assert.assertNotNull(config89);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) 1L);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config20.putInConfigCache("config", (java.lang.Object) "def$g");
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config40.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config40.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config40.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config40.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        config20.putInConfigCache("IOException", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension yaml...");
        com.networknt.config.Config config67 = com.networknt.config.Config.getInstance();
        config67.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config67.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config67.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config67.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config20.putInConfigCache(".", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config67);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) 0L);
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config50.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config50.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config50);
        java.lang.Object obj74 = null;
        // The following exception was thrown during execution in test generation
        try {
            config50.putInConfigCache("", obj74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config50);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config14);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config32);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config53.putInConfigCache(".yaml", (java.lang.Object) ".");
        config53.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config53.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config53.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config76.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config76.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config76.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config76.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config53.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config76);
        config0.putInConfigCache("Exception", (java.lang.Object) config76);
        java.lang.Object obj95 = null;
        // The following exception was thrown during execution in test generation
        try {
            config76.putInConfigCache("def$g", obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config53);
        org.junit.Assert.assertNotNull(config76);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config");
        config0.putInConfigCache("sql2", (java.lang.Object) "config");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config32.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("password", (java.lang.Object) config55);
        config0.putInConfigCache("", (java.lang.Object) "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config55);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config11);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) (-1));
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config62.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config62.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config62);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        config0.putInConfigCache("", (java.lang.Object) config20);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("hi!", (java.lang.Object) ".");
        config35.putInConfigCache("C", (java.lang.Object) 100L);
        config35.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config35.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config35.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config35.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config76.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config76.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config76.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config35.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config76);
        config20.putInConfigCache("abc$defg", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config76);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache(".yml", (java.lang.Object) ' ');
        config47.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config47.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        config29.putInConfigCache("abc$defg", (java.lang.Object) 10.0f);
        config29.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config45 = com.networknt.config.Config.getInstance();
        config45.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config45.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config45.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config45.putInConfigCache(".yaml", (java.lang.Object) ".");
        config34.putInConfigCache("hi!", (java.lang.Object) ".");
        config34.putInConfigCache("C", (java.lang.Object) 100L);
        config34.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config34.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config69 = com.networknt.config.Config.getInstance();
        config69.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config69.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config69.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config80 = com.networknt.config.Config.getInstance();
        config80.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config80.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config80.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config80.putInConfigCache(".yaml", (java.lang.Object) ".");
        config69.putInConfigCache("hi!", (java.lang.Object) ".");
        config34.putInConfigCache("Exception", (java.lang.Object) ".");
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Exception");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "Exception");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config45);
        org.junit.Assert.assertNotNull(config69);
        org.junit.Assert.assertNotNull(config80);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache("C", (java.lang.Object) 100L);
        config17.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config17.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config17.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config17.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config17.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config58);
        config0.putInConfigCache("password", (java.lang.Object) config58);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("IOException", (java.lang.Object) 10.0f);
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config8.putInConfigCache(".yaml", (java.lang.Object) ".");
        config8.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config8.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config39 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config39);
        config8.putInConfigCache("", (java.lang.Object) config28);
        config28.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config28);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNotNull(config39);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config20.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("def$g", (java.lang.Object) 1.0d);
        config0.putInConfigCache("IOException", (java.lang.Object) "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config43.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config14.putInConfigCache("config\001", (java.lang.Object) config43);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config43);
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config73 = com.networknt.config.Config.getInstance();
        config73.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config73.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config73.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config73.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("hi!", (java.lang.Object) ".");
        config62.putInConfigCache(".yml", (java.lang.Object) ' ');
        config62.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config62.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        config43.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config73);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("config", (java.lang.Object) config47);
        config0.putInConfigCache("abc$defg", (java.lang.Object) false);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config47);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache("C", (java.lang.Object) 100L);
        config17.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config49.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config49.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config49.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config49.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ".yaml");
        config17.putInConfigCache("sql1", (java.lang.Object) config49);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) "sql1");
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config77.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config77.putInConfigCache("Exception", (java.lang.Object) (-1));
        config77.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config77);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config52.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config52.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config52);
        config29.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config52);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache(".yaml", (java.lang.Object) ".");
        config46.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config32.putInConfigCache(".yml", (java.lang.Object) config46);
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config64.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config64.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config32.putInConfigCache("decryptorClass", (java.lang.Object) config64);
        config0.putInConfigCache("hi!", (java.lang.Object) config32);
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config60 = com.networknt.config.Config.getInstance();
        config60.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config60.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config60.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config60.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config60.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config31.putInConfigCache("config\001", (java.lang.Object) config60);
        config17.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config60);
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config60);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config26);
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config74.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config14.putInConfigCache("", (java.lang.Object) 1L);
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config45 = com.networknt.config.Config.getInstance();
        config45.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config45.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config45.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config45.putInConfigCache(".yaml", (java.lang.Object) ".");
        config34.putInConfigCache("hi!", (java.lang.Object) ".");
        config34.putInConfigCache("C", (java.lang.Object) 100L);
        config34.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config66.putInConfigCache(".yaml", (java.lang.Object) ".");
        config66.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config66.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config66.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config66.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ".yaml");
        config34.putInConfigCache("sql1", (java.lang.Object) config66);
        config14.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) config66);
        config0.putInConfigCache("hi!", (java.lang.Object) "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config45);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config19 = com.networknt.config.Config.getInstance();
        config19.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config19.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config19.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config19.putInConfigCache(".yaml", (java.lang.Object) ".");
        config8.putInConfigCache("hi!", (java.lang.Object) ".");
        config8.putInConfigCache("C", (java.lang.Object) 100L);
        config8.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config8.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config8.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config57 = com.networknt.config.Config.getInstance();
        config57.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config57.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config57.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config57.putInConfigCache(".yaml", (java.lang.Object) ".");
        config46.putInConfigCache("hi!", (java.lang.Object) ".");
        config46.putInConfigCache("C", (java.lang.Object) 100L);
        config46.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config8.putInConfigCache("", (java.lang.Object) (short) 0);
        config0.putInConfigCache("abc$defg", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config57);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config5 = com.networknt.config.Config.getInstance();
        config5.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config5.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config5.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config16 = com.networknt.config.Config.getInstance();
        config16.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config16.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config16.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config16.putInConfigCache(".yaml", (java.lang.Object) ".");
        config5.putInConfigCache("hi!", (java.lang.Object) ".");
        config5.putInConfigCache("C", (java.lang.Object) 100L);
        config5.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config5.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config5.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        config0.putInConfigCache("config", (java.lang.Object) "Exception");
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config5);
        org.junit.Assert.assertNotNull(config16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config14);
        config14.putInConfigCache("IOException", (java.lang.Object) ".json");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config35.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config35.putInConfigCache("Exception", (java.lang.Object) (-1));
        config35.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config35.putInConfigCache("", (java.lang.Object) "hi!");
        config14.putInConfigCache("value", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config35);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config29.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache("password", (java.lang.Object) config52);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "password");
        com.networknt.config.Config config65 = com.networknt.config.Config.getInstance();
        config65.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config65.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config65.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config65.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config65.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config");
        config0.putInConfigCache("sql1", (java.lang.Object) "config");
        java.lang.Object obj83 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("", obj83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config65);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config");
        config0.putInConfigCache("sql2", (java.lang.Object) "config");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache(".yaml", (java.lang.Object) ".");
        config46.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config32.putInConfigCache(".yml", (java.lang.Object) config46);
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config64.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config64.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config32.putInConfigCache("decryptorClass", (java.lang.Object) config64);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config64);
        java.lang.Object obj86 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("config file cannot be found.", obj86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (byte) 100);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config26.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config72 = com.networknt.config.Config.getInstance();
        config72.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config72.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config72.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config72.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("Exception", (java.lang.Object) ".");
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) config26);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config72);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        config14.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config14.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config14.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) (short) 1);
        config0.putInConfigCache("C", (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config29.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache("password", (java.lang.Object) config52);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "password");
        java.lang.Object obj65 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", obj65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config14);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("hi!", (java.lang.Object) ".");
        config32.putInConfigCache("C", (java.lang.Object) 100L);
        config32.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config32.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("config", (java.lang.Object) config79);
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) config79);
        config79.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) (byte) 100);
        config79.putInConfigCache("config\001", (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config64);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        config14.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config14.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "value");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config68 = com.networknt.config.Config.getInstance();
        config68.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config68.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config68.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config79.putInConfigCache(".yaml", (java.lang.Object) ".");
        config68.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) ".");
        java.lang.Object obj95 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("password", obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config68);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config26);
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) "");
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) config77);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config77);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache(".yml", (java.lang.Object) ' ');
        config38.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config38.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "config file cannot be found.");
        config0.putInConfigCache(".json", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config11);
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config59.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (byte) -1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) config59);
        config59.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache(".yml", (java.lang.Object) ' ');
        config47.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config47.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        config29.putInConfigCache("abc$defg", (java.lang.Object) 10.0f);
        config29.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        config0.putInConfigCache("config\001", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config56 = com.networknt.config.Config.getInstance();
        config56.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config56.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config56.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config56.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config56.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config56.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config56.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Exception", (java.lang.Object) "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config56);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config14);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config32.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config54 = com.networknt.config.Config.getInstance();
        config54.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config54.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config54.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config54.putInConfigCache(".yaml", (java.lang.Object) ".");
        config43.putInConfigCache("hi!", (java.lang.Object) ".");
        config43.putInConfigCache("C", (java.lang.Object) 100L);
        config43.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config75 = com.networknt.config.Config.getInstance();
        config75.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config75.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config75.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config75.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config43.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config32.putInConfigCache("light-4j-config-dir", (java.lang.Object) config43);
        config32.putInConfigCache("loaded config from file {}", (java.lang.Object) (-1));
        config0.putInConfigCache("", (java.lang.Object) config32);
        java.lang.Object obj95 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache(".json", obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config54);
        org.junit.Assert.assertNotNull(config75);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Exception");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache("C", (java.lang.Object) 100L);
        config17.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("sql2", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("C", (java.lang.Object) 100L);
        config23.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config66);
        config23.putInConfigCache("sql2", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension json...");
        config0.putInConfigCache(".json", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension json...");
        com.networknt.config.Config config71 = com.networknt.config.Config.getInstance();
        config71.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config71.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config71.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config71.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config71.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config71.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config71.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config71.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        config0.putInConfigCache("", (java.lang.Object) config20);
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) ".yml");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config38.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config38.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config38.putInConfigCache("Exception", (java.lang.Object) (-1));
        config38.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config38.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config38.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "Config loaded from externalized folder for \001");
        com.networknt.config.Config config68 = com.networknt.config.Config.getInstance();
        config68.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config68.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config68.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config68.putInConfigCache(".yaml", (java.lang.Object) ".");
        config68.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config68.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config68.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config20.putInConfigCache("sql2", (java.lang.Object) "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config68);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config11);
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config59.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (byte) -1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) config59);
        config11.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config19 = com.networknt.config.Config.getInstance();
        config19.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config19.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config19.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config19.putInConfigCache(".yaml", (java.lang.Object) ".");
        config8.putInConfigCache("hi!", (java.lang.Object) ".");
        config8.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config8.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config37);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config71 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config71);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) ".");
        config50.putInConfigCache("hi!", (java.lang.Object) ".");
        config50.putInConfigCache("C", (java.lang.Object) 100L);
        config50.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config50.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config50);
        org.junit.Assert.assertNotNull(config61);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config0.putInConfigCache("sql2", (java.lang.Object) 10.0f);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config26.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config72 = com.networknt.config.Config.getInstance();
        config72.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config72.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config72.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config72.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("hi!", (java.lang.Object) ".");
        config61.putInConfigCache("C", (java.lang.Object) 100L);
        config61.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config61.putInConfigCache("loaded config from file {}", (java.lang.Object) "IOException");
        config26.putInConfigCache("config", (java.lang.Object) config61);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config72);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config17.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) ".yml");
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Config loaded from default folder for \001", obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config11);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config14.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config11.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config44 = com.networknt.config.Config.getInstance();
        config44.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config44.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config44.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config44.putInConfigCache(".yaml", (java.lang.Object) ".");
        config44.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config44.putInConfigCache("sql1", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        config11.putInConfigCache(".json", (java.lang.Object) config44);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config44);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config19 = com.networknt.config.Config.getInstance();
        config19.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config19.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config19.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config19.putInConfigCache(".yaml", (java.lang.Object) ".");
        config8.putInConfigCache("hi!", (java.lang.Object) ".");
        config8.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config8.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config37);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        config0.putInConfigCache(".yml", (java.lang.Object) "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config20.putInConfigCache("Exception", (java.lang.Object) (-1));
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config54 = com.networknt.config.Config.getInstance();
        config54.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config54.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config54.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config54.putInConfigCache(".yaml", (java.lang.Object) ".");
        config43.putInConfigCache("hi!", (java.lang.Object) ".");
        config43.putInConfigCache(".yml", (java.lang.Object) ' ');
        config20.putInConfigCache("loaded config from file {}", (java.lang.Object) config43);
        com.networknt.config.Config config73 = com.networknt.config.Config.getInstance();
        config73.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config73.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config73.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config73.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config73.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config43.putInConfigCache("", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config54);
        org.junit.Assert.assertNotNull(config73);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config5 = com.networknt.config.Config.getInstance();
        config5.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config5.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config5.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config5.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) (short) 100);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config69 = com.networknt.config.Config.getInstance();
        config69.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config69.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config69.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config69.putInConfigCache(".yaml", (java.lang.Object) ".");
        config69.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config69.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config69.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config69.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ".yaml");
        config37.putInConfigCache("sql1", (java.lang.Object) config69);
        config20.putInConfigCache("\001 in \001", (java.lang.Object) "sql1");
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) config20);
        config0.putInConfigCache("", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config5);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
        org.junit.Assert.assertNotNull(config69);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config5 = com.networknt.config.Config.getInstance();
        config5.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config5.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config5.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config5.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) (short) 100);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config69 = com.networknt.config.Config.getInstance();
        config69.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config69.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config69.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config69.putInConfigCache(".yaml", (java.lang.Object) ".");
        config69.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config69.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config69.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config69.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ".yaml");
        config37.putInConfigCache("sql1", (java.lang.Object) config69);
        config20.putInConfigCache("\001 in \001", (java.lang.Object) "sql1");
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) config20);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config5);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
        org.junit.Assert.assertNotNull(config69);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        config0.putInConfigCache("", (java.lang.Object) config20);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config35.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config57 = com.networknt.config.Config.getInstance();
        config57.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config57.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config57.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config57.putInConfigCache(".yaml", (java.lang.Object) ".");
        config46.putInConfigCache("hi!", (java.lang.Object) ".");
        config46.putInConfigCache("C", (java.lang.Object) 100L);
        config46.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config78 = com.networknt.config.Config.getInstance();
        config78.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config78.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config78.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config78.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config46.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config35.putInConfigCache("light-4j-config-dir", (java.lang.Object) config46);
        config46.putInConfigCache("abc$defg", (java.lang.Object) false);
        config0.putInConfigCache("", (java.lang.Object) false);
        config0.putInConfigCache("Exception", (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config57);
        org.junit.Assert.assertNotNull(config78);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config5 = com.networknt.config.Config.getInstance();
        config5.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config5.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config5.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config5.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config5.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config5.putInConfigCache("Exception", (java.lang.Object) (-1));
        config5.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config5.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config5.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config34.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config34.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config54 = com.networknt.config.Config.getInstance();
        config54.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config54.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config54.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config65 = com.networknt.config.Config.getInstance();
        config54.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config65);
        config34.putInConfigCache("", (java.lang.Object) config54);
        config5.putInConfigCache(".yml", (java.lang.Object) config54);
        config0.putInConfigCache("sql1", (java.lang.Object) config5);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config5);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config54);
        org.junit.Assert.assertNotNull(config65);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        java.lang.Object obj44 = new java.lang.Object();
        config0.putInConfigCache(".", obj44);
        java.lang.Object obj47 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Config loaded from default folder for \001", obj47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config26);
        config0.putInConfigCache("", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config20);
        config0.putInConfigCache("IOException", (java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config19 = com.networknt.config.Config.getInstance();
        config19.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config19.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config19.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config19.putInConfigCache(".yaml", (java.lang.Object) ".");
        config8.putInConfigCache("hi!", (java.lang.Object) ".");
        config8.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config8.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config37);
        config8.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        config8.putInConfigCache("loaded config from file {}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config8);
        config0.putInConfigCache("hi!", (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        config14.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) 0L);
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config64.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config64.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config64.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config64);
        config0.putInConfigCache("value", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config26.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) ".");
        config0.putInConfigCache(".", (java.lang.Object) ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        config14.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config14.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "value");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        com.networknt.config.Config config71 = com.networknt.config.Config.getInstance();
        config71.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config71.putInConfigCache("IOException", (java.lang.Object) 10.0f);
        config0.putInConfigCache("config\001", (java.lang.Object) "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config52.putInConfigCache("C", (java.lang.Object) 100L);
        config52.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config52.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config52.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        config47.putInConfigCache("config", (java.lang.Object) "Exception");
        config29.putInConfigCache("value", (java.lang.Object) config47);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config41.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config41.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config52);
        config0.putInConfigCache(".", (java.lang.Object) config52);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config41);
        org.junit.Assert.assertNotNull(config52);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("config", (java.lang.Object) config58);
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config64.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config64.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config64.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config64.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (byte) 100);
        config11.putInConfigCache("", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config53.putInConfigCache(".yaml", (java.lang.Object) ".");
        config53.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config53.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config53.putInConfigCache("Exception", (java.lang.Object) 100);
        config23.putInConfigCache("sql2", (java.lang.Object) config53);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config53);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("sql1", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config49.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config20.putInConfigCache("config\001", (java.lang.Object) config49);
        config0.putInConfigCache("config\001", (java.lang.Object) config20);
        config0.putInConfigCache("config", (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config49);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) ".");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config31.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        config17.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "value");
        config17.putInConfigCache("Exception", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("Exception", (java.lang.Object) config17);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config26);
        java.lang.Object obj74 = null;
        // The following exception was thrown during execution in test generation
        try {
            config26.putInConfigCache("def$g", obj74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("", (java.lang.Object) "hi!");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config45 = com.networknt.config.Config.getInstance();
        config45.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config45.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config45.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config45.putInConfigCache(".yaml", (java.lang.Object) ".");
        config34.putInConfigCache("hi!", (java.lang.Object) ".");
        config34.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) ".");
        config63.putInConfigCache("hi!", (java.lang.Object) ".");
        config63.putInConfigCache("C", (java.lang.Object) 100L);
        config63.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config34.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config63);
        config34.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        config26.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension yaml...");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config45);
        org.junit.Assert.assertNotNull(config63);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config0.putInConfigCache("config\001", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Exception", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("", (java.lang.Object) 1L);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("C", (java.lang.Object) 100L);
        config20.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config52.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config52.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config52.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config52.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ".yaml");
        config20.putInConfigCache("sql1", (java.lang.Object) config52);
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) config52);
        config0.putInConfigCache(".yml", (java.lang.Object) '#');
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config52);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Exception", (java.lang.Object) 100);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("", (java.lang.Object) 10.0d);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache(".json", (java.lang.Object) ".");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config26.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config26.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache("password", (java.lang.Object) config49);
        config49.putInConfigCache("\001 in \001", (java.lang.Object) 10);
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config75 = com.networknt.config.Config.getInstance();
        config75.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config75.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config75.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config75.putInConfigCache(".yaml", (java.lang.Object) ".");
        config64.putInConfigCache("hi!", (java.lang.Object) ".");
        config64.putInConfigCache("C", (java.lang.Object) 100L);
        config64.putInConfigCache(".", (java.lang.Object) "IOException");
        config49.putInConfigCache("value", (java.lang.Object) "IOException");
        config0.putInConfigCache(".yaml", (java.lang.Object) "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config64);
        org.junit.Assert.assertNotNull(config75);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config11.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config31.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yaml", (java.lang.Object) ".");
        config66.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("Exception", (java.lang.Object) ".");
        config31.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) ".");
        config11.putInConfigCache("\001 in \001", (java.lang.Object) config31);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) 1L);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config66);
        org.junit.Assert.assertNotNull(config77);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("password", (java.lang.Object) config23);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("hi!", (java.lang.Object) ".");
        config35.putInConfigCache("C", (java.lang.Object) 100L);
        config35.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config35.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config35.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        config0.putInConfigCache("", (java.lang.Object) config35);
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config74.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config74.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config74.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config74.putInConfigCache("light-4j-config-dir", (java.lang.Object) "config file cannot be found.");
        config0.putInConfigCache("abc$defg", (java.lang.Object) config74);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config11);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config14.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config11.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            config11.putInConfigCache("${password:abc$defg}", obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config38);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config8.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("IOException", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config34.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config34.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config34.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config31.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache(".yaml", (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config41.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config41.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config52.putInConfigCache(".yaml", (java.lang.Object) ".");
        config41.putInConfigCache("hi!", (java.lang.Object) ".");
        config41.putInConfigCache("C", (java.lang.Object) 100L);
        config41.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config41.putInConfigCache("loaded config from file {}", (java.lang.Object) "IOException");
        config23.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) "loaded config from file {}");
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config77.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config77.putInConfigCache("Exception", (java.lang.Object) (-1));
        config77.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config23.putInConfigCache("IOException", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config41);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config77);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config35.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config66);
        config35.putInConfigCache("", (java.lang.Object) config55);
        config0.putInConfigCache("\001 in \001", (java.lang.Object) config35);
        config35.putInConfigCache("value", (java.lang.Object) "loaded config from file {}");
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) ".");
        config74.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config74.putInConfigCache("sql1", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        config35.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) config74);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("", obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config41.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config41.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config41.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config41);
        config0.putInConfigCache("Exception", (java.lang.Object) "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config41);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config60 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config60);
        config29.putInConfigCache("", (java.lang.Object) config49);
        config0.putInConfigCache(".yml", (java.lang.Object) config49);
        com.networknt.config.Config config65 = com.networknt.config.Config.getInstance();
        config65.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config65.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config65.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config65.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config65.putInConfigCache("config", (java.lang.Object) "def$g");
        config65.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config49.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) config65);
        config49.putInConfigCache("C", (java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config60);
        org.junit.Assert.assertNotNull(config65);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) 0L);
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config50.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config50.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config50);
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config50);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) "found configLoaderClass={}");
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("hi!", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config17.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) config17);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) ".");
        config43.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config29.putInConfigCache(".yml", (java.lang.Object) config43);
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config61.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config29.putInConfigCache("decryptorClass", (java.lang.Object) config61);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) config29);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config61);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        config0.putInConfigCache(".yml", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (byte) 100);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config26.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config72 = com.networknt.config.Config.getInstance();
        config72.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config72.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config72.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config72.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("Exception", (java.lang.Object) ".");
        config0.putInConfigCache(".", (java.lang.Object) "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config72);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) "IOException");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config35.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config35.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache("password", (java.lang.Object) config58);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config58);
        config0.putInConfigCache(".yaml", (java.lang.Object) 1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config29.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache("password", (java.lang.Object) config52);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "password");
        com.networknt.config.Config config65 = com.networknt.config.Config.getInstance();
        config65.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config65.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config65.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config76.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config76.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config76.putInConfigCache(".yaml", (java.lang.Object) ".");
        config65.putInConfigCache("hi!", (java.lang.Object) ".");
        config65.putInConfigCache("C", (java.lang.Object) 100L);
        config65.putInConfigCache(".", (java.lang.Object) "IOException");
        java.lang.Object obj97 = new java.lang.Object();
        config65.putInConfigCache(".json", obj97);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config65);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config65);
        org.junit.Assert.assertNotNull(config76);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache("C", (java.lang.Object) 100L);
        config38.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config38.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config38.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) config38);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        java.lang.Object obj44 = new java.lang.Object();
        config0.putInConfigCache(".", obj44);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config55.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config47.putInConfigCache("IOException", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("config\001", (java.lang.Object) "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config55);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config8.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config22.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config");
        config8.putInConfigCache("sql2", (java.lang.Object) "config");
        config0.putInConfigCache("value", (java.lang.Object) config8);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config22);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config26.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config26.putInConfigCache("Exception", (java.lang.Object) (-1));
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config49.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config26.putInConfigCache("value", (java.lang.Object) (short) 10);
        config0.putInConfigCache("def$g", (java.lang.Object) (short) 10);
        config0.putInConfigCache("hi!", (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config49);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config0.putInConfigCache("sql2", (java.lang.Object) 10.0f);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config26.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config26.putInConfigCache("Exception", (java.lang.Object) (-1));
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config60 = com.networknt.config.Config.getInstance();
        config60.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config60.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config60.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config60.putInConfigCache(".yaml", (java.lang.Object) ".");
        config49.putInConfigCache("hi!", (java.lang.Object) ".");
        config49.putInConfigCache(".yml", (java.lang.Object) ' ');
        config26.putInConfigCache("loaded config from file {}", (java.lang.Object) config49);
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config79.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config79.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config49.putInConfigCache("${password:abc$defg}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config49.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config60);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "config file cannot be found.");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) ".");
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yaml", (java.lang.Object) ".");
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config59.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config82 = com.networknt.config.Config.getInstance();
        config82.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config82.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config82.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config82.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config82.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config82);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config59);
        org.junit.Assert.assertNotNull(config82);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config52.putInConfigCache("C", (java.lang.Object) 100L);
        config52.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config23.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config52);
        config0.putInConfigCache(".json", (java.lang.Object) config52);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) 10.0d);
        config52.putInConfigCache("sql2", (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config38.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config38.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("", (java.lang.Object) "IOException");
        config0.putInConfigCache("sql2", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config62.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config62.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config62.putInConfigCache(".json", (java.lang.Object) ".");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config62);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) ".yml");
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) ".");
        config50.putInConfigCache("hi!", (java.lang.Object) ".");
        config50.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config79.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config79.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config50.putInConfigCache("config\001", (java.lang.Object) config79);
        config50.putInConfigCache("\001 in \001", (java.lang.Object) "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        config0.putInConfigCache("config\001", (java.lang.Object) "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config50);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config29.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) config62);
        com.networknt.config.Config config80 = com.networknt.config.Config.getInstance();
        config80.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config80.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config80.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config80.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config80.putInConfigCache("config", (java.lang.Object) "def$g");
        config80.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config80);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        com.networknt.config.Config config65 = com.networknt.config.Config.getInstance();
        config65.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config65.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config65.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config65.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config65.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config65);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config37.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config37.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        config32.putInConfigCache("config", (java.lang.Object) "Exception");
        config0.putInConfigCache("IOException", (java.lang.Object) config32);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".json", (java.lang.Object) 100L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config26.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Unable to load config from externalized folder for \001");
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config57 = com.networknt.config.Config.getInstance();
        config57.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config57.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config57.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config68 = com.networknt.config.Config.getInstance();
        config68.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config68.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config68.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config68.putInConfigCache(".yaml", (java.lang.Object) ".");
        config57.putInConfigCache("hi!", (java.lang.Object) ".");
        config57.putInConfigCache("C", (java.lang.Object) 100L);
        config57.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config57.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config57.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config43.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) (short) 1);
        config26.putInConfigCache("loaded config from file {}", (java.lang.Object) (short) 1);
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config57);
        org.junit.Assert.assertNotNull(config68);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config11.putInConfigCache(".yml", (java.lang.Object) config43);
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) config43);
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yaml", (java.lang.Object) ".");
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("password", (java.lang.Object) "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache("C", (java.lang.Object) 100L);
        config38.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("", (java.lang.Object) (short) 0);
        com.networknt.config.Config config71 = com.networknt.config.Config.getInstance();
        config71.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config71.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config71.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config71.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config71.putInConfigCache("config", (java.lang.Object) "def$g");
        config71.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config71.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config71.putInConfigCache(".json", (java.lang.Object) 100L);
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) 100L);
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config52.putInConfigCache("C", (java.lang.Object) 100L);
        config52.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config23.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config52);
        config0.putInConfigCache(".json", (java.lang.Object) config52);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) 10.0d);
        java.lang.Object obj89 = null;
        // The following exception was thrown during execution in test generation
        try {
            config52.putInConfigCache("config file cannot be found.", obj89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("C", (java.lang.Object) 100L);
        config23.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config66);
        config23.putInConfigCache("sql2", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension json...");
        config0.putInConfigCache(".json", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension json...");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("def$g", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) "IOException");
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache(".", obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        config23.putInConfigCache("C", (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) "IOException");
        config0.putInConfigCache("abc$defg", (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config23.putInConfigCache(".yml", (java.lang.Object) config37);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        com.networknt.config.Config config56 = com.networknt.config.Config.getInstance();
        config56.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config56.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config76.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config76.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config76.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config76.putInConfigCache("config", (java.lang.Object) "def$g");
        config76.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config56.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config76);
        config23.putInConfigCache("", (java.lang.Object) config56);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config56);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config76);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) config11);
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config59.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config59.putInConfigCache("Exception", (java.lang.Object) (-1));
        config59.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config11.putInConfigCache("loaded config from file {}", (java.lang.Object) config59);
        java.lang.Object obj83 = null;
        // The following exception was thrown during execution in test generation
        try {
            config11.putInConfigCache("config\001", obj83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("decryptorClass", (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("", (java.lang.Object) 1L);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config20.putInConfigCache("loaded config from file {}", (java.lang.Object) (-1));
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config20);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config11);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config14.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config11.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("sql1", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config47.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config47.putInConfigCache(".yml", (java.lang.Object) config61);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config47);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config61);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache(".json", obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Unable to load config from externalized folder for \001");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config31.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config31.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config17.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) (short) 1);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) (short) 1);
        com.networknt.config.Config config71 = com.networknt.config.Config.getInstance();
        config71.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config71.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config71.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config71.putInConfigCache(".yaml", (java.lang.Object) ".");
        config71.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config71.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) config71);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config20);
        config20.putInConfigCache("value", (java.lang.Object) 0L);
        java.lang.Object obj83 = null;
        // The following exception was thrown during execution in test generation
        try {
            config20.putInConfigCache("config", obj83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config76.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config76.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config76.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config76.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config47.putInConfigCache("config\001", (java.lang.Object) config76);
        config0.putInConfigCache(".yml", (java.lang.Object) config76);
        java.lang.Object obj95 = null;
        // The following exception was thrown during execution in test generation
        try {
            config76.putInConfigCache("Config loaded from externalized folder for \001", obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config76);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj46 = new java.lang.Object();
        config17.putInConfigCache("found configLoaderClass={}", obj46);
        config0.putInConfigCache("abc$defg", obj46);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) 1);
        java.lang.Object obj53 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("config loaded from classpath for \001", obj53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("hi!", (java.lang.Object) ".");
        config32.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config72 = com.networknt.config.Config.getInstance();
        config72.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config72.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config72.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config72.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("hi!", (java.lang.Object) ".");
        config61.putInConfigCache("C", (java.lang.Object) 100L);
        config61.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config32.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config61);
        config0.putInConfigCache("C", (java.lang.Object) config32);
        java.lang.Object obj95 = null;
        // The following exception was thrown during execution in test generation
        try {
            config32.putInConfigCache("config\001", obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config72);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache("abc$defg", (java.lang.Object) 0.0f);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config26.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config26.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config29.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) config62);
        com.networknt.config.Config config80 = com.networknt.config.Config.getInstance();
        config80.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config80.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config80.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config80.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config80.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config80.putInConfigCache("Exception", (java.lang.Object) (-1));
        config29.putInConfigCache("Exception", (java.lang.Object) config80);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config80);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config23.putInConfigCache("light-4j-config-dir", (java.lang.Object) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config43.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        config23.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config43);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config23);
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config73 = com.networknt.config.Config.getInstance();
        config73.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config73.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config73.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config73.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("hi!", (java.lang.Object) ".");
        config62.putInConfigCache("C", (java.lang.Object) 100L);
        config62.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config62.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config23.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config73);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config20.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("def$g", (java.lang.Object) 1.0d);
        config0.putInConfigCache("value", (java.lang.Object) 1.0d);
        com.networknt.config.Config config44 = com.networknt.config.Config.getInstance();
        config44.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config44.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config44.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config44.putInConfigCache(".yaml", (java.lang.Object) ".");
        config44.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config44.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config44.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config67 = com.networknt.config.Config.getInstance();
        config67.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config67.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config67.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config67.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config67.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config44.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config67);
        config44.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config44);
        org.junit.Assert.assertNotNull(config67);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        com.networknt.config.Config config8 = com.networknt.config.Config.getInstance();
        config8.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config8.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config8.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config19 = com.networknt.config.Config.getInstance();
        config19.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config19.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config19.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config19.putInConfigCache(".yaml", (java.lang.Object) ".");
        config8.putInConfigCache("hi!", (java.lang.Object) ".");
        config8.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache("C", (java.lang.Object) 100L);
        config37.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config8.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config37);
        config8.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension yaml...");
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) false);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("config", (java.lang.Object) (-1L));
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("value", (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("password", (java.lang.Object) config23);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache(".yml", (java.lang.Object) ' ');
        config20.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "config loaded from classpath for \001");
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config53.putInConfigCache("hi!", (java.lang.Object) ".");
        config53.putInConfigCache("C", (java.lang.Object) 100L);
        config53.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config85 = com.networknt.config.Config.getInstance();
        config85.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config85.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config85.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config85.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config53.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("", (java.lang.Object) config53);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config53);
        org.junit.Assert.assertNotNull(config64);
        org.junit.Assert.assertNotNull(config85);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) ".");
        config35.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config35.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config35.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        config35.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) ".yaml");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Config loaded from default folder for \001");
        config0.putInConfigCache("config\001", (java.lang.Object) ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) "found decryptorClass={}");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config23.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config23.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (byte) -1);
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config37.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config37.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config60 = com.networknt.config.Config.getInstance();
        config60.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config60.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config60.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config60.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config60.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config37.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config60);
        config23.putInConfigCache("${password:abc$defg}", (java.lang.Object) config60);
        config0.putInConfigCache("config", (java.lang.Object) "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config60);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        config14.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config14.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "value");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config46);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "C");
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config29.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config29.putInConfigCache("def$g", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("hi!", (java.lang.Object) ".");
        config32.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config72 = com.networknt.config.Config.getInstance();
        config72.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config72.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config72.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config72.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("hi!", (java.lang.Object) ".");
        config61.putInConfigCache("C", (java.lang.Object) 100L);
        config61.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config32.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config61);
        config0.putInConfigCache("C", (java.lang.Object) config32);
        config32.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config72);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("C", (java.lang.Object) 100L);
        config14.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config14.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "value");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "value");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config68 = com.networknt.config.Config.getInstance();
        config68.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config68.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config68.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config79.putInConfigCache(".yaml", (java.lang.Object) ".");
        config68.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config68);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("C", (java.lang.Object) 100L);
        config23.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config23.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config23.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config72 = com.networknt.config.Config.getInstance();
        config72.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config72.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config72.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config72.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("hi!", (java.lang.Object) ".");
        config61.putInConfigCache("C", (java.lang.Object) 100L);
        config61.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config23.putInConfigCache("", (java.lang.Object) (short) 0);
        config0.putInConfigCache("value", (java.lang.Object) config23);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config72);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config0.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) 'a');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config40.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config40.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config23.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) ".yml");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Config loaded from externalized folder for \001");
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config62.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config62.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config85 = com.networknt.config.Config.getInstance();
        config85.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config85.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config85.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache("password", (java.lang.Object) config85);
        config0.putInConfigCache(".", (java.lang.Object) config85);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config85);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache(".yml", (java.lang.Object) config32);
        java.lang.Object obj47 = null;
        // The following exception was thrown during execution in test generation
        try {
            config32.putInConfigCache("abc$defg", obj47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache(".yml", (java.lang.Object) config32);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config47.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config47.putInConfigCache(".yml", (java.lang.Object) config61);
        config61.putInConfigCache("IOException", (java.lang.Object) ".json");
        config61.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) (short) 1);
        config32.putInConfigCache("IOException", (java.lang.Object) (short) 1);
        config32.putInConfigCache("sql1", (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config61);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config20.putInConfigCache("Exception", (java.lang.Object) (-1));
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config20.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config57 = com.networknt.config.Config.getInstance();
        config57.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config57.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config57.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config57.putInConfigCache(".yaml", (java.lang.Object) ".");
        config46.putInConfigCache("hi!", (java.lang.Object) ".");
        config46.putInConfigCache("C", (java.lang.Object) 100L);
        config46.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config78 = com.networknt.config.Config.getInstance();
        config78.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config78.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config78.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config78.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config46.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config46);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config57);
        org.junit.Assert.assertNotNull(config78);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache(".", (java.lang.Object) "IOException");
        config0.putInConfigCache("def$g", (java.lang.Object) ".");
        java.lang.Object obj59 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("found configLoaderClass={}", obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config29.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config52.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config52.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config29.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config52);
        config29.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        java.lang.Object obj73 = new java.lang.Object();
        config29.putInConfigCache(".", obj73);
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) config29);
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yaml", (java.lang.Object) ".");
        config77.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config77.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config77.putInConfigCache("Unable to load config from externalized folder for \001", (java.lang.Object) "found decryptorClass={}");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config77);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache("C", (java.lang.Object) 100L);
        config38.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("", (java.lang.Object) (short) 0);
        com.networknt.config.Config config71 = com.networknt.config.Config.getInstance();
        config71.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config71.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config71.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config71.putInConfigCache(".yaml", (java.lang.Object) ".");
        config71.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("def$g", (java.lang.Object) "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("password", (java.lang.Object) config23);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config35.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config35.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config52 = com.networknt.config.Config.getInstance();
        config52.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config52.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config52.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache(".yaml", (java.lang.Object) ".");
        config52.putInConfigCache("hi!", (java.lang.Object) ".");
        config52.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj81 = new java.lang.Object();
        config52.putInConfigCache("found configLoaderClass={}", obj81);
        config35.putInConfigCache("abc$defg", obj81);
        config23.putInConfigCache("password", (java.lang.Object) config35);
        java.lang.Object obj86 = null;
        // The following exception was thrown during execution in test generation
        try {
            config23.putInConfigCache("Unable to load \001 as map.", obj86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config52);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("password", (java.lang.Object) config23);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            config23.putInConfigCache("", obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config46.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config46.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config46.putInConfigCache("Exception", (java.lang.Object) (-1));
        config46.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config69 = com.networknt.config.Config.getInstance();
        config69.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config69.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config69.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config69.putInConfigCache(".yaml", (java.lang.Object) ".");
        config69.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config46.putInConfigCache("value", (java.lang.Object) (short) 10);
        config20.putInConfigCache("def$g", (java.lang.Object) (short) 10);
        config0.putInConfigCache("", (java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config69);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) 0L);
        config0.putInConfigCache("IOException", (java.lang.Object) "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("C", (java.lang.Object) 100L);
        config26.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config26.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config26.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config64.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config64.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config26.putInConfigCache("", (java.lang.Object) "IOException");
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        config29.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) -1);
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config50.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config50.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "config");
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config50);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("C", (java.lang.Object) 100L);
        config20.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config20.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config20.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config61);
        config0.putInConfigCache("def$g", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache("config", (java.lang.Object) config77);
        com.networknt.config.Config config92 = com.networknt.config.Config.getInstance();
        config92.putInConfigCache("hi!", (java.lang.Object) 1);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config77);
        org.junit.Assert.assertNotNull(config92);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) (-1L));
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config70 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config70);
        com.networknt.config.Config config73 = com.networknt.config.Config.getInstance();
        config73.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config73.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config73.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config73.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config73.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config73.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config73.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config70.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("def$g", (java.lang.Object) "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config59);
        org.junit.Assert.assertNotNull(config70);
        org.junit.Assert.assertNotNull(config73);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (byte) -1);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config25.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("hi!", (java.lang.Object) ".");
        config14.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config54 = com.networknt.config.Config.getInstance();
        config54.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config54.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config54.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config54.putInConfigCache(".yaml", (java.lang.Object) ".");
        config43.putInConfigCache("hi!", (java.lang.Object) ".");
        config43.putInConfigCache("C", (java.lang.Object) 100L);
        config43.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config14.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config43);
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config76.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config76.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config76.putInConfigCache(".yaml", (java.lang.Object) ".");
        config76.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config43.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) config76);
        config0.putInConfigCache("value", (java.lang.Object) config43);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config54);
        org.junit.Assert.assertNotNull(config76);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("hi!", (java.lang.Object) 1);
        com.networknt.config.Config config5 = com.networknt.config.Config.getInstance();
        config5.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config5.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config5.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config16 = com.networknt.config.Config.getInstance();
        config16.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config16.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config16.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config16.putInConfigCache(".yaml", (java.lang.Object) ".");
        config5.putInConfigCache("hi!", (java.lang.Object) ".");
        config5.putInConfigCache("C", (java.lang.Object) 100L);
        config5.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config5.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config5.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config5.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        config5.putInConfigCache(".json", (java.lang.Object) 0);
        config0.putInConfigCache("config\001", (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config5);
        org.junit.Assert.assertNotNull(config16);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache(".", (java.lang.Object) "IOException");
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("hi!", (java.lang.Object) ".");
        config32.putInConfigCache("C", (java.lang.Object) 100L);
        config32.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config32.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config67 = com.networknt.config.Config.getInstance();
        config67.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config67.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config67.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config78 = com.networknt.config.Config.getInstance();
        config78.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config78.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config78.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config78.putInConfigCache(".yaml", (java.lang.Object) ".");
        config67.putInConfigCache("hi!", (java.lang.Object) ".");
        config32.putInConfigCache("Exception", (java.lang.Object) ".");
        config32.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config67);
        org.junit.Assert.assertNotNull(config78);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config20.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config51 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config51);
        config20.putInConfigCache("", (java.lang.Object) config40);
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config55.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) false);
        config20.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) config55);
        config0.putInConfigCache("config", (java.lang.Object) config55);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config51);
        org.junit.Assert.assertNotNull(config55);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config23.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config23.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config23);
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config41.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config41.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config41.putInConfigCache(".yaml", (java.lang.Object) ".");
        config41.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config41.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config41.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config64.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config41.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config64);
        config41.putInConfigCache("loaded config from file {}", (java.lang.Object) 1.0f);
        java.lang.Object obj85 = new java.lang.Object();
        config41.putInConfigCache(".", obj85);
        config23.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", obj85);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config41);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache(".yml", (java.lang.Object) ' ');
        config38.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config38.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "config file cannot be found.");
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config74.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config74.putInConfigCache("Exception", (java.lang.Object) (-1));
        config74.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config74.putInConfigCache("", (java.lang.Object) "hi!");
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config74);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        config29.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) -1);
        com.networknt.config.Config config50 = com.networknt.config.Config.getInstance();
        config50.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config50.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config50.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config50.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config50.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config50.putInConfigCache("Exception", (java.lang.Object) (-1));
        config50.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config50.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config29.putInConfigCache("Exception", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config50);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config11);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("loaded config from file {}", (java.lang.Object) "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("C", (java.lang.Object) 100L);
        config20.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config55.putInConfigCache(".yaml", (java.lang.Object) ".");
        config55.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config55.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config75 = com.networknt.config.Config.getInstance();
        config75.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config75.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config75.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config86 = com.networknt.config.Config.getInstance();
        config75.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config86);
        config55.putInConfigCache("", (java.lang.Object) config75);
        config20.putInConfigCache("\001 in \001", (java.lang.Object) config55);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config75);
        org.junit.Assert.assertNotNull(config86);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        java.lang.Object obj65 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("def$g", obj65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache("C", (java.lang.Object) 100L);
        config47.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config79 = com.networknt.config.Config.getInstance();
        config79.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config79.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config79.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config79.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config47.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1));
        config29.putInConfigCache("config file cannot be found.", (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config79);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config51 = com.networknt.config.Config.getInstance();
        config51.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config51.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config51.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config51.putInConfigCache(".yaml", (java.lang.Object) ".");
        config40.putInConfigCache("hi!", (java.lang.Object) ".");
        config40.putInConfigCache("C", (java.lang.Object) 100L);
        config40.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config40);
        config0.putInConfigCache("config\001", (java.lang.Object) config11);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config51);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache(".yml", (java.lang.Object) ' ');
        config20.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "config loaded from classpath for \001");
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config53.putInConfigCache("hi!", (java.lang.Object) ".");
        config53.putInConfigCache("C", (java.lang.Object) 100L);
        config53.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config53.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config53.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config53.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        config53.putInConfigCache(".json", (java.lang.Object) 0);
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) 10.0f);
        config0.putInConfigCache("", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config53);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache(".json", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 0.0f);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config31.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yaml", (java.lang.Object) ".");
        config66.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("Exception", (java.lang.Object) ".");
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Exception");
        config14.putInConfigCache(".yml", (java.lang.Object) "");
        config0.putInConfigCache("value", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config66);
        org.junit.Assert.assertNotNull(config77);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) ".");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1.0d));
        config0.putInConfigCache("hi!", (java.lang.Object) "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".json", (java.lang.Object) 100L);
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config37.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("hi!", (java.lang.Object) ".");
        config26.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config66.putInConfigCache(".yaml", (java.lang.Object) ".");
        config55.putInConfigCache("hi!", (java.lang.Object) ".");
        config55.putInConfigCache("C", (java.lang.Object) 100L);
        config55.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config26.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config55);
        config26.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        config26.putInConfigCache("loaded config from file {}", (java.lang.Object) (short) 0);
        config26.putInConfigCache("", (java.lang.Object) "Exception");
        config0.putInConfigCache("C", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("sql1", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config37 = com.networknt.config.Config.getInstance();
        config37.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config37.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config37.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config48 = com.networknt.config.Config.getInstance();
        config48.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config48.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config48.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config48.putInConfigCache(".yaml", (java.lang.Object) ".");
        config37.putInConfigCache("hi!", (java.lang.Object) ".");
        config37.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj66 = new java.lang.Object();
        config37.putInConfigCache("found configLoaderClass={}", obj66);
        config20.putInConfigCache("abc$defg", obj66);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config37);
        org.junit.Assert.assertNotNull(config48);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config31.putInConfigCache(".yaml", (java.lang.Object) ".");
        config20.putInConfigCache("hi!", (java.lang.Object) ".");
        config20.putInConfigCache("C", (java.lang.Object) 100L);
        config20.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config20.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config20.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config61);
        config0.putInConfigCache("def$g", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config77 = com.networknt.config.Config.getInstance();
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config77.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config77.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache("config", (java.lang.Object) config77);
        com.networknt.config.Config config92 = com.networknt.config.Config.getInstance();
        config92.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config77.putInConfigCache("found decryptorClass={}", (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config77);
        org.junit.Assert.assertNotNull(config92);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache(".yaml", (java.lang.Object) ".");
        config14.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache(".yml", (java.lang.Object) config14);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config32);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config53.putInConfigCache("hi!", (java.lang.Object) ".");
        config53.putInConfigCache("C", (java.lang.Object) 100L);
        config32.putInConfigCache("sql2", (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config53);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config49.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("hi!", (java.lang.Object) ".");
        config38.putInConfigCache("C", (java.lang.Object) 100L);
        config38.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config74 = com.networknt.config.Config.getInstance();
        config74.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config74.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config74.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config74.putInConfigCache(".yaml", (java.lang.Object) ".");
        config74.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) config74);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config74);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Unable to load config from externalized folder for \001");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config28 = com.networknt.config.Config.getInstance();
        config28.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config28.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config28.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config28.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("hi!", (java.lang.Object) ".");
        config17.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config57 = com.networknt.config.Config.getInstance();
        config57.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config57.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config57.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config57.putInConfigCache(".yaml", (java.lang.Object) ".");
        config46.putInConfigCache("hi!", (java.lang.Object) ".");
        config46.putInConfigCache("C", (java.lang.Object) 100L);
        config46.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config17.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config46);
        config17.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        config17.putInConfigCache("loaded config from file {}", (java.lang.Object) (short) 0);
        config17.putInConfigCache("def$g", (java.lang.Object) 100.0f);
        config0.putInConfigCache("config\001", (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config57);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        config0.putInConfigCache("config\001", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config38.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config38.putInConfigCache("config", (java.lang.Object) "def$g");
        config38.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config38.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache(".yaml", (java.lang.Object) ".");
        config61.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config61.putInConfigCache("light-4j-config-dir", (java.lang.Object) 0);
        com.networknt.config.Config config81 = com.networknt.config.Config.getInstance();
        config81.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config81.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config81.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config81.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config81.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        config61.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config81);
        config38.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config61);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) config38);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config81);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        config0.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        com.networknt.config.Config config56 = com.networknt.config.Config.getInstance();
        config56.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config56.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config56.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config67 = com.networknt.config.Config.getInstance();
        config67.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config67.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config67.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config67.putInConfigCache(".yaml", (java.lang.Object) ".");
        config56.putInConfigCache("hi!", (java.lang.Object) ".");
        config56.putInConfigCache("C", (java.lang.Object) 100L);
        config56.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config56.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config56);
        org.junit.Assert.assertNotNull(config67);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config0.putInConfigCache("", (java.lang.Object) "hi!");
        config0.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        config0.putInConfigCache("", (java.lang.Object) config20);
        config20.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) ".yml");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config38.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config49 = com.networknt.config.Config.getInstance();
        config49.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config49.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config49.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config60 = com.networknt.config.Config.getInstance();
        config60.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config60.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config60.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config60.putInConfigCache(".yaml", (java.lang.Object) ".");
        config49.putInConfigCache("hi!", (java.lang.Object) ".");
        config49.putInConfigCache("C", (java.lang.Object) 100L);
        config49.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config81 = com.networknt.config.Config.getInstance();
        config81.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config81.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config81.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config81.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config49.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config38.putInConfigCache("light-4j-config-dir", (java.lang.Object) config49);
        config38.putInConfigCache("loaded config from file {}", (java.lang.Object) (-1));
        config20.putInConfigCache(".", (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config49);
        org.junit.Assert.assertNotNull(config60);
        org.junit.Assert.assertNotNull(config81);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config0.putInConfigCache("config\001", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) config26);
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config41.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config41.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config41.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config41.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config41.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config69 = com.networknt.config.Config.getInstance();
        config69.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config69.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config69.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config69.putInConfigCache(".yaml", (java.lang.Object) ".");
        config58.putInConfigCache("hi!", (java.lang.Object) ".");
        config58.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj87 = new java.lang.Object();
        config58.putInConfigCache("found configLoaderClass={}", obj87);
        config41.putInConfigCache("abc$defg", obj87);
        config41.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) (short) 10);
        config26.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config41);
        org.junit.Assert.assertNotNull(config58);
        org.junit.Assert.assertNotNull(config69);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache("C", (java.lang.Object) 100L);
        config23.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config23.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config23.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config23.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        config23.putInConfigCache(".json", (java.lang.Object) 0);
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) 10.0f);
        config0.putInConfigCache("", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        config0.putInConfigCache("hi!", (java.lang.Object) "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config0.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("def$g", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) (short) 10);
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) 0);
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config20.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config20.putInConfigCache("abc$defg", (java.lang.Object) "hi!");
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config20);
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config54 = com.networknt.config.Config.getInstance();
        config54.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config54.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config54.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config54.putInConfigCache(".yaml", (java.lang.Object) ".");
        config43.putInConfigCache("hi!", (java.lang.Object) ".");
        config43.putInConfigCache("C", (java.lang.Object) 100L);
        config43.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config43.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config43.putInConfigCache("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", (java.lang.Object) "Exception");
        config38.putInConfigCache("config", (java.lang.Object) "Exception");
        config20.putInConfigCache("config\001", (java.lang.Object) config38);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config54);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config20.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config31);
        config0.putInConfigCache("", (java.lang.Object) config20);
        config20.putInConfigCache("loaded config from file {}", (java.lang.Object) "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("", (java.lang.Object) 10.0d);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) (short) 0);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) config29);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 100L);
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("", (java.lang.Object) "Exception");
        config0.putInConfigCache("config", (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config0.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("light-4j-config-dir", (java.lang.Object) "config file cannot be found.");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) config26);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config38.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config38.putInConfigCache("abc$defg", (java.lang.Object) "C");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config66 = com.networknt.config.Config.getInstance();
        config66.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config66.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config66.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config66.putInConfigCache(".yaml", (java.lang.Object) ".");
        config55.putInConfigCache("hi!", (java.lang.Object) ".");
        config55.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj84 = new java.lang.Object();
        config55.putInConfigCache("found configLoaderClass={}", obj84);
        config38.putInConfigCache("abc$defg", obj84);
        config38.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) 1);
        config0.putInConfigCache("", (java.lang.Object) "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config66);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config11);
        com.networknt.config.Config config14 = com.networknt.config.Config.getInstance();
        config14.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config14.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config14.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config14.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config14.putInConfigCache(".yaml", (java.lang.Object) (byte) 100);
        config14.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config11.putInConfigCache("password", (java.lang.Object) "decryptorClass");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("sql1", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config47.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config47.putInConfigCache("config", (java.lang.Object) "def$g");
        config47.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 100.0d);
        config11.putInConfigCache("def$g", (java.lang.Object) config47);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config14);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config47);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Exception", (java.lang.Object) (short) 1);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) ".yaml");
        config0.putInConfigCache(".json", (java.lang.Object) 0);
        com.networknt.config.Config config44 = com.networknt.config.Config.getInstance();
        config44.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config44.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config44.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config55.putInConfigCache(".yaml", (java.lang.Object) ".");
        config44.putInConfigCache("hi!", (java.lang.Object) ".");
        config44.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config73 = com.networknt.config.Config.getInstance();
        config73.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config73.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config73.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config73.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config73.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config44.putInConfigCache("config\001", (java.lang.Object) config73);
        config73.putInConfigCache("config\001", (java.lang.Object) ".yml");
        config73.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) 0.0f);
        config73.putInConfigCache(".yaml", (java.lang.Object) (byte) -1);
        config0.putInConfigCache("", (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config44);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(config73);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config53.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config53.putInConfigCache("found configLoaderClass={}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config23.putInConfigCache("${password:abc$defg}", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        config23.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 1L);
        java.lang.Object obj74 = null;
        // The following exception was thrown during execution in test generation
        try {
            config23.putInConfigCache("Exception", obj74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config53);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj29 = new java.lang.Object();
        config0.putInConfigCache("found configLoaderClass={}", obj29);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config32.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("password", (java.lang.Object) config55);
        config55.putInConfigCache("\001 in \001", (java.lang.Object) 10);
        config0.putInConfigCache("value", (java.lang.Object) config55);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config55);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) "IOException");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "Trying to load {} with extension yaml, yml or json by using default loading method.");
        com.networknt.config.Config config38 = com.networknt.config.Config.getInstance();
        config38.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config38.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config38.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config38.putInConfigCache(".yaml", (java.lang.Object) ".");
        config38.putInConfigCache("${password:abc$defg}", (java.lang.Object) ".yml");
        config38.putInConfigCache("IOException", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("", (java.lang.Object) "IOException");
        config0.putInConfigCache("sql2", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config62 = com.networknt.config.Config.getInstance();
        config62.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config62.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config62.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config62.putInConfigCache(".yaml", (java.lang.Object) ".");
        config62.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "Exception");
        config62.putInConfigCache("hi!", (java.lang.Object) 0.0d);
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) config62);
        com.networknt.config.Config config83 = com.networknt.config.Config.getInstance();
        config83.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config83.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config83.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config83.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config83.putInConfigCache("config", (java.lang.Object) "def$g");
        config62.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNotNull(config62);
        org.junit.Assert.assertNotNull(config83);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        com.networknt.config.Config config20 = com.networknt.config.Config.getInstance();
        config20.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config20.putInConfigCache("Unable to load \001 as object.", (java.lang.Object) ".yml");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) (-1.0f));
        com.networknt.config.Config config31 = com.networknt.config.Config.getInstance();
        config31.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config31.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config31.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config42 = com.networknt.config.Config.getInstance();
        config42.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config42.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config42.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config42.putInConfigCache(".yaml", (java.lang.Object) ".");
        config31.putInConfigCache("hi!", (java.lang.Object) ".");
        config31.putInConfigCache("C", (java.lang.Object) 100L);
        config31.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config63 = com.networknt.config.Config.getInstance();
        config63.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config63.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config63.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config63.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config31.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config20.putInConfigCache("light-4j-config-dir", (java.lang.Object) config31);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) config20);
        java.lang.Object obj80 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("config file cannot be found.", obj80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(config42);
        org.junit.Assert.assertNotNull(config63);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) "config");
        config0.putInConfigCache("config file cannot be found.", (java.lang.Object) 10.0f);
        com.networknt.config.Config config35 = com.networknt.config.Config.getInstance();
        config35.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config35.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config35.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("config", (java.lang.Object) (-1L));
        com.networknt.config.Config config47 = com.networknt.config.Config.getInstance();
        config47.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config47.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config47.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config58.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config58.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config58.putInConfigCache(".yaml", (java.lang.Object) ".");
        config47.putInConfigCache("hi!", (java.lang.Object) ".");
        config47.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj76 = new java.lang.Object();
        config47.putInConfigCache("found configLoaderClass={}", obj76);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config35);
        org.junit.Assert.assertNotNull(config47);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config0.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("Exception", (java.lang.Object) (-1));
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        com.networknt.config.Config config23 = com.networknt.config.Config.getInstance();
        config23.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config23.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config23.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config34 = com.networknt.config.Config.getInstance();
        config34.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config34.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config34.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config34.putInConfigCache(".yaml", (java.lang.Object) ".");
        config23.putInConfigCache("hi!", (java.lang.Object) ".");
        config23.putInConfigCache(".yml", (java.lang.Object) ' ');
        config0.putInConfigCache("loaded config from file {}", (java.lang.Object) config23);
        com.networknt.config.Config config53 = com.networknt.config.Config.getInstance();
        config53.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config53.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config53.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config64 = com.networknt.config.Config.getInstance();
        config64.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config64.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config64.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config64.putInConfigCache(".yaml", (java.lang.Object) ".");
        config53.putInConfigCache("hi!", (java.lang.Object) ".");
        config53.putInConfigCache(".yml", (java.lang.Object) ' ');
        java.lang.Object obj82 = new java.lang.Object();
        config53.putInConfigCache("found configLoaderClass={}", obj82);
        config23.putInConfigCache("hi!", (java.lang.Object) "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config23);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(config53);
        org.junit.Assert.assertNotNull(config64);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        com.networknt.config.Config config2 = com.networknt.config.Config.getInstance();
        config2.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config2.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config2.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config2.putInConfigCache(".yaml", (java.lang.Object) ".");
        config2.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config2.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config2.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "sql2");
        com.networknt.config.Config config25 = com.networknt.config.Config.getInstance();
        config25.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config25.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config25.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config36 = com.networknt.config.Config.getInstance();
        config36.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config36.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config36.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config36.putInConfigCache(".yaml", (java.lang.Object) ".");
        config25.putInConfigCache("hi!", (java.lang.Object) ".");
        config25.putInConfigCache("", (java.lang.Object) 10.0d);
        config2.putInConfigCache("C", (java.lang.Object) "");
        config0.putInConfigCache("sql2", (java.lang.Object) "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config2);
        org.junit.Assert.assertNotNull(config25);
        org.junit.Assert.assertNotNull(config36);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config0.putInConfigCache("config\001", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache(".yaml", (java.lang.Object) ".");
        config26.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config26.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        com.networknt.config.Config config46 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config46.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config46.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config57 = com.networknt.config.Config.getInstance();
        config46.putInConfigCache("Unable to load config \001. Looking for the same file name with extension json...", (java.lang.Object) config57);
        config26.putInConfigCache("", (java.lang.Object) config46);
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) false);
        config26.putInConfigCache("config loaded from classpath for \001", (java.lang.Object) config61);
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) config61);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config46);
        org.junit.Assert.assertNotNull(config57);
        org.junit.Assert.assertNotNull(config61);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("config", (java.lang.Object) "def$g");
        com.networknt.config.Config config17 = com.networknt.config.Config.getInstance();
        config17.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config17.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config17.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config17.putInConfigCache(".yaml", (java.lang.Object) ".");
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config17.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config40.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) config40);
        config17.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) 10);
        config0.putInConfigCache("value", (java.lang.Object) config17);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config17);
        org.junit.Assert.assertNotNull(config40);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config29.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config29.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config0.putInConfigCache("config\001", (java.lang.Object) config29);
        config29.putInConfigCache("config\001", (java.lang.Object) ".yml");
        config29.putInConfigCache("Config loaded from default folder for \001", (java.lang.Object) 0.0f);
        config29.putInConfigCache(".yaml", (java.lang.Object) (byte) -1);
        config29.putInConfigCache("IOException", (java.lang.Object) 100L);
        com.networknt.config.Config config59 = com.networknt.config.Config.getInstance();
        config59.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config59.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config59.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config59.putInConfigCache(".yaml", (java.lang.Object) ".");
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config59.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config59.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config59.putInConfigCache(".json", (java.lang.Object) ".");
        config59.putInConfigCache("", (java.lang.Object) 0.0f);
        config29.putInConfigCache(".yaml", (java.lang.Object) 0.0f);
        config29.putInConfigCache("password", (java.lang.Object) "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config59);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1));
        config0.putInConfigCache("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config11.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("hi!", (java.lang.Object) ".");
        config0.putInConfigCache("C", (java.lang.Object) 100L);
        config0.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config32 = com.networknt.config.Config.getInstance();
        config32.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config32.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config32.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache(".yaml", (java.lang.Object) ".");
        config32.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config32.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config32.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        com.networknt.config.Config config55 = com.networknt.config.Config.getInstance();
        config55.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config55.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config55.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config32.putInConfigCache("password", (java.lang.Object) config55);
        config0.putInConfigCache("", (java.lang.Object) config55);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config32);
        org.junit.Assert.assertNotNull(config55);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", (java.lang.Object) "sql1");
        config0.putInConfigCache(".", (java.lang.Object) "Unable to load \001 as object.");
        config0.putInConfigCache("config\001", (java.lang.Object) "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        com.networknt.config.Config config26 = com.networknt.config.Config.getInstance();
        config26.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config26.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config26.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config26.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) config26);
        com.networknt.config.Config config41 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("found configLoaderClass={}", (java.lang.Object) config41);
        com.networknt.config.Config config44 = com.networknt.config.Config.getInstance();
        config44.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config44.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config44.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config44.putInConfigCache(".yaml", (java.lang.Object) "\001 in \001");
        config44.putInConfigCache("abc$defg", (java.lang.Object) "C");
        config44.putInConfigCache("Exception", (java.lang.Object) (-1));
        config44.putInConfigCache("Trying to load {} with extension yaml, yml or json by using default loading method.", (java.lang.Object) 0);
        config44.putInConfigCache("Config loaded from externalized folder for \001", (java.lang.Object) 1.0d);
        config0.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNotNull(config41);
        org.junit.Assert.assertNotNull(config44);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yml", (java.lang.Object) 10.0f);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            config0.putInConfigCache("Config loaded from default folder for \001", obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config11 = com.networknt.config.Config.getInstance();
        config11.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config11.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config22 = com.networknt.config.Config.getInstance();
        config22.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config22.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config22.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config22.putInConfigCache(".yaml", (java.lang.Object) ".");
        config11.putInConfigCache("hi!", (java.lang.Object) ".");
        config11.putInConfigCache("C", (java.lang.Object) 100L);
        config11.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config43 = com.networknt.config.Config.getInstance();
        config43.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config43.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config43.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config43.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config11.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config58 = com.networknt.config.Config.getInstance();
        config58.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config11.putInConfigCache("config", (java.lang.Object) config58);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config11);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(config58);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        config0.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config0.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config0.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config0.putInConfigCache(".yaml", (java.lang.Object) ".");
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) "decryptorClass");
        config0.putInConfigCache(".yml", (java.lang.Object) (byte) 0);
        config0.putInConfigCache("Unable to load \001 as map.", (java.lang.Object) '4');
        config0.putInConfigCache("Unable to load config \001. Looking for the same file name with extension yaml...", (java.lang.Object) 0L);
        config0.putInConfigCache("abc$defg", (java.lang.Object) '4');
        com.networknt.config.Config config29 = com.networknt.config.Config.getInstance();
        config29.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config29.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        com.networknt.config.Config config40 = com.networknt.config.Config.getInstance();
        config40.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config40.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config40.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config40.putInConfigCache(".yaml", (java.lang.Object) ".");
        config29.putInConfigCache("hi!", (java.lang.Object) ".");
        config29.putInConfigCache("C", (java.lang.Object) 100L);
        config29.putInConfigCache("found decryptorClass={}", (java.lang.Object) (short) 0);
        com.networknt.config.Config config61 = com.networknt.config.Config.getInstance();
        config61.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config61.putInConfigCache("decryptorClass", (java.lang.Object) "Unable to load config from externalized folder for \001");
        config61.putInConfigCache("Trying to load config from classpath directory for file \001", (java.lang.Object) (-1L));
        config61.putInConfigCache("found configLoaderClass={}", (java.lang.Object) (short) 100);
        config29.putInConfigCache("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", (java.lang.Object) "found configLoaderClass={}");
        com.networknt.config.Config config76 = com.networknt.config.Config.getInstance();
        config76.putInConfigCache("def$g", (java.lang.Object) (byte) 1);
        config29.putInConfigCache("config", (java.lang.Object) config76);
        config0.putInConfigCache("password", (java.lang.Object) config29);
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNotNull(config29);
        org.junit.Assert.assertNotNull(config40);
        org.junit.Assert.assertNotNull(config61);
        org.junit.Assert.assertNotNull(config76);
    }
}

