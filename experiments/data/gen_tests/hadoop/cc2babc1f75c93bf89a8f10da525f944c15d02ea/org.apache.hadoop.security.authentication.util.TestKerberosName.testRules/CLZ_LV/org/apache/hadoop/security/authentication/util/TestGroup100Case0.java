package org.apache.hadoop.security.authentication.util;

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
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 0, 100]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("joe");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean0 = org.apache.hadoop.security.authentication.util.KerberosName.hasRuleMechanismBeenSet();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.MECHANISM_HADOOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop" + "'", str0, "hadoop");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        boolean boolean0 = org.apache.hadoop.security.authentication.util.KerberosName.hasRulesBeenSet();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDefaultRealm();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: KrbException: Cannot locate default realm");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.slf4j.ILoggerFactory iLoggerFactory0 = org.slf4j.LoggerFactory.getILoggerFactory();
        org.junit.Assert.assertNotNull(iLoggerFactory0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.apache.hadoop.security.authentication.util.KerberosUtil kerberosUtil0 = new org.apache.hadoop.security.authentication.util.KerberosUtil();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 10, 1, 0]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.ietf.jgss.Oid oid0 = org.apache.hadoop.security.authentication.util.KerberosUtil.NT_GSS_KRB5_PRINCIPAL_OID;
        org.junit.Assert.assertNotNull(oid0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1, 1]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.ietf.jgss.Oid oid0 = org.apache.hadoop.security.authentication.util.KerberosUtil.GSS_KRB5_MECH_OID;
        org.junit.Assert.assertNotNull(oid0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("root");
        java.lang.Class<?> wildcardClass2 = badFormatString1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.DEFAULT_MECHANISM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop" + "'", str0, "hadoop");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosUtil.getLocalHostName();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x1carbon" + "'", str0, "x1carbon");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = org.slf4j.Logger.ROOT_LOGGER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOT" + "'", str0, "ROOT");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.ietf.jgss.Oid oid0 = org.apache.hadoop.security.authentication.util.KerberosUtil.GSS_SPNEGO_MECH_OID;
        org.junit.Assert.assertNotNull(oid0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("Checking");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        javax.security.auth.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.hadoop.security.authentication.util.KerberosUtil.hasKerberosKeyTab(subject0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.MECHANISM_MIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mit" + "'", str0, "mit");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("short name incorrect");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: short name incorrect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Joe@FOO.COM", "hdfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Joe@FOO.COM/hdfs" + "'", str2, "Joe@FOO.COM/hdfs");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDefaultRealmProtected();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("Kerberos krb5 configuration not found, setting default realm to empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: Kerberos krb5 configuration not found, setting default realm to empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("Joe@FOO.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: Joe@FOO.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.getRules();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.apache.hadoop.security.authentication.util.KerberosName.resetDefaultRealm();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule2 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("mit");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString3 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("g", (java.lang.Throwable) noMatchingRule2);
        java.lang.String str4 = badFormatString3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g" + "'", str4, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("localhost:88");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: localhost:88");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("guest");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.getRuleMechanism();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("HTTP");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("joe", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/joe");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 100, 10, -1]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("HTTP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: HTTP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule3 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("No rules applied to");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString4 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule3);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString5 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("INVALID_MECHANISM", (java.lang.Throwable) badFormatString4);
        java.lang.String str6 = badFormatString5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM" + "'", str6, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("hi!", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("HTTP");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        javax.security.auth.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.hadoop.security.authentication.util.KerberosUtil.hasKerberosTicket(subject0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule2 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("mit");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString3 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("g", (java.lang.Throwable) noMatchingRule2);
        java.lang.Class<?> wildcardClass4 = badFormatString3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.getDefaultRealm();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosUtil.getKrb5LoginModuleName();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "com.sun.security.auth.module.Krb5LoginModule" + "'", str0, "com.sun.security.auth.module.Krb5LoginModule");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("mit");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: mit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, 1]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Kerberos krb5 configuration not found, setting default realm to empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Kerberos krb5 configuration not found, setting default realm to empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule3 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("No rules applied to");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString4 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule3);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString5 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("INVALID_MECHANISM", (java.lang.Throwable) badFormatString4);
        java.lang.String str6 = badFormatString4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com" + "'", str6, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("([^$]*)($(d*))?", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/([^$]*)($(d*))?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("foo@ACME.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: foo@ACME.COM is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName:  is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("ROOT", "Checking");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ROOT/checking" + "'", str2, "ROOT/checking");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("No rules applied to", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/No rules applied to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.apache.hadoop.classification.InterfaceStability interfaceStability0 = new org.apache.hadoop.classification.InterfaceStability();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("java.security.krb5.realm");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: java.security.krb5.realm");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("Checking bad translation for");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: Checking bad translation for");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("No rules applied to");
        java.lang.Class<?> wildcardClass2 = noMatchingRule1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("No rules applied to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: No rules applied to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("to", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("hdfs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/hdfs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Malformed Kerberos name:");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Malformed Kerberos name: is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("omalley@");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: omalley@");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("omalley@");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed Kerberos name: omalley@");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("Joe@FOO.COM/hdfs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed Kerberos name: Joe@FOO.COM/hdfs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("to ensure it is bad.");
        org.slf4j.Marker marker2 = null;
        boolean boolean3 = logger1.isTraceEnabled(marker2);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("Joe@FOO.COM/hdfs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: Joe@FOO.COM/hdfs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, 100, -1, 0]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("g");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("Invalid rule:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: Invalid rule:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Invalid rule:", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Invalid rule:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("ROOT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/ROOT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("com.sun.security.auth.module.Krb5LoginModule");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: com.sun.security.auth.module.Krb5LoginModule is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("@");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/@");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 100, 100, 100]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("hadoop");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("oom", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/oom");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule3 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("mit");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString4 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("g", (java.lang.Throwable) noMatchingRule3);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString5 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule3);
        java.lang.Class<?> wildcardClass6 = noMatchingRule3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("foo@ACME.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: foo@ACME.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("java.security.krb5.kdc");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("auth_to_local rule mechanism not set.Using default of hadoop");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/auth_to_local rule mechanism not set.Using default of hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("@");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: @");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("ROOT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: ROOT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("hadoop", "Joe@FOO.COM");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Translate", "x1carbon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Translate/x1carbon" + "'", str2, "Translate/x1carbon");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Checking bad translation for");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Checking bad translation for");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("Invalid rule:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: Invalid rule:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("Joe@FOO.COM");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("foo@ACME.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: foo@ACME.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("", "java.security.krb5.kdc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/java.security.krb5.kdc" + "'", str2, "/java.security.krb5.kdc");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 1, 0, 10]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Translate/x1carbon", "to");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Translate/x1carbon/to" + "'", str2, "Translate/x1carbon/to");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("Malformed Kerberos name:");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.realm");
        java.lang.String str2 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.security.krb5.realm" + "'", str2, "java.security.krb5.realm");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("joe");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("foo@ACME.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/foo@ACME.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("Checking bad translation for");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("HTTP", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/HTTP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("localhost:88");
        java.lang.Throwable[] throwableArray2 = noMatchingRule1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("x1carbon");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("Malformed Kerberos name:");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("com.sun.security.auth.module.Krb5LoginModule");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/com.sun.security.auth.module.Krb5LoginModule");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Translate/x1carbon", "oom@YAHOO.COM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Translate/x1carbon/oom@yahoo.com@yahoo.com" + "'", str2, "Translate/x1carbon/oom@yahoo.com@yahoo.com");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("/java.security.krb5.kdc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: /java.security.krb5.kdc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("g");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("mit", "to");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit/to" + "'", str2, "mit/to");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("com.sun.security.auth.module.Krb5LoginModule");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("mit/to");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Malformed Kerberos name:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Malformed Kerberos name:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("ROOT/checking");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/ROOT/checking");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -1, 1, -1]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: HTTP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: HTTP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("L");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("No rules applied to");
        java.lang.String str2 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "No rules applied to" + "'", str2, "No rules applied to");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("guest");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: guest is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("to ensure it is bad.");
        org.slf4j.Marker marker2 = null;
        boolean boolean3 = logger1.isErrorEnabled(marker2);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("No rules applied to");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("ROOT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: ROOT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, 0, 1]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("HTTP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: HTTP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("didn't get exception for");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Invalid rule:");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Malformed Kerberos name:");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("L", "com.sun.security.auth.module.Krb5LoginModule");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L/com.sun.security.auth.module.krb5loginmodule" + "'", str2, "L/com.sun.security.auth.module.krb5loginmodule");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("short name incorrect");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("Invalid rule:");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("hadoop");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("to");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("hdfs");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, -1, 100, 1]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("No rules applied to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/No rules applied to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Checking bad translation for", "omalley");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Checking bad translation for/omalley" + "'", str2, "Checking bad translation for/omalley");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hdfs");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("L");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hadoop");
        org.slf4j.Marker marker2 = null;
        boolean boolean3 = logger1.isDebugEnabled(marker2);
        java.lang.String str4 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hadoop" + "'", str4, "hadoop");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Checking bad translation for/omalley", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Checking bad translation for/omalley");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("foo@ACME.COM");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ACME.COM" + "'", str1, "ACME.COM");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("([^$]*)($(d*))?");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/([^$]*)($(d*))?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("x1carbon");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/x1carbon");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.apache.hadoop.security.authentication.util.KerberosName.setRules("");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("mit");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 0, 100, -1]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("INVALID_MECHANISM", "ROOT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INVALID_MECHANISM/root" + "'", str2, "INVALID_MECHANISM/root");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Translate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Translate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("oom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: oom");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Invalid rule:");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Invalid rule: is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -1, 0]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("mit");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("abc.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: abc.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("x1carbon");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: x1carbon");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hdfs");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("INVALID_MECHANISM/root");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("INVALID_MECHANISM/root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: INVALID_MECHANISM/root");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("g");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "g" + "'", str3, "g");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("INVALID_MECHANISM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: INVALID_MECHANISM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed Kerberos name: @");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("hdfs");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: hdfs is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Invalid rule mechanism:");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Invalid rule mechanism: is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("mit/to", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/mit/to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("INVALID_MECHANISM/root");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: INVALID_MECHANISM/root is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("Translate/x1carbon/oom@yahoo.com@yahoo.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: Translate/x1carbon/oom@yahoo.com@yahoo.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("short name incorrect");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: short name incorrect is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("Checking bad translation for");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule6 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("No rules applied to");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString7 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule6);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString8 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("INVALID_MECHANISM", (java.lang.Throwable) badFormatString7);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString9 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("Malformed Kerberos name:", (java.lang.Throwable) badFormatString7);
        badFormatString1.addSuppressed((java.lang.Throwable) badFormatString9);
        java.lang.String str11 = badFormatString1.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for" + "'", str11, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 1, 1, -1]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: guest");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, -1, 0, 1, 1]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("joe", "short name incorrect");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe/short name incorrect" + "'", str2, "joe/short name incorrect");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("L/com.sun.security.auth.module.krb5loginmodule");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("hdfs");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("root");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("abc.com");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: abc.com is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("auth_to_local rule mechanism not set.Using default of hadoop");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: auth_to_local rule mechanism not set.Using default of hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 100, 100, 0]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("joe/short name incorrect");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: HTTP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: HTTP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("ACME.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/ACME.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: HTTP");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("Checking bad translation for/omalley");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 0, 0]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("mit/to");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: @ is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("hadoop");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Checking bad translation for", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Checking bad translation for");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("guest", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/guest");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("com.sun.security.auth.module.Krb5LoginModule", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/com.sun.security.auth.module.Krb5LoginModule");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("/java.security.krb5.kdc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: /java.security.krb5.kdc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("java.security.krb5.kdc", "INVALID_MECHANISM/root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.security.krb5.kdc/invalid_mechanism/root" + "'", str2, "java.security.krb5.kdc/invalid_mechanism/root");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 1, 1, 100]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("localhost:88");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("No rules applied to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: No rules applied to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("com.sun.security.auth.module.Krb5LoginModule");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: com.sun.security.auth.module.Krb5LoginModule");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("INVALID_MECHANISM", "Invalid rule mechanism:");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INVALID_MECHANISM/invalid rule mechanism:" + "'", str2, "INVALID_MECHANISM/invalid rule mechanism:");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("INVALID_MECHANISM/root", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/INVALID_MECHANISM/root");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: HTTP");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("", "Translate/x1carbon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/translate/x1carbon" + "'", str2, "/translate/x1carbon");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("root");
        java.lang.Throwable[] throwableArray2 = badFormatString1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("Translate/x1carbon/to");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("EXAMPLE.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: EXAMPLE.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("java.security.krb5.kdc/invalid_mechanism/root");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "joe" + "'", str8, "joe");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getShortName();
        java.lang.String str9 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "joe" + "'", str8, "joe");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "joe" + "'", str9, "joe");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule2 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("hi!");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString3 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("hi!", (java.lang.Throwable) noMatchingRule2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("oom");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: ");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("abc.com");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule3 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("mit");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString4 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("g", (java.lang.Throwable) noMatchingRule3);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString5 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule3);
        java.lang.Throwable[] throwableArray6 = noMatchingRule3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Translate/x1carbon/oom@yahoo.com@yahoo.com", "ACME.COM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Translate/x1carbon/oom@yahoo.com@yahoo.com/acme.com" + "'", str2, "Translate/x1carbon/oom@yahoo.com@yahoo.com/acme.com");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Translate/x1carbon");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Translate/x1carbon");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Translate/x1carbon/oom@yahoo.com@yahoo.com/acme.com");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Translate/x1carbon");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Translate/x1carbon is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule3 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("Joe@FOO.COM/hdfs");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString4 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("com.sun.security.auth.module.Krb5LoginModule", (java.lang.Throwable) noMatchingRule3);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString5 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("java.security.krb5.kdc/invalid_mechanism/root", (java.lang.Throwable) badFormatString4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("omalley@");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Translate/x1carbon/oom@yahoo.com@yahoo.com");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Translate/x1carbon/oom@yahoo.com@yahoo.com is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("EXAMPLE.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: EXAMPLE.COM is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("oom@YAHOO.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: oom@YAHOO.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Checking");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 1, 1, 100]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Malformed Kerberos name:", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Malformed Kerberos name:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("INVALID_MECHANISM/root");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule2 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("localhost:88");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString3 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: ", (java.lang.Throwable) noMatchingRule2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 1, 1, -1]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("INVALID_MECHANISM/root");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("root");
        java.lang.Throwable[] throwableArray2 = noMatchingRule1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("java.security.krb5.kdc/invalid_mechanism/root", "x1carbon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.security.krb5.kdc/invalid_mechanism/root/x1carbon" + "'", str2, "java.security.krb5.kdc/invalid_mechanism/root/x1carbon");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("resetting default realm failed, current default realm will still be used.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: resetting default realm failed, current default realm will still be used.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("INVALID_MECHANISM/invalid rule mechanism:");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("com.sun.security.auth.module.Krb5LoginModule");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.sun.security.auth.module.Krb5LoginModule" + "'", str3, "com.sun.security.auth.module.Krb5LoginModule");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.sun.security.auth.module.Krb5LoginModule" + "'", str4, "com.sun.security.auth.module.Krb5LoginModule");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.sun.security.auth.module.Krb5LoginModule" + "'", str5, "com.sun.security.auth.module.Krb5LoginModule");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.sun.security.auth.module.Krb5LoginModule" + "'", str6, "com.sun.security.auth.module.Krb5LoginModule");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("/translate/x1carbon");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: /translate/x1carbon is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("Checking");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("HTTP");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("HTTP@EXAMPLE.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: HTTP@EXAMPLE.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("hadoop");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("com.sun.security.auth.module.Krb5LoginModule", "ROOT/checking");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.sun.security.auth.module.Krb5LoginModule/root/checking" + "'", str2, "com.sun.security.auth.module.Krb5LoginModule/root/checking");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("Translate/x1carbon/oom@yahoo.com@yahoo.com");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("x1carbon", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/x1carbon");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("to ensure it is bad.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: to ensure it is bad.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("L/com.sun.security.auth.module.krb5loginmodule");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: L/com.sun.security.auth.module.krb5loginmodule");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("Translate/x1carbon/to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: Translate/x1carbon/to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("@");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("foo@ACME.COM", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/foo@ACME.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("L/com.sun.security.auth.module.krb5loginmodule");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: L/com.sun.security.auth.module.krb5loginmodule is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("g");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Kerberos krb5 configuration not found, setting default realm to empty", "INVALID_MECHANISM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Kerberos krb5 configuration not found, setting default realm to empty/invalid_mechanism" + "'", str2, "Kerberos krb5 configuration not found, setting default realm to empty/invalid_mechanism");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 100, -1, 10]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("ROOT/checking");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: ROOT/checking is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("INVALID_MECHANISM");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("ROOT/checking", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/ROOT/checking");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, -1, 10]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("ROOT", "INVALID_MECHANISM/root");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ROOT/invalid_mechanism/root" + "'", str2, "ROOT/invalid_mechanism/root");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule5 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("mit");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString6 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("g", (java.lang.Throwable) noMatchingRule5);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString7 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule5);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString8 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("oom@YAHOO.COM", (java.lang.Throwable) badFormatString7);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString9 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("mit", (java.lang.Throwable) badFormatString8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.realm");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.security.krb5.realm" + "'", str3, "java.security.krb5.realm");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.security.krb5.realm" + "'", str4, "java.security.krb5.realm");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getShortName();
        java.lang.String str9 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "joe" + "'", str8, "joe");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Translate/x1carbon", "java.security.krb5.realm");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Translate/x1carbon/java.security.krb5.realm" + "'", str2, "Translate/x1carbon/java.security.krb5.realm");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("([^$]*)($(d*))?", "Translate/x1carbon");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "([^$]*)($(d*))?/translate/x1carbon" + "'", str2, "([^$]*)($(d*))?/translate/x1carbon");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("foo@ACME.COM");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Invalid rule mechanism:", "org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: No rules applied to");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid rule mechanism:/org.apache.hadoop.security.authentication.util.kerberosname$nomatchingrule: no rules applied to" + "'", str2, "Invalid rule mechanism:/org.apache.hadoop.security.authentication.util.kerberosname$nomatchingrule: no rules applied to");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("Checking");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: Checking");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("resetting default realm failed, current default realm will still be used.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("Kerberos krb5 configuration not found, setting default realm to empty/invalid_mechanism");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("x1carbon");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Kerberos krb5 configuration not found, setting default realm to empty/invalid_mechanism");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Kerberos krb5 configuration not found, setting default realm to empty/invalid_mechanism is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("localhost:88");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 0, 100, -1]");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("java.security.krb5.kdc/invalid_mechanism/root/x1carbon");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: java.security.krb5.kdc/invalid_mechanism/root/x1carbon is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("HTTP@EXAMPLE.COM");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("resetting default realm failed, current default realm will still be used.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/resetting default realm failed, current default realm will still be used.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("abc.com");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "abc.com" + "'", str2, "abc.com");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "abc.com" + "'", str3, "abc.com");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("java.security.krb5.kdc/invalid_mechanism/root", "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.security.krb5.kdc/invalid_mechanism/root/org.apache.hadoop.security.authentication.util.kerberosname$badformatstring: checking bad translation for" + "'", str2, "java.security.krb5.kdc/invalid_mechanism/root/org.apache.hadoop.security.authentication.util.kerberosname$badformatstring: checking bad translation for");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Translate/x1carbon/to", "Translate/x1carbon/to");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Translate/x1carbon/to/translate/x1carbon/to" + "'", str2, "Translate/x1carbon/to/translate/x1carbon/to");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.realm");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.security.krb5.realm" + "'", str3, "java.security.krb5.realm");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("ROOT");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("oom@YAHOO.COM");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: ");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: No rules applied to");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("abc.com");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "abc.com" + "'", str2, "abc.com");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.realm");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.security.krb5.realm" + "'", str4, "java.security.krb5.realm");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("HTTP");
        java.lang.String str2 = badFormatString1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: HTTP" + "'", str2, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: HTTP");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("");
        java.lang.String str2 = badFormatString1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: " + "'", str2, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: ");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("No rules applied to");
        java.lang.String str2 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("Checking bad translation for");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: Checking bad translation for is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.kdc/invalid_mechanism/root");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Translate/x1carbon/oom@yahoo.com@yahoo.com");
        java.lang.Throwable throwable3 = null;
        logger1.info("java.security.krb5.kdc/invalid_mechanism/root/x1carbon", throwable3);
        org.slf4j.Marker marker5 = null;
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule9 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("hadoop");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString10 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("EXAMPLE.COM", (java.lang.Throwable) noMatchingRule9);
        logger1.debug(marker5, "EXAMPLE.COM", (java.lang.Throwable) noMatchingRule9);
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("java.security.krb5.kdc/invalid_mechanism/root/org.apache.hadoop.security.authentication.util.kerberosname$badformatstring: checking bad translation for");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: java.security.krb5.kdc/invalid_mechanism/root/org.apache.hadoop.security.authentication.util.kerberosname$badformatstring: checking bad translation for");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, -1]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("L");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: L");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("ROOT/checking");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Translate/x1carbon/oom@yahoo.com@yahoo.com");
        boolean boolean2 = logger1.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("INVALID_MECHANISM");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: INVALID_MECHANISM is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("([^$]*)($(d*))?/translate/x1carbon");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit/to");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("@");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("didn't get exception for");
        java.lang.Throwable[] throwableArray2 = noMatchingRule1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Joe@FOO.COM");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
        java.lang.String str2 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g" + "'", str2, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: g");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.realm");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.security.krb5.realm" + "'", str4, "java.security.krb5.realm");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("ROOT/checking");
        java.lang.String str2 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ROOT" + "'", str2, "ROOT");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("ACME.COM");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, -1, 100, 1]");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("HTTP@EXAMPLE.COM");
        boolean boolean2 = logger1.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: INVALID_MECHANISM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("hdfs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: hdfs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("Invalid rule:");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Checking bad translation for/omalley");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Checking bad translation for/omalley");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("ACME.COM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: ACME.COM");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 100, 0, 0]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("guest");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule4 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("No rules applied to");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString5 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("abc.com", (java.lang.Throwable) noMatchingRule4);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString6 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("INVALID_MECHANISM", (java.lang.Throwable) badFormatString5);
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString7 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("Malformed Kerberos name:", (java.lang.Throwable) badFormatString5);
        java.lang.Throwable[] throwableArray8 = badFormatString5.getSuppressed();
        java.lang.String str9 = badFormatString5.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com" + "'", str9, "org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: abc.com");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("oom@YAHOO.COM", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "oom@YAHOO.COM/x1carbon" + "'", str2, "oom@YAHOO.COM/x1carbon");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("hi!");
        java.lang.Throwable[] throwableArray2 = noMatchingRule1.getSuppressed();
        java.lang.String str3 = noMatchingRule1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: hi!" + "'", str3, "org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: hi!");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hadoop");
        org.slf4j.Marker marker2 = null;
        boolean boolean3 = logger1.isDebugEnabled(marker2);
        org.slf4j.Marker marker4 = null;
        logger1.info(marker4, "@");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("", "No rules applied to");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/no rules applied to" + "'", str2, "/no rules applied to");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("ROOT");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("foo@ACME.COM", "HTTP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo@ACME.COM/http" + "'", str2, "foo@ACME.COM/http");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Invalid rule mechanism:");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("Translate/x1carbon/to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/Translate/x1carbon/to");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("Kerberos krb5 configuration not found, setting default realm to empty");
        java.lang.String str2 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Kerberos krb5 configuration not found, setting default realm to empty" + "'", str2, "Kerberos krb5 configuration not found, setting default realm to empty");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "joe" + "'", str7, "joe");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("java.security.krb5.kdc/invalid_mechanism/root");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: hadoop", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("localhost:88");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("/java.security.krb5.kdc");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        java.util.regex.Pattern pattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("com.sun.security.auth.module.Krb5LoginModule/root/checking", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/com.sun.security.auth.module.Krb5LoginModule/root/checking");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("INVALID_MECHANISM/invalid rule mechanism:");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("Invalid rule mechanism:/org.apache.hadoop.security.authentication.util.kerberosname$nomatchingrule: no rules applied to");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "joe" + "'", str4, "joe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.lang.String str1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getDomainRealm("auth_to_local rule mechanism not set.Using default of hadoop");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "joe" + "'", str2, "joe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("joe");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "joe" + "'", str3, "joe");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "joe" + "'", str5, "joe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "joe" + "'", str6, "joe");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("g", "org.apache.hadoop.security.authentication.util.KerberosName$NoMatchingRule: No rules applied to");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g/org.apache.hadoop.security.authentication.util.kerberosname$nomatchingrule: no rules applied to" + "'", str2, "g/org.apache.hadoop.security.authentication.util.kerberosname$nomatchingrule: no rules applied to");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("java.security.krb5.kdc/invalid_mechanism/root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/java.security.krb5.kdc/invalid_mechanism/root");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.security.authentication.util.KerberosUtil.getTokenServerName(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 100, 0, -1]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString badFormatString1 = new org.apache.hadoop.security.authentication.util.KerberosName.BadFormatString("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: HTTP");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("Malformed Kerberos name:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: Malformed Kerberos name:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("java.security.krb5.realm");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.security.krb5.realm" + "'", str3, "java.security.krb5.realm");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.security.krb5.realm" + "'", str4, "java.security.krb5.realm");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.security.krb5.realm" + "'", str5, "java.security.krb5.realm");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getPrincipalNames("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: HTTP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid keytab file: /home/anonymous/projects/tools/reseter-finder/exp/_downloads/hadoop/org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: HTTP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("INVALID_MECHANISM");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.lang.String str2 = org.apache.hadoop.security.authentication.util.KerberosUtil.getServicePrincipal("Invalid rule mechanism:", "foo@ACME.COM/http");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        // The following exception was thrown during execution in test generation
        try {
            org.ietf.jgss.Oid oid1 = org.apache.hadoop.security.authentication.util.KerberosUtil.getOidInstance("org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for");
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchFieldException; message: oidName: org.apache.hadoop.security.authentication.util.KerberosName$BadFormatString: Checking bad translation for is not supported.");
        } catch (java.lang.NoSuchFieldException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule noMatchingRule1 = new org.apache.hadoop.security.authentication.util.KerberosName.NoMatchingRule("@");
        java.lang.Throwable[] throwableArray2 = noMatchingRule1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }
}

