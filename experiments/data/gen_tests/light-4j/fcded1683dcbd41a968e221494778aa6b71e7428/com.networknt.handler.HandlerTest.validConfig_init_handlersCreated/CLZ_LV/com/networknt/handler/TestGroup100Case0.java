package com.networknt.handler;

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
        com.networknt.handler.config.HandlerConfig handlerConfig0 = null;
        com.networknt.handler.Handler.config = handlerConfig0;
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpHandler httpHandler1 = com.networknt.handler.Handler.getNext(httpServerExchange0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        io.undertow.server.HttpHandler httpHandler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, httpHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.networknt.handler.Handler.initHandlers();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.undertow.server.HttpHandler httpHandler0 = com.networknt.handler.Handler.lastHandler;
        org.junit.Assert.assertNull(httpHandler0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.networknt.handler.Handler.init();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.CONFIG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "handler" + "'", str0, "handler");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString(byteArray1, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 > 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.AUDIT_ON_ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auditOnError" + "'", str0, "auditOnError");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.Map<io.undertow.util.HttpString, io.undertow.util.PathTemplateMatcher<java.lang.String>> httpStringMap0 = com.networknt.handler.Handler.methodToMatcherMap;
        org.junit.Assert.assertNotNull(httpStringMap0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.networknt.handler.Handler.initDefaultHandlers();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(byteArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.Map<java.lang.String, io.undertow.server.HttpHandler> strMap0 = com.networknt.handler.Handler.handlers;
        java.lang.Class<?> wildcardClass1 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        boolean boolean0 = com.networknt.handler.LightHttpHandler.auditOnError;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.undertow.server.HttpHandler httpHandler0 = null;
        com.networknt.handler.Handler.setLastHandler(httpHandler0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.networknt.handler.Handler.initPaths();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.initChains();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Chain secondBeforeFirst uses Unknown handler: com.networknt.handler.sample.SampleHttpHandler2");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.AUDIT_CONFIG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "audit" + "'", str0, "audit");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("third");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: third has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.networknt.handler.Handler.start(httpServerExchange0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo((int) (byte) 100, byteArray8, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 0, 1, 0]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(100, byteArray7, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("Expected an exception to be thrown");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: Expected an exception to be thrown has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString1.writeTo(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.ERROR_NOT_DEFINED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ERR10042" + "'", str0, "ERR10042");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            httpString4.copyTo(byteArray8, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for byte[12]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("auditOnError");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: auditOnError has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString4.appendTo(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "and path", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        io.undertow.server.HttpHandler httpHandler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpHandler httpHandler2 = com.networknt.handler.Handler.getNext(httpServerExchange0, httpHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("ERR10042");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: ERR10042 has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.Class<?> wildcardClass5 = endpoint2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.AUDIT_STACK_TRACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auditStackTrace" + "'", str0, "auditStackTrace");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("auditOnError");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray4, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[12]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: hi! has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("audit");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in audit [ You must specify either path or source ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        java.lang.String str3 = endpoint2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Expected an exception to be thrown@third" + "'", str3, "Expected an exception to be thrown@third");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo((int) (byte) 100, byteArray4, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("Hello");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: Hello has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString1.writeTo(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.networknt.handler.config.HandlerConfig handlerConfig0 = com.networknt.handler.Handler.config;
        com.networknt.handler.Handler.config = handlerConfig0;
// flaky:         org.junit.Assert.assertNotNull(handlerConfig0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString8 = new io.undertow.util.HttpString(byteArray5, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UT000149: HttpString is not allowed to contain newlines. value: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 10, 0, 10]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        java.lang.String str3 = httpString1.toString();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.Class<?> wildcardClass1 = pathChain0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        boolean boolean1 = com.networknt.handler.Handler.startDefaultHandlers(httpServerExchange0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getPath();
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher7 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet8 = serializablePathTemplateMatcher7.getPathTemplates();
        boolean boolean9 = endpoint2.equals((java.lang.Object) pathTemplateSet8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Expected an exception to be thrown" + "'", str6, "Expected an exception to be thrown");
        org.junit.Assert.assertNotNull(pathTemplateSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = httpString0.byteAt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("com.networknt.handler.sample.SampleHttpHandler1@Hello", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = pathTemplateMatch2.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = strMap3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "\001 config", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        io.undertow.util.HttpString httpString13 = new io.undertow.util.HttpString(byteArray10);
        io.undertow.util.HttpString httpString14 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        boolean boolean16 = httpString14.equals(httpString15);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1 };
        httpString15.copyTo(byteArray19, (int) (short) 1);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray19);
        httpString13.copyTo(byteArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo((int) (byte) 1, byteArray19, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "post", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("hi!", strMap1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = httpString1.byteAt((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = httpString1.byteAt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        boolean boolean5 = httpString0.equalToString("Could not construct a handler with values provided as a list: \001");
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = httpString0.byteAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "Expected an exception to be thrown", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        boolean boolean5 = httpString0.equalToString("Could not construct a handler with values provided as a list: \001");
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = httpString0.byteAt((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.networknt.handler.Handler.setConfig("Configured class: \001 has not been found. Declared label was: \001");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString1.appendTo(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = httpString1.byteAt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        boolean boolean6 = httpString4.equals(httpString5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1 };
        httpString5.copyTo(byteArray9, (int) (short) 1);
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        boolean boolean14 = httpString12.equals(httpString13);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1 };
        httpString13.copyTo(byteArray17, (int) (short) 1);
        io.undertow.util.HttpString httpString20 = new io.undertow.util.HttpString(byteArray17);
        httpString5.copyTo(byteArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo((int) (short) 0, byteArray17, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.networknt.handler.Handler.setConfig("Unknown handler or chain: \001");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("auditOnError");
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1 };
        httpString4.copyTo(byteArray8, (int) (short) 1);
        java.lang.String str11 = httpString4.toString();
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        boolean boolean14 = httpString12.equals(httpString13);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1 };
        httpString13.copyTo(byteArray17, (int) (short) 1);
        io.undertow.util.HttpString httpString20 = new io.undertow.util.HttpString(byteArray17);
        httpString4.copyTo(byteArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo((int) (short) 0, byteArray17, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[12]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1 };
        httpString4.copyTo(byteArray8, (int) (short) 1);
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        boolean boolean13 = httpString11.equals(httpString12);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1 };
        httpString12.copyTo(byteArray16, (int) (short) 1);
        io.undertow.util.HttpString httpString19 = new io.undertow.util.HttpString(byteArray16);
        httpString4.copyTo(byteArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("PUT");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: PUT has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "audit", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in  [ You must specify either path or source ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.util.List<io.undertow.server.HttpHandler> httpHandlerList0 = com.networknt.handler.Handler.defaultHandlers;
// flaky:         org.junit.Assert.assertNotNull(httpHandlerList0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        boolean boolean13 = httpString11.equals(httpString12);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1 };
        httpString12.copyTo(byteArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            httpString9.copyTo(byteArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplate pathTemplate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher7 = serializablePathTemplateMatcher0.add(pathTemplate5, (java.io.Serializable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.networknt.handler.Handler handler0 = new com.networknt.handler.Handler();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("Hello", strMap1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Expected an exception to be thrown@third" + "'", str5, "Expected an exception to be thrown@third");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getPath();
        java.lang.String str7 = endpoint2.getMethod();
        java.lang.String str8 = endpoint2.getPath();
        java.lang.String str9 = endpoint2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Expected an exception to be thrown" + "'", str6, "Expected an exception to be thrown");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "third" + "'", str7, "third");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Expected an exception to be thrown" + "'", str8, "Expected an exception to be thrown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Expected an exception to be thrown@third" + "'", str9, "Expected an exception to be thrown@third");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        boolean boolean0 = com.networknt.handler.LightHttpHandler.auditStackTrace;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString4.writeTo(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.undertow.server.HttpHandler httpHandler0 = null;
        com.networknt.handler.Handler.lastHandler = httpHandler0;
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        boolean boolean4 = httpString0.equals((java.lang.Object) false);
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString7 = io.undertow.util.HttpString.EMPTY;
        boolean boolean8 = httpString6.equals(httpString7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1 };
        httpString7.copyTo(byteArray11, (int) (short) 1);
        java.lang.String str14 = httpString7.toString();
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString16 = io.undertow.util.HttpString.EMPTY;
        boolean boolean17 = httpString15.equals(httpString16);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1 };
        httpString16.copyTo(byteArray20, (int) (short) 1);
        io.undertow.util.HttpString httpString23 = new io.undertow.util.HttpString(byteArray20);
        httpString7.copyTo(byteArray20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo((int) (short) 1, byteArray20, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertNotNull(httpString16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 1]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.lang.String str8 = pathChain0.getMethod();
        java.lang.String[] strArray15 = new java.lang.String[] { "Configured class: \001 has not been found. Declared label was: \001", "ERR10042", "Unsupported type of handler provided: \001", "put", "ERR10042", "\001 config@Hello" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        pathChain0.setExec((java.util.List<java.lang.String>) strList16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        pathChain0.setMethod("ERR10042");
        pathChain0.setMethod("third");
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("audit");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in audit [ You must specify either path or source | Invalid HTTP method: third ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.networknt.handler.Handler.setConfig("Could not construct a handler with values provided as a list: \001");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("Could not construct a handler with values provided as a map: \001", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = pathTemplateMatch2.getParameters();
        java.lang.String str4 = pathTemplateMatch2.getMatchedTemplate();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Could not construct a handler with values provided as a map: \001" + "'", str4, "Could not construct a handler with values provided as a map: \001");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.networknt.handler.config.HandlerConfig handlerConfig0 = com.networknt.handler.LightHttpHandler.config;
        com.networknt.handler.Handler.config = handlerConfig0;
        com.networknt.handler.Handler.config = handlerConfig0;
        com.networknt.handler.Handler.config = handlerConfig0;
        org.junit.Assert.assertNotNull(handlerConfig0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        io.undertow.util.HttpString httpString8 = new io.undertow.util.HttpString(byteArray5);
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString8.copyTo(byteArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -50 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString7 = io.undertow.util.HttpString.EMPTY;
        boolean boolean8 = httpString6.equals(httpString7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1 };
        httpString7.copyTo(byteArray11, (int) (short) 1);
        io.undertow.util.HttpString httpString14 = new io.undertow.util.HttpString(byteArray11);
        httpString0.copyTo(byteArray11, (int) (short) 0);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setPath("com.networknt.handler.sample.SampleHttpHandler1@Hello");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        io.undertow.util.HttpString httpString8 = new io.undertow.util.HttpString(byteArray5);
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString8.copyTo(byteArray14, 0);
        io.undertow.util.HttpString httpString20 = new io.undertow.util.HttpString(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString23 = new io.undertow.util.HttpString(byteArray14, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        java.lang.String str3 = pathChain0.getPath();
        pathChain0.setSource("invalid-method");
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        io.undertow.util.HttpString httpString8 = new io.undertow.util.HttpString(byteArray5);
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        int int11 = httpString9.compareTo(httpString10);
        io.undertow.util.HttpString httpString13 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean14 = httpString9.equals(httpString13);
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString16 = io.undertow.util.HttpString.EMPTY;
        boolean boolean17 = httpString15.equals(httpString16);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1 };
        httpString16.copyTo(byteArray20, (int) (short) 1);
        io.undertow.util.HttpString httpString23 = new io.undertow.util.HttpString(byteArray20);
        httpString9.copyTo(byteArray20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString8.copyTo(byteArray20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 102 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertNotNull(httpString16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 1]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("com.networknt.handler.sample.SampleHttpHandler1");
        org.junit.Assert.assertNotNull(strTuple1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        boolean boolean4 = httpString0.equals((java.lang.Object) false);
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.appendTo(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, 0, 0);
        java.nio.ByteBuffer byteBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString22.appendTo(byteBuffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("audit", "Failed to inject handler.yml paths from: \001");
        java.lang.String str3 = endpoint2.getPath();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "audit" + "'", str3, "audit");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        int int9 = httpString1.compareTo(httpString8);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString8.writeTo(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("Unsupported type of handler provided: \001");
        java.lang.String str2 = httpString1.toString();
        boolean boolean4 = httpString1.equalToString("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unsupported type of handler provided: \001" + "'", str2, "Unsupported type of handler provided: \001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("Could not construct a handler with values provided as a map: \001", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = pathTemplateMatch2.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = pathTemplateMatch2.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = pathTemplateMatch2.getParameters();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.undertow.util.PathTemplateMatcher<java.util.Set<io.undertow.util.PathTemplate>> pathTemplateSetPathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.util.Set<io.undertow.util.PathTemplate>>();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString7 = io.undertow.util.HttpString.EMPTY;
        boolean boolean8 = httpString6.equals(httpString7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1 };
        httpString7.copyTo(byteArray11, (int) (short) 1);
        io.undertow.util.HttpString httpString14 = new io.undertow.util.HttpString(byteArray11);
        httpString0.copyTo(byteArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString19 = new io.undertow.util.HttpString(byteArray11, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -98 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        java.lang.String str3 = httpString0.toString();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "Unsupported type of handler provided: \001", logger4);
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult6 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unknown handler or chain: \001", logger4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = loggerPathMatchResult6.getParameters();
        java.lang.String str8 = loggerPathMatchResult6.getMatchedTemplate();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown handler or chain: \001" + "'", str8, "Unknown handler or chain: \001");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        boolean boolean14 = httpString12.equals(httpString13);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1 };
        httpString13.copyTo(byteArray17, (int) (short) 1);
        java.lang.String str20 = httpString13.toString();
        io.undertow.util.HttpString httpString21 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString22 = io.undertow.util.HttpString.EMPTY;
        boolean boolean23 = httpString21.equals(httpString22);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1 };
        httpString22.copyTo(byteArray26, (int) (short) 1);
        io.undertow.util.HttpString httpString29 = new io.undertow.util.HttpString(byteArray26);
        httpString13.copyTo(byteArray26, (int) (short) 0);
        io.undertow.util.HttpString httpString34 = new io.undertow.util.HttpString(byteArray26, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString9.copyTo(1, byteArray26, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(httpString21);
        org.junit.Assert.assertNotNull(httpString22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 1]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "Unknown handler or chain: \001", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        boolean boolean4 = httpString0.equals((java.lang.Object) false);
        boolean boolean6 = httpString0.equalToString("invalid-method");
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = httpString0.byteAt((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "handler", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        int int6 = httpString0.length();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(byteArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 0, 1, -1, 100]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        int int6 = httpString4.length();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("and method", "Could not construct a handler with values provided as a map: \001");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        java.lang.String str6 = pathChain0.getSource();
        pathChain0.setSource("and method");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        io.undertow.util.HttpString httpString21 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString22 = io.undertow.util.HttpString.EMPTY;
        boolean boolean23 = httpString21.equals(httpString22);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1 };
        httpString22.copyTo(byteArray26, (int) (short) 1);
        java.lang.String str29 = httpString22.toString();
        io.undertow.util.HttpString httpString30 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString31 = io.undertow.util.HttpString.EMPTY;
        boolean boolean32 = httpString30.equals(httpString31);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1 };
        httpString31.copyTo(byteArray35, (int) (short) 1);
        io.undertow.util.HttpString httpString38 = new io.undertow.util.HttpString(byteArray35);
        httpString22.copyTo(byteArray35, (int) (short) 0);
        io.undertow.util.HttpString httpString43 = new io.undertow.util.HttpString(byteArray35, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(100, byteArray35, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 200 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString21);
        org.junit.Assert.assertNotNull(httpString22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(httpString30);
        org.junit.Assert.assertNotNull(httpString31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 1]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher5 = serializablePathTemplateMatcher0.remove("");
        java.lang.Class<?> wildcardClass6 = serializablePathTemplateMatcher5.getClass();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        java.lang.String str6 = pathChain0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "Unsupported type of handler provided: \001", logger4);
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult6 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unknown handler or chain: \001", logger4);
        java.lang.String str7 = loggerPathMatchResult6.getMatchedTemplate();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = loggerPathMatchResult6.getParameters();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unknown handler or chain: \001" + "'", str7, "Unknown handler or chain: \001");
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = httpString6.byteAt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        int int5 = httpString0.length();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        java.lang.String str3 = pathChain0.getPath();
        java.lang.String str4 = pathChain0.getPath();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        boolean boolean4 = httpString0.equalToString("Chain \001 uses Unknown handler: \001");
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(byteArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("auditOnError");
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1 };
        httpString4.copyTo(byteArray8, (int) (short) 1);
        java.lang.String str11 = httpString4.toString();
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        boolean boolean14 = httpString12.equals(httpString13);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1 };
        httpString13.copyTo(byteArray17, (int) (short) 1);
        io.undertow.util.HttpString httpString20 = new io.undertow.util.HttpString(byteArray17);
        httpString4.copyTo(byteArray17, (int) (short) 0);
        io.undertow.util.HttpString httpString25 = new io.undertow.util.HttpString(byteArray17, 0, 0);
        io.undertow.util.HttpString httpString26 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString27 = io.undertow.util.HttpString.EMPTY;
        boolean boolean28 = httpString26.equals(httpString27);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1 };
        httpString27.copyTo(byteArray31, (int) (short) 1);
        httpString25.copyTo(byteArray31, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo((int) (byte) 10, byteArray31, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 20 out of bounds for byte[12]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString26);
        org.junit.Assert.assertNotNull(httpString27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100, 1]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.networknt.handler.Handler.setConfig("com.networknt.handler.sample.SampleHttpHandler1");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.slf4j.Logger logger2 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult3 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "invalid-method", logger2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = loggerPathMatchResult3.getParameters();
        org.slf4j.Logger logger5 = loggerPathMatchResult3.getValue();
        org.slf4j.Logger logger6 = loggerPathMatchResult3.getValue();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = loggerPathMatchResult3.getParameters();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        java.lang.String[] strArray27 = new java.lang.String[] { "PUT", "Unsupported type of handler provided: \001", "auditOnError", "com.networknt.handler.sample.SampleHttpHandler1", "secondBeforeFirst", "put", "Could not construct a handler with values provided as a map: \001", "", "and method", "invalid-method", "Could not instantiate handler class: \001", "Could not construct a handler with values provided as a list: \001", "put", "\001 config", "Chain \001 uses Unknown handler: \001", "source", "\u2192 null", "Could not construct a handler with values provided as a list: \001", "com.networknt.handler.sample.SampleHttpHandler1", "Conflicting source", "some-chain", "source", "Failed to inject handler.yml paths from: \001", "some-chain" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        pathChain0.setExec((java.util.List<java.lang.String>) strList28);
        java.lang.String str31 = pathChain0.toString();
        pathChain0.setSource("and method");
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]" + "'", str31, "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult3 = serializablePathTemplateMatcher0.match("third");
        java.io.Serializable serializable5 = serializablePathTemplateMatcher0.get("Configured class: \001 has not been found. Declared label was: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet7 = serializablePathTemplateMatcher6.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet8 = serializablePathTemplateMatcher6.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult10 = serializablePathTemplateMatcher6.match("audit");
        java.io.Serializable serializable12 = serializablePathTemplateMatcher6.get("@");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet13 = serializablePathTemplateMatcher6.getPathTemplates();
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher14 = serializablePathTemplateMatcher0.addAll(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializablePathMatchResult3);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNotNull(pathTemplateSet7);
        org.junit.Assert.assertNotNull(pathTemplateSet8);
        org.junit.Assert.assertNull(serializablePathMatchResult10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNotNull(pathTemplateSet13);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        pathChain0.setMethod("Unsupported type of handler provided: \001");
        pathChain0.setSource("audit");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        java.lang.String str7 = httpString3.toString();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "Conflicting source", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("put", "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        java.lang.String str3 = endpoint2.getPath();
        java.lang.String str4 = endpoint2.getMethod();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "put" + "'", str3, "put");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]" + "'", str4, "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "Expected an exception to be thrown", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        int int14 = httpString0.length();
        java.nio.ByteBuffer byteBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.appendTo(byteBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: null() ? [PUT, Unsupported type of handler provided: ?, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: ?, , and method, invalid-method, Could not instantiate handler class: ?, Could not construct a handler with values provided as a list: ?, put, ? config, Chain ? uses Unknown handler: ?, source, null() ? null, Could not construct a handler with values provided as a list: ?, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: ?, some-chain] has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        pathChain0.setMethod("Configured class: \001 has not been found. Declared label was: \001");
        pathChain0.setPath("Expected an exception to be thrown@third");
        pathChain0.setPath("@");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.setConfig("audit");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to load audit.yml as object.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("post");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.tryFromString("Expected an exception to be thrown@third");
        org.junit.Assert.assertNotNull(httpString1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.tryFromString("com.networknt.handler.sample.SampleHttpHandler1@Hello");
        org.junit.Assert.assertNotNull(httpString1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        boolean boolean4 = httpString0.equals((java.lang.Object) false);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = httpString1.equals(obj8);
        java.lang.String str10 = httpString1.toString();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        java.lang.String str5 = pathChain0.getPath();
        java.util.List<java.lang.String> strList6 = pathChain0.getExec();
        com.networknt.handler.config.PathChain pathChain7 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray11 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        pathChain7.setExec((java.util.List<java.lang.String>) strList12);
        pathChain0.setExec((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        boolean boolean10 = httpString8.equals(httpString9);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1 };
        httpString9.copyTo(byteArray13, (int) (short) 1);
        io.undertow.util.HttpString httpString16 = new io.undertow.util.HttpString(byteArray13);
        httpString1.copyTo(byteArray13, (int) (short) 1);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString1.writeTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        java.lang.String str6 = pathChain0.getSource();
        java.util.List<java.lang.String> strList7 = pathChain0.getExec();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        boolean boolean6 = httpString4.equals(httpString5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1 };
        httpString5.copyTo(byteArray9, (int) (short) 1);
        java.lang.String str12 = httpString5.toString();
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString14 = io.undertow.util.HttpString.EMPTY;
        boolean boolean15 = httpString13.equals(httpString14);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1 };
        httpString14.copyTo(byteArray18, (int) (short) 1);
        io.undertow.util.HttpString httpString21 = new io.undertow.util.HttpString(byteArray18);
        httpString5.copyTo(byteArray18, (int) (short) 0);
        io.undertow.util.HttpString httpString26 = new io.undertow.util.HttpString(byteArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(byteArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 1]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher5 = serializablePathTemplateMatcher0.remove("");
        io.undertow.util.PathTemplate pathTemplate6 = null;
        io.undertow.util.HttpString httpString7 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.EMPTY;
        boolean boolean9 = httpString7.equals(httpString8);
        java.lang.String str10 = httpString7.toString();
        int int11 = httpString7.length();
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        boolean boolean14 = httpString12.equals(httpString13);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1 };
        httpString13.copyTo(byteArray17, (int) (short) 1);
        boolean boolean20 = httpString7.equals(httpString13);
        int int21 = httpString7.length();
        boolean boolean23 = httpString7.equalToString("audit");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher24 = serializablePathTemplateMatcher0.add(pathTemplate6, (java.io.Serializable) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher5);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.undertow.server.HttpHandler[] httpHandlerArray0 = new io.undertow.server.HttpHandler[] {};
        java.util.ArrayList<io.undertow.server.HttpHandler> httpHandlerList1 = new java.util.ArrayList<io.undertow.server.HttpHandler>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.undertow.server.HttpHandler>) httpHandlerList1, httpHandlerArray0);
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList1;
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList1;
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList1;
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList1;
        org.junit.Assert.assertNotNull(httpHandlerArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getPath();
        pathChain0.setPath("Unsupported type of handler provided: \001");
        java.util.List<java.lang.String> strList4 = pathChain0.getExec();
        pathChain0.setSource("\u2192 [Invalid format provided for class label: \001, POST, third]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, 0, 0);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString22.writeTo(outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher6.remove("put");
        io.undertow.util.PathTemplate pathTemplate9 = null;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.EMPTY;
        int int12 = httpString10.compareTo(httpString11);
        io.undertow.util.HttpString httpString14 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean15 = httpString10.equals(httpString14);
        int int16 = httpString10.length();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher17 = serializablePathTemplateMatcher6.add(pathTemplate9, (java.io.Serializable) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        io.undertow.server.HttpHandler[] httpHandlerArray2 = new io.undertow.server.HttpHandler[] {};
        java.util.ArrayList<io.undertow.server.HttpHandler> httpHandlerList3 = new java.util.ArrayList<io.undertow.server.HttpHandler>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<io.undertow.server.HttpHandler>) httpHandlerList3, httpHandlerArray2);
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList3;
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList3;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.util.ArrayList<io.undertow.server.HttpHandler>> httpHandlerListPathMatchResult7 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<java.util.ArrayList<io.undertow.server.HttpHandler>>(strMap0, "auditStackTrace", httpHandlerList3);
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList3;
        org.junit.Assert.assertNotNull(httpHandlerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.lang.String str8 = pathChain0.getMethod();
        pathChain0.setMethod("Chain \001 uses Unknown handler: \001");
        java.lang.String str11 = pathChain0.getPath();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        boolean boolean5 = httpString0.equalToString("Could not construct a handler with values provided as a list: \001");
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.appendTo(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        int int14 = httpString0.length();
        boolean boolean16 = httpString0.equalToString("audit");
        int int17 = httpString0.length();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("\u2192 [Invalid format provided for class label: \001, POST, third]");
        io.undertow.util.PathTemplate pathTemplate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher11 = serializablePathTemplateMatcher0.add(pathTemplate9, (java.io.Serializable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("Configured class: \001 has not been found. Declared label was: \001", strMap1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        int int9 = httpString1.compareTo(httpString8);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            httpString8.copyTo((-1), byteArray13, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[27]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "source", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        java.util.List<java.lang.String> strList5 = pathChain0.getExec();
        java.util.List<java.lang.String> strList6 = pathChain0.getExec();
        pathChain0.setMethod("Conflicting source");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "hi!", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("PUT");
        // The following exception was thrown during execution in test generation
        try {
            byte byte3 = httpString1.byteAt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        boolean boolean4 = httpString0.equalToString("Chain \001 uses Unknown handler: \001");
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        java.lang.String str13 = httpString6.toString();
        io.undertow.util.HttpString httpString14 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        boolean boolean16 = httpString14.equals(httpString15);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1 };
        httpString15.copyTo(byteArray19, (int) (short) 1);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray19);
        httpString6.copyTo(byteArray19, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(byteArray19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.lang.String str8 = pathChain0.getMethod();
        pathChain0.setPath("Could not instantiate handler class: \001");
        pathChain0.setPath("Unsupported type of handler provided: \001");
        pathChain0.setSource("");
        pathChain0.setSource("Invalid format provided for class label: \001");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.toString();
        java.lang.String str2 = pathChain0.toString();
        java.lang.String str3 = pathChain0.toString();
        pathChain0.setSource("Could not construct a handler with values provided as a list: \001");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u2192 null" + "'", str1, "\u2192 null");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2192 null" + "'", str3, "\u2192 null");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        pathChain0.setSource("secondBeforeFirst");
        pathChain0.validate("com.networknt.handler.sample.SampleHttpHandler1@Hello");
        java.lang.String str5 = pathChain0.getPath();
        java.lang.String str6 = pathChain0.getMethod();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1 > -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.tryFromString("ERR10042");
        org.junit.Assert.assertNotNull(httpString1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.lang.String str3 = pathChain0.getSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        java.lang.String str3 = endpoint2.getPath();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Expected an exception to be thrown" + "'", str3, "Expected an exception to be thrown");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult3 = serializablePathTemplateMatcher0.match("third");
        java.io.Serializable serializable5 = serializablePathTemplateMatcher0.get("Configured class: \001 has not been found. Declared label was: \001");
        java.io.Serializable serializable7 = serializablePathTemplateMatcher0.get("@");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializablePathMatchResult3);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.slf4j.Logger logger2 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult3 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unsupported type of handler provided: \001", logger2);
        java.lang.String str4 = loggerPathMatchResult3.getMatchedTemplate();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Unsupported type of handler provided: \001" + "'", str4, "Unsupported type of handler provided: \001");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("Unsupported type of handler provided: \001");
        java.lang.String str2 = httpString1.toString();
        boolean boolean4 = httpString1.equalToString("handler");
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        java.lang.String str13 = httpString6.toString();
        io.undertow.util.HttpString httpString14 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        boolean boolean16 = httpString14.equals(httpString15);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1 };
        httpString15.copyTo(byteArray19, (int) (short) 1);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray19);
        httpString6.copyTo(byteArray19, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray19, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[39]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unsupported type of handler provided: \001" + "'", str2, "Unsupported type of handler provided: \001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("\u2192 [Invalid format provided for class label: \001, POST, third]");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult10 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNull(serializablePathMatchResult10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("Could not instantiate handler class: \001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: Could not instantiate handler class: ? has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("third", "Expected an exception to be thrown@third");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "Unsupported type of handler provided: \001", logger4);
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult6 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unknown handler or chain: \001", logger4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = loggerPathMatchResult6.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = loggerPathMatchResult6.getParameters();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        int int14 = httpString0.length();
        io.undertow.util.HttpString httpString15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = httpString0.compareTo(httpString15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getMethod();
        java.lang.String str7 = endpoint2.toString();
        java.lang.String str8 = endpoint2.getPath();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        java.lang.String str12 = httpString9.toString();
        int int13 = httpString9.length();
        io.undertow.util.HttpString httpString14 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        boolean boolean16 = httpString14.equals(httpString15);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1 };
        httpString15.copyTo(byteArray19, (int) (short) 1);
        boolean boolean22 = httpString9.equals(httpString15);
        java.lang.String str23 = httpString15.toString();
        boolean boolean24 = endpoint2.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "third" + "'", str6, "third");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Expected an exception to be thrown@third" + "'", str7, "Expected an exception to be thrown@third");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Expected an exception to be thrown" + "'", str8, "Expected an exception to be thrown");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.lang.String str8 = pathChain0.getMethod();
        pathChain0.setPath("Could not instantiate handler class: \001");
        pathChain0.setPath("Unsupported type of handler provided: \001");
        pathChain0.setSource("");
        pathChain0.setMethod("@");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.lang.String str4 = pathChain0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2192 null" + "'", str4, "\u2192 null");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals((java.lang.Object) "post");
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1 };
        httpString4.copyTo(byteArray8, (int) (short) 1);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = httpString4.equals(obj11);
        boolean boolean13 = httpString0.equals(httpString4);
        int int14 = httpString4.length();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        java.io.Serializable serializable6 = serializablePathTemplateMatcher0.get("@");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("Hello");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher9 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet10 = serializablePathTemplateMatcher9.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet11 = serializablePathTemplateMatcher9.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult13 = serializablePathTemplateMatcher9.match("audit");
        java.io.Serializable serializable15 = serializablePathTemplateMatcher9.get("@");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult17 = serializablePathTemplateMatcher9.match("Hello");
        java.io.Serializable serializable19 = serializablePathTemplateMatcher9.get("");
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString("PUT");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher23 = serializablePathTemplateMatcher9.add("handler", (java.io.Serializable) "PUT");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher24 = serializablePathTemplateMatcher0.addAll(serializablePathTemplateMatcher9);
        io.undertow.util.PathTemplate pathTemplate25 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher27 = serializablePathTemplateMatcher9.add(pathTemplate25, (java.io.Serializable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNotNull(pathTemplateSet10);
        org.junit.Assert.assertNotNull(pathTemplateSet11);
        org.junit.Assert.assertNull(serializablePathMatchResult13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNull(serializablePathMatchResult17);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher23);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher24);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("audit", "Failed to inject handler.yml paths from: \001");
        java.lang.String str3 = endpoint2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "audit@Failed to inject handler.yml paths from: \001" + "'", str3, "audit@Failed to inject handler.yml paths from: \001");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        java.lang.Object obj14 = null;
        boolean boolean15 = httpString0.equals(obj14);
        io.undertow.util.HttpString httpString17 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString18 = io.undertow.util.HttpString.EMPTY;
        boolean boolean19 = httpString17.equals(httpString18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1 };
        httpString18.copyTo(byteArray22, (int) (short) 1);
        java.lang.String str25 = httpString18.toString();
        io.undertow.util.HttpString httpString26 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString27 = io.undertow.util.HttpString.EMPTY;
        boolean boolean28 = httpString26.equals(httpString27);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1 };
        httpString27.copyTo(byteArray31, (int) (short) 1);
        io.undertow.util.HttpString httpString34 = new io.undertow.util.HttpString(byteArray31);
        httpString18.copyTo(byteArray31, (int) (short) 0);
        io.undertow.util.HttpString httpString39 = new io.undertow.util.HttpString(byteArray31, 0, 0);
        io.undertow.util.HttpString httpString40 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString41 = io.undertow.util.HttpString.EMPTY;
        boolean boolean42 = httpString40.equals(httpString41);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1 };
        httpString41.copyTo(byteArray45, (int) (short) 1);
        httpString39.copyTo(byteArray45, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo(100, byteArray45, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(httpString17);
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(httpString26);
        org.junit.Assert.assertNotNull(httpString27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString40);
        org.junit.Assert.assertNotNull(httpString41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100, 1]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult5 = serializablePathTemplateMatcher0.match("auditOnError");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNull(serializablePathMatchResult5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("post", "PUT");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.networknt.handler.Handler.setConfig("secondBeforeFirst");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        pathChain0.setSource("Expected an exception to be thrown@third");
        com.networknt.handler.config.PathChain pathChain10 = new com.networknt.handler.config.PathChain();
        java.lang.String str11 = pathChain10.getMethod();
        java.lang.String str12 = pathChain10.toString();
        java.lang.String[] strArray37 = new java.lang.String[] { "PUT", "Unsupported type of handler provided: \001", "auditOnError", "com.networknt.handler.sample.SampleHttpHandler1", "secondBeforeFirst", "put", "Could not construct a handler with values provided as a map: \001", "", "and method", "invalid-method", "Could not instantiate handler class: \001", "Could not construct a handler with values provided as a list: \001", "put", "\001 config", "Chain \001 uses Unknown handler: \001", "source", "\u2192 null", "Could not construct a handler with values provided as a list: \001", "com.networknt.handler.sample.SampleHttpHandler1", "Conflicting source", "some-chain", "source", "Failed to inject handler.yml paths from: \001", "some-chain" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        pathChain10.setExec((java.util.List<java.lang.String>) strList38);
        java.lang.String str41 = pathChain10.toString();
        com.networknt.handler.config.PathChain pathChain42 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray46 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        pathChain42.setExec((java.util.List<java.lang.String>) strList47);
        pathChain10.setExec((java.util.List<java.lang.String>) strList47);
        pathChain0.setExec((java.util.List<java.lang.String>) strList47);
        java.lang.String str52 = pathChain0.toString();
        pathChain0.setPath("and method");
        java.lang.String str55 = pathChain0.getSource();
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("com.networknt.handler.sample.SampleHttpHandler1@Hello");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in com.networknt.handler.sample.SampleHttpHandler1@Hello [ Conflicting source: Expected an exception to be thrown@third and path: and method ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u2192 null" + "'", str12, "\u2192 null");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]" + "'", str41, "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u2192 [Invalid format provided for class label: \001, POST, third]" + "'", str52, "\u2192 [Invalid format provided for class label: \001, POST, third]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Expected an exception to be thrown@third" + "'", str55, "Expected an exception to be thrown@third");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher0.remove("");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        pathChain0.setSource("Expected an exception to be thrown@third");
        com.networknt.handler.config.PathChain pathChain10 = new com.networknt.handler.config.PathChain();
        java.lang.String str11 = pathChain10.getMethod();
        java.lang.String str12 = pathChain10.toString();
        java.lang.String[] strArray37 = new java.lang.String[] { "PUT", "Unsupported type of handler provided: \001", "auditOnError", "com.networknt.handler.sample.SampleHttpHandler1", "secondBeforeFirst", "put", "Could not construct a handler with values provided as a map: \001", "", "and method", "invalid-method", "Could not instantiate handler class: \001", "Could not construct a handler with values provided as a list: \001", "put", "\001 config", "Chain \001 uses Unknown handler: \001", "source", "\u2192 null", "Could not construct a handler with values provided as a list: \001", "com.networknt.handler.sample.SampleHttpHandler1", "Conflicting source", "some-chain", "source", "Failed to inject handler.yml paths from: \001", "some-chain" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        pathChain10.setExec((java.util.List<java.lang.String>) strList38);
        java.lang.String str41 = pathChain10.toString();
        com.networknt.handler.config.PathChain pathChain42 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray46 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        pathChain42.setExec((java.util.List<java.lang.String>) strList47);
        pathChain10.setExec((java.util.List<java.lang.String>) strList47);
        pathChain0.setExec((java.util.List<java.lang.String>) strList47);
        java.lang.String str52 = pathChain0.toString();
        pathChain0.setPath("and method");
        java.lang.String str55 = pathChain0.getSource();
        java.lang.Class<?> wildcardClass56 = pathChain0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u2192 null" + "'", str12, "\u2192 null");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]" + "'", str41, "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u2192 [Invalid format provided for class label: \001, POST, third]" + "'", str52, "\u2192 [Invalid format provided for class label: \001, POST, third]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Expected an exception to be thrown@third" + "'", str55, "Expected an exception to be thrown@third");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        boolean boolean5 = httpString0.equalToString("and method");
        boolean boolean7 = httpString0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("auditStackTrace", strMap1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        java.io.Serializable serializable6 = serializablePathTemplateMatcher0.get("@");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("Hello");
        java.io.Serializable serializable10 = serializablePathTemplateMatcher0.get("");
        io.undertow.util.HttpString httpString13 = new io.undertow.util.HttpString("PUT");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher14 = serializablePathTemplateMatcher0.add("handler", (java.io.Serializable) "PUT");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet15 = serializablePathTemplateMatcher0.getPathTemplates();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher14);
        org.junit.Assert.assertNotNull(pathTemplateSet15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        int int20 = httpString1.length();
        boolean boolean22 = httpString1.equalToString("\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        // The following exception was thrown during execution in test generation
        try {
            byte byte24 = httpString1.byteAt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "Chain \001 uses Unknown handler: \001", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.lang.String str8 = pathChain0.getMethod();
        pathChain0.setPath("Could not instantiate handler class: \001");
        pathChain0.setSource("Unsupported type of handler provided: \001");
        java.util.List<java.lang.String> strList13 = pathChain0.getExec();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getSource();
        java.lang.String str2 = pathChain0.getMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("Could not construct a handler with values provided as a map: \001", strMap1);
        java.lang.String str3 = pathTemplateMatch2.getMatchedTemplate();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = pathTemplateMatch2.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = pathTemplateMatch2.getParameters();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Could not construct a handler with values provided as a map: \001" + "'", str3, "Could not construct a handler with values provided as a map: \001");
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("third", strMap1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("POST");
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1 };
        httpString4.copyTo(byteArray8, (int) (short) 1);
        io.undertow.util.HttpString httpString11 = new io.undertow.util.HttpString(byteArray8);
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString13 = io.undertow.util.HttpString.EMPTY;
        boolean boolean14 = httpString12.equals(httpString13);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1 };
        httpString13.copyTo(byteArray17, (int) (short) 1);
        io.undertow.util.HttpString httpString20 = new io.undertow.util.HttpString(byteArray17);
        httpString11.copyTo(byteArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo((int) (short) 100, byteArray17, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.undertow.util.PathTemplateMatcher<java.util.AbstractCollection<io.undertow.server.HttpHandler>> httpHandlerCollectionPathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.util.AbstractCollection<io.undertow.server.HttpHandler>>();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        int int2 = httpString0.compareTo(httpString1);
        io.undertow.util.HttpString httpString4 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean5 = httpString0.equals(httpString4);
        boolean boolean7 = httpString0.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        java.io.Serializable serializable8 = serializablePathTemplateMatcher0.get("audit");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Invalid format provided for class label: \001", "Expected an exception to be thrown");
        boolean boolean4 = endpoint2.equals((java.lang.Object) (-1));
        java.lang.String str5 = endpoint2.getMethod();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Expected an exception to be thrown" + "'", str5, "Expected an exception to be thrown");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        pathChain0.setSource("Expected an exception to be thrown@third");
        com.networknt.handler.config.PathChain pathChain10 = new com.networknt.handler.config.PathChain();
        java.lang.String str11 = pathChain10.toString();
        com.networknt.handler.config.PathChain pathChain12 = new com.networknt.handler.config.PathChain();
        java.lang.String str13 = pathChain12.getMethod();
        java.lang.String str14 = pathChain12.toString();
        java.lang.String[] strArray39 = new java.lang.String[] { "PUT", "Unsupported type of handler provided: \001", "auditOnError", "com.networknt.handler.sample.SampleHttpHandler1", "secondBeforeFirst", "put", "Could not construct a handler with values provided as a map: \001", "", "and method", "invalid-method", "Could not instantiate handler class: \001", "Could not construct a handler with values provided as a list: \001", "put", "\001 config", "Chain \001 uses Unknown handler: \001", "source", "\u2192 null", "Could not construct a handler with values provided as a list: \001", "com.networknt.handler.sample.SampleHttpHandler1", "Conflicting source", "some-chain", "source", "Failed to inject handler.yml paths from: \001", "some-chain" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        pathChain12.setExec((java.util.List<java.lang.String>) strList40);
        java.lang.String str43 = pathChain12.toString();
        com.networknt.handler.config.PathChain pathChain44 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray48 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        pathChain44.setExec((java.util.List<java.lang.String>) strList49);
        pathChain12.setExec((java.util.List<java.lang.String>) strList49);
        pathChain10.setExec((java.util.List<java.lang.String>) strList49);
        pathChain0.setExec((java.util.List<java.lang.String>) strList49);
        pathChain0.setSource("Configured class: \001 has not been found");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u2192 null" + "'", str11, "\u2192 null");
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u2192 null" + "'", str14, "\u2192 null");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]" + "'", str43, "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult3 = serializablePathTemplateMatcher0.match("third");
        java.io.Serializable serializable5 = serializablePathTemplateMatcher0.get("Configured class: \001 has not been found. Declared label was: \001");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet6 = serializablePathTemplateMatcher0.getPathTemplates();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializablePathMatchResult3);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNotNull(pathTemplateSet6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        com.networknt.handler.config.PathChain pathChain3 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray7 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        pathChain3.setExec((java.util.List<java.lang.String>) strList8);
        pathChain3.setSource("Expected an exception to be thrown@third");
        com.networknt.handler.config.PathChain pathChain13 = new com.networknt.handler.config.PathChain();
        java.lang.String str14 = pathChain13.getMethod();
        java.lang.String str15 = pathChain13.toString();
        java.lang.String[] strArray40 = new java.lang.String[] { "PUT", "Unsupported type of handler provided: \001", "auditOnError", "com.networknt.handler.sample.SampleHttpHandler1", "secondBeforeFirst", "put", "Could not construct a handler with values provided as a map: \001", "", "and method", "invalid-method", "Could not instantiate handler class: \001", "Could not construct a handler with values provided as a list: \001", "put", "\001 config", "Chain \001 uses Unknown handler: \001", "source", "\u2192 null", "Could not construct a handler with values provided as a list: \001", "com.networknt.handler.sample.SampleHttpHandler1", "Conflicting source", "some-chain", "source", "Failed to inject handler.yml paths from: \001", "some-chain" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        pathChain13.setExec((java.util.List<java.lang.String>) strList41);
        java.lang.String str44 = pathChain13.toString();
        com.networknt.handler.config.PathChain pathChain45 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray49 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        pathChain45.setExec((java.util.List<java.lang.String>) strList50);
        pathChain13.setExec((java.util.List<java.lang.String>) strList50);
        pathChain3.setExec((java.util.List<java.lang.String>) strList50);
        boolean boolean55 = endpoint2.equals((java.lang.Object) strList50);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u2192 null" + "'", str15, "\u2192 null");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]" + "'", str44, "\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = com.networknt.handler.LightHttpHandler.auditConfig;
        boolean boolean4 = endpoint2.equals((java.lang.Object) strMap3);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        java.util.List<java.lang.String> strList5 = pathChain0.getExec();
        pathChain0.setSource("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("some-chain", strMap1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "Unsupported type of handler provided: \001", logger4);
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult6 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unknown handler or chain: \001", logger4);
        org.slf4j.Logger logger7 = loggerPathMatchResult6.getValue();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        java.io.Serializable serializable6 = serializablePathTemplateMatcher0.get("@");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("Hello");
        java.io.Serializable serializable10 = serializablePathTemplateMatcher0.get("");
        io.undertow.util.HttpString httpString13 = new io.undertow.util.HttpString("PUT");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher14 = serializablePathTemplateMatcher0.add("handler", (java.io.Serializable) "PUT");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet15 = serializablePathTemplateMatcher14.getPathTemplates();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher14);
        org.junit.Assert.assertNotNull(pathTemplateSet15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString9.appendTo(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher5 = serializablePathTemplateMatcher0.remove("");
        java.io.Serializable serializable7 = null;
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher0.add("com.networknt.handler.sample.SampleHttpHandler1@Hello", serializable7);
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher5);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = httpString1.byteAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.tryFromString("source");
        io.undertow.util.HttpString httpString2 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        boolean boolean4 = httpString2.equals(httpString3);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1 };
        httpString3.copyTo(byteArray7, (int) (short) 1);
        io.undertow.util.HttpString httpString10 = new io.undertow.util.HttpString(byteArray7);
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString12 = io.undertow.util.HttpString.EMPTY;
        boolean boolean13 = httpString11.equals(httpString12);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1 };
        httpString12.copyTo(byteArray16, (int) (short) 1);
        io.undertow.util.HttpString httpString19 = new io.undertow.util.HttpString(byteArray16);
        httpString10.copyTo(byteArray16, 0);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray16);
        io.undertow.util.HttpString httpString23 = new io.undertow.util.HttpString(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray16, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        pathChain0.setSource("ERR10042");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        pathChain0.setMethod("Configured class: \001 has not been found. Declared label was: \001");
        pathChain0.setPath("ERR10042");
        java.lang.String str10 = pathChain0.getPath();
        java.lang.String str11 = pathChain0.getMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ERR10042" + "'", str10, "ERR10042");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Configured class: \001 has not been found. Declared label was: \001" + "'", str11, "Configured class: \001 has not been found. Declared label was: \001");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getSource();
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("Unsupported type of handler provided: \001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in Unsupported type of handler provided: ? [ You must specify either path or source ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("\u2192 [Invalid format provided for class label: \001, POST, third]");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.remove("third");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("\001 config", "Hello");
        java.lang.String str3 = endpoint2.getMethod();
        boolean boolean5 = endpoint2.equals((java.lang.Object) "@");
        java.lang.String str6 = endpoint2.getMethod();
        java.lang.String str7 = endpoint2.toString();
        java.lang.String str8 = endpoint2.getPath();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hello" + "'", str3, "Hello");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello" + "'", str6, "Hello");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001 config@Hello" + "'", str7, "\001 config@Hello");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001 config" + "'", str8, "\001 config");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "Unsupported type of handler provided: \001", logger4);
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult6 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unknown handler or chain: \001", logger4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = loggerPathMatchResult6.getParameters();
        org.slf4j.Logger logger8 = loggerPathMatchResult6.getValue();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "com.networknt.handler.sample.SampleHttpHandler1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("\u2192 [Invalid format provided for class label: \001, POST, third]", "Invalid format provided for class label: \001");
        java.lang.String str3 = endpoint2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2192 [Invalid format provided for class label: \001, POST, third]@Invalid format provided for class label: \001" + "'", str3, "\u2192 [Invalid format provided for class label: \001, POST, third]@Invalid format provided for class label: \001");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet11 = serializablePathTemplateMatcher10.getPathTemplates();
        java.lang.Class<?> wildcardClass12 = serializablePathTemplateMatcher10.getClass();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
        org.junit.Assert.assertNotNull(pathTemplateSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = httpString1.equals(obj8);
        io.undertow.util.HttpString httpString11 = new io.undertow.util.HttpString("and method");
        int int12 = httpString1.compareTo(httpString11);
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        int int9 = httpString1.compareTo(httpString8);
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.EMPTY;
        boolean boolean12 = httpString10.equals(httpString11);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1 };
        httpString11.copyTo(byteArray15, (int) (short) 1);
        io.undertow.util.HttpString httpString18 = new io.undertow.util.HttpString(byteArray15);
        io.undertow.util.HttpString httpString19 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString20 = io.undertow.util.HttpString.EMPTY;
        boolean boolean21 = httpString19.equals(httpString20);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1 };
        httpString20.copyTo(byteArray24, (int) (short) 1);
        io.undertow.util.HttpString httpString27 = new io.undertow.util.HttpString(byteArray24);
        httpString18.copyTo(byteArray24, 0);
        io.undertow.util.HttpString httpString30 = new io.undertow.util.HttpString(byteArray24);
        io.undertow.util.HttpString httpString31 = new io.undertow.util.HttpString(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray24, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString19);
        org.junit.Assert.assertNotNull(httpString20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 1]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        int int9 = httpString1.compareTo(httpString8);
        java.nio.ByteBuffer byteBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString8.appendTo(byteBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher2 = serializablePathTemplateMatcher0.remove("@");
        java.lang.Class<?> wildcardClass3 = serializablePathTemplateMatcher2.getClass();
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        java.lang.String str6 = pathChain0.getSource();
        java.lang.String str7 = pathChain0.toString();
        pathChain0.setPath("PUT");
        pathChain0.setPath("and path");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2192 null" + "'", str7, "\u2192 null");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        int int14 = httpString0.length();
        boolean boolean16 = httpString0.equalToString("PUT");
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        int int11 = httpString9.length();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("Unsupported type of handler provided: \001");
        java.lang.String str2 = httpString1.toString();
        int int3 = httpString1.length();
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString1.appendTo(byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unsupported type of handler provided: \001" + "'", str2, "Unsupported type of handler provided: \001");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getMethod();
        java.lang.String str7 = endpoint2.toString();
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet9 = serializablePathTemplateMatcher8.getPathTemplates();
        java.io.Serializable serializable11 = serializablePathTemplateMatcher8.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher14 = serializablePathTemplateMatcher8.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString17 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher18 = serializablePathTemplateMatcher8.add("ERR10042", (java.io.Serializable) httpString17);
        boolean boolean19 = endpoint2.equals((java.lang.Object) "ERR10042");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "third" + "'", str6, "third");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Expected an exception to be thrown@third" + "'", str7, "Expected an exception to be thrown@third");
        org.junit.Assert.assertNotNull(pathTemplateSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher14);
        org.junit.Assert.assertNotNull(httpString17);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("auditStackTrace");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: auditStackTrace has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("com.networknt.handler.sample.SampleHttpHandler1", "Chain \001 uses Unknown handler: \001");
        java.lang.String str3 = endpoint2.getPath();
        java.util.Map<java.lang.String, java.util.List<io.undertow.server.HttpHandler>> strMap4 = com.networknt.handler.Handler.handlerListById;
        boolean boolean5 = endpoint2.equals((java.lang.Object) strMap4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.networknt.handler.sample.SampleHttpHandler1" + "'", str3, "com.networknt.handler.sample.SampleHttpHandler1");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher7 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) 100);
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher9 = serializablePathTemplateMatcher0.remove("com.networknt.handler.sample.SampleHttpHandler1");
        java.io.Serializable serializable11 = serializablePathTemplateMatcher9.get("");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher7);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher9);
        org.junit.Assert.assertNull(serializable11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher2 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet3 = serializablePathTemplateMatcher2.getPathTemplates();
        java.io.Serializable serializable5 = serializablePathTemplateMatcher2.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher2.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher12 = serializablePathTemplateMatcher2.add("ERR10042", (java.io.Serializable) httpString11);
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet13 = serializablePathTemplateMatcher12.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.util.Set<io.undertow.util.PathTemplate>> pathTemplateSetPathMatchResult14 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<java.util.Set<io.undertow.util.PathTemplate>>(strMap0, "\u2192 [Invalid format provided for class label: \001, POST, third]@Invalid format provided for class label: \001", pathTemplateSet13);
        org.junit.Assert.assertNotNull(pathTemplateSet3);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher12);
        org.junit.Assert.assertNotNull(pathTemplateSet13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        io.undertow.util.HttpString httpString13 = new io.undertow.util.HttpString(byteArray10);
        io.undertow.util.HttpString httpString14 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString15 = io.undertow.util.HttpString.EMPTY;
        boolean boolean16 = httpString14.equals(httpString15);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1 };
        httpString15.copyTo(byteArray19, (int) (short) 1);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray19);
        httpString13.copyTo(byteArray19, 0);
        io.undertow.util.HttpString httpString25 = new io.undertow.util.HttpString(byteArray19);
        io.undertow.util.HttpString httpString26 = new io.undertow.util.HttpString(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            httpString0.copyTo((int) '4', byteArray19, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 104 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        pathChain0.setMethod("Unsupported type of handler provided: \001");
        pathChain0.setMethod("Unknown handler or chain: \001");
        pathChain0.setSource("com.networknt.handler.sample.SampleHttpHandler1@Hello");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "invalid-method", logger4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = loggerPathMatchResult5.getParameters();
        org.slf4j.Logger logger7 = loggerPathMatchResult5.getValue();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult8 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "put", logger7);
        java.lang.Class<?> wildcardClass9 = logger7.getClass();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getPath();
        pathChain0.setPath("Unsupported type of handler provided: \001");
        java.lang.String str4 = pathChain0.getMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher6.remove("put");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult10 = serializablePathTemplateMatcher6.match("POST");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
        org.junit.Assert.assertNull(serializablePathMatchResult10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.tryFromString("hi!");
        org.junit.Assert.assertNotNull(httpString1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        java.lang.String str5 = pathChain0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("@");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in @ [ You must specify either path or source | Invalid HTTP method: secondBeforeFirst ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        int int14 = httpString0.length();
        boolean boolean16 = httpString0.equalToString("audit");
        io.undertow.util.HttpString httpString18 = new io.undertow.util.HttpString("Unsupported type of handler provided: \001");
        java.lang.String str19 = httpString18.toString();
        io.undertow.util.HttpString httpString20 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString21 = io.undertow.util.HttpString.EMPTY;
        boolean boolean22 = httpString20.equals(httpString21);
        java.lang.String str23 = httpString20.toString();
        boolean boolean25 = httpString20.equalToString("Could not construct a handler with values provided as a list: \001");
        boolean boolean26 = httpString18.equals(httpString20);
        io.undertow.util.AttachmentKey<io.undertow.util.PathTemplateMatch> pathTemplateMatchAttachmentKey27 = io.undertow.util.PathTemplateMatch.ATTACHMENT_KEY;
        boolean boolean28 = httpString20.equals((java.lang.Object) pathTemplateMatchAttachmentKey27);
        io.undertow.util.HttpString httpString29 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString30 = io.undertow.util.HttpString.EMPTY;
        int int31 = httpString29.compareTo(httpString30);
        boolean boolean32 = httpString20.equals(httpString30);
        int int33 = httpString0.compareTo(httpString30);
        boolean boolean35 = httpString0.equalToString("\001 config@Hello");
        java.nio.ByteBuffer byteBuffer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.appendTo(byteBuffer36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unsupported type of handler provided: \001" + "'", str19, "Unsupported type of handler provided: \001");
        org.junit.Assert.assertNotNull(httpString20);
        org.junit.Assert.assertNotNull(httpString21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(pathTemplateMatchAttachmentKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(httpString29);
        org.junit.Assert.assertNotNull(httpString30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "auditOnError", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString0.writeTo(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        pathChain0.setMethod("Unsupported type of handler provided: \001");
        pathChain0.setMethod("Unknown handler or chain: \001");
        java.util.List<java.lang.String> strList5 = null;
        pathChain0.setExec(strList5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.slf4j.Logger logger2 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult3 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "invalid-method", logger2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = loggerPathMatchResult3.getParameters();
        org.slf4j.Logger logger5 = loggerPathMatchResult3.getValue();
        org.slf4j.Logger logger6 = loggerPathMatchResult3.getValue();
        org.slf4j.Logger logger7 = loggerPathMatchResult3.getValue();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("Invalid format provided for class label: \001");
        java.lang.Class<?> wildcardClass2 = httpString1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher6.remove("put");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet9 = serializablePathTemplateMatcher8.getPathTemplates();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
        org.junit.Assert.assertNotNull(pathTemplateSet9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, 0, 0);
        io.undertow.util.HttpString httpString23 = new io.undertow.util.HttpString(byteArray14);
        java.nio.ByteBuffer byteBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpString23.appendTo(byteBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher6.remove("put");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher11 = serializablePathTemplateMatcher8.add("secondBeforeFirst", (java.io.Serializable) "and method");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher8);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        pathChain0.setSource("Expected an exception to be thrown@third");
        java.util.List<java.lang.String> strList10 = pathChain0.getExec();
        pathChain0.setPath("some-chain");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        java.lang.String str3 = pathChain0.getPath();
        pathChain0.setPath("\u2192 null");
        java.lang.String str6 = pathChain0.getMethod();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        pathChain0.setSource("secondBeforeFirst");
        pathChain0.setSource("\001 config");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        java.lang.String str5 = pathChain0.getPath();
        java.lang.Class<?> wildcardClass6 = pathChain0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.undertow.server.HttpServerExchange httpServerExchange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange0, "and path", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult10 = serializablePathTemplateMatcher0.match("com.networknt.handler.sample.SampleHttpHandler1");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet11 = serializablePathTemplateMatcher0.getPathTemplates();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNull(serializablePathMatchResult10);
        org.junit.Assert.assertNotNull(pathTemplateSet11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("\u2192 [Invalid format provided for class label: \001, POST, third]");
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet9 = serializablePathTemplateMatcher0.getPathTemplates();
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNotNull(pathTemplateSet9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString6 = new io.undertow.util.HttpString(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UT000149: HttpString is not allowed to contain newlines. value: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 10, -1]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        pathChain0.setMethod("secondBeforeFirst");
        pathChain0.setSource("ERR10042");
        java.lang.String str7 = pathChain0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, 0, 0);
        int int23 = httpString22.length();
        // The following exception was thrown during execution in test generation
        try {
            byte byte25 = httpString22.byteAt((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("\u2192 [Invalid format provided for class label: \001, POST, third]", strMap1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.utility.Tuple<java.lang.String, java.lang.Class> strTuple1 = com.networknt.handler.Handler.splitClassAndName("Could not construct a handler with values provided as a list: \001");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configured class: Could not construct a handler with values provided as a list: ? has not been found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getMethod();
        java.lang.String str7 = endpoint2.toString();
        java.lang.String str8 = endpoint2.toString();
        java.lang.String str9 = endpoint2.toString();
        java.lang.String str10 = endpoint2.getPath();
        java.lang.String str11 = endpoint2.getPath();
        java.lang.String str12 = endpoint2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "third" + "'", str6, "third");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Expected an exception to be thrown@third" + "'", str7, "Expected an exception to be thrown@third");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Expected an exception to be thrown@third" + "'", str8, "Expected an exception to be thrown@third");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Expected an exception to be thrown@third" + "'", str9, "Expected an exception to be thrown@third");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Expected an exception to be thrown" + "'", str10, "Expected an exception to be thrown");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Expected an exception to be thrown" + "'", str11, "Expected an exception to be thrown");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Expected an exception to be thrown@third" + "'", str12, "Expected an exception to be thrown@third");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getMethod();
        java.lang.String str7 = endpoint2.toString();
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        int int10 = httpString8.compareTo(httpString9);
        io.undertow.util.HttpString httpString12 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean13 = httpString8.equals(httpString12);
        boolean boolean14 = endpoint2.equals((java.lang.Object) boolean13);
        boolean boolean16 = endpoint2.equals((java.lang.Object) 0.0d);
        java.lang.String str17 = endpoint2.getPath();
        java.lang.String str18 = endpoint2.getPath();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "third" + "'", str6, "third");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Expected an exception to be thrown@third" + "'", str7, "Expected an exception to be thrown@third");
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Expected an exception to be thrown" + "'", str17, "Expected an exception to be thrown");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Expected an exception to be thrown" + "'", str18, "Expected an exception to be thrown");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        io.undertow.util.PathTemplateMatcher<java.util.List<io.undertow.server.HttpHandler>> httpHandlerListPathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.util.List<io.undertow.server.HttpHandler>>();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher9 = serializablePathTemplateMatcher0.add("put", (java.io.Serializable) "Configured class: \001 has not been found. Declared label was: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher11 = serializablePathTemplateMatcher9.remove("post");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher11);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher2 = serializablePathTemplateMatcher0.remove("@");
        io.undertow.util.PathTemplate pathTemplate3 = null;
        io.undertow.server.HttpHandler[] httpHandlerArray4 = new io.undertow.server.HttpHandler[] {};
        java.util.ArrayList<io.undertow.server.HttpHandler> httpHandlerList5 = new java.util.ArrayList<io.undertow.server.HttpHandler>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<io.undertow.server.HttpHandler>) httpHandlerList5, httpHandlerArray4);
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList5;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher8 = serializablePathTemplateMatcher2.add(pathTemplate3, (java.io.Serializable) httpHandlerList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher2);
        org.junit.Assert.assertNotNull(httpHandlerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.util.List<java.lang.String> strList8 = pathChain0.getExec();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        boolean boolean5 = httpString0.equalToString("Unknown handler or chain: \001");
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        org.slf4j.Logger logger2 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult3 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "invalid-method", logger2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = loggerPathMatchResult3.getParameters();
        java.lang.String str5 = loggerPathMatchResult3.getMatchedTemplate();
        org.slf4j.Logger logger6 = loggerPathMatchResult3.getValue();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "invalid-method" + "'", str5, "invalid-method");
        org.junit.Assert.assertNotNull(logger6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet11 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplate pathTemplate12 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher14 = serializablePathTemplateMatcher0.add(pathTemplate12, (java.io.Serializable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
        org.junit.Assert.assertNotNull(pathTemplateSet11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet2 = serializablePathTemplateMatcher0.getPathTemplates();
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult4 = serializablePathTemplateMatcher0.match("audit");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult6 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult8 = serializablePathTemplateMatcher0.match("Unsupported type of handler provided: \001");
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.io.Serializable> serializablePathMatchResult10 = serializablePathTemplateMatcher0.match("com.networknt.handler.sample.SampleHttpHandler1");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher12 = serializablePathTemplateMatcher0.remove("Expected an exception to be thrown@third");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNotNull(pathTemplateSet2);
        org.junit.Assert.assertNull(serializablePathMatchResult4);
        org.junit.Assert.assertNull(serializablePathMatchResult6);
        org.junit.Assert.assertNull(serializablePathMatchResult8);
        org.junit.Assert.assertNull(serializablePathMatchResult10);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        java.lang.String str6 = pathChain0.getSource();
        pathChain0.setPath("and path");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "ERR10042");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        io.undertow.util.AttachmentKey<io.undertow.util.PathTemplateMatch> pathTemplateMatchAttachmentKey2 = io.undertow.util.PathTemplateMatch.ATTACHMENT_KEY;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<io.undertow.util.AttachmentKey<io.undertow.util.PathTemplateMatch>> pathTemplateMatchAttachmentKeyPathMatchResult3 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<io.undertow.util.AttachmentKey<io.undertow.util.PathTemplateMatch>>(strMap0, "secondBeforeFirst", pathTemplateMatchAttachmentKey2);
        org.junit.Assert.assertNotNull(pathTemplateMatchAttachmentKey2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.PathTemplate pathTemplate7 = null;
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        int int10 = httpString8.compareTo(httpString9);
        io.undertow.util.HttpString httpString12 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean13 = httpString8.equals(httpString12);
        int int14 = httpString8.length();
        java.lang.String str15 = httpString8.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher16 = serializablePathTemplateMatcher0.add(pathTemplate7, (java.io.Serializable) httpString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1 };
        httpString1.copyTo(byteArray5, (int) (short) 1);
        java.lang.String str8 = httpString1.toString();
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        boolean boolean11 = httpString9.equals(httpString10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1 };
        httpString10.copyTo(byteArray14, (int) (short) 1);
        io.undertow.util.HttpString httpString17 = new io.undertow.util.HttpString(byteArray14);
        httpString1.copyTo(byteArray14, (int) (short) 0);
        io.undertow.util.HttpString httpString22 = new io.undertow.util.HttpString(byteArray14, 0, 0);
        io.undertow.util.HttpString httpString23 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString24 = io.undertow.util.HttpString.EMPTY;
        boolean boolean25 = httpString23.equals(httpString24);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1 };
        httpString24.copyTo(byteArray28, (int) (short) 1);
        httpString22.copyTo(byteArray28, (int) (byte) 1);
        io.undertow.util.HttpString httpString35 = io.undertow.util.HttpString.tryFromString("source");
        io.undertow.util.HttpString httpString36 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString37 = io.undertow.util.HttpString.EMPTY;
        int int38 = httpString36.compareTo(httpString37);
        io.undertow.util.HttpString httpString40 = new io.undertow.util.HttpString("auditOnError");
        boolean boolean41 = httpString36.equals(httpString40);
        io.undertow.util.HttpString httpString42 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString43 = io.undertow.util.HttpString.EMPTY;
        boolean boolean44 = httpString42.equals(httpString43);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 1 };
        httpString43.copyTo(byteArray47, (int) (short) 1);
        io.undertow.util.HttpString httpString50 = new io.undertow.util.HttpString(byteArray47);
        httpString36.copyTo(byteArray47, (int) (short) 0);
        io.undertow.util.HttpString httpString53 = new io.undertow.util.HttpString(byteArray47);
        io.undertow.util.HttpString httpString54 = new io.undertow.util.HttpString(byteArray47);
        httpString35.copyTo(byteArray47, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            httpString22.copyTo((int) (byte) 100, byteArray47, (int) (short) 1, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 139 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString23);
        org.junit.Assert.assertNotNull(httpString24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 1]");
        org.junit.Assert.assertNotNull(httpString35);
        org.junit.Assert.assertNotNull(httpString36);
        org.junit.Assert.assertNotNull(httpString37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(httpString42);
        org.junit.Assert.assertNotNull(httpString43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 1]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.slf4j.Logger logger4 = com.networknt.handler.LightHttpHandler.logger;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult5 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap2, "Unsupported type of handler provided: \001", logger4);
        io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger> loggerPathMatchResult6 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<org.slf4j.Logger>(strMap0, "Unknown handler or chain: \001", logger4);
        java.lang.String str7 = loggerPathMatchResult6.getMatchedTemplate();
        java.lang.String str8 = loggerPathMatchResult6.getMatchedTemplate();
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unknown handler or chain: \001" + "'", str7, "Unknown handler or chain: \001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown handler or chain: \001" + "'", str8, "Unknown handler or chain: \001");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("\001 config", "Hello");
        java.lang.String str3 = endpoint2.getMethod();
        boolean boolean5 = endpoint2.equals((java.lang.Object) "@");
        java.lang.String str6 = endpoint2.toString();
        java.lang.String str7 = endpoint2.toString();
        java.lang.String str8 = endpoint2.getMethod();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hello" + "'", str3, "Hello");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001 config@Hello" + "'", str6, "\001 config@Hello");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001 config@Hello" + "'", str7, "\001 config@Hello");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello" + "'", str8, "Hello");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        io.undertow.server.HttpHandler[] httpHandlerArray2 = new io.undertow.server.HttpHandler[] {};
        java.util.ArrayList<io.undertow.server.HttpHandler> httpHandlerList3 = new java.util.ArrayList<io.undertow.server.HttpHandler>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<io.undertow.server.HttpHandler>) httpHandlerList3, httpHandlerArray2);
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList3;
        com.networknt.handler.Handler.defaultHandlers = httpHandlerList3;
        io.undertow.util.PathTemplateMatcher.PathMatchResult<java.util.ArrayList<io.undertow.server.HttpHandler>> httpHandlerListPathMatchResult7 = new io.undertow.util.PathTemplateMatcher.PathMatchResult<java.util.ArrayList<io.undertow.server.HttpHandler>>(strMap0, "auditStackTrace", httpHandlerList3);
        java.lang.String str8 = httpHandlerListPathMatchResult7.getMatchedTemplate();
        org.junit.Assert.assertNotNull(httpHandlerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "auditStackTrace" + "'", str8, "auditStackTrace");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("", "@");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.util.List<java.lang.String> strList2 = pathChain0.getExec();
        java.util.List<java.lang.String> strList3 = pathChain0.getExec();
        java.util.List<java.lang.String> strList4 = null;
        pathChain0.setExec(strList4);
        pathChain0.setPath("\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String str1 = pathChain0.getMethod();
        java.lang.String str2 = pathChain0.toString();
        pathChain0.setMethod("ERR10042");
        java.lang.String str5 = pathChain0.getPath();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2192 null" + "'", str2, "\u2192 null");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.networknt.handler.config.EndpointSource.Endpoint endpoint2 = new com.networknt.handler.config.EndpointSource.Endpoint("Expected an exception to be thrown", "third");
        boolean boolean4 = endpoint2.equals((java.lang.Object) "POST");
        java.lang.String str5 = endpoint2.getMethod();
        java.lang.String str6 = endpoint2.getMethod();
        java.lang.String str7 = endpoint2.toString();
        java.lang.String str8 = endpoint2.toString();
        java.lang.String str9 = endpoint2.toString();
        io.undertow.util.HttpString httpString10 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString11 = io.undertow.util.HttpString.EMPTY;
        boolean boolean12 = httpString10.equals(httpString11);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1 };
        httpString11.copyTo(byteArray15, (int) (short) 1);
        java.lang.String str18 = httpString11.toString();
        io.undertow.util.HttpString httpString19 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString20 = io.undertow.util.HttpString.EMPTY;
        boolean boolean21 = httpString19.equals(httpString20);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1 };
        httpString20.copyTo(byteArray24, (int) (short) 1);
        io.undertow.util.HttpString httpString27 = new io.undertow.util.HttpString(byteArray24);
        httpString11.copyTo(byteArray24, (int) (short) 0);
        int int30 = httpString11.length();
        boolean boolean32 = httpString11.equalToString("\u2192 [PUT, Unsupported type of handler provided: \001, auditOnError, com.networknt.handler.sample.SampleHttpHandler1, secondBeforeFirst, put, Could not construct a handler with values provided as a map: \001, , and method, invalid-method, Could not instantiate handler class: \001, Could not construct a handler with values provided as a list: \001, put, \001 config, Chain \001 uses Unknown handler: \001\u2192 null, Could not construct a handler with values provided as a list: \001, com.networknt.handler.sample.SampleHttpHandler1, Conflicting source, some-chain, source, Failed to inject handler.yml paths from: \001, some-chain]");
        boolean boolean33 = endpoint2.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "third" + "'", str5, "third");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "third" + "'", str6, "third");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Expected an exception to be thrown@third" + "'", str7, "Expected an exception to be thrown@third");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Expected an exception to be thrown@third" + "'", str8, "Expected an exception to be thrown@third");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Expected an exception to be thrown@third" + "'", str9, "Expected an exception to be thrown@third");
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(httpString19);
        org.junit.Assert.assertNotNull(httpString20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        io.undertow.util.PathTemplateMatch pathTemplateMatch2 = new io.undertow.util.PathTemplateMatch("Could not construct a handler with values provided as a map: \001", strMap1);
        java.lang.String str3 = pathTemplateMatch2.getMatchedTemplate();
        java.lang.String str4 = pathTemplateMatch2.getMatchedTemplate();
        java.lang.String str5 = pathTemplateMatch2.getMatchedTemplate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Could not construct a handler with values provided as a map: \001" + "'", str3, "Could not construct a handler with values provided as a map: \001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Could not construct a handler with values provided as a map: \001" + "'", str4, "Could not construct a handler with values provided as a map: \001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Could not construct a handler with values provided as a map: \001" + "'", str5, "Could not construct a handler with values provided as a map: \001");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HttpString httpString1 = new io.undertow.util.HttpString("Unsupported type of handler provided: \001\u2192 [Invalid format provided for class label: \001, POST, third]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid string contents Unsupported type of handler provided: ?@null ? [Invalid format provided for class label: ?, POST, third]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        java.lang.String str3 = httpString0.toString();
        int int4 = httpString0.length();
        io.undertow.util.HttpString httpString5 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString6 = io.undertow.util.HttpString.EMPTY;
        boolean boolean7 = httpString5.equals(httpString6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        httpString6.copyTo(byteArray10, (int) (short) 1);
        boolean boolean13 = httpString0.equals(httpString6);
        java.lang.String str14 = httpString6.toString();
        java.lang.String str15 = httpString6.toString();
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher0 = new io.undertow.util.PathTemplateMatcher<java.io.Serializable>();
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet1 = serializablePathTemplateMatcher0.getPathTemplates();
        java.io.Serializable serializable3 = serializablePathTemplateMatcher0.get("invalid-method");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher6 = serializablePathTemplateMatcher0.add("third", (java.io.Serializable) "hi!");
        io.undertow.util.HttpString httpString9 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        io.undertow.util.PathTemplateMatcher<java.io.Serializable> serializablePathTemplateMatcher10 = serializablePathTemplateMatcher0.add("ERR10042", (java.io.Serializable) httpString9);
        java.util.Set<io.undertow.util.PathTemplate> pathTemplateSet11 = serializablePathTemplateMatcher10.getPathTemplates();
        java.io.Serializable serializable13 = serializablePathTemplateMatcher10.get("Expected an exception to be thrown");
        org.junit.Assert.assertNotNull(pathTemplateSet1);
        org.junit.Assert.assertNull(serializable3);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher6);
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(serializablePathTemplateMatcher10);
        org.junit.Assert.assertNotNull(pathTemplateSet11);
        org.junit.Assert.assertNull(serializable13);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.networknt.handler.config.PathChain pathChain0 = new com.networknt.handler.config.PathChain();
        java.lang.String[] strArray4 = new java.lang.String[] { "Invalid format provided for class label: \001", "POST", "third" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        pathChain0.setExec((java.util.List<java.lang.String>) strList5);
        java.lang.String str8 = pathChain0.getMethod();
        pathChain0.setPath("Could not instantiate handler class: \001");
        pathChain0.setPath("Unsupported type of handler provided: \001");
        pathChain0.setSource("");
        java.lang.String str15 = pathChain0.getPath();
        java.lang.String str16 = pathChain0.toString();
        // The following exception was thrown during execution in test generation
        try {
            pathChain0.validate("\u2192 null");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in null() ? null [ Conflicting source:  and path: Unsupported type of handler provided: ? ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unsupported type of handler provided: \001" + "'", str15, "Unsupported type of handler provided: \001");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Unsupported type of handler provided: \001\u2192 [Invalid format provided for class label: \001, POST, third]" + "'", str16, "Unsupported type of handler provided: \001\u2192 [Invalid format provided for class label: \001, POST, third]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        io.undertow.util.HttpString httpString0 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString1 = io.undertow.util.HttpString.EMPTY;
        boolean boolean2 = httpString0.equals(httpString1);
        io.undertow.util.HttpString httpString3 = io.undertow.util.HttpString.EMPTY;
        io.undertow.util.HttpString httpString4 = io.undertow.util.HttpString.EMPTY;
        boolean boolean5 = httpString3.equals(httpString4);
        boolean boolean6 = httpString1.equals(httpString3);
        io.undertow.util.HttpString httpString8 = io.undertow.util.HttpString.tryFromString("Unknown handler or chain: \001");
        int int9 = httpString1.compareTo(httpString8);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            httpString1.copyTo(byteArray11, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 39 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString0);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
    }
}
