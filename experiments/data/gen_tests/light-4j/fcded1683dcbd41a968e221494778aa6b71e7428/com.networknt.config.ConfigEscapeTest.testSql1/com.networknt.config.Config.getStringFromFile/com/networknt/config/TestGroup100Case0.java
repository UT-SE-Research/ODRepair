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
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("sql2", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile(".yml", "");
        java.lang.String str15 = config0.getStringFromFile("abc$defg", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = config0.getStringFromFile("config", "value");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile("", "config");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = config0.getStringFromFile("config", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "def$g");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = config0.getStringFromFile("config", "sql1");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("IOException", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("\001 in \001", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile(".yaml", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "def$g");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "password");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = config0.getStringFromFile("config", ".yml");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile(".yaml", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "light-4j-config-dir");
        java.lang.String str21 = config0.getStringFromFile("C", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("def$g", "hi!");
        java.lang.String str12 = config0.getStringFromFile("found decryptorClass={}", "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from externalized folder for \001", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("IOException", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile("", "config");
        java.lang.String str24 = config0.getStringFromFile("", "Trying to load config from classpath directory for file \001");
        java.lang.String str27 = config0.getStringFromFile("\001 in \001", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str24, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "Exception");
        java.lang.String str12 = config0.getStringFromFile("${password:abc$defg}", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from externalized folder for \001", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("IOException", "C");
        java.lang.String str21 = config0.getStringFromFile("Unable to load \001 as map.", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "def$g");
        java.lang.String str12 = config0.getStringFromFile("Exception", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("hi!", "config\001");
        java.lang.String str12 = config0.getStringFromFile("light-4j-config-dir", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("value", ".yml");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("sql1", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("value", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("sql2", "sql1");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("password", "config");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("IOException", "found decryptorClass={}");
        java.lang.String str6 = config0.getStringFromFile("found configLoaderClass={}", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "hi!");
        java.lang.String str21 = config0.getStringFromFile("light-4j-config-dir", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("${password:abc$defg}", "found configLoaderClass={}");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "\001 in \001");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("sql2", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "def$g");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as map.", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("password", ".json");
        java.lang.String str15 = config0.getStringFromFile("found decryptorClass={}", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("Config loaded from externalized folder for \001", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("sql1", "abc$defg");
        java.lang.String str21 = config0.getStringFromFile("sql2", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile(".yml", "");
        java.lang.String str15 = config0.getStringFromFile("abc$defg", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str18 = config0.getStringFromFile(".yaml", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("\001 in \001", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "loaded config from file {}");
        java.lang.String str12 = config0.getStringFromFile(".", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("Config loaded from externalized folder for \001", "sql2");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("found decryptorClass={}", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("${password:abc$defg}", "found configLoaderClass={}");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "\001 in \001");
        java.lang.String str15 = config0.getStringFromFile("password", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str18 = config0.getStringFromFile("sql2", "");
        java.lang.String str21 = config0.getStringFromFile("decryptorClass", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str21 = config0.getStringFromFile("config\001", ".json");
        java.lang.String str24 = config0.getStringFromFile("config\001", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str21 = config0.getStringFromFile("abc$defg", "config");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str21 = config0.getStringFromFile("config\001", ".json");
        java.lang.String str24 = config0.getStringFromFile("Unable to load \001 as map.", "value");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = config0.getStringFromFile("config", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("", "config loaded from classpath for \001");
        java.lang.String str15 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str21 = config0.getStringFromFile("value", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("config file cannot be found.", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("sql2", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql1");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str21 = config0.getStringFromFile("Unable to load \001 as map.", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as object.", "found decryptorClass={}");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "loaded config from file {}");
        java.lang.String str18 = config0.getStringFromFile("config loaded from classpath for \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = config0.getStringFromFile("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("sql2", ".yml");
        java.lang.String str18 = config0.getStringFromFile(".yaml", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("${password:abc$defg}", "found configLoaderClass={}");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "\001 in \001");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", ".json");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile(".yml", "");
        java.lang.String str15 = config0.getStringFromFile("C", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("config\001", "decryptorClass");
        java.lang.String str21 = config0.getStringFromFile("", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("light-4j-config-dir", "abc$defg");
        java.lang.String str9 = config0.getStringFromFile("config file cannot be found.", "sql1");
        java.lang.String str12 = config0.getStringFromFile("hi!", ".yaml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("sql1", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "C");
        java.lang.String str21 = config0.getStringFromFile(".json", "abc$defg");
        java.lang.String str24 = config0.getStringFromFile("abc$defg", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("value", "IOException");
        java.lang.String str21 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "");
        java.lang.String str24 = config0.getStringFromFile("\001 in \001", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str27 = config0.getStringFromFile(".json", ".");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "def$g");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile(".", "def$g");
        java.lang.String str12 = config0.getStringFromFile(".yaml", ".yml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("value", "IOException");
        java.lang.String str21 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "");
        java.lang.String str24 = config0.getStringFromFile("sql1", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str27 = config0.getStringFromFile("found decryptorClass={}", "IOException");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "password");
        java.lang.String str21 = config0.getStringFromFile("password", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str21 = config0.getStringFromFile("password", ".json");
        java.lang.String str24 = config0.getStringFromFile("decryptorClass", ".yml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("\001 in \001", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("Exception", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str15 = config0.getStringFromFile("hi!", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("IOException", "found decryptorClass={}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str9 = config0.getStringFromFile(".json", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("IOException", "");
        java.lang.String str15 = config0.getStringFromFile("config loaded from classpath for \001", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "");
        java.lang.String str21 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("sql1", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "C");
        java.lang.String str21 = config0.getStringFromFile(".json", "abc$defg");
        java.lang.String str24 = config0.getStringFromFile("IOException", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("sql1", ".json");
        java.lang.String str12 = config0.getStringFromFile("found configLoaderClass={}", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("config\001", "password");
        java.lang.String str12 = config0.getStringFromFile("", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("Exception", "");
        java.lang.String str21 = config0.getStringFromFile("value", ".json");
        java.lang.String str24 = config0.getStringFromFile("${password:abc$defg}", "value");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql1");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.lang.String str21 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str21 = config0.getStringFromFile("decryptorClass", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str21 = config0.getStringFromFile("Config loaded from externalized folder for \001", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str21 = config0.getStringFromFile("decryptorClass", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str21 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from externalized folder for \001", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("IOException", "C");
        java.lang.String str21 = config0.getStringFromFile("hi!", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "value");
        java.lang.String str21 = config0.getStringFromFile(".yml", "def$g");
        java.lang.String str24 = config0.getStringFromFile("${password:abc$defg}", "config");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("", "sql1");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "password");
        java.lang.String str21 = config0.getStringFromFile("", "sql2");
        java.lang.String str24 = config0.getStringFromFile("\001 in \001", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("light-4j-config-dir", "abc$defg");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as object.", "");
        java.lang.String str15 = config0.getStringFromFile(".yml", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("password", "Exception");
        java.lang.String str9 = config0.getStringFromFile("", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str12 = config0.getStringFromFile("Exception", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile("\001 in \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "sql1");
        java.lang.String str18 = config0.getStringFromFile("config\001", "config\001");
        java.lang.String str21 = config0.getStringFromFile(".", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql1");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("sql1", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile(".yaml", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as object.", "found decryptorClass={}");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "loaded config from file {}");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str18 = config0.getStringFromFile(".", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str21 = config0.getStringFromFile("decryptorClass", ".yml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str18, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("C", "config file cannot be found.");
        java.lang.String str24 = config0.getStringFromFile("Unable to load \001 as map.", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile(".yml", "");
        java.lang.String str15 = config0.getStringFromFile("abc$defg", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "decryptorClass");
        java.lang.String str21 = config0.getStringFromFile(".", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("sql2", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("found decryptorClass={}", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile(".", "IOException");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "found decryptorClass={}");
        java.lang.String str21 = config0.getStringFromFile(".", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str15, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("sql1", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile("Exception", "loaded config from file {}");
        java.lang.String str18 = config0.getStringFromFile("hi!", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile("", "config");
        java.lang.String str24 = config0.getStringFromFile("", "Trying to load config from classpath directory for file \001");
        java.lang.String str27 = config0.getStringFromFile("Exception", "sql2");
        java.lang.String str30 = config0.getStringFromFile("${password:abc$defg}", "Exception");
        java.lang.String str33 = config0.getStringFromFile("", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str24, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str33, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "hi!");
        java.lang.String str15 = config0.getStringFromFile(".json", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "Unable to load config from externalized folder for \001");
        java.lang.String str21 = config0.getStringFromFile("abc$defg", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("Exception", "");
        java.lang.String str21 = config0.getStringFromFile("${password:abc$defg}", "password");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str21 = config0.getStringFromFile("light-4j-config-dir", ".yml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile("", "config");
        java.lang.String str24 = config0.getStringFromFile("", "Trying to load config from classpath directory for file \001");
        java.lang.String str27 = config0.getStringFromFile(".", "abc$defg");
        java.lang.String str30 = config0.getStringFromFile("config\001", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str24, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str27, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str21 = config0.getStringFromFile("IOException", "password");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("Exception", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "Exception");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "Exception");
        java.lang.String str12 = config0.getStringFromFile(".yml", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = config0.getStringFromFile("config", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("hi!", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql1");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "");
        java.lang.String str21 = config0.getStringFromFile("", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str21 = config0.getStringFromFile("password", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("sql1", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile("Exception", "loaded config from file {}");
        java.lang.String str18 = config0.getStringFromFile("IOException", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("password", ".json");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "Trying to load config from classpath directory for file \001");
        java.lang.String str18 = config0.getStringFromFile("config\001", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql1");
        java.lang.String str18 = config0.getStringFromFile("Unable to load \001 as object.", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile(".yaml", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile(".", "IOException");
        java.lang.String str18 = config0.getStringFromFile("", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str15, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str18, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("IOException", "found decryptorClass={}");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("C", "config file cannot be found.");
        java.lang.String str24 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql1");
        java.lang.String str27 = config0.getStringFromFile(".json", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "def$g");
        java.lang.String str12 = config0.getStringFromFile("abc$defg", "found decryptorClass={}");
        java.lang.String str15 = config0.getStringFromFile("sql1", "IOException");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "light-4j-config-dir");
        java.lang.String str21 = config0.getStringFromFile("Unable to load \001 as object.", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "value");
        java.lang.String str21 = config0.getStringFromFile("loaded config from file {}", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from externalized folder for \001", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("IOException", "C");
        java.lang.String str21 = config0.getStringFromFile("Config loaded from externalized folder for \001", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", ".yaml");
        java.lang.String str12 = config0.getStringFromFile("found decryptorClass={}", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "Exception");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from externalized folder for \001", "config file cannot be found.");
        java.lang.String str21 = config0.getStringFromFile("found decryptorClass={}", "config");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str21 = config0.getStringFromFile("hi!", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("config\001", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yml");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("IOException", "");
        java.lang.String str15 = config0.getStringFromFile("sql1", "config");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "Exception");
        java.lang.String str12 = config0.getStringFromFile(".yaml", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile("C", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("value", "");
        java.lang.String str18 = config0.getStringFromFile("def$g", "found configLoaderClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("password", "config");
        java.lang.String str12 = config0.getStringFromFile("Exception", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str21 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("config loaded from classpath for \001", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "light-4j-config-dir");
        java.lang.String str12 = config0.getStringFromFile("${password:abc$defg}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "def$g");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "C");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("password", "Exception");
        java.lang.String str9 = config0.getStringFromFile("", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "config");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("IOException", ".json");
        java.lang.String str21 = config0.getStringFromFile("value", "Unable to load \001 as map.");
        java.lang.String str24 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("C", "Trying to load config from classpath directory for file \001");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "C");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("sql1", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile(".yml", ".");
        java.lang.String str18 = config0.getStringFromFile("", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str18, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "value");
        java.lang.String str21 = config0.getStringFromFile(".yml", "def$g");
        java.lang.String str24 = config0.getStringFromFile("hi!", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile("\001 in \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str15 = config0.getStringFromFile(".yml", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "def$g");
        java.lang.String str12 = config0.getStringFromFile("Config loaded from default folder for \001", "");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("password", "Exception");
        java.lang.String str9 = config0.getStringFromFile(".", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as map.", "abc$defg");
        java.lang.String str15 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "hi!");
        java.lang.String str15 = config0.getStringFromFile(".json", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "abc$defg");
        java.lang.String str21 = config0.getStringFromFile("\001 in \001", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("config loaded from classpath for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile("", "config");
        java.lang.String str24 = config0.getStringFromFile("", "Trying to load config from classpath directory for file \001");
        java.lang.String str27 = config0.getStringFromFile(".", "abc$defg");
        java.lang.String str30 = config0.getStringFromFile("config file cannot be found.", "found decryptorClass={}");
        java.lang.String str33 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "light-4j-config-dir");
        java.lang.String str36 = config0.getStringFromFile("light-4j-config-dir", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str24, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str27, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile("C", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("value", "");
        java.lang.String str18 = config0.getStringFromFile("Unable to load \001 as map.", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("${password:abc$defg}", "config\001");
        java.lang.String str24 = config0.getStringFromFile("sql1", "Config loaded from externalized folder for \001");
        java.lang.String str27 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("password", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str18 = config0.getStringFromFile("config file cannot be found.", "value");
        java.lang.String str21 = config0.getStringFromFile("Exception", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("decryptorClass", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = config0.getStringFromFile("config", "Trying to load {} with extension yaml, yml or json by using default loading method.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("\001 in \001", "decryptorClass");
        java.lang.String str18 = config0.getStringFromFile("IOException", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str21 = config0.getStringFromFile("password", ".json");
        java.lang.String str24 = config0.getStringFromFile("IOException", ".");
        java.lang.String str27 = config0.getStringFromFile("abc$defg", ".yaml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile(".yml", "");
        java.lang.String str15 = config0.getStringFromFile("decryptorClass", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("sql1", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile(".yml", ".");
        java.lang.String str18 = config0.getStringFromFile("config file cannot be found.", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("light-4j-config-dir", "Config loaded from externalized folder for \001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = config0.getStringFromFile("config", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("Exception", "");
        java.lang.String str21 = config0.getStringFromFile("Unable to load \001 as object.", "Unable to load config from externalized folder for \001");
        java.lang.String str24 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "${password:abc$defg}");
        java.lang.String str12 = config0.getStringFromFile("found configLoaderClass={}", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "value");
        java.lang.String str21 = config0.getStringFromFile(".yml", "def$g");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = config0.getStringFromFile("config", "Exception");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str15 = config0.getStringFromFile(".", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str15, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", ".json");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql2");
        java.lang.String str18 = config0.getStringFromFile("Unable to load \001 as object.", ".yaml");
        java.lang.String str21 = config0.getStringFromFile("def$g", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str21 = config0.getStringFromFile("config file cannot be found.", "Unable to load \001 as map.");
        java.lang.String str24 = config0.getStringFromFile("", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str24, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "hi!");
        java.lang.String str15 = config0.getStringFromFile(".json", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("IOException", "value");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("hi!", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("found configLoaderClass={}", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yaml");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "password");
        java.lang.String str21 = config0.getStringFromFile("sql2", "light-4j-config-dir");
        java.lang.String str24 = config0.getStringFromFile(".yaml", "loaded config from file {}");
        java.lang.String str27 = config0.getStringFromFile("Config loaded from externalized folder for \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("password", "Exception");
        java.lang.String str9 = config0.getStringFromFile(".json", "");
        java.lang.String str12 = config0.getStringFromFile("${password:abc$defg}", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "password");
        java.lang.String str21 = config0.getStringFromFile("abc$defg", "light-4j-config-dir");
        java.lang.String str24 = config0.getStringFromFile("value", "config\001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("${password:abc$defg}", "config\001");
        java.lang.String str24 = config0.getStringFromFile("hi!", "found configLoaderClass={}");
        java.lang.String str27 = config0.getStringFromFile("found configLoaderClass={}", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "${password:abc$defg}");
        java.lang.String str12 = config0.getStringFromFile("Config loaded from externalized folder for \001", "Config loaded from default folder for \001");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Trying to load config from classpath directory for file \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("hi!", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("password", ".json");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "Trying to load config from classpath directory for file \001");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "abc$defg");
        java.lang.String str21 = config0.getStringFromFile(".", ".yml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("IOException", "found decryptorClass={}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str9 = config0.getStringFromFile("", "found decryptorClass={}");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("C", "config file cannot be found.");
        java.lang.String str24 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql1");
        java.lang.String str27 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "loaded config from file {}");
        java.lang.String str30 = config0.getStringFromFile("IOException", "light-4j-config-dir");
        java.lang.String str33 = config0.getStringFromFile("IOException", ".json");
        java.lang.String str36 = config0.getStringFromFile("loaded config from file {}", "config loaded from classpath for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "hi!");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("value", ".yml");
        java.lang.String str12 = config0.getStringFromFile("found configLoaderClass={}", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str21 = config0.getStringFromFile("config file cannot be found.", "Unable to load \001 as map.");
        java.lang.String str24 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "hi!");
        java.lang.String str27 = config0.getStringFromFile("loaded config from file {}", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "def$g");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "config\001");
        java.lang.String str21 = config0.getStringFromFile("Config loaded from default folder for \001", "Unable to load \001 as object.");
        java.lang.String str24 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", ".");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("sql2", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("hi!", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("IOException", ".json");
        java.lang.String str21 = config0.getStringFromFile("value", "Unable to load \001 as map.");
        java.lang.String str24 = config0.getStringFromFile(".", "abc$defg");
        java.lang.String str27 = config0.getStringFromFile("", "value");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str24, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str27, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("IOException", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "sql1");
        java.lang.String str21 = config0.getStringFromFile(".", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("IOException", "found decryptorClass={}");
        java.lang.String str6 = config0.getStringFromFile("found configLoaderClass={}", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "password");
        java.lang.String str12 = config0.getStringFromFile(".yaml", "Unable to load \001 as object.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("IOException", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("found decryptorClass={}", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("config file cannot be found.", "loaded config from file {}");
        java.lang.String str9 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "Unable to load \001 as map.");
        java.lang.String str12 = config0.getStringFromFile("", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("config file cannot be found.", "\001 in \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "C");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "config");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "value");
        java.lang.String str21 = config0.getStringFromFile(".yml", "def$g");
        java.lang.String str24 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "config\001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("config\001", "password");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Exception");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("password", "Exception");
        java.lang.String str9 = config0.getStringFromFile(".json", "");
        java.lang.String str12 = config0.getStringFromFile(".yml", "sql2");
        java.lang.String str15 = config0.getStringFromFile("value", "value");
        java.lang.String str18 = config0.getStringFromFile("password", "password");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "loaded config from file {}");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("${password:abc$defg}", "config\001");
        java.lang.String str24 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile("", "config");
        java.lang.String str24 = config0.getStringFromFile("${password:abc$defg}", "");
        java.lang.String str27 = config0.getStringFromFile("Config loaded from externalized folder for \001", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str21, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("config\001", "abc$defg");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "IOException");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str9 = config0.getStringFromFile("Exception", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("sql1", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile("Exception", "loaded config from file {}");
        java.lang.String str18 = config0.getStringFromFile("value", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Config loaded from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "\001 in \001");
        java.lang.String str15 = config0.getStringFromFile("light-4j-config-dir", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "abc$defg");
        java.lang.String str9 = config0.getStringFromFile("sql1", "Unable to load config \001. Looking for the same file name with extension json...");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("Exception", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from externalized folder for \001", "");
        java.lang.String str18 = config0.getStringFromFile("", "Unable to load config from externalized folder for \001");
        java.lang.String str21 = config0.getStringFromFile("\001 in \001", "password");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str18, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "Unable to load \001 as map.");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "sql1");
        java.lang.String str18 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str21 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "${password:abc$defg}");
        java.lang.String str24 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile("config\001", "");
        java.lang.String str15 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "value");
        java.lang.String str21 = config0.getStringFromFile("sql1", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("C", "Trying to load config from classpath directory for file \001");
        java.lang.String str15 = config0.getStringFromFile("decryptorClass", "abc$defg");
        java.lang.String str18 = config0.getStringFromFile("config loaded from classpath for \001", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str21 = config0.getStringFromFile("Unable to load \001 as object.", "Unable to load \001 as map.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "def$g");
        java.lang.String str18 = config0.getStringFromFile("abc$defg", "");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("sql1", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("config\001", "abc$defg");
        java.lang.String str21 = config0.getStringFromFile("abc$defg", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("C", "config file cannot be found.");
        java.lang.String str24 = config0.getStringFromFile("found configLoaderClass={}", "loaded config from file {}");
        java.lang.String str27 = config0.getStringFromFile("loaded config from file {}", ".yaml");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("def$g", "hi!");
        java.lang.String str12 = config0.getStringFromFile("found configLoaderClass={}", "");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("IOException", ".json");
        java.lang.String str21 = config0.getStringFromFile("def$g", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("${password:abc$defg}", ".yaml");
        java.lang.String str18 = config0.getStringFromFile("sql1", "");
        java.lang.String str21 = config0.getStringFromFile("Unable to load \001 as map.", "Trying to load config from classpath directory for file \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "${password:abc$defg}");
        java.lang.String str12 = config0.getStringFromFile("Config loaded from externalized folder for \001", "Config loaded from default folder for \001");
        java.lang.String str15 = config0.getStringFromFile("config\001", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", ".yaml");
        java.lang.String str12 = config0.getStringFromFile("found decryptorClass={}", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile("config\001", "Config loaded from default folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Unable to load \001 as map.", ".yaml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("${password:abc$defg}", "found configLoaderClass={}");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "\001 in \001");
        java.lang.String str15 = config0.getStringFromFile("password", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "${password:abc$defg}");
        java.lang.String str21 = config0.getStringFromFile("found configLoaderClass={}", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("light-4j-config-dir", "abc$defg");
        java.lang.String str9 = config0.getStringFromFile("config file cannot be found.", "sql1");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "config\001");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from default folder for \001", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str9 = config0.getStringFromFile("config loaded from classpath for \001", "light-4j-config-dir");
        java.lang.String str12 = config0.getStringFromFile("found configLoaderClass={}", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "${password:abc$defg}");
        java.lang.String str12 = config0.getStringFromFile("", "");
        java.lang.String str15 = config0.getStringFromFile("found configLoaderClass={}", "abc$defg");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("password", "config");
        java.lang.String str12 = config0.getStringFromFile(".", "sql2");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "${password:abc$defg}");
        java.lang.String str12 = config0.getStringFromFile("", "");
        java.lang.String str15 = config0.getStringFromFile("Config loaded from externalized folder for \001", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str18 = config0.getStringFromFile("password", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile(".json", "Exception");
        java.lang.String str12 = config0.getStringFromFile("hi!", ".");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str9 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "loaded config from file {}");
        java.lang.String str12 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "C");
        java.lang.String str15 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", ".yml");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("C", "config file cannot be found.");
        java.lang.String str24 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql1");
        java.lang.String str27 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "loaded config from file {}");
        java.lang.String str30 = config0.getStringFromFile("config file cannot be found.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str33 = config0.getStringFromFile("${password:abc$defg}", "abc$defg");
        java.lang.String str36 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "found decryptorClass={}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "light-4j-config-dir");
        java.lang.String str21 = config0.getStringFromFile("config loaded from classpath for \001", "decryptorClass");
        java.lang.String str24 = config0.getStringFromFile("value", "${password:abc$defg}");
        java.lang.String str27 = config0.getStringFromFile(".", "config loaded from classpath for \001");
        java.lang.String str30 = config0.getStringFromFile("found decryptorClass={}", "config\001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str27, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yaml");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "password");
        java.lang.String str21 = config0.getStringFromFile("password", "config");
        java.lang.String str24 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension yaml...", "hi!");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("password", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str24 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "Unable to load config from externalized folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("light-4j-config-dir", "");
        java.lang.String str12 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "sql2");
        java.lang.String str18 = config0.getStringFromFile("\001 in \001", "loaded config from file {}");
        java.lang.String str21 = config0.getStringFromFile("C", "config file cannot be found.");
        java.lang.String str24 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "sql1");
        java.lang.String str27 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "loaded config from file {}");
        java.lang.String str30 = config0.getStringFromFile("config file cannot be found.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str33 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "hi!");
        java.lang.String str15 = config0.getStringFromFile(".json", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "abc$defg");
        java.lang.String str21 = config0.getStringFromFile(".yml", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile(".", "IOException");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "found decryptorClass={}");
        java.lang.String str21 = config0.getStringFromFile(".yaml", "Exception");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str15, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "password");
        java.lang.String str21 = config0.getStringFromFile("found decryptorClass={}", "Unable to load \001 as map.");
        java.lang.String str24 = config0.getStringFromFile("Unable to load \001 as object.", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("password", "config");
        java.lang.String str12 = config0.getStringFromFile("Exception", "Config loaded from externalized folder for \001");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Unable to load \001 as object.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = config0.getStringFromFile("config", ".json");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yaml");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "password");
        java.lang.String str21 = config0.getStringFromFile("sql2", "light-4j-config-dir");
        java.lang.String str24 = config0.getStringFromFile("${password:abc$defg}", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("${password:abc$defg}", "found configLoaderClass={}");
        java.lang.String str12 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "\001 in \001");
        java.lang.String str15 = config0.getStringFromFile("password", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "${password:abc$defg}");
        java.lang.String str21 = config0.getStringFromFile(".yml", "decryptorClass");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yaml");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "password");
        java.lang.String str21 = config0.getStringFromFile("sql2", "light-4j-config-dir");
        java.lang.String str24 = config0.getStringFromFile(".yaml", "loaded config from file {}");
        java.lang.String str27 = config0.getStringFromFile("Config loaded from default folder for \001", "config\001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("value", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as object.", "");
        java.lang.String str15 = config0.getStringFromFile(".", "Trying to load config from classpath directory for file \001");
        java.lang.String str18 = config0.getStringFromFile("decryptorClass", "sql2");
        java.lang.String str21 = config0.getStringFromFile(".yaml", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str15, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "hi!");
        java.lang.String str15 = config0.getStringFromFile(".json", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "Unable to load config from externalized folder for \001");
        java.lang.String str21 = config0.getStringFromFile("found decryptorClass={}", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("loaded config from file {}", "config file cannot be found.");
        java.lang.String str15 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.", "C");
        java.lang.String str18 = config0.getStringFromFile("sql2", "Unable to load \001 as object.");
        java.lang.String str21 = config0.getStringFromFile(".yaml", ".yml");
        java.lang.String str24 = config0.getStringFromFile("Trying to load config from classpath directory for file \001", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str27 = config0.getStringFromFile("Unable to load \001 as map.", "sql1");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("loaded config from file {}", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "hi!");
        java.lang.String str15 = config0.getStringFromFile(".json", "Unable to load \001 as object.");
        java.lang.String str18 = config0.getStringFromFile("${password:abc$defg}", "Unable to load config from externalized folder for \001");
        java.lang.String str21 = config0.getStringFromFile("Config loaded from externalized folder for \001", "Unable to load config \001. Looking for the same file name with extension yaml...");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "Config loaded from default folder for \001");
        java.lang.String str18 = config0.getStringFromFile("IOException", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", ".yaml");
        java.lang.String str12 = config0.getStringFromFile("found decryptorClass={}", "decryptorClass");
        java.lang.String str15 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "Exception");
        java.lang.String str18 = config0.getStringFromFile("", "C");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str18, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("decryptorClass", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str15 = config0.getStringFromFile("IOException", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "value");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("Exception", "IOException");
        java.lang.String str9 = config0.getStringFromFile("hi!", "value");
        java.lang.String str12 = config0.getStringFromFile("config\001", "${password:abc$defg}");
        java.lang.String str15 = config0.getStringFromFile("def$g", ".yaml");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "password");
        java.lang.String str21 = config0.getStringFromFile("sql2", "light-4j-config-dir");
        java.lang.String str24 = config0.getStringFromFile("config loaded from classpath for \001", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("config\001", "");
        java.lang.String str6 = config0.getStringFromFile("password", "Exception");
        java.lang.String str9 = config0.getStringFromFile(".", "abc$defg");
        java.lang.String str12 = config0.getStringFromFile("Unable to load \001 as map.", "abc$defg");
        java.lang.String str15 = config0.getStringFromFile("Unable to load \001 as map.", "value");
        java.lang.String str18 = config0.getStringFromFile("value", "Config loaded from default folder for \001");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str9, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".yaml");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as object.", "Config loaded from default folder for \001");
        java.lang.String str12 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str15 = config0.getStringFromFile("sql1", "found decryptorClass={}");
        java.lang.String str18 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "C");
        java.lang.String str21 = config0.getStringFromFile(".json", "abc$defg");
        java.lang.String str24 = config0.getStringFromFile("value", "Unable to load config \001. Looking for the same file name with extension yaml...");
        java.lang.String str27 = config0.getStringFromFile(".yaml", "config\001");
        java.lang.String str30 = config0.getStringFromFile("${password:abc$defg}", "config");
        java.lang.String str33 = config0.getStringFromFile("Unable to load \001 as object.", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "password");
        java.lang.String str21 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str24 = config0.getStringFromFile("Unable to load config \001. Looking for the same file name with extension json...", "Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.");
        java.lang.String str27 = config0.getStringFromFile("config loaded from classpath for \001", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str30 = config0.getStringFromFile("Config loaded from default folder for \001", "config file cannot be found.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("config file cannot be found.", "${password:abc$defg}");
        java.lang.String str18 = config0.getStringFromFile("SELECT JSON_VALUE(abc, '$.foo.bar') FROM def", "def$g");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("light-4j-config-dir", "abc$defg");
        java.lang.String str9 = config0.getStringFromFile("${password:abc$defg}", ".json");
        java.lang.String str12 = config0.getStringFromFile("", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str12, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile("def$g", "light-4j-config-dir");
        java.lang.String str9 = config0.getStringFromFile("IOException", "Trying to load {} with extension yaml, yml or json by using ConfigLoader: {}.");
        java.lang.String str12 = config0.getStringFromFile("Exception", "Unable to load config \001. Looking for the same file name with extension json...");
        java.lang.String str15 = config0.getStringFromFile("value", "Trying to load {} with extension yaml, yml or json by using default loading method.");
        java.lang.String str18 = config0.getStringFromFile("sql1", "Unable to load config from externalized folder for \001");
        java.lang.String str21 = config0.getStringFromFile("Unable to load config '\001' with extension yml, yaml and json from external config, application config and module config. Please ignore this message if you are sure that your application is not using this config file.", "C");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("IOException", "def$g");
        java.lang.String str9 = config0.getStringFromFile("Trying to load {} with extension yaml, yml or json by using default loading method.", "light-4j-config-dir");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("sql2", "hi!");
        java.lang.String str9 = config0.getStringFromFile("Unable to load \001 as map.", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("hi!", "light-4j-config-dir");
        java.lang.String str15 = config0.getStringFromFile("hi!", "config loaded from classpath for \001");
        java.lang.String str18 = config0.getStringFromFile(".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n", "hi!");
        java.lang.String str21 = config0.getStringFromFile("C", "def$g");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = config0.getStringFromFile("config", ".");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedHashMap cannot be cast to class java.lang.String (java.util.LinkedHashMap and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("loaded config from file {}", "");
        java.lang.String str12 = config0.getStringFromFile("sql2", "IOException");
        java.lang.String str15 = config0.getStringFromFile("loaded config from file {}", "Config loaded from externalized folder for \001");
        java.lang.String str18 = config0.getStringFromFile("Config loaded from default folder for \001", "password");
        java.lang.String str21 = config0.getStringFromFile("abc$defg", "light-4j-config-dir");
        java.lang.String str24 = config0.getStringFromFile("found decryptorClass={}", "\001 in \001");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile(".", "");
        java.lang.String str6 = config0.getStringFromFile(".yaml", ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        java.lang.String str9 = config0.getStringFromFile("\001 in \001", "SELECT JSON_VALUE(abc, '$.foo.bar') FROM def");
        java.lang.String str12 = config0.getStringFromFile("Unable to load config from externalized folder for \001", "loaded config from file {}");
        org.junit.Assert.assertNotNull(config0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str3, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.networknt.config.Config config0 = com.networknt.config.Config.getInstance();
        java.lang.String str3 = config0.getStringFromFile("def$g", "${password:abc$defg}");
        java.lang.String str6 = config0.getStringFromFile("", "${password:abc$defg}");
        org.junit.Assert.assertNotNull(config0);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n" + "'", str6, ".git\n.gitattributes\n.gitignore\n.travis.yml\naudit\nbalance\nbasic-auth\nbody\nCHANGELOG.md\nclient\ncluster\ncom\ncommon\nconfig\nconsul\ncontent\ncorrelation\ncors\ndata-source\ndecryptor\nderef-token\ndump\negress-router\nemail-sender\nencode-decode\nexception\nhandler\nheader\nhealth\nhttp-entity\nhttp-string\nhttp-url\ninfo\ningress-proxy\nip-whitelist\njaeger-tracing\nLICENSE\nlogger-config\nmask\nmetrics\nmonad-result\nNOTICE\npom.xml\nportal-registry\nprometheus\nrate-limit\nREADME.md\nregistry\nresource\nsanitizer\nsecurity\nserver\nservice\nstatus\nswitcher\ntarget\ntraceability\nutility\n");
    }
}
