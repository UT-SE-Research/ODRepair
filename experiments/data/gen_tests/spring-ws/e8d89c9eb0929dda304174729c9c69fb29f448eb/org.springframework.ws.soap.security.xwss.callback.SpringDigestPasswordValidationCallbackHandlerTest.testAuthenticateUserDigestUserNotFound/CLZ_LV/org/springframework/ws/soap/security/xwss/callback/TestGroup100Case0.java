package org.springframework.ws.soap.security.xwss.callback;

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
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: [Assertion failed] - this state invariant must be true");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.springframework.util.Assert.notNull((java.lang.Object) (-1));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.springframework.core.SpringVersion.getVersion();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5.0.10.RELEASE" + "'", str0, "5.0.10.RELEASE");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.springframework.util.Assert.hasLength("kwNstEaiFOrI7B31j7GuETYvdgk=");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.springframework.util.Assert.isTrue(true, "disabled user authenticated");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("2006-06-01T23:48:42Z", "Bert", strSupplier2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) (byte) -1, strSupplier1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.springframework.util.Assert.state(true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray10, strSupplier13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.springframework.util.Assert.notNull((java.lang.Object) 0.0d, "2006-06-01T23:48:42Z");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.isTrue(true, strSupplier1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull((java.lang.Object) authentication2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(authentication2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.springframework.util.Assert.notNull((java.lang.Object) 10L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.springframework.util.Assert.hasLength("2006-06-01T23:48:42Z");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.springframework.util.Assert.hasLength("disabled user authenticated", "Authenticated");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.springframework.util.Assert.hasText("disabled user authenticated");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) (-1.0f), strSupplier1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        long long0 = org.springframework.security.core.SpringSecurityCoreVersion.SERIAL_VERSION_UID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 500L + "'", long0 == 500L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.springframework.util.Assert.doesNotContain("No Authentication created", "disabled user authenticated", "Authentication created");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.hasText("", strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.springframework.util.Assert.doesNotContain("", "Authentication created", "kwNstEaiFOrI7B31j7GuETYvdgk=");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.springframework.util.Assert.doesNotContain("Authentication created", "Not authenticated");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.hasText("", "Bert");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bert");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.Object[] objArray0 = null;
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notEmpty(objArray0, strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        log1.fatal((java.lang.Object) "Not authenticated");
        java.lang.Class<?> wildcardClass9 = log1.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray8, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier11);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray8, "Ernie");
        java.lang.Throwable throwable17 = null;
        log1.info((java.lang.Object) "Ernie", throwable17);
        boolean boolean19 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("Not authenticated", strSupplier1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.springframework.core.SpringVersion springVersion0 = new org.springframework.core.SpringVersion();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray10);
        java.util.function.Supplier<java.lang.String> strSupplier16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray10, strSupplier16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.springframework.util.Assert.notNull((java.lang.Object) "Ernie");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("9mdsYDCrjjYRur0rxzYt2oD7", strSupplier1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray8, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier11);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray8, "Ernie");
        java.lang.Throwable throwable17 = null;
        log1.info((java.lang.Object) "Ernie", throwable17);
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.isNull((java.lang.Object) throwable17, strSupplier19);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.springframework.util.Assert.isTrue(true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.springframework.util.Assert.hasLength("Authentication created");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = org.springframework.security.core.SpringSecurityCoreVersion.getVersion();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5.0.9.RELEASE" + "'", str0, "5.0.9.RELEASE");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.state(true, strSupplier1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("5.0.9.RELEASE", strSupplier1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("Authentication created", strSupplier1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.springframework.util.Assert.doesNotContain("Authenticated", "Not authenticated", "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) "hi!", strSupplier1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        org.springframework.util.Assert.noNullElements(objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        org.springframework.util.Assert.noNullElements(objArray6);
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier12);
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull((java.lang.Object) strSupplier12, strSupplier14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("disabled user authenticated", "Ernie", strSupplier2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this expression must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.springframework.util.Assert.hasText("Authentication created", "Not authenticated");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication5 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
        org.junit.Assert.assertNull(authentication5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.springframework.util.Assert.hasLength("disabled user authenticated");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.Log log13 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable15 = null;
        log13.fatal((java.lang.Object) (byte) 0, throwable15);
        log13.trace((java.lang.Object) '#');
        java.lang.Throwable throwable19 = null;
        log4.info((java.lang.Object) log13, throwable19);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) 1L, "kwNstEaiFOrI7B31j7GuETYvdgk=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: kwNstEaiFOrI7B31j7GuETYvdgk=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.springframework.util.Assert.hasLength("Big bird");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.springframework.util.Assert.hasLength("9mdsYDCrjjYRur0rxzYt2oD7");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.springframework.util.Assert.hasLength("Authenticated");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.springframework.util.Assert.doesNotContain("Authentication created", "Bert");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("No Authentication created", strSupplier1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.springframework.util.Assert.state(true, "Big bird");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) log1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        boolean boolean7 = log1.isTraceEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        org.springframework.util.Assert.noNullElements(objArray0, "No Authentication created");
        org.springframework.util.Assert.noNullElements(objArray0);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.springframework.util.Assert.state(true, "Ernie");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.springframework.util.Assert.doesNotContain("Bert", "Ernie");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        java.lang.Class<?> wildcardClass19 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("Bert", "5.0.9.RELEASE", strSupplier2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.springframework.util.Assert.hasLength("Bert");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        org.springframework.util.Assert.noNullElements(objArray10, "Big bird");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isFatalEnabled();
        java.lang.Throwable throwable4 = null;
        log1.warn((java.lang.Object) 1.0d, throwable4);
        org.apache.commons.logging.Log log7 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean8 = log7.isWarnEnabled();
        org.apache.commons.logging.Log log10 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable12 = null;
        log10.fatal((java.lang.Object) (byte) 0, throwable12);
        org.apache.commons.logging.LogFactory logFactory14 = org.apache.commons.logging.LogFactory.getFactory();
        log10.warn((java.lang.Object) logFactory14);
        java.lang.Throwable throwable16 = null;
        log7.debug((java.lang.Object) log10, throwable16);
        org.apache.commons.logging.LogFactory logFactory18 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass19 = logFactory18.getClass();
        log10.info((java.lang.Object) wildcardClass19);
        log1.error((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(logFactory14);
        org.junit.Assert.assertNotNull(logFactory18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.springframework.security.core.SpringSecurityCoreVersion springSecurityCoreVersion0 = new org.springframework.security.core.SpringSecurityCoreVersion();
        org.springframework.util.Assert.notNull((java.lang.Object) springSecurityCoreVersion0, "Not authenticated");
        org.springframework.util.Assert.notNull((java.lang.Object) springSecurityCoreVersion0, "5.0.9.RELEASE");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier15);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull((java.lang.Object) strSupplier15, "5.0.9.RELEASE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5.0.9.RELEASE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("Big bird", "kwNstEaiFOrI7B31j7GuETYvdgk=", strSupplier2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("kwNstEaiFOrI7B31j7GuETYvdgk=", strSupplier1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) "5.0.10.RELEASE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("disabled user authenticated", strSupplier1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        java.lang.Throwable throwable13 = null;
        log1.debug((java.lang.Object) "Bert", throwable13);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("5.0.9.RELEASE", "Bert", strSupplier2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isFatalEnabled();
        java.lang.Throwable throwable4 = null;
        log1.warn((java.lang.Object) 1.0d, throwable4);
        boolean boolean6 = log1.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log2 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable4 = null;
        log2.fatal((java.lang.Object) (byte) 0, throwable4);
        org.apache.commons.logging.LogFactory logFactory6 = org.apache.commons.logging.LogFactory.getFactory();
        log2.warn((java.lang.Object) logFactory6);
        log2.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray16, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier19);
        log2.trace((java.lang.Object) objArray16);
        boolean boolean22 = log2.isDebugEnabled();
        boolean boolean23 = securityContextImpl0.equals((java.lang.Object) log2);
        org.springframework.security.core.Authentication authentication24 = securityContextImpl0.getAuthentication();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(logFactory6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(authentication24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        boolean boolean2 = log1.isWarnEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray10, strSupplier15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) 1.0d, strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.springframework.util.Assert.hasLength("Authentication created", "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.springframework.util.Assert.hasLength("Not authenticated", "9mdsYDCrjjYRur0rxzYt2oD7");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = null;
        securityContextImpl1.setAuthentication(authentication8);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("No Authentication created", strSupplier1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.Object obj0 = null;
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull(obj0, strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.springframework.util.Assert.hasText("2006-06-01T23:48:42Z");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.springframework.util.Assert.hasText("Authenticated");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        org.springframework.util.Assert.notNull((java.lang.Object) log4, "Authentication created");
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        boolean boolean2 = log1.isInfoEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.springframework.util.Assert.hasLength("5.0.9.RELEASE");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.springframework.util.Assert.isTrue(true, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.springframework.util.Assert.doesNotContain("Ernie", "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        java.lang.String str7 = securityContextImpl1.toString();
        java.lang.String str8 = securityContextImpl1.toString();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.springframework.util.Assert.hasText("Bert");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "5.0.9.RELEASE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 5.0.9.RELEASE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.springframework.util.Assert.hasLength("hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "9mdsYDCrjjYRur0rxzYt2oD7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 9mdsYDCrjjYRur0rxzYt2oD7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isFatalEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) log1, "2006-06-01T23:48:42Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2006-06-01T23:48:42Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("5.0.10.RELEASE", strSupplier1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.springframework.util.Assert.isTrue(true, "Bert");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        org.springframework.util.Assert.notEmpty(objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.hasLength("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this String argument must have length; it must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) log4, strSupplier12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray6, strSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        boolean boolean5 = log1.isFatalEnabled();
        org.apache.commons.logging.Log log7 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable9 = null;
        log7.fatal((java.lang.Object) (byte) 0, throwable9);
        boolean boolean11 = log7.isFatalEnabled();
        java.lang.Throwable throwable13 = null;
        log7.trace((java.lang.Object) "Big bird", throwable13);
        java.lang.Throwable throwable15 = null;
        log1.fatal((java.lang.Object) "Big bird", throwable15);
        boolean boolean17 = log1.isTraceEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        java.lang.Throwable throwable8 = null;
        log1.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable8);
        boolean boolean10 = log1.isTraceEnabled();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray18, "Bert");
        java.lang.Object[] objArray21 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray21, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        org.springframework.util.Assert.noNullElements(objArray21, strSupplier24);
        java.util.function.Supplier<java.lang.String> strSupplier26 = null;
        org.springframework.util.Assert.noNullElements(objArray21, strSupplier26);
        java.util.function.Supplier<java.lang.String> strSupplier28 = null;
        org.springframework.util.Assert.noNullElements(objArray21, strSupplier28);
        log1.info((java.lang.Object) strSupplier28);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("9mdsYDCrjjYRur0rxzYt2oD7", strSupplier1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("Authenticated", "hi!", strSupplier2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        org.springframework.security.core.Authentication authentication15 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl16 = new org.springframework.security.core.context.SecurityContextImpl(authentication15);
        org.springframework.security.core.Authentication authentication17 = securityContextImpl16.getAuthentication();
        org.springframework.security.core.Authentication authentication18 = securityContextImpl16.getAuthentication();
        java.lang.Object[] objArray19 = new java.lang.Object[] { log4, authentication18 };
        org.springframework.util.Assert.notEmpty(objArray19, "No Authentication created");
        org.springframework.util.Assert.notEmpty(objArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.noNullElements(objArray19, "2006-06-01T23:48:42Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2006-06-01T23:48:42Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(authentication17);
        org.junit.Assert.assertNull(authentication18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("Ernie", strSupplier1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier15);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier13);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.springframework.util.Assert.doesNotContain("Authenticated", "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.springframework.util.Assert.doesNotContain("Ernie", "9mdsYDCrjjYRur0rxzYt2oD7");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        org.springframework.util.Assert.noNullElements(objArray6);
        org.springframework.util.Assert.notEmpty(objArray6);
        org.springframework.util.Assert.noNullElements(objArray6, "");
        org.springframework.util.Assert.noNullElements(objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("Authenticated", strSupplier1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        log1.fatal((java.lang.Object) "Not authenticated");
        boolean boolean9 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        org.springframework.security.core.Authentication authentication7 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl8 = new org.springframework.security.core.context.SecurityContextImpl(authentication7);
        org.springframework.security.core.Authentication authentication9 = securityContextImpl8.getAuthentication();
        org.springframework.security.core.Authentication authentication10 = securityContextImpl8.getAuthentication();
        java.lang.Throwable throwable11 = null;
        log1.error((java.lang.Object) securityContextImpl8, throwable11);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNull(authentication9);
        org.junit.Assert.assertNull(authentication10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.springframework.util.Assert.state(true, "kwNstEaiFOrI7B31j7GuETYvdgk=");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "9mdsYDCrjjYRur0rxzYt2oD7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 9mdsYDCrjjYRur0rxzYt2oD7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.springframework.util.Assert.hasLength("Not authenticated");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.springframework.util.Assert.doesNotContain("Authentication created", "5.0.9.RELEASE", "Not authenticated");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("disabled user authenticated", strSupplier1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.springframework.util.Assert.doesNotContain("Bert", "5.0.9.RELEASE");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable5 = null;
        log3.fatal((java.lang.Object) (byte) 0, throwable5);
        org.apache.commons.logging.LogFactory logFactory7 = org.apache.commons.logging.LogFactory.getFactory();
        log3.warn((java.lang.Object) logFactory7);
        log1.trace((java.lang.Object) logFactory7);
        boolean boolean10 = log1.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(logFactory7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.springframework.util.Assert.doesNotContain("Not authenticated", "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) "Bert", strSupplier1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.springframework.util.Assert.isTrue(true, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray10);
        org.springframework.util.Assert.noNullElements(objArray10, "Not authenticated");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.springframework.util.Assert.isTrue(true, "Big bird");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable5 = null;
        log3.fatal((java.lang.Object) (byte) 0, throwable5);
        org.apache.commons.logging.LogFactory logFactory7 = org.apache.commons.logging.LogFactory.getFactory();
        log3.warn((java.lang.Object) logFactory7);
        log1.trace((java.lang.Object) logFactory7);
        boolean boolean10 = log1.isWarnEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(logFactory7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray8, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier11);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray8, "Ernie");
        java.lang.Throwable throwable17 = null;
        log1.info((java.lang.Object) "Ernie", throwable17);
        log1.warn((java.lang.Object) "2006-06-01T23:48:42Z");
        boolean boolean21 = log1.isFatalEnabled();
        org.apache.commons.logging.Log log23 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean24 = log23.isWarnEnabled();
        log23.info((java.lang.Object) 10L);
        log1.debug((java.lang.Object) log23);
        boolean boolean28 = log23.isWarnEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.hasText("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this String argument must have text; it must not be null, empty, or blank");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.springframework.util.Assert.doesNotContain("2006-06-01T23:48:42Z", "", "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        org.springframework.util.Assert.noNullElements(objArray6);
        org.springframework.util.Assert.noNullElements(objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean4 = log3.isFatalEnabled();
        boolean boolean5 = log3.isDebugEnabled();
        java.lang.Throwable throwable6 = null;
        log1.warn((java.lang.Object) boolean5, throwable6);
        java.util.function.Supplier<java.lang.String> strSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) log1, strSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("Not authenticated", strSupplier1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) "hi!", strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.springframework.util.Assert.doesNotContain("5.0.10.RELEASE", "Bert", "No Authentication created");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.springframework.util.Assert.hasText("5.0.9.RELEASE");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("Big bird", "Not authenticated", strSupplier2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("kwNstEaiFOrI7B31j7GuETYvdgk=", strSupplier1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.springframework.util.Assert.state(true, "Not authenticated");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        log1.info((java.lang.Object) 10L);
        org.springframework.security.core.SpringSecurityCoreVersion springSecurityCoreVersion5 = new org.springframework.security.core.SpringSecurityCoreVersion();
        log1.info((java.lang.Object) springSecurityCoreVersion5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Throwable throwable8 = null;
        log1.error(obj7, throwable8);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        org.springframework.util.Assert.noNullElements(objArray0, "No Authentication created");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.springframework.util.Assert.hasLength("5.0.9.RELEASE", "Not authenticated");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("5.0.10.RELEASE", strSupplier1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        boolean boolean15 = log4.isTraceEnabled();
        boolean boolean16 = log4.isTraceEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "Bert");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Bert");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull((java.lang.Object) strSupplier17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable5 = null;
        log3.fatal((java.lang.Object) (byte) 0, throwable5);
        org.apache.commons.logging.LogFactory logFactory7 = org.apache.commons.logging.LogFactory.getFactory();
        log3.warn((java.lang.Object) logFactory7);
        log1.trace((java.lang.Object) logFactory7);
        org.apache.commons.logging.Log log11 = logFactory7.getInstance("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) log11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(logFactory7);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.springframework.util.Assert.doesNotContain("9mdsYDCrjjYRur0rxzYt2oD7", "Authenticated");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        org.springframework.security.core.Authentication authentication15 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl16 = new org.springframework.security.core.context.SecurityContextImpl(authentication15);
        org.springframework.security.core.Authentication authentication17 = securityContextImpl16.getAuthentication();
        org.springframework.security.core.Authentication authentication18 = securityContextImpl16.getAuthentication();
        java.lang.Object[] objArray19 = new java.lang.Object[] { log4, authentication18 };
        org.springframework.util.Assert.notEmpty(objArray19, "No Authentication created");
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        org.springframework.util.Assert.notEmpty(objArray19, strSupplier22);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(authentication17);
        org.junit.Assert.assertNull(authentication18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        java.lang.Throwable throwable8 = null;
        log1.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable8);
        boolean boolean10 = log1.isTraceEnabled();
        boolean boolean11 = log1.isFatalEnabled();
        java.lang.Throwable throwable13 = null;
        log1.info((java.lang.Object) (byte) 100, throwable13);
        java.lang.Throwable throwable16 = null;
        log1.trace((java.lang.Object) 10.0f, throwable16);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        java.lang.Throwable throwable8 = null;
        log1.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable8);
        boolean boolean10 = log1.isTraceEnabled();
        boolean boolean11 = log1.isFatalEnabled();
        boolean boolean12 = log1.isInfoEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl8 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log10 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable12 = null;
        log10.fatal((java.lang.Object) (byte) 0, throwable12);
        org.apache.commons.logging.LogFactory logFactory14 = org.apache.commons.logging.LogFactory.getFactory();
        log10.warn((java.lang.Object) logFactory14);
        log10.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray24 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray24, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier27 = null;
        org.springframework.util.Assert.notEmpty(objArray24, strSupplier27);
        log10.trace((java.lang.Object) objArray24);
        boolean boolean30 = log10.isDebugEnabled();
        boolean boolean31 = securityContextImpl8.equals((java.lang.Object) log10);
        boolean boolean32 = securityContextImpl1.equals((java.lang.Object) log10);
        org.springframework.security.core.Authentication authentication33 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(logFactory14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(authentication33);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.springframework.util.Assert.state(true, "Authenticated");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("2006-06-01T23:48:42Z", strSupplier1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("hi!", strSupplier1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("Ernie", strSupplier1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        log1.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray15 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray15, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        org.springframework.util.Assert.notEmpty(objArray15, strSupplier18);
        log1.trace((java.lang.Object) objArray15);
        boolean boolean21 = log1.isDebugEnabled();
        boolean boolean22 = log1.isFatalEnabled();
        boolean boolean23 = log1.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) objArray6, strSupplier11);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl8 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log10 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable12 = null;
        log10.fatal((java.lang.Object) (byte) 0, throwable12);
        org.apache.commons.logging.LogFactory logFactory14 = org.apache.commons.logging.LogFactory.getFactory();
        log10.warn((java.lang.Object) logFactory14);
        log10.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray24 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray24, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier27 = null;
        org.springframework.util.Assert.notEmpty(objArray24, strSupplier27);
        log10.trace((java.lang.Object) objArray24);
        boolean boolean30 = log10.isDebugEnabled();
        boolean boolean31 = securityContextImpl8.equals((java.lang.Object) log10);
        boolean boolean32 = securityContextImpl1.equals((java.lang.Object) log10);
        org.springframework.util.Assert.notNull((java.lang.Object) log10, "");
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(logFactory14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.springframework.util.Assert.hasText("No Authentication created", "Bert");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.springframework.security.core.SpringSecurityCoreVersion springSecurityCoreVersion0 = new org.springframework.security.core.SpringSecurityCoreVersion();
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) springSecurityCoreVersion0, strSupplier1);
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        org.springframework.util.Assert.isNull((java.lang.Object) strSupplier1, strSupplier3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.doesNotContain("disabled user authenticated", "disabled user authenticated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this String argument must not contain the substring [disabled user authenticated]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.springframework.util.Assert.doesNotContain("kwNstEaiFOrI7B31j7GuETYvdgk=", "Authentication created", "Bert");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        org.springframework.security.core.Authentication authentication15 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl16 = new org.springframework.security.core.context.SecurityContextImpl(authentication15);
        org.springframework.security.core.Authentication authentication17 = securityContextImpl16.getAuthentication();
        org.springframework.security.core.Authentication authentication18 = securityContextImpl16.getAuthentication();
        java.lang.Object[] objArray19 = new java.lang.Object[] { log4, authentication18 };
        org.springframework.util.Assert.notEmpty(objArray19, "No Authentication created");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.noNullElements(objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this array must not contain any null elements");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(authentication17);
        org.junit.Assert.assertNull(authentication18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("Authentication created", strSupplier1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        java.util.function.Supplier<java.lang.String> strSupplier6 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) securityContextImpl1, strSupplier6);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.springframework.util.Assert.doesNotContain("9mdsYDCrjjYRur0rxzYt2oD7", "Bert");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) (byte) 10, strSupplier1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        org.springframework.util.Assert.noNullElements(objArray6);
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier12);
        org.springframework.util.Assert.notEmpty(objArray6, "disabled user authenticated");
        org.springframework.util.Assert.notEmpty(objArray6, "No Authentication created");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        boolean boolean7 = log1.isWarnEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log2 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable4 = null;
        log2.fatal((java.lang.Object) (byte) 0, throwable4);
        org.apache.commons.logging.LogFactory logFactory6 = org.apache.commons.logging.LogFactory.getFactory();
        log2.warn((java.lang.Object) logFactory6);
        log2.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray16, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier19);
        log2.trace((java.lang.Object) objArray16);
        boolean boolean22 = log2.isDebugEnabled();
        boolean boolean23 = securityContextImpl0.equals((java.lang.Object) log2);
        org.apache.commons.logging.Log log25 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable27 = null;
        log25.fatal((java.lang.Object) (byte) 0, throwable27);
        log25.trace((java.lang.Object) '#');
        java.lang.Throwable throwable32 = null;
        log25.trace((java.lang.Object) "5.0.10.RELEASE", throwable32);
        java.lang.Throwable throwable34 = null;
        log2.trace((java.lang.Object) throwable32, throwable34);
        boolean boolean36 = log2.isInfoEnabled();
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl37 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log39 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable41 = null;
        log39.fatal((java.lang.Object) (byte) 0, throwable41);
        org.apache.commons.logging.LogFactory logFactory43 = org.apache.commons.logging.LogFactory.getFactory();
        log39.warn((java.lang.Object) logFactory43);
        log39.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray53 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray53, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier56 = null;
        org.springframework.util.Assert.notEmpty(objArray53, strSupplier56);
        log39.trace((java.lang.Object) objArray53);
        boolean boolean59 = log39.isDebugEnabled();
        boolean boolean60 = securityContextImpl37.equals((java.lang.Object) log39);
        boolean boolean61 = log39.isInfoEnabled();
        boolean boolean62 = log39.isFatalEnabled();
        log2.error((java.lang.Object) boolean62);
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl64 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log66 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable68 = null;
        log66.fatal((java.lang.Object) (byte) 0, throwable68);
        org.apache.commons.logging.LogFactory logFactory70 = org.apache.commons.logging.LogFactory.getFactory();
        log66.warn((java.lang.Object) logFactory70);
        log66.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray80 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray80, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier83 = null;
        org.springframework.util.Assert.notEmpty(objArray80, strSupplier83);
        log66.trace((java.lang.Object) objArray80);
        boolean boolean86 = log66.isDebugEnabled();
        boolean boolean87 = securityContextImpl64.equals((java.lang.Object) log66);
        boolean boolean88 = log66.isInfoEnabled();
        java.lang.Throwable throwable89 = null;
        log2.fatal((java.lang.Object) boolean88, throwable89);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(logFactory6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(logFactory43);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(logFactory70);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        boolean boolean7 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        boolean boolean12 = log1.isInfoEnabled();
        java.lang.Object[] objArray20 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray20, "Bert");
        java.lang.Object[] objArray23 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray23, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier26 = null;
        org.springframework.util.Assert.noNullElements(objArray23, strSupplier26);
        java.lang.Throwable throwable28 = null;
        log1.error((java.lang.Object) objArray23, throwable28);
        log1.debug((java.lang.Object) 500L);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.springframework.util.Assert.state(true, "5.0.9.RELEASE");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.springframework.util.Assert.hasText("hi!", "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.apache.commons.logging.Log log7 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable9 = null;
        log7.fatal((java.lang.Object) (byte) 0, throwable9);
        org.apache.commons.logging.LogFactory logFactory11 = org.apache.commons.logging.LogFactory.getFactory();
        log7.warn((java.lang.Object) logFactory11);
        org.apache.commons.logging.Log log14 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean15 = log14.isFatalEnabled();
        java.lang.Throwable throwable17 = null;
        log14.warn((java.lang.Object) 1.0d, throwable17);
        log7.fatal((java.lang.Object) throwable17);
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) log7, strSupplier20);
        boolean boolean22 = securityContextImpl1.equals((java.lang.Object) log7);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(logFactory11);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = null;
        securityContextImpl1.setAuthentication(authentication8);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        log1.info((java.lang.Object) 10L);
        org.springframework.security.core.SpringSecurityCoreVersion springSecurityCoreVersion5 = new org.springframework.security.core.SpringSecurityCoreVersion();
        log1.info((java.lang.Object) springSecurityCoreVersion5);
        boolean boolean7 = log1.isFatalEnabled();
        boolean boolean8 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier15);
        org.springframework.util.Assert.notEmpty(objArray6);
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier18);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.springframework.security.core.Authentication authentication1 = securityContextImpl0.getAuthentication();
        org.springframework.security.core.Authentication authentication2 = null;
        securityContextImpl0.setAuthentication(authentication2);
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl0.setAuthentication(authentication4);
        boolean boolean7 = securityContextImpl0.equals((java.lang.Object) '#');
        org.junit.Assert.assertNull(authentication1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.springframework.util.Assert.hasLength("5.0.10.RELEASE", "kwNstEaiFOrI7B31j7GuETYvdgk=");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        org.springframework.util.Assert.noNullElements(objArray6, "disabled user authenticated");
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        org.springframework.util.Assert.notEmpty(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = securityContextImpl1.getAuthentication();
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.isNull((java.lang.Object) authentication8, strSupplier9);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        org.springframework.security.core.Authentication authentication7 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.springframework.util.Assert.doesNotContain("Authentication created", "No Authentication created", "Authentication created");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.springframework.util.Assert.hasLength("No Authentication created");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.springframework.util.Assert.hasLength("5.0.10.RELEASE", "No Authentication created");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notEmpty(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this array must not be empty: it must contain at least 1 element");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "Authentication created");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Authentication created");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        java.lang.Object[] objArray13 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray13, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier16 = null;
        org.springframework.util.Assert.notEmpty(objArray13, strSupplier16);
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        org.springframework.util.Assert.notEmpty(objArray13, strSupplier18);
        org.springframework.util.Assert.notEmpty(objArray13, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        org.springframework.util.Assert.noNullElements(objArray13, strSupplier22);
        org.springframework.util.Assert.notEmpty(objArray13);
        boolean boolean25 = securityContextImpl1.equals((java.lang.Object) objArray13);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.springframework.util.Assert.hasLength("Authentication created", "Authentication created");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray8, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier11);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray8, "Ernie");
        java.lang.Throwable throwable17 = null;
        log1.info((java.lang.Object) "Ernie", throwable17);
        java.lang.Object obj19 = null;
        log1.fatal(obj19);
        boolean boolean21 = log1.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl6 = new org.springframework.security.core.context.SecurityContextImpl(authentication5);
        org.springframework.security.core.Authentication authentication7 = securityContextImpl6.getAuthentication();
        org.springframework.security.core.Authentication authentication8 = securityContextImpl6.getAuthentication();
        boolean boolean9 = securityContextImpl1.equals((java.lang.Object) securityContextImpl6);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication7);
        org.junit.Assert.assertNull(authentication8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.springframework.util.Assert.hasText("Not authenticated");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.notEmpty(objArray10, strSupplier17);
        org.springframework.util.Assert.noNullElements(objArray10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log2 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable4 = null;
        log2.fatal((java.lang.Object) (byte) 0, throwable4);
        org.apache.commons.logging.LogFactory logFactory6 = org.apache.commons.logging.LogFactory.getFactory();
        log2.warn((java.lang.Object) logFactory6);
        log2.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray16, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier19);
        log2.trace((java.lang.Object) objArray16);
        boolean boolean22 = log2.isDebugEnabled();
        boolean boolean23 = securityContextImpl0.equals((java.lang.Object) log2);
        org.apache.commons.logging.Log log25 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable27 = null;
        log25.fatal((java.lang.Object) (byte) 0, throwable27);
        log25.trace((java.lang.Object) '#');
        java.lang.Throwable throwable32 = null;
        log25.trace((java.lang.Object) "5.0.10.RELEASE", throwable32);
        java.lang.Throwable throwable34 = null;
        log2.trace((java.lang.Object) throwable32, throwable34);
        boolean boolean36 = log2.isInfoEnabled();
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl37 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log39 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable41 = null;
        log39.fatal((java.lang.Object) (byte) 0, throwable41);
        org.apache.commons.logging.LogFactory logFactory43 = org.apache.commons.logging.LogFactory.getFactory();
        log39.warn((java.lang.Object) logFactory43);
        log39.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray53 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray53, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier56 = null;
        org.springframework.util.Assert.notEmpty(objArray53, strSupplier56);
        log39.trace((java.lang.Object) objArray53);
        boolean boolean59 = log39.isDebugEnabled();
        boolean boolean60 = securityContextImpl37.equals((java.lang.Object) log39);
        boolean boolean61 = log39.isInfoEnabled();
        boolean boolean62 = log39.isFatalEnabled();
        log2.error((java.lang.Object) boolean62);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) log2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(logFactory6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(logFactory43);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        org.springframework.util.Assert.notNull((java.lang.Object) securityContextImpl1);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.springframework.util.Assert.hasText("kwNstEaiFOrI7B31j7GuETYvdgk=", "Authentication created");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.springframework.util.Assert.hasText("hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        java.lang.String str1 = securityContextImpl0.toString();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        org.springframework.util.Assert.notNull((java.lang.Object) str5);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.springframework.util.Assert.hasText("Not authenticated", "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean4 = log3.isFatalEnabled();
        boolean boolean5 = log3.isDebugEnabled();
        java.lang.Throwable throwable6 = null;
        log1.warn((java.lang.Object) boolean5, throwable6);
        boolean boolean8 = log1.isErrorEnabled();
        org.apache.commons.logging.LogFactory logFactory9 = org.apache.commons.logging.LogFactory.getFactory();
        org.apache.commons.logging.Log log11 = logFactory9.getInstance("Not authenticated");
        java.lang.Throwable throwable12 = null;
        log1.error((java.lang.Object) log11, throwable12);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull((java.lang.Object) throwable12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logFactory9);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.doesNotContain("No Authentication created", "Authentication created", strSupplier2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.springframework.util.Assert.hasText("disabled user authenticated", "2006-06-01T23:48:42Z");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication6 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.springframework.util.Assert.doesNotContain("Big bird", "Not authenticated", "Authenticated");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        log1.error((java.lang.Object) 100.0f);
        java.lang.Object obj4 = null;
        java.lang.Throwable throwable5 = null;
        log1.info(obj4, throwable5);
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.springframework.util.Assert.doesNotContain("Ernie", "hi!", "No Authentication created");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Not authenticated");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "2006-06-01T23:48:42Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 2006-06-01T23:48:42Z");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.springframework.util.Assert.doesNotContain("", "5.0.9.RELEASE");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "5.0.10.RELEASE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 5.0.10.RELEASE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.Object obj0 = null;
        org.springframework.util.Assert.isNull(obj0, "5.0.9.RELEASE");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.springframework.util.Assert.state(true, "No Authentication created");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "5.0.10.RELEASE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5.0.10.RELEASE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.springframework.util.Assert.hasText("No Authentication created");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isFatalEnabled();
        boolean boolean3 = log1.isDebugEnabled();
        boolean boolean4 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        log4.info((java.lang.Object) 1L);
        boolean boolean14 = log4.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("Bert", strSupplier1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.Object obj4 = null;
        boolean boolean5 = securityContextImpl1.equals(obj4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = null;
        securityContextImpl1.setAuthentication(authentication3);
        org.springframework.security.core.Authentication authentication5 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray8 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray8, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier11);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.notEmpty(objArray8, strSupplier13);
        org.springframework.util.Assert.notEmpty(objArray8, "Ernie");
        java.lang.Throwable throwable17 = null;
        log1.info((java.lang.Object) "Ernie", throwable17);
        java.lang.Object obj19 = null;
        log1.fatal(obj19);
        org.springframework.security.core.Authentication authentication21 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl22 = new org.springframework.security.core.context.SecurityContextImpl(authentication21);
        org.springframework.security.core.Authentication authentication23 = securityContextImpl22.getAuthentication();
        org.springframework.security.core.Authentication authentication24 = securityContextImpl22.getAuthentication();
        java.lang.String str25 = securityContextImpl22.toString();
        java.lang.Throwable throwable26 = null;
        log1.error((java.lang.Object) securityContextImpl22, throwable26);
        org.springframework.security.core.Authentication authentication28 = null;
        securityContextImpl22.setAuthentication(authentication28);
        org.springframework.security.core.Authentication authentication30 = securityContextImpl22.getAuthentication();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNull(authentication23);
        org.junit.Assert.assertNull(authentication24);
        org.junit.Assert.assertNull(authentication30);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier19);
        org.springframework.util.Assert.notEmpty(objArray10, "9mdsYDCrjjYRur0rxzYt2oD7");
        java.util.function.Supplier<java.lang.String> strSupplier23 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier23);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        boolean boolean12 = log1.isTraceEnabled();
        log1.info((java.lang.Object) "5.0.10.RELEASE");
        org.apache.commons.logging.Log log16 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable18 = null;
        log16.fatal((java.lang.Object) (byte) 0, throwable18);
        org.apache.commons.logging.LogFactory logFactory20 = org.apache.commons.logging.LogFactory.getFactory();
        log16.warn((java.lang.Object) logFactory20);
        log16.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray30 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray30, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier33 = null;
        org.springframework.util.Assert.notEmpty(objArray30, strSupplier33);
        log16.trace((java.lang.Object) objArray30);
        java.lang.Throwable throwable37 = null;
        log16.error((java.lang.Object) 1, throwable37);
        java.util.function.Supplier<java.lang.String> strSupplier39 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) log16, strSupplier39);
        java.lang.Object[] objArray47 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray47, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier50 = null;
        org.springframework.util.Assert.notEmpty(objArray47, strSupplier50);
        java.lang.Throwable throwable52 = null;
        log16.debug((java.lang.Object) objArray47, throwable52);
        java.lang.Throwable throwable54 = null;
        log1.debug((java.lang.Object) throwable52, throwable54);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(logFactory20);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable5 = null;
        log3.fatal((java.lang.Object) (byte) 0, throwable5);
        org.apache.commons.logging.LogFactory logFactory7 = org.apache.commons.logging.LogFactory.getFactory();
        log3.warn((java.lang.Object) logFactory7);
        log1.trace((java.lang.Object) logFactory7);
        org.apache.commons.logging.Log log11 = logFactory7.getInstance("hi!");
        java.lang.Class<?> wildcardClass12 = log11.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(logFactory7);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier19);
        org.springframework.util.Assert.notEmpty(objArray10, "9mdsYDCrjjYRur0rxzYt2oD7");
        org.springframework.util.Assert.noNullElements(objArray10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        org.springframework.security.core.Authentication authentication15 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl16 = new org.springframework.security.core.context.SecurityContextImpl(authentication15);
        org.springframework.security.core.Authentication authentication17 = securityContextImpl16.getAuthentication();
        org.springframework.security.core.Authentication authentication18 = securityContextImpl16.getAuthentication();
        java.lang.Object[] objArray19 = new java.lang.Object[] { log4, authentication18 };
        org.springframework.util.Assert.notEmpty(objArray19, "No Authentication created");
        org.springframework.util.Assert.notEmpty(objArray19);
        org.springframework.util.Assert.notEmpty(objArray19);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(authentication17);
        org.junit.Assert.assertNull(authentication18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.Object[] objArray0 = null;
        org.springframework.util.Assert.noNullElements(objArray0, "5.0.10.RELEASE");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log2 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable4 = null;
        log2.fatal((java.lang.Object) (byte) 0, throwable4);
        org.apache.commons.logging.LogFactory logFactory6 = org.apache.commons.logging.LogFactory.getFactory();
        log2.warn((java.lang.Object) logFactory6);
        log2.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray16, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier19);
        log2.trace((java.lang.Object) objArray16);
        boolean boolean22 = log2.isDebugEnabled();
        boolean boolean23 = securityContextImpl0.equals((java.lang.Object) log2);
        org.apache.commons.logging.Log log25 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable27 = null;
        log25.fatal((java.lang.Object) (byte) 0, throwable27);
        log25.trace((java.lang.Object) '#');
        java.lang.Throwable throwable32 = null;
        log25.trace((java.lang.Object) "5.0.10.RELEASE", throwable32);
        java.lang.Throwable throwable34 = null;
        log2.trace((java.lang.Object) throwable32, throwable34);
        org.apache.commons.logging.Log log37 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean38 = log37.isWarnEnabled();
        org.apache.commons.logging.Log log40 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable42 = null;
        log40.fatal((java.lang.Object) (byte) 0, throwable42);
        org.apache.commons.logging.LogFactory logFactory44 = org.apache.commons.logging.LogFactory.getFactory();
        log40.warn((java.lang.Object) logFactory44);
        java.lang.Throwable throwable46 = null;
        log37.debug((java.lang.Object) log40, throwable46);
        org.apache.commons.logging.LogFactory logFactory48 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass49 = logFactory48.getClass();
        log40.info((java.lang.Object) wildcardClass49);
        log2.warn((java.lang.Object) wildcardClass49);
        org.apache.commons.logging.Log log53 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean54 = log53.isWarnEnabled();
        org.apache.commons.logging.Log log56 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable58 = null;
        log56.fatal((java.lang.Object) (byte) 0, throwable58);
        org.apache.commons.logging.LogFactory logFactory60 = org.apache.commons.logging.LogFactory.getFactory();
        log56.warn((java.lang.Object) logFactory60);
        java.lang.Throwable throwable62 = null;
        log53.debug((java.lang.Object) log56, throwable62);
        org.apache.commons.logging.LogFactory logFactory64 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass65 = logFactory64.getClass();
        log56.info((java.lang.Object) wildcardClass65);
        org.springframework.security.core.Authentication authentication67 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl68 = new org.springframework.security.core.context.SecurityContextImpl(authentication67);
        org.springframework.security.core.Authentication authentication69 = securityContextImpl68.getAuthentication();
        org.springframework.security.core.Authentication authentication70 = securityContextImpl68.getAuthentication();
        java.lang.Object[] objArray71 = new java.lang.Object[] { log56, authentication70 };
        org.springframework.util.Assert.notEmpty(objArray71, "No Authentication created");
        org.springframework.util.Assert.notEmpty(objArray71);
        java.lang.Throwable throwable75 = null;
        log2.warn((java.lang.Object) objArray71, throwable75);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.noNullElements(objArray71, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(logFactory6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNotNull(logFactory44);
        org.junit.Assert.assertNotNull(logFactory48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(log53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(logFactory60);
        org.junit.Assert.assertNotNull(logFactory64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(authentication69);
        org.junit.Assert.assertNull(authentication70);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        java.lang.String str7 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication8 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.springframework.util.Assert.doesNotContain("Big bird", "No Authentication created", "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("2006-06-01T23:48:42Z", strSupplier1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray10, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.notEmpty(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.notEmpty(objArray10, strSupplier15);
        org.springframework.util.Assert.notEmpty(objArray10, "Ernie");
        java.lang.Throwable throwable19 = null;
        log3.info((java.lang.Object) "Ernie", throwable19);
        java.lang.Object obj21 = null;
        log3.fatal(obj21);
        log1.fatal((java.lang.Object) log3);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.springframework.util.Assert.doesNotContain("No Authentication created", "Big bird");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.springframework.util.Assert.hasText("5.0.10.RELEASE");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.springframework.security.core.Authentication authentication1 = securityContextImpl0.getAuthentication();
        org.junit.Assert.assertNull(authentication1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.Object obj4 = null;
        boolean boolean5 = securityContextImpl1.equals(obj4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        org.springframework.util.Assert.noNullElements(objArray6);
        org.springframework.util.Assert.notEmpty(objArray6);
        org.springframework.util.Assert.noNullElements(objArray6, "");
        org.springframework.util.Assert.notEmpty(objArray6, "No Authentication created");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "Big bird");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Big bird");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        boolean boolean5 = log1.isFatalEnabled();
        org.apache.commons.logging.Log log7 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable9 = null;
        log7.fatal((java.lang.Object) (byte) 0, throwable9);
        boolean boolean11 = log7.isFatalEnabled();
        java.lang.Throwable throwable13 = null;
        log7.trace((java.lang.Object) "Big bird", throwable13);
        java.lang.Throwable throwable15 = null;
        log1.fatal((java.lang.Object) "Big bird", throwable15);
        org.springframework.security.core.Authentication authentication17 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl18 = new org.springframework.security.core.context.SecurityContextImpl(authentication17);
        org.springframework.security.core.Authentication authentication19 = securityContextImpl18.getAuthentication();
        org.springframework.security.core.Authentication authentication20 = securityContextImpl18.getAuthentication();
        java.lang.String str21 = securityContextImpl18.toString();
        org.springframework.security.core.Authentication authentication22 = null;
        securityContextImpl18.setAuthentication(authentication22);
        log1.error((java.lang.Object) authentication22);
        boolean boolean25 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(authentication19);
        org.junit.Assert.assertNull(authentication20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.springframework.util.Assert.hasLength("2006-06-01T23:48:42Z", "disabled user authenticated");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.springframework.security.core.Authentication authentication1 = securityContextImpl0.getAuthentication();
        org.springframework.security.core.Authentication authentication2 = null;
        securityContextImpl0.setAuthentication(authentication2);
        org.junit.Assert.assertNull(authentication1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication6 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = null;
        securityContextImpl1.setAuthentication(authentication8);
        org.springframework.security.core.Authentication authentication10 = null;
        securityContextImpl1.setAuthentication(authentication10);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.springframework.util.Assert.doesNotContain("2006-06-01T23:48:42Z", "disabled user authenticated");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication9 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication8);
        org.junit.Assert.assertNull(authentication9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.hasLength("", "Big bird");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Big bird");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication6 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication5);
        org.junit.Assert.assertNull(authentication6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable5 = null;
        log3.fatal((java.lang.Object) (byte) 0, throwable5);
        log3.trace((java.lang.Object) '#');
        java.lang.Throwable throwable10 = null;
        log3.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable10);
        java.lang.Throwable throwable13 = null;
        log3.debug((java.lang.Object) '4', throwable13);
        java.lang.Throwable throwable15 = null;
        log1.info((java.lang.Object) throwable13, throwable15);
        boolean boolean17 = log1.isWarnEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        log1.error((java.lang.Object) 100.0f);
        boolean boolean4 = log1.isFatalEnabled();
        java.util.function.Supplier<java.lang.String> strSupplier5 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) boolean4, strSupplier5);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier19);
        org.springframework.util.Assert.notEmpty(objArray10, "9mdsYDCrjjYRur0rxzYt2oD7");
        org.springframework.util.Assert.notEmpty(objArray10, "Authenticated");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "5.0.9.RELEASE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5.0.9.RELEASE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.springframework.util.Assert.doesNotContain("Authentication created", "Authenticated", "Ernie");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.apache.commons.logging.LogFactory logFactory0 = org.apache.commons.logging.LogFactory.getFactory();
        org.apache.commons.logging.Log log2 = logFactory0.getInstance("Not authenticated");
        org.apache.commons.logging.Log log4 = logFactory0.getInstance("Bert");
        org.junit.Assert.assertNotNull(logFactory0);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        org.springframework.util.Assert.noNullElements(objArray6, "disabled user authenticated");
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier17);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        java.lang.String str5 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
        org.junit.Assert.assertNull(authentication8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = null;
        securityContextImpl1.setAuthentication(authentication4);
        java.lang.Object obj6 = null;
        boolean boolean7 = securityContextImpl1.equals(obj6);
        org.apache.commons.logging.Log log9 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray16, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier19);
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier21);
        org.springframework.util.Assert.notEmpty(objArray16, "Ernie");
        java.lang.Throwable throwable25 = null;
        log9.info((java.lang.Object) "Ernie", throwable25);
        log9.warn((java.lang.Object) "2006-06-01T23:48:42Z");
        boolean boolean29 = securityContextImpl1.equals((java.lang.Object) "2006-06-01T23:48:42Z");
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("Big bird", strSupplier1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        boolean boolean4 = securityContextImpl1.equals((java.lang.Object) false);
        org.springframework.security.core.Authentication authentication5 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = null;
        securityContextImpl1.setAuthentication(authentication8);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(authentication5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        boolean boolean15 = log4.isTraceEnabled();
        boolean boolean16 = log4.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.noNullElements(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "5.0.9.RELEASE");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) 100.0f, throwable3);
        boolean boolean5 = log1.isTraceEnabled();
        log1.trace((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        org.springframework.util.Assert.noNullElements(objArray6);
        org.springframework.util.Assert.noNullElements(objArray6, "Authentication created");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.springframework.util.Assert.doesNotContain("Authentication created", "2006-06-01T23:48:42Z", "Big bird");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) 100.0f, throwable3);
        boolean boolean5 = log1.isTraceEnabled();
        java.lang.Object obj6 = null;
        java.lang.Throwable throwable7 = null;
        log1.fatal(obj6, throwable7);
        org.springframework.util.Assert.notNull((java.lang.Object) log1);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier17);
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier19);
        org.springframework.util.Assert.noNullElements(objArray10, "9mdsYDCrjjYRur0rxzYt2oD7");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "hi!");
        org.springframework.util.Assert.noNullElements(objArray6, "Authentication created");
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier17);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.springframework.util.Assert.state(true, "2006-06-01T23:48:42Z");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.springframework.util.Assert.hasText("9mdsYDCrjjYRur0rxzYt2oD7", "9mdsYDCrjjYRur0rxzYt2oD7");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "kwNstEaiFOrI7B31j7GuETYvdgk=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: kwNstEaiFOrI7B31j7GuETYvdgk=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray6, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier9);
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        org.springframework.util.Assert.notEmpty(objArray6, strSupplier11);
        org.springframework.util.Assert.notEmpty(objArray6, "Ernie");
        org.springframework.util.Assert.noNullElements(objArray6, "disabled user authenticated");
        org.springframework.util.Assert.noNullElements(objArray6, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        org.apache.commons.logging.Log log8 = logFactory5.getInstance("9mdsYDCrjjYRur0rxzYt2oD7");
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.springframework.util.Assert.hasText("9mdsYDCrjjYRur0rxzYt2oD7", "No Authentication created");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        java.lang.Throwable throwable8 = null;
        log1.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable8);
        boolean boolean10 = log1.isTraceEnabled();
        boolean boolean11 = log1.isFatalEnabled();
        java.lang.Throwable throwable13 = null;
        log1.info((java.lang.Object) (byte) 100, throwable13);
        boolean boolean15 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.springframework.util.Assert.hasText("kwNstEaiFOrI7B31j7GuETYvdgk=");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.Object obj0 = null;
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.isNull(obj0, strSupplier1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("");
        org.springframework.security.core.Authentication authentication2 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl3 = new org.springframework.security.core.context.SecurityContextImpl(authentication2);
        org.springframework.security.core.Authentication authentication4 = securityContextImpl3.getAuthentication();
        org.springframework.security.core.Authentication authentication5 = securityContextImpl3.getAuthentication();
        java.lang.String str6 = securityContextImpl3.toString();
        org.springframework.security.core.Authentication authentication7 = securityContextImpl3.getAuthentication();
        java.lang.Throwable throwable8 = null;
        log1.fatal((java.lang.Object) authentication7, throwable8);
        org.apache.commons.logging.Log log11 = org.apache.commons.logging.LogFactory.getLog("disabled user authenticated");
        java.lang.Throwable throwable13 = null;
        log11.fatal((java.lang.Object) 100.0f, throwable13);
        boolean boolean15 = log11.isTraceEnabled();
        log1.fatal((java.lang.Object) boolean15);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(authentication4);
        org.junit.Assert.assertNull(authentication5);
        org.junit.Assert.assertNull(authentication7);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        boolean boolean12 = log1.isTraceEnabled();
        log1.info((java.lang.Object) "5.0.10.RELEASE");
        boolean boolean15 = log1.isTraceEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl0 = new org.springframework.security.core.context.SecurityContextImpl();
        org.apache.commons.logging.Log log2 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable4 = null;
        log2.fatal((java.lang.Object) (byte) 0, throwable4);
        org.apache.commons.logging.LogFactory logFactory6 = org.apache.commons.logging.LogFactory.getFactory();
        log2.warn((java.lang.Object) logFactory6);
        log2.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray16, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray16, strSupplier19);
        log2.trace((java.lang.Object) objArray16);
        boolean boolean22 = log2.isDebugEnabled();
        boolean boolean23 = securityContextImpl0.equals((java.lang.Object) log2);
        org.apache.commons.logging.Log log25 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable27 = null;
        log25.fatal((java.lang.Object) (byte) 0, throwable27);
        log25.trace((java.lang.Object) '#');
        java.lang.Throwable throwable32 = null;
        log25.trace((java.lang.Object) "5.0.10.RELEASE", throwable32);
        java.lang.Throwable throwable34 = null;
        log2.trace((java.lang.Object) throwable32, throwable34);
        org.apache.commons.logging.Log log37 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean38 = log37.isWarnEnabled();
        org.apache.commons.logging.Log log40 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable42 = null;
        log40.fatal((java.lang.Object) (byte) 0, throwable42);
        org.apache.commons.logging.LogFactory logFactory44 = org.apache.commons.logging.LogFactory.getFactory();
        log40.warn((java.lang.Object) logFactory44);
        java.lang.Throwable throwable46 = null;
        log37.debug((java.lang.Object) log40, throwable46);
        org.apache.commons.logging.LogFactory logFactory48 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass49 = logFactory48.getClass();
        log40.info((java.lang.Object) wildcardClass49);
        log2.warn((java.lang.Object) wildcardClass49);
        org.apache.commons.logging.Log log53 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean54 = log53.isWarnEnabled();
        org.apache.commons.logging.Log log56 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable58 = null;
        log56.fatal((java.lang.Object) (byte) 0, throwable58);
        org.apache.commons.logging.LogFactory logFactory60 = org.apache.commons.logging.LogFactory.getFactory();
        log56.warn((java.lang.Object) logFactory60);
        java.lang.Throwable throwable62 = null;
        log53.debug((java.lang.Object) log56, throwable62);
        org.apache.commons.logging.LogFactory logFactory64 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass65 = logFactory64.getClass();
        log56.info((java.lang.Object) wildcardClass65);
        org.springframework.security.core.Authentication authentication67 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl68 = new org.springframework.security.core.context.SecurityContextImpl(authentication67);
        org.springframework.security.core.Authentication authentication69 = securityContextImpl68.getAuthentication();
        org.springframework.security.core.Authentication authentication70 = securityContextImpl68.getAuthentication();
        java.lang.Object[] objArray71 = new java.lang.Object[] { log56, authentication70 };
        org.springframework.util.Assert.notEmpty(objArray71, "No Authentication created");
        org.springframework.util.Assert.notEmpty(objArray71);
        java.lang.Throwable throwable75 = null;
        log2.warn((java.lang.Object) objArray71, throwable75);
        org.springframework.util.Assert.notNull((java.lang.Object) objArray71);
        java.util.function.Supplier<java.lang.String> strSupplier78 = null;
        org.springframework.util.Assert.notEmpty(objArray71, strSupplier78);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(logFactory6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNotNull(logFactory44);
        org.junit.Assert.assertNotNull(logFactory48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(log53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(logFactory60);
        org.junit.Assert.assertNotNull(logFactory64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(authentication69);
        org.junit.Assert.assertNull(authentication70);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        java.lang.Throwable throwable8 = null;
        log1.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable8);
        boolean boolean10 = log1.isTraceEnabled();
        boolean boolean11 = log1.isFatalEnabled();
        java.lang.Throwable throwable13 = null;
        log1.info((java.lang.Object) (byte) 100, throwable13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) log1, strSupplier15);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        java.lang.Object obj7 = null;
        boolean boolean8 = securityContextImpl1.equals(obj7);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isTrue(false, "disabled user authenticated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: disabled user authenticated");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("Not authenticated", "Authentication created", strSupplier2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean5 = log4.isWarnEnabled();
        org.apache.commons.logging.Log log7 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable9 = null;
        log7.fatal((java.lang.Object) (byte) 0, throwable9);
        org.apache.commons.logging.LogFactory logFactory11 = org.apache.commons.logging.LogFactory.getFactory();
        log7.warn((java.lang.Object) logFactory11);
        java.lang.Throwable throwable13 = null;
        log4.debug((java.lang.Object) log7, throwable13);
        org.apache.commons.logging.LogFactory logFactory15 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass16 = logFactory15.getClass();
        log7.info((java.lang.Object) wildcardClass16);
        log1.error((java.lang.Object) wildcardClass16);
        boolean boolean19 = log1.isTraceEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(logFactory11);
        org.junit.Assert.assertNotNull(logFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("kwNstEaiFOrI7B31j7GuETYvdgk=", "", strSupplier2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        boolean boolean4 = securityContextImpl1.equals((java.lang.Object) false);
        java.lang.String str5 = securityContextImpl1.toString();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.springframework.util.Assert.hasLength("5.0.9.RELEASE", "Authenticated");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        org.apache.commons.logging.Log log3 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable5 = null;
        log3.fatal((java.lang.Object) (byte) 0, throwable5);
        org.apache.commons.logging.LogFactory logFactory7 = org.apache.commons.logging.LogFactory.getFactory();
        log3.warn((java.lang.Object) logFactory7);
        log1.trace((java.lang.Object) logFactory7);
        org.apache.commons.logging.Log log11 = logFactory7.getInstance("hi!");
        boolean boolean12 = log11.isFatalEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(logFactory7);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.springframework.util.Assert.doesNotContain("kwNstEaiFOrI7B31j7GuETYvdgk=", "");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        java.lang.String str7 = securityContextImpl1.toString();
        java.util.function.Supplier<java.lang.String> strSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) str7, strSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.springframework.util.Assert.hasText("Ernie");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        boolean boolean4 = securityContextImpl1.equals((java.lang.Object) false);
        org.springframework.security.core.Authentication authentication5 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication6 = null;
        securityContextImpl1.setAuthentication(authentication6);
        org.springframework.security.core.Authentication authentication8 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(authentication5);
        org.junit.Assert.assertNull(authentication8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasLength("Authenticated", strSupplier1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "Authenticated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Authenticated");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.springframework.util.Assert.doesNotContain("No Authentication created", "Bert");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        log1.trace((java.lang.Object) '#');
        java.lang.Throwable throwable8 = null;
        log1.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable8);
        boolean boolean10 = log1.isTraceEnabled();
        org.apache.commons.logging.Log log12 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean13 = log12.isFatalEnabled();
        boolean boolean14 = log12.isTraceEnabled();
        log1.debug((java.lang.Object) boolean14);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.notEmpty(objArray10, strSupplier19);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("hi!");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.springframework.util.Assert.hasText("5.0.10.RELEASE", "disabled user authenticated");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        org.apache.commons.logging.Log log8 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean9 = log8.isFatalEnabled();
        java.lang.Throwable throwable11 = null;
        log8.warn((java.lang.Object) 1.0d, throwable11);
        log1.fatal((java.lang.Object) throwable11);
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) log1, strSupplier14);
        boolean boolean16 = log1.isWarnEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean5 = log4.isWarnEnabled();
        org.apache.commons.logging.Log log7 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable9 = null;
        log7.fatal((java.lang.Object) (byte) 0, throwable9);
        org.apache.commons.logging.LogFactory logFactory11 = org.apache.commons.logging.LogFactory.getFactory();
        log7.warn((java.lang.Object) logFactory11);
        java.lang.Throwable throwable13 = null;
        log4.debug((java.lang.Object) log7, throwable13);
        org.apache.commons.logging.LogFactory logFactory15 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass16 = logFactory15.getClass();
        log7.info((java.lang.Object) wildcardClass16);
        log1.error((java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = log1.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(logFactory11);
        org.junit.Assert.assertNotNull(logFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        boolean boolean5 = log1.isFatalEnabled();
        java.lang.Throwable throwable7 = null;
        log1.fatal((java.lang.Object) (byte) 100, throwable7);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.hasLength("", strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        org.springframework.util.Assert.doesNotContain("disabled user authenticated", "No Authentication created", "Not authenticated");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        log1.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray15 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray15, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        org.springframework.util.Assert.notEmpty(objArray15, strSupplier18);
        log1.trace((java.lang.Object) objArray15);
        boolean boolean21 = log1.isDebugEnabled();
        boolean boolean22 = log1.isDebugEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        log1.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray15 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray15, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        org.springframework.util.Assert.notEmpty(objArray15, strSupplier18);
        log1.trace((java.lang.Object) objArray15);
        boolean boolean21 = log1.isErrorEnabled();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.Log log13 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean14 = log13.isWarnEnabled();
        org.apache.commons.logging.Log log16 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable18 = null;
        log16.fatal((java.lang.Object) (byte) 0, throwable18);
        org.apache.commons.logging.LogFactory logFactory20 = org.apache.commons.logging.LogFactory.getFactory();
        log16.warn((java.lang.Object) logFactory20);
        java.lang.Throwable throwable22 = null;
        log13.debug((java.lang.Object) log16, throwable22);
        boolean boolean24 = log13.isTraceEnabled();
        log13.trace((java.lang.Object) 0.0d);
        log1.trace((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(logFactory20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        org.springframework.security.core.Authentication authentication7 = null;
        securityContextImpl1.setAuthentication(authentication7);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.Object obj0 = null;
        org.springframework.util.Assert.isNull(obj0, "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        org.springframework.util.Assert.noNullElements(objArray0, "No Authentication created");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notEmpty(objArray0, "kwNstEaiFOrI7B31j7GuETYvdgk=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: kwNstEaiFOrI7B31j7GuETYvdgk=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        java.lang.String str7 = securityContextImpl1.toString();
        java.lang.String str8 = securityContextImpl1.toString();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "Authentication created");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Authentication created");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.isNull((java.lang.Object) (short) 100, strSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.springframework.util.Assert.doesNotContain("kwNstEaiFOrI7B31j7GuETYvdgk=", "", "Not authenticated");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        log1.fatal((java.lang.Object) "Not authenticated");
        java.lang.Object[] objArray15 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray15, "Bert");
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        org.springframework.util.Assert.notEmpty(objArray15, strSupplier18);
        log1.trace((java.lang.Object) objArray15);
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        org.springframework.util.Assert.notEmpty(objArray15, strSupplier21);
        org.springframework.util.Assert.isNull((java.lang.Object) strSupplier21);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[Authentication created, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        org.springframework.security.core.Authentication authentication7 = null;
        securityContextImpl1.setAuthentication(authentication7);
        org.springframework.security.core.Authentication authentication9 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication10 = null;
        securityContextImpl1.setAuthentication(authentication10);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
        org.junit.Assert.assertNull(authentication9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.lang.Object[] objArray7 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray7, "Bert");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray10, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier13);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        org.springframework.util.Assert.noNullElements(objArray10, strSupplier15);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        org.springframework.util.Assert.notEmpty(objArray10, strSupplier17);
        org.springframework.util.Assert.noNullElements(objArray10, "Ernie");
        org.springframework.util.Assert.notNull((java.lang.Object) objArray10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        java.lang.String str5 = securityContextImpl1.toString();
        java.lang.Object[] objArray13 = new java.lang.Object[] { "Authentication created", (-1L), (byte) 0, (short) 1, 1, 1 };
        org.springframework.util.Assert.noNullElements(objArray13, "Bert");
        java.lang.Object[] objArray16 = new java.lang.Object[] { "kwNstEaiFOrI7B31j7GuETYvdgk=", "Bert" };
        org.springframework.util.Assert.notEmpty(objArray16, "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        org.springframework.util.Assert.noNullElements(objArray16, strSupplier19);
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        org.springframework.util.Assert.noNullElements(objArray16, strSupplier21);
        java.util.function.Supplier<java.lang.String> strSupplier23 = null;
        org.springframework.util.Assert.noNullElements(objArray16, strSupplier23);
        java.util.function.Supplier<java.lang.String> strSupplier25 = null;
        org.springframework.util.Assert.noNullElements(objArray16, strSupplier25);
        java.util.function.Supplier<java.lang.String> strSupplier27 = null;
        org.springframework.util.Assert.noNullElements(objArray16, strSupplier27);
        boolean boolean29 = securityContextImpl1.equals((java.lang.Object) objArray16);
        org.springframework.security.core.Authentication authentication30 = null;
        securityContextImpl1.setAuthentication(authentication30);
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[Authentication created, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[kwNstEaiFOrI7B31j7GuETYvdgk=, Bert]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication4 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.notNull((java.lang.Object) authentication5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.Assert.state(false, "Ernie");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Ernie");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.util.function.Supplier<java.lang.String> strSupplier2 = null;
        org.springframework.util.Assert.doesNotContain("hi!", "disabled user authenticated", strSupplier2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        log1.info((java.lang.Object) 10L);
        org.springframework.security.core.SpringSecurityCoreVersion springSecurityCoreVersion5 = new org.springframework.security.core.SpringSecurityCoreVersion();
        log1.info((java.lang.Object) springSecurityCoreVersion5);
        java.lang.Throwable throwable8 = null;
        log1.debug((java.lang.Object) "Authentication created", throwable8);
        org.apache.commons.logging.Log log11 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean12 = log11.isFatalEnabled();
        java.lang.Throwable throwable14 = null;
        log11.warn((java.lang.Object) 1.0d, throwable14);
        org.apache.commons.logging.Log log17 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable19 = null;
        log17.fatal((java.lang.Object) (byte) 0, throwable19);
        log17.trace((java.lang.Object) '#');
        java.lang.Throwable throwable24 = null;
        log17.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=", throwable24);
        log11.error((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=");
        log1.warn((java.lang.Object) "kwNstEaiFOrI7B31j7GuETYvdgk=");
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable3 = null;
        log1.fatal((java.lang.Object) (byte) 0, throwable3);
        org.apache.commons.logging.LogFactory logFactory5 = org.apache.commons.logging.LogFactory.getFactory();
        log1.warn((java.lang.Object) logFactory5);
        org.apache.commons.logging.Log log8 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean9 = log8.isFatalEnabled();
        java.lang.Throwable throwable11 = null;
        log8.warn((java.lang.Object) 1.0d, throwable11);
        log1.fatal((java.lang.Object) throwable11);
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        org.springframework.util.Assert.notNull((java.lang.Object) log1, strSupplier14);
        java.lang.Object obj16 = null;
        log1.trace(obj16);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(logFactory5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        org.springframework.security.core.Authentication authentication0 = null;
        org.springframework.security.core.context.SecurityContextImpl securityContextImpl1 = new org.springframework.security.core.context.SecurityContextImpl(authentication0);
        org.springframework.security.core.Authentication authentication2 = securityContextImpl1.getAuthentication();
        org.springframework.security.core.Authentication authentication3 = securityContextImpl1.getAuthentication();
        java.lang.String str4 = securityContextImpl1.toString();
        org.springframework.security.core.Authentication authentication5 = null;
        securityContextImpl1.setAuthentication(authentication5);
        org.springframework.security.core.Authentication authentication7 = null;
        securityContextImpl1.setAuthentication(authentication7);
        org.springframework.security.core.Authentication authentication9 = securityContextImpl1.getAuthentication();
        org.junit.Assert.assertNull(authentication2);
        org.junit.Assert.assertNull(authentication3);
        org.junit.Assert.assertNull(authentication9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        org.apache.commons.logging.Log log1 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        boolean boolean2 = log1.isWarnEnabled();
        org.apache.commons.logging.Log log4 = org.apache.commons.logging.LogFactory.getLog("Authentication created");
        java.lang.Throwable throwable6 = null;
        log4.fatal((java.lang.Object) (byte) 0, throwable6);
        org.apache.commons.logging.LogFactory logFactory8 = org.apache.commons.logging.LogFactory.getFactory();
        log4.warn((java.lang.Object) logFactory8);
        java.lang.Throwable throwable10 = null;
        log1.debug((java.lang.Object) log4, throwable10);
        org.apache.commons.logging.LogFactory logFactory12 = org.apache.commons.logging.LogFactory.getFactory();
        java.lang.Class<?> wildcardClass13 = logFactory12.getClass();
        log4.info((java.lang.Object) wildcardClass13);
        boolean boolean15 = log4.isTraceEnabled();
        boolean boolean16 = log4.isWarnEnabled();
        log4.trace((java.lang.Object) "5.0.9.RELEASE");
        java.lang.Object obj19 = null;
        java.lang.Throwable throwable20 = null;
        log4.debug(obj19, throwable20);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(logFactory8);
        org.junit.Assert.assertNotNull(logFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.springframework.util.Assert.doesNotContain("hi!", "5.0.10.RELEASE");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        org.springframework.util.Assert.hasText("Bert", strSupplier1);
    }
}

