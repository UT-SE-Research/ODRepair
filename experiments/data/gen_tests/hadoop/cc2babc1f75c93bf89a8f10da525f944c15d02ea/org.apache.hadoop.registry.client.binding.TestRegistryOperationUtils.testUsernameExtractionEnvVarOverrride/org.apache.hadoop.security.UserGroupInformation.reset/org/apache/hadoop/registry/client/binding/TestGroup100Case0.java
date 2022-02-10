package org.apache.hadoop.registry.client.binding;

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
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.token.delegation.web.HttpUserGroupInformation.get();
        org.junit.Assert.assertNull(userGroupInformation0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("", userGroupInformation4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.ipc.Server.getRemoteUser();
        org.junit.Assert.assertNull(userGroupInformation0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Group Ids:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        javax.security.auth.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getUGIFromSubject(subject0);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.security.KerberosAuthException; message:  Subject must not be null");
        } catch (org.apache.hadoop.security.KerberosAuthException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.apache.hadoop.security.UserGroupInformation.reset();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("There is no primary group for UGI", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Failed to get groups for user {}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Reading credentials from location {}", "login must be done first");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Provided Subject must contain a KerberosPrincipal", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Null user", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hadoop.token.files", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Not attempting to re-login since the last re-login was attempted less than", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getLoginUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Token file {} does not exist", userGroupInformation1);
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("UGI loginUser: {}");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Loaded {} base64 tokens", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hbase@HADOOP.APACHE.ORG", "hadoop.kerberos.kinit.command");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Cannot add token {}: {}", "Getting UGI from keytab....");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = userGroupInformation0.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertNull(userGroupInformation1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.kerberos.min.seconds.before.relogin");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("hadoop.kerberos.keytab.login.autorenewal.enabled", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.NTUserPrincipal", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("loginUserFromKeyTab must be done first", "Not attempting to re-login since the last re-login was attempted less than");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Null user", "com.sun.security.auth.module.UnixLoginModule");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of", "hbase user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("hadoop.kerberos.min.seconds.before.relogin", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("]:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Real", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating logout for {}", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation6.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Not attempting to re-login since the last re-login was attempted less than", "Provided Subject must contain a KerberosPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Logout failure");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("User:", "latency");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Groups:");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI(")", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Real", "Windows");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Groups:", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("via", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("using keytab file", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hadoop.kerberos.min.seconds.before.relogin", "Subject does not contain a valid User");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("com.sun.security.auth.NTUserPrincipal", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("UGI:");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Initiating logout for {}", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.sun.security.auth.UnixPrincipal", "Keytab");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Failure to load login credentials", "Warning, no kerberos ticket found while attempting to renew ticket");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("com.sun.security.auth.NTUserPrincipal", "Reading credentials from location {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("s", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("", "hadoop.token.files");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Loaded {} tokens from {}", "Subject must not be null");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hadoop.tokens", "Initiating re-login for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Getting UGI from keytab....");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Getting UGI from keytab....", "PrivilegedActionException as: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hi!", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Logout successful for user");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Failed to get groups for user {}", "Initiating logout for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Current", "+token: {} -> {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("latency");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("s", "krbtgt");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Get groups", "Getting UGI from keytab....");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("", "login must be done first");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Token file {} does not exist", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Not attempting to re-login since the last re-login was attempted less than", "Unable to find JAAS classes:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("login must be done first", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Subject does not contain a valid User", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Unable to find JAAS classes:", "com.ibm.security.auth.module.JAASLoginModule");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating logout for {}", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("", userGroupInformation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "Keytab");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Windows", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Groups:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Loaded {} base64 tokens");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("com.ibm.security.auth.module.JAASLoginModule", "hbase user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation2);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNull(userGroupInformation4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Logout failure", "Loaded {} tokens from {}");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("drwho", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "com.sun.security.auth.UnixPrincipal");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Getting UGI for current user");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hbase", "com.sun.security.auth.module.NTLoginModule");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Failed to get groups for user {}");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache(")", "Real");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("+token: {} -> {}", "PrivilegedActionException with no underlying cause. UGI [");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("ops", "Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("via");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("destroy ticket failed", userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("PrivilegedActionException as: {}", "UGI:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login failure", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("os.name", "hbase");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hbase", "com.sun.security.auth.module.UnixLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hbase", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Subject must not be null", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("UGI:", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Null real user", "Null user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Login");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.sun.security.auth.NTUserPrincipal", "Windows");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.NTUserPrincipal", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("User:", "seconds before. Last Login=");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Unable to find JAAS classes:");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("kinit", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation4.getRealUser();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("+token: {} -> {}", userGroupInformation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNull(userGroupInformation7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Cannot add token {}: {}", "hbase");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Null real user", ")");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("seconds before. Last Login=", "destroy ticket failed");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Loaded {} base64 tokens", "seconds before. Last Login=");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("UGI loginUser: {}", "Cannot add token {}: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("kinit", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("kinit", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("ops", "Failure to load login credentials");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Subject does not contain a valid User", "Loaded {} tokens from {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("+token: {} -> {}", "Current");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("]:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("PrivilegedActionException with no underlying cause. UGI [", userGroupInformation2);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNull(userGroupInformation4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Reading credentials from location {}", "Group Ids:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
        org.junit.Assert.assertNull(userGroupInformation4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getLoginUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.UsernamePrincipal", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.NTUserPrincipal", userGroupInformation4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("", userGroupInformation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Failure to load login credentials", "com.sun.security.auth.NTUserPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("User:", "com.sun.security.auth.module.UnixLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Getting UGI for current user", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("", "com.ibm.security.auth.module.JAASLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("(auth:", "Subject does not contain a valid User");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.kerberos.kinit.command", "Getting UGI from keytab....");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Subject does not contain a valid User", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "Unable to find JAAS classes:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating logout for {}", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Loaded {} base64 tokens", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation4.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNull(userGroupInformation7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Keytab:", ")");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Provided Subject must contain a KerberosPrincipal", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Token file {} does not exist", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Ticket is already destroyed, remove it.", "Loaded {} tokens from {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Failed to get groups for user {}", "latency");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Loaded {} base64 tokens", "Token file {} does not exist");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Real", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("seconds before. Last Login=", "UGI loginUser: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("(auth:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Getting UGI from keytab....", "using keytab file");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("PrivilegedActionException as: {}", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Keytab", "hbase");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Login failure", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("PrivilegedAction [as: {}][action: {}]", "using keytab file");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Initiating logout for {}", "destroy ticket failed");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("ops", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation4.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("os.name");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hi!", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("com.sun.security.auth.NTUserPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation1.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Cannot add token {}: {}", "hadoop.kerberos.min.seconds.before.relogin");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hadoop.tokens", "Unable to find JAAS classes:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Subject must not be null", "Initiating logout for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("hbase", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("", "Not attempting to re-login since the last re-login was attempted less than");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("PrivilegedActionException with no underlying cause. UGI [", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("latency", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hbase", "Failure to load login credentials");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hbase user", "Subject does not contain a valid User");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hadoop.kerberos.keytab.login.autorenewal.enabled", "There is no primary group for UGI");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("User:");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getLoginUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.UsernamePrincipal", userGroupInformation1);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.kerberos.min.seconds.before.relogin", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Unable to find JAAS classes:", "Provided Subject must contain a KerberosPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("There is no primary group for UGI", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("", "com.sun.security.auth.module.NTLoginModule");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Keytab:");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("s", "hadoop.kerberos.keytab.login.autorenewal.enabled");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("There is no primary group for UGI");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Login", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Getting UGI for current user", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("latency", "Getting UGI from keytab....");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Warning, no kerberos ticket found while attempting to renew ticket");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Loaded {} tokens from {}", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "Keytab");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hadoop.kerberos.kinit.command", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("s", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Initiating re-login for {}", "Current");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Windows");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Keytab", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Auth method", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Failure to load login credentials", "Not attempting to re-login since the last re-login was attempted less than");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Provided Subject must contain a KerberosPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hadoop.user.group.metrics.percentiles.intervals", "s");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("PrivilegedActionException as: {}", "failure to login:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Groups:", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser(")", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.module.UnixLoginModule", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation9 = userGroupInformation5.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
        org.junit.Assert.assertNull(userGroupInformation9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Real", "com.ibm.security.auth.module.JAASLoginModule");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Logout failure", "via");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("drwho", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation4.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("loginUserFromKeyTab must be done first", "Reading credentials from location {}");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation4.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Auth method", "krbtgt");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("seconds before. Last Login=", "os.name");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("loginUserFromKeyTab must be done first", "krbtgt");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Provided Subject must contain a KerberosPrincipal", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("failure to login:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.kerberos.min.seconds.before.relogin", "The first kerberos ticket is not TGT(the server principal is {}), remove and destroy it.");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Warning, no kerberos ticket found while attempting to renew ticket", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Keytab:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("UGI:", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("]:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation2);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation5.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNull(userGroupInformation6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hbase user", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hbase", "Auth method");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("", userGroupInformation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Logout successful for user", "Failed to get groups for user {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("PrivilegedAction [as: {}][action: {}]", "Cannot add token {}: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.sun.security.auth.UnixPrincipal", "os.name");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.module.UnixLoginModule", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("UGI loginUser: {}", "Keytab:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Cannot add token {}: {}", "(auth:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("via", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("", "hadoop.user.group.metrics.percentiles.intervals");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("destroy ticket failed", "Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Subject must not be null", ")");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("latency", "Logout successful for user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null user", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Keytab:", "Auth method");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "The first kerberos ticket is not TGT(the server principal is {}), remove and destroy it.");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.UnixPrincipal", userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("com.ibm.security.auth.UsernamePrincipal", "seconds before. Last Login=");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hbase");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Subject does not contain a valid User", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hadoop.kerberos.min.seconds.before.relogin", "s");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("using keytab file");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Subject must not be null", "Groups:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("]:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.user.group.metrics.percentiles.intervals", "Initiating re-login for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Keytab", "]:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hadoop.kerberos.kinit.command", "Getting UGI from keytab....");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Reading credentials from location {}", "latency");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.sun.security.auth.UnixPrincipal", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("", "Real");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("loginUserFromKeyTab must be done first", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("There is no primary group for UGI", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Subject must not be null", userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Real", "Groups:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("kinit", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("latency", userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.tokens");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("ops", "hbase@HADOOP.APACHE.ORG");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("UGI loginUser: {}", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("hadoop.token.files", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("+token: {} -> {}", "Failed to get groups for user {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("PrivilegedActionException as: {}", "Problem with Kerberos auth_to_local name configuration");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("+token: {} -> {}", "drwho");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("hbase user", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("kinit", "via");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hi!", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("ops", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("PrivilegedActionException as: {}", "");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("com.ibm.security.auth.UsernamePrincipal", "Null real user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("", "com.ibm.security.auth.module.JAASLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Logout failure", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Keytab:", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Initiating logout for {}", "hbase");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hi!", "drwho");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Failed to get groups for user {}", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Get groups", "hadoop.tokens");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.module.UnixLoginModule", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating re-login for {}", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Subject does not contain a valid User", "Keytab");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("UGI loginUser: {}", "UGI loginUser: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("login must be done first", "com.ibm.security.auth.UsernamePrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hbase user", "Real");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Keytab:", "Logout successful for user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("com.ibm.security.auth.UsernamePrincipal", "Current");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Getting UGI for current user", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.module.NTLoginModule", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Real", "Get groups");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("", "seconds before. Last Login=");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("via");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Getting UGI from keytab....", "loginUserFromKeyTab must be done first");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Loaded {} tokens from {}", "");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Loaded {} base64 tokens", "seconds before. Last Login=");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Real", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation5.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.sun.security.auth.UnixPrincipal", "hbase");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Groups:", "hadoop.user.group.metrics.percentiles.intervals");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation3.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNull(userGroupInformation5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("loginUserFromKeyTab must be done first", "hadoop.user.group.metrics.percentiles.intervals");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Get groups", "ops");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("", "com.ibm.security.auth.module.JAASLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Logout failure", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation6.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("via");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Groups:", userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Token file {} does not exist");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("User:", "Windows");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Logout failure", "Failed to get groups for user {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Current", "There is no primary group for UGI");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("The first kerberos ticket is not TGT(the server principal is {}), remove and destroy it.", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("User:", "hadoop.kerberos.kinit.command");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null real user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.user.group.metrics.percentiles.intervals");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("com.ibm.security.auth.module.JAASLoginModule", "kinit");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.user.group.metrics.percentiles.intervals", "PrivilegedActionException as: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Token file {} does not exist", "hadoop.tokens");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("using keytab file", "(auth:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "Keytab");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("loginUserFromKeyTab must be done first", "Current");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("]:", "Current");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hadoop.token.files", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("com.ibm.security.auth.UsernamePrincipal", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Problem with Kerberos auth_to_local name configuration", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "latency");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Logout failure", "hbase");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Initiating logout for {}", "hadoop.kerberos.kinit.command");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("com.sun.security.auth.UnixPrincipal", "ops");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Subject must not be null", "Loaded {} tokens from {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("krbtgt", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Subject must not be null", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("]:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation2);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation3.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Warning, no kerberos ticket found while attempting to renew ticket", "s");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Real", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Not attempting to re-login since the last re-login was attempted less than", "Warning, no kerberos ticket found while attempting to renew ticket");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("", "drwho");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.token.files");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Problem with Kerberos auth_to_local name configuration");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Loaded {} base64 tokens", "seconds before. Last Login=");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Real", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation6.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = userGroupInformation7.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("seconds before. Last Login=", "hadoop.kerberos.keytab.login.autorenewal.enabled");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Keytab:", ")");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Provided Subject must contain a KerberosPrincipal", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation5.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation5.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Auth method", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("os.name", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Subject does not contain a valid User");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.ibm.security.auth.module.JAASLoginModule", "]:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Subject does not contain a valid User", "Real");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("destroy ticket failed", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Windows", "s");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Null user", "com.sun.security.auth.NTUserPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("drwho", "com.ibm.security.auth.module.JAASLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("(auth:", "Failure to load login credentials");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("UGI:", "hi!");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Logout successful for user", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Provided Subject must contain a KerberosPrincipal", "Loaded {} tokens from {}");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of", "Initiating logout for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("UGI loginUser: {}", "Keytab");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("com.sun.security.auth.NTUserPrincipal", "Group Ids:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("PrivilegedActionException as: {}", "com.sun.security.auth.NTUserPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.ibm.security.auth.module.JAASLoginModule", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null user");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("latency", "User:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("failure to login:", "hbase");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Null real user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null real user", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("ops", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Getting UGI from keytab....", userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hbase@HADOOP.APACHE.ORG");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating logout for {}", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation5.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hadoop.kerberos.kinit.command", userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("+token: {} -> {}", "Warning, no kerberos ticket found while attempting to renew ticket");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Loaded {} base64 tokens", "seconds before. Last Login=");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation6);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Real", userGroupInformation7);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation9 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Reading credentials from location {}", userGroupInformation7);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation10 = userGroupInformation7.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation11 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("PrivilegedActionException as: {}", userGroupInformation10);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
        org.junit.Assert.assertNotNull(userGroupInformation9);
        org.junit.Assert.assertNotNull(userGroupInformation10);
        org.junit.Assert.assertNotNull(userGroupInformation11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hbase@HADOOP.APACHE.ORG", "latency");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hadoop.tokens", "hadoop.kerberos.min.seconds.before.relogin");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("com.sun.security.auth.module.UnixLoginModule", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("seconds before. Last Login=", "Logout successful for user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("s");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Auth method");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Auth method", "Get groups");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "login must be done first");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hadoop.kerberos.min.seconds.before.relogin", "Login failure");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("]:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("PrivilegedActionException with no underlying cause. UGI [", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation5.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Current", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation9 = userGroupInformation8.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
        org.junit.Assert.assertNotNull(userGroupInformation9);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("os.name", "hbase@HADOOP.APACHE.ORG");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Cannot add token {}: {}", "Subject must not be null");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Keytab:", ")");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Getting UGI for current user", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation3.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNull(userGroupInformation5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("PrivilegedActionException with no underlying cause. UGI [", "Real");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("seconds before. Last Login=");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("login must be done first");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Real");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Unable to find JAAS classes:", "hadoop.tokens");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating logout for {}", userGroupInformation6);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Loaded {} base64 tokens", userGroupInformation6);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation9 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation6);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation10 = userGroupInformation9.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation11 = userGroupInformation10.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation12 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Reading credentials from location {}", userGroupInformation10);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
        org.junit.Assert.assertNotNull(userGroupInformation9);
        org.junit.Assert.assertNotNull(userGroupInformation10);
        org.junit.Assert.assertNull(userGroupInformation11);
        org.junit.Assert.assertNotNull(userGroupInformation12);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("os.name", "s");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of", "Logout failure");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("using keytab file", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Logout failure", "+token: {} -> {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("UGI loginUser: {}", "+token: {} -> {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("PrivilegedAction [as: {}][action: {}]");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Login", userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("hadoop.token.files", "Loaded {} tokens from {}");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Login successful for user {} using keytab file {}. Keytab auto renewal enabled : {}", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Initiating logout for {}", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Loaded {} base64 tokens", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation8 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation5);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation9 = userGroupInformation8.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation10 = userGroupInformation8.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertNotNull(userGroupInformation8);
        org.junit.Assert.assertNotNull(userGroupInformation9);
        org.junit.Assert.assertNotNull(userGroupInformation10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hbase", "com.sun.security.auth.module.UnixLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hbase", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation4.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Null user", userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Logout failure", "via");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("drwho", userGroupInformation4);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hi!", userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("]:", "Groups:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("com.sun.security.auth.UnixPrincipal", "os.name");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Not attempting to re-login since the last re-login was attempted less than", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("failure to login:", "Cannot add token {}: {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("(auth:");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("hadoop.token.files", "Getting UGI for current user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("]:", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("login must be done first", "Login");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Cannot add token {}: {}", "Not attempting to re-login since the last re-login was attempted less than");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Initiating re-login for {}", "User:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Loaded {} base64 tokens", "Token file {} does not exist");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("s", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Logout failure", "Logout successful for user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.module.UnixLoginModule", userGroupInformation1);
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("os.name", "s");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("PrivilegedActionException with no underlying cause. UGI [");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getLoginUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.UsernamePrincipal", userGroupInformation2);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.NTUserPrincipal", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation3.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = userGroupInformation3.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertNotNull(userGroupInformation7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Null real user", "Current");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("s", "Logout failure");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("destroy ticket failed");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("PrivilegedActionException as: {}", userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Getting UGI from keytab....", "Auth method");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Getting UGI from keytab....", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("kinit", "Groups:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("The first kerberos ticket is not TGT(the server principal is {}), remove and destroy it.", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Windows");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = userGroupInformation1.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNull(userGroupInformation2);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Provided Subject must contain a KerberosPrincipal", "Subject must not be null");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
        org.junit.Assert.assertNull(userGroupInformation4);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("loginUserFromKeyTab must be done first", "hbase user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Token file {} does not exist", "+token: {} -> {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Failed to get groups for user {}", "Reading credentials from location {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Initiating logout for {}", "drwho");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Logout failure", "User:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("Initiating re-login for {}", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Logout successful for user", "Token file {} does not exist");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.sun.security.auth.module.NTLoginModule", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Failed to get groups for user {}", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Keytab", "using keytab file");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Logout successful for user", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("]:", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Unable to find JAAS classes:", "Getting UGI for current user");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Loaded {} tokens from {}", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("Login failure");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Loaded {} tokens from {}", userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("loginUserFromKeyTab must be done first", "User:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hbase@HADOOP.APACHE.ORG", "com.ibm.security.auth.module.JAASLoginModule");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Login", "Failure to load login credentials");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNull(userGroupInformation3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Login", "(auth:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("Null real user", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("hi!", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation4.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("The first kerberos ticket is not TGT(the server principal is {}), remove and destroy it.", "Initiating logout for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("kinit", "Warning, no kerberos ticket found while attempting to renew ticket");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("]:", "Logout failure");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Initiating logout for {}", "Unable to find JAAS classes:");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("drwho");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("kinit", userGroupInformation3);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Warning, no kerberos ticket found while attempting to renew ticket", userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("via", "latency");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("The first kerberos ticket is not TGT(the server principal is {}), remove and destroy it.", "(auth:");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("Real", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("seconds before. Last Login=", "Logout successful for user");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser("There is no primary group for UGI", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Subject must not be null", "ops");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.registry.RegistryTestHelper.loginUGI("loginUserFromKeyTab must be done first", file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

