package com.networknt.correlation;

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
        com.networknt.handler.Handler.init();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        boolean boolean0 = com.networknt.handler.LightHttpHandler.auditStackTrace;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = com.networknt.utility.Util.getFrameworkVersion();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class" + "'", str0, "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.AUDIT_CONFIG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "audit" + "'", str0, "audit");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        java.lang.String str2 = com.networknt.utility.Util.substituteVariables("cid", strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cid" + "'", str2, "cid");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        io.undertow.server.HttpHandler httpHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange2, httpHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.channels.StreamSinkChannel streamSinkChannel4 = httpServerExchange2.getResponseChannel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.undertow.util.AttachmentKey<java.lang.String> strAttachmentKey0 = io.undertow.server.HttpServerExchange.REMOTE_USER;
        org.junit.Assert.assertNotNull(strAttachmentKey0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.slf4j.MDC.setContextMap(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.slf4j.MDC.remove("cid");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str1 = com.networknt.utility.Util.urlEncode("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi%21" + "'", str1, "hi%21");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setQueryString("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpHandler httpHandler12 = com.networknt.handler.Handler.getNext(httpServerExchange2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress10 = httpServerExchange2.getSourceAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.slf4j.MDC.put("", "cid");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.SCOPE;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = httpServerExchange9.isHttp11();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpHandler httpHandler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpHandler httpHandler9 = com.networknt.handler.Handler.getNext(httpServerExchange2, httpHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.channels.StreamSinkChannel streamSinkChannel6 = httpServerExchange2.getResponseChannel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.slf4j.MDC.clear();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.undertow.util.AttachmentKey<java.util.Map<java.lang.String, java.lang.String>> strMapAttachmentKey0 = io.undertow.server.HttpServerExchange.REQUEST_ATTRIBUTES;
        org.junit.Assert.assertNotNull(strMapAttachmentKey0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str1 = com.networknt.utility.Util.quote("generated cid, error");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"generated cid, error\"" + "'", str1, "\"generated cid, error\"");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.SERVICE_URL;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        boolean boolean0 = com.networknt.handler.LightHttpHandler.auditOnError;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.enabled;
        boolean boolean3 = correlationConfig0.isAutogenCorrelationID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str1 = com.networknt.utility.Util.urlDecode("\"generated cid, error\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"generated cid, error\"" + "'", str1, "\"generated cid, error\"");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setQueryString("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.endExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        correlationConfig0.autogenCorrelationID = true;
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.AUDIT_ON_ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auditOnError" + "'", str0, "auditOnError");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.autogenCorrelationID;
        correlationConfig0.setEnabled(true);
        boolean boolean5 = correlationConfig0.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        java.lang.String str4 = httpServerExchange2.getRequestPath();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress5 = httpServerExchange2.getDestinationAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        java.util.concurrent.Executor executor6 = null;
        io.undertow.server.HttpHandler httpHandler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange5.dispatch(executor6, httpHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = com.networknt.utility.Util.getJarVersion();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        boolean boolean12 = com.networknt.handler.Handler.start(httpServerExchange2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        boolean boolean10 = httpServerExchange2.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        java.lang.String str15 = httpServerExchange14.getRequestScheme();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Associate traceability Id \001 with correlation Id \001" + "'", str15, "Associate traceability Id \001 with correlation Id \001");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.slf4j.MDC.MDCCloseable mDCCloseable2 = org.slf4j.MDC.putCloseable("hi%21", "correlationId = \001");
        org.junit.Assert.assertNotNull(mDCCloseable2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = com.networknt.handler.LightHttpHandler.auditConfig;
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream12 = httpServerExchange2.getInputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: UT000035: Cannot get stream as startBlocking has not been invoked");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterate();
        long long5 = headerMap0.fastIterate();
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 55834574848L + "'", long5 == 55834574848L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.CALLER_ID;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        int int4 = headerMap3.size();
        java.util.Collection<io.undertow.util.HttpString> httpStringCollection5 = headerMap3.getHeaderNames();
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(httpStringCollection5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        java.lang.String str6 = httpServerExchange2.getResponseCharset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISO-8859-1" + "'", str6, "ISO-8859-1");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str1 = org.slf4j.MDC.get("hi%21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "correlationId = \001" + "'", str1, "correlationId = \001");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        boolean boolean12 = httpServerExchange11.isSecure();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setDestinationAddress(inetSocketAddress6);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setMaxEntitySize((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        boolean boolean10 = httpServerExchange2.isDispatched();
        io.undertow.server.ServerConnection serverConnection11 = httpServerExchange2.getConnection();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange12 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange13 = httpServerExchange2.startBlocking(blockingHttpExchange12);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(serverConnection11);
        org.junit.Assert.assertNull(blockingHttpExchange13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.net.InetAddress inetAddress0 = com.networknt.utility.Util.getInetAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.undertow.server.HttpHandler httpHandler0 = null;
        com.networknt.handler.Handler.setLastHandler(httpHandler0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        java.lang.String str12 = httpServerExchange11.getRequestScheme();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.channels.StreamSinkChannel streamSinkChannel13 = httpServerExchange11.getResponseChannel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.isAutogenCorrelationID();
        correlationConfig0.setEnabled(false);
        boolean boolean5 = correlationConfig0.isAutogenCorrelationID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = httpServerExchange2.isHttp09();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setQueryString("correlationId = \001");
        java.util.concurrent.Executor executor16 = null;
        java.lang.Runnable runnable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange18 = httpServerExchange2.dispatch(executor16, runnable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        boolean boolean8 = logger0.isDebugEnabled();
        java.lang.Class<?> wildcardClass9 = logger0.getClass();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = httpServerExchange9.getHostPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.ERROR_NOT_DEFINED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ERR10042" + "'", str0, "ERR10042");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.isEnabled();
        correlationConfig0.setAutogenCorrelationID(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        java.util.concurrent.Executor executor10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange9.dispatch(executor10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        boolean boolean10 = httpServerExchange2.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = httpServerExchange14.getHostPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        long long10 = httpServerExchange2.getMaxEntitySize();
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setPersistent(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(httpServerExchange12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = httpServerExchange2.isHttp11();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = org.slf4j.Logger.ROOT_LOGGER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOT" + "'", str0, "ROOT");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray2 = null;
        logger0.error("The server is stopped.", objArray2);
        org.slf4j.Marker marker4 = null;
        io.undertow.server.ServerConnection serverConnection7 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = new io.undertow.server.HttpServerExchange(serverConnection7, (long) (short) 0);
        long long10 = httpServerExchange9.getRequestStartTime();
        java.lang.String str11 = httpServerExchange9.getRequestURI();
        boolean boolean12 = httpServerExchange9.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange13 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange14 = httpServerExchange9.startBlocking(blockingHttpExchange13);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange9.addRequestWrapper(streamSourceConduitConduitWrapper15);
        boolean boolean17 = httpServerExchange9.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange19 = httpServerExchange9.setRequestPath("");
        logger0.warn(marker4, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        boolean boolean21 = logger0.isErrorEnabled();
        org.slf4j.Marker marker22 = null;
        io.undertow.util.HeaderMap headerMap24 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap25 = new io.undertow.util.HeaderMap();
        long long26 = headerMap25.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString27 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap29 = headerMap25.add(httpString27, (long) (short) 0);
        java.util.List<java.lang.String> strList30 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap31 = headerMap24.addAll(httpString27, (java.util.Collection<java.lang.String>) strList30);
        logger0.error(marker22, "hi%21", (java.lang.Object) httpString27);
        org.slf4j.Marker marker33 = null;
        com.networknt.correlation.CorrelationConfig correlationConfig35 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean36 = correlationConfig35.isAutogenCorrelationID();
        boolean boolean37 = correlationConfig35.isEnabled();
        logger0.error(marker33, "localhost", (java.lang.Object) correlationConfig35);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(blockingHttpExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(httpServerExchange19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(httpString27);
        org.junit.Assert.assertNotNull(headerMap29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(headerMap31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str1 = com.networknt.utility.Util.quote("The server is stopped.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"The server is stopped.\"" + "'", str1, "\"The server is stopped.\"");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        boolean boolean4 = httpServerExchange2.isResponseComplete();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        correlationConfig0.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        long long2 = headerMap1.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString3 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap5 = headerMap1.add(httpString3, (long) (short) 0);
        java.util.List<java.lang.String> strList6 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap7 = headerMap0.addAll(httpString3, (java.util.Collection<java.lang.String>) strList6);
        int int8 = headerMap7.size();
        io.undertow.util.HeaderMap headerMap9 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap10 = new io.undertow.util.HeaderMap();
        long long11 = headerMap10.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString12 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap14 = headerMap10.add(httpString12, (long) (short) 0);
        java.util.List<java.lang.String> strList15 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap16 = headerMap9.addAll(httpString12, (java.util.Collection<java.lang.String>) strList15);
        io.undertow.util.HeaderMap headerMap17 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString18 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap20 = headerMap17.add(httpString18, (long) (short) -1);
        long long21 = headerMap17.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString22 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        java.lang.String[] strArray39 = new java.lang.String[] { "Exception:", "hi!", "cid", "localhost", "auditOnError", "starting server", "noCID", "cid", "ISO-8859-1", "cId", "The server is stopped.", "hi%21", "hi%21", "ISO-8859-1", "localhost", "\"generated cid, error\"" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.undertow.util.HeaderMap headerMap42 = headerMap17.addAll(httpString22, (java.util.Collection<java.lang.String>) strList40);
        io.undertow.util.HeaderMap headerMap43 = headerMap7.addAll(httpString12, (java.util.Collection<java.lang.String>) strList40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(headerMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(headerMap14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(headerMap16);
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertNotNull(headerMap20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 55834574848L + "'", long21 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString22);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(headerMap42);
        org.junit.Assert.assertNotNull(headerMap43);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        io.undertow.util.HeaderMap headerMap5 = httpServerExchange2.getRequestHeaders();
        java.lang.String str7 = headerMap5.getFirst("");
        long long9 = headerMap5.fiNextNonEmpty((long) 200);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.slf4j.MDC.getCopyOfContextMap();
        java.lang.String str2 = com.networknt.utility.Util.substituteVariables("generated cid, error", strMap1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "generated cid, error" + "'", str2, "generated cid, error");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = httpServerExchange2.isHttp09();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        io.undertow.util.HeaderMap headerMap5 = httpServerExchange2.getRequestHeaders();
        java.lang.String str7 = headerMap5.getFirst("");
        int int8 = headerMap5.size();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        long long2 = headerMap1.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString3 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap5 = headerMap1.add(httpString3, (long) (short) 0);
        java.lang.Iterable<java.lang.String> strIterable6 = headerMap0.eachValue(httpString3);
        org.slf4j.Logger logger7 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray9 = null;
        logger7.error("The server is stopped.", objArray9);
        org.slf4j.Marker marker11 = null;
        io.undertow.server.ServerConnection serverConnection14 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = new io.undertow.server.HttpServerExchange(serverConnection14, (long) (short) 0);
        long long17 = httpServerExchange16.getRequestStartTime();
        java.lang.String str18 = httpServerExchange16.getRequestURI();
        boolean boolean19 = httpServerExchange16.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange20 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = httpServerExchange16.startBlocking(blockingHttpExchange20);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper22 = null;
        io.undertow.server.HttpServerExchange httpServerExchange23 = httpServerExchange16.addRequestWrapper(streamSourceConduitConduitWrapper22);
        boolean boolean24 = httpServerExchange16.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange26 = httpServerExchange16.setRequestPath("");
        logger7.warn(marker11, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        boolean boolean28 = logger7.isErrorEnabled();
        org.slf4j.Marker marker29 = null;
        io.undertow.util.HeaderMap headerMap31 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap32 = new io.undertow.util.HeaderMap();
        long long33 = headerMap32.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString34 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap36 = headerMap32.add(httpString34, (long) (short) 0);
        java.util.List<java.lang.String> strList37 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap38 = headerMap31.addAll(httpString34, (java.util.Collection<java.lang.String>) strList37);
        logger7.error(marker29, "hi%21", (java.lang.Object) httpString34);
        boolean boolean40 = headerMap0.contains(httpString34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(blockingHttpExchange21);
        org.junit.Assert.assertNotNull(httpServerExchange23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(httpServerExchange26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(httpString34);
        org.junit.Assert.assertNotNull(headerMap36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(headerMap38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.util.concurrent.Executor executor4 = httpServerExchange2.getDispatchExecutor();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.Cookie cookie6 = httpServerExchange2.getRequestCookie("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(executor4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        java.lang.Throwable throwable7 = null;
        logger0.warn("Associate traceability Id \001 with correlation Id \001", throwable7);
        org.slf4j.Marker marker9 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        logger0.debug(marker9, "", objArray11);
        org.slf4j.Marker marker13 = null;
        boolean boolean14 = logger0.isInfoEnabled(marker13);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        io.undertow.util.HeaderMap headerMap5 = httpServerExchange2.getRequestHeaders();
        java.lang.String str7 = headerMap5.getFirst("");
        java.lang.String str9 = headerMap5.getLast("");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        logger0.trace(marker1, "Associate traceability Id \001 with correlation Id \001");
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        long long6 = headerMap5.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap9 = headerMap5.add(httpString7, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap10 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap11 = new io.undertow.util.HeaderMap();
        long long12 = headerMap11.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString13 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap15 = headerMap11.add(httpString13, (long) (short) 0);
        java.util.List<java.lang.String> strList16 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap17 = headerMap10.addAll(httpString13, (java.util.Collection<java.lang.String>) strList16);
        io.undertow.util.HeaderMap headerMap19 = headerMap9.add(httpString13, (long) 10);
        logger0.trace("correlation", (java.lang.Object) headerMap9);
        boolean boolean21 = logger0.isInfoEnabled();
        java.lang.Throwable throwable23 = null;
        logger0.error("noCID", throwable23);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNotNull(headerMap9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertNotNull(headerMap15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(headerMap17);
        org.junit.Assert.assertNotNull(headerMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.endExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange7.setResponseCode(200);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange7.setResponseCode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid response code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isInfoEnabled();
        org.slf4j.Marker marker6 = null;
        logger0.error(marker6, "ROOT", (java.lang.Object) "hi!");
        boolean boolean10 = logger0.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        boolean boolean4 = httpServerExchange2.isResponseStarted();
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> strMap5 = httpServerExchange2.getQueryParameters();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.slf4j.MDC.put("generated cid, error", "CorrelationHandler is loaded.");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = com.networknt.correlation.CorrelationHandler.config;
        org.junit.Assert.assertNotNull(correlationConfig0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        boolean boolean12 = httpServerExchange2.isPersistent();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.slf4j.MDC.MDCCloseable mDCCloseable2 = org.slf4j.MDC.putCloseable("", "The server is stopped.");
        org.junit.Assert.assertNotNull(mDCCloseable2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setRequestScheme("");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.io.Receiver receiver16 = httpServerExchange2.getRequestReceiver();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.slf4j.MDC.put("\"generated cid, error\"", "cId");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.autogenCorrelationID;
        correlationConfig0.setAutogenCorrelationID(true);
        correlationConfig0.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener8);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isInfoEnabled();
        io.undertow.util.AttachmentKey<java.lang.String> strAttachmentKey7 = io.undertow.server.HttpServerExchange.REMOTE_USER;
        io.undertow.server.ServerConnection serverConnection9 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = new io.undertow.server.HttpServerExchange(serverConnection9, (long) (short) 0);
        long long12 = httpServerExchange11.getRequestStartTime();
        java.lang.String str13 = httpServerExchange11.getRequestURI();
        boolean boolean14 = httpServerExchange11.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange15 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange16 = httpServerExchange11.startBlocking(blockingHttpExchange15);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper17 = null;
        io.undertow.server.HttpServerExchange httpServerExchange18 = httpServerExchange11.addRequestWrapper(streamSourceConduitConduitWrapper17);
        boolean boolean19 = httpServerExchange11.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange21 = httpServerExchange11.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange23 = httpServerExchange11.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        java.lang.Object[] objArray24 = new java.lang.Object[] { strAttachmentKey7, (short) 10, httpServerExchange11 };
        logger0.trace("ERR10042", objArray24);
        org.slf4j.Marker marker26 = null;
        io.undertow.util.HeaderMap headerMap29 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap30 = new io.undertow.util.HeaderMap();
        long long31 = headerMap30.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString32 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap34 = headerMap30.add(httpString32, (long) (short) 0);
        java.util.List<java.lang.String> strList35 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap36 = headerMap29.addAll(httpString32, (java.util.Collection<java.lang.String>) strList35);
        int int37 = headerMap36.size();
        io.undertow.server.ServerConnection serverConnection38 = null;
        io.undertow.server.HttpServerExchange httpServerExchange40 = new io.undertow.server.HttpServerExchange(serverConnection38, (long) (short) 0);
        long long41 = httpServerExchange40.getRequestStartTime();
        java.lang.String str42 = httpServerExchange40.getRequestURI();
        boolean boolean43 = httpServerExchange40.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress44 = null;
        io.undertow.server.HttpServerExchange httpServerExchange45 = httpServerExchange40.setSourceAddress(inetSocketAddress44);
        io.undertow.server.HttpServerExchange httpServerExchange47 = httpServerExchange45.setResponseCode(200);
        java.lang.Object[] objArray48 = new java.lang.Object[] { "localhost", int37, httpServerExchange47 };
        logger0.info(marker26, "The server is stopped.", objArray48);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strAttachmentKey7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(blockingHttpExchange16);
        org.junit.Assert.assertNotNull(httpServerExchange18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(httpServerExchange21);
        org.junit.Assert.assertNotNull(httpServerExchange23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(httpString32);
        org.junit.Assert.assertNotNull(headerMap34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(headerMap36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(httpServerExchange45);
        org.junit.Assert.assertNotNull(httpServerExchange47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[localhost, 1, HttpServerExchange{  null}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[localhost, 1, HttpServerExchange{  null}]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.SWAGGER_OPERATION;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setRequestScheme("");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange2.endExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        io.undertow.util.HeaderMap headerMap5 = httpServerExchange2.getRequestHeaders();
        java.lang.String str6 = httpServerExchange2.getRequestScheme();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = httpServerExchange2.isHttp09();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        java.util.Collection<java.lang.String> strCollection6 = headerMap0.remove("CorrelationHandler is loaded.");
        long long8 = headerMap0.fiNextNonEmpty((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 51539607552L + "'", long8 == 51539607552L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setQueryString("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        boolean boolean12 = httpServerExchange11.isHostIncludedInRequestURI();
        io.undertow.server.ResponseCommitListener responseCommitListener13 = null;
        httpServerExchange11.addResponseCommitListener(responseCommitListener13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setDestinationAddress(inetSocketAddress6);
        io.undertow.server.HttpHandler httpHandler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpHandler httpHandler9 = com.networknt.handler.Handler.getNext(httpServerExchange2, httpHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.slf4j.MDC.remove("correlation");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.networknt.utility.Util util0 = new com.networknt.utility.Util();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap6 = new io.undertow.util.HeaderMap();
        long long7 = headerMap6.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap10 = headerMap6.add(httpString8, (long) (short) 0);
        java.util.List<java.lang.String> strList11 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap12 = headerMap5.addAll(httpString8, (java.util.Collection<java.lang.String>) strList11);
        io.undertow.util.HeaderMap headerMap14 = headerMap4.add(httpString8, (long) 10);
        long long15 = headerMap14.fastIterateNonEmpty();
        java.util.Collection<java.lang.String> strCollection17 = headerMap14.remove("ROOT");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(headerMap12);
        org.junit.Assert.assertNotNull(headerMap14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 51539607552L + "'", long15 == 51539607552L);
        org.junit.Assert.assertNotNull(strCollection17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.io.Sender sender8 = httpServerExchange2.getResponseSender();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpHandler httpHandler9 = com.networknt.handler.Handler.getNext(httpServerExchange2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(sender8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.AUDIT_STACK_TRACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auditStackTrace" + "'", str0, "auditStackTrace");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str0 = com.networknt.handler.LightHttpHandler.CONFIG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "handler" + "'", str0, "handler");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        long long10 = httpServerExchange2.getMaxEntitySize();
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange2, "cid", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange7.endExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        java.lang.String str6 = httpServerExchange2.getReasonPhrase();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setQueryString("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.setStatusCode(0);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setReasonPhrase("cid");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        long long8 = httpServerExchange2.getMaxEntitySize();
        boolean boolean9 = httpServerExchange2.isResponseComplete();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray2 = null;
        logger0.error("The server is stopped.", objArray2);
        org.slf4j.Marker marker4 = null;
        java.lang.Throwable throwable6 = null;
        logger0.error(marker4, "\"generated cid, error\"", throwable6);
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.String str1 = com.networknt.utility.Util.urlEncode("localhost");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "localhost" + "'", str1, "localhost");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange2.addQueryParam("correlation", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream11 = httpServerExchange10.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: UT000035: Cannot get stream as startBlocking has not been invoked");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString5 = com.networknt.httpstring.HttpStringConstants.USER_ID;
        java.lang.String str6 = headerMap0.getLast(httpString5);
        java.lang.String str8 = headerMap0.getFirst("generated cid, error");
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpUpgradeListener httpUpgradeListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange9.acceptConnectRequest(httpUpgradeListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: UT000117: Request was not a CONNECT request");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        java.lang.String str12 = httpServerExchange11.getRequestScheme();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.Cookie cookie14 = httpServerExchange11.getRequestCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Object obj3 = null;
        logger0.debug(marker1, "correlationId = \001", obj3, (java.lang.Object) "correlationId = \001");
        org.slf4j.Marker marker6 = null;
        java.lang.Throwable throwable8 = null;
        logger0.warn(marker6, "noCID", throwable8);
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterate();
        io.undertow.util.HttpString httpString5 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.undertow.util.HeaderMap headerMap23 = headerMap0.addAll(httpString5, (java.util.Collection<java.lang.String>) strList21);
        io.undertow.util.HttpString httpString24 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderValues headerValues25 = headerMap23.get(httpString24);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(headerMap23);
        org.junit.Assert.assertNotNull(httpString24);
        org.junit.Assert.assertNull(headerValues25);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        java.lang.Throwable throwable7 = null;
        logger0.warn("Associate traceability Id \001 with correlation Id \001", throwable7);
        org.slf4j.Marker marker9 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        logger0.debug(marker9, "", objArray11);
        org.slf4j.Marker marker13 = null;
        java.lang.Throwable throwable15 = null;
        logger0.info(marker13, "hi%21", throwable15);
        boolean boolean17 = logger0.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setRequestScheme("");
        java.lang.String str16 = httpServerExchange2.getResolvedPath();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.channels.StreamSourceChannel streamSourceChannel8 = httpServerExchange2.getRequestChannel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.Cookie cookie8 = httpServerExchange2.getRequestCookie("starting server");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        long long10 = httpServerExchange2.getMaxEntitySize();
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> strMap11 = httpServerExchange2.getQueryParameters();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.setResponseContentLength(55834574848L);
        io.undertow.server.HttpUpgradeListener httpUpgradeListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange2.upgradeChannel("Exception:", httpUpgradeListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        io.undertow.util.HeaderMap headerMap3 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString4 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap6 = headerMap3.add(httpString4, (long) (short) -1);
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str8 = headerMap3.getFirst(httpString7);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey9 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable12 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable12.close();
        io.undertow.util.HttpString httpString14 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange17 = new io.undertow.server.HttpServerExchange(serverConnection15, (long) (short) 0);
        long long18 = httpServerExchange17.getRequestStartTime();
        java.lang.String str19 = httpServerExchange17.getRequestURI();
        boolean boolean20 = httpServerExchange17.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange22 = httpServerExchange17.startBlocking(blockingHttpExchange21);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper23 = null;
        io.undertow.server.HttpServerExchange httpServerExchange24 = httpServerExchange17.addRequestWrapper(streamSourceConduitConduitWrapper23);
        java.lang.Object[] objArray26 = new java.lang.Object[] { str8, booleanAttachmentKey9, mDCCloseable12, httpString14, streamSourceConduitConduitWrapper23, 0.0d };
        logger0.info(marker1, "generated cid, error", objArray26);
        org.slf4j.Marker marker28 = null;
        boolean boolean29 = logger0.isWarnEnabled(marker28);
        org.slf4j.Marker marker30 = null;
        io.undertow.server.ServerConnection serverConnection32 = null;
        io.undertow.server.HttpServerExchange httpServerExchange34 = new io.undertow.server.HttpServerExchange(serverConnection32, (long) (short) 0);
        long long35 = httpServerExchange34.getRequestStartTime();
        java.lang.String str36 = httpServerExchange34.getRequestURI();
        boolean boolean37 = httpServerExchange34.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange38 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange39 = httpServerExchange34.startBlocking(blockingHttpExchange38);
        io.undertow.server.HttpServerExchange httpServerExchange41 = httpServerExchange34.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        boolean boolean42 = httpServerExchange41.isRequestChannelAvailable();
        logger0.debug(marker30, "ERR10042", (java.lang.Object) boolean42);
        org.slf4j.Marker marker44 = null;
        org.slf4j.Logger logger46 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker47 = null;
        java.lang.Throwable throwable49 = null;
        logger46.trace(marker47, "The server is stopped.", throwable49);
        boolean boolean51 = logger46.isTraceEnabled();
        logger46.info("generated cid, error");
        org.slf4j.Logger logger55 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker56 = null;
        java.lang.Throwable throwable58 = null;
        logger55.trace(marker56, "The server is stopped.", throwable58);
        boolean boolean60 = logger55.isTraceEnabled();
        logger55.info("generated cid, error");
        org.slf4j.Marker marker63 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable68 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable68.close();
        java.lang.Object[] objArray70 = new java.lang.Object[] { "noCID", mDCCloseable68 };
        logger55.debug(marker63, "CorrelationHandler is loaded.", objArray70);
        org.slf4j.Marker marker72 = null;
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        logger55.error(marker72, "The server is stopped.", objArray74);
        logger46.warn("", objArray74);
        logger0.warn(marker44, "correlationId = \001", objArray74);
        java.lang.String str78 = logger0.getName();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(booleanAttachmentKey9);
        org.junit.Assert.assertNotNull(mDCCloseable12);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(blockingHttpExchange22);
        org.junit.Assert.assertNotNull(httpServerExchange24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(blockingHttpExchange39);
        org.junit.Assert.assertNotNull(httpServerExchange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(mDCCloseable68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "com.networknt.handler.LightHttpHandler" + "'", str78, "com.networknt.handler.LightHttpHandler");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.isAutogenCorrelationID();
        correlationConfig0.setEnabled(false);
        correlationConfig0.enabled = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        io.undertow.util.HeaderMap headerMap3 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString4 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap6 = headerMap3.add(httpString4, (long) (short) -1);
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str8 = headerMap3.getFirst(httpString7);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey9 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable12 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable12.close();
        io.undertow.util.HttpString httpString14 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange17 = new io.undertow.server.HttpServerExchange(serverConnection15, (long) (short) 0);
        long long18 = httpServerExchange17.getRequestStartTime();
        java.lang.String str19 = httpServerExchange17.getRequestURI();
        boolean boolean20 = httpServerExchange17.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange22 = httpServerExchange17.startBlocking(blockingHttpExchange21);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper23 = null;
        io.undertow.server.HttpServerExchange httpServerExchange24 = httpServerExchange17.addRequestWrapper(streamSourceConduitConduitWrapper23);
        java.lang.Object[] objArray26 = new java.lang.Object[] { str8, booleanAttachmentKey9, mDCCloseable12, httpString14, streamSourceConduitConduitWrapper23, 0.0d };
        logger0.info(marker1, "generated cid, error", objArray26);
        org.slf4j.Marker marker28 = null;
        java.lang.Throwable throwable30 = null;
        logger0.trace(marker28, "", throwable30);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(booleanAttachmentKey9);
        org.junit.Assert.assertNotNull(mDCCloseable12);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(blockingHttpExchange22);
        org.junit.Assert.assertNotNull(httpServerExchange24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        int int4 = headerMap3.size();
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString6 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap8 = headerMap5.add(httpString6, (long) (short) -1);
        long long9 = headerMap5.fastIterate();
        io.undertow.util.HttpString httpString10 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.undertow.util.HeaderMap headerMap28 = headerMap5.addAll(httpString10, (java.util.Collection<java.lang.String>) strList26);
        io.undertow.util.HeaderMap headerMap29 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap30 = new io.undertow.util.HeaderMap();
        long long31 = headerMap30.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString32 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap34 = headerMap30.add(httpString32, (long) (short) 0);
        java.util.List<java.lang.String> strList35 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap36 = headerMap29.addAll(httpString32, (java.util.Collection<java.lang.String>) strList35);
        io.undertow.util.HeaderMap headerMap37 = headerMap3.putAll(httpString10, (java.util.Collection<java.lang.String>) strList35);
        boolean boolean39 = headerMap37.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(headerMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 55834574848L + "'", long9 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(headerMap28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(httpString32);
        org.junit.Assert.assertNotNull(headerMap34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(headerMap36);
        org.junit.Assert.assertNotNull(headerMap37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream10 = httpServerExchange2.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: UT000035: Cannot get stream as startBlocking has not been invoked");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterate();
        io.undertow.util.HttpString httpString5 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.undertow.util.HeaderMap headerMap23 = headerMap0.addAll(httpString5, (java.util.Collection<java.lang.String>) strList21);
        io.undertow.util.HttpString httpString24 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        java.lang.String str25 = headerMap0.getFirst(httpString24);
        long long27 = headerMap0.fiNext((-1L));
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(headerMap23);
        org.junit.Assert.assertNotNull(httpString24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        boolean boolean8 = logger0.isDebugEnabled();
        org.slf4j.Marker marker9 = null;
        logger0.debug(marker9, "auditStackTrace");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterateNonEmpty();
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HeaderValues headerValues6 = headerMap0.fiCurrent((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setDestinationAddress(inetSocketAddress6);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange8 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange9 = httpServerExchange2.startBlocking(blockingHttpExchange8);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNull(blockingHttpExchange9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.slf4j.MDC.MDCCloseable mDCCloseable2 = org.slf4j.MDC.putCloseable("generated cid, error", "cid");
        mDCCloseable2.close();
        mDCCloseable2.close();
        org.junit.Assert.assertNotNull(mDCCloseable2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange2.addQueryParam("correlation", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.util.HeaderMap headerMap11 = httpServerExchange2.getResponseHeaders();
        long long12 = httpServerExchange2.getRequestStartTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange10);
        org.junit.Assert.assertNotNull(headerMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        boolean boolean10 = httpServerExchange9.isRequestComplete();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = org.slf4j.MDC.getCopyOfContextMap();
        org.slf4j.MDC.setContextMap(strMap0);
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        java.lang.String str4 = httpServerExchange2.getRequestPath();
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener5 = null;
        io.undertow.server.HttpServerExchange httpServerExchange6 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener5);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(httpServerExchange6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        org.slf4j.Marker marker5 = null;
        logger0.error(marker5, "\"generated cid, error\"", (java.lang.Object) 0.0d);
        java.lang.Throwable throwable10 = null;
        logger0.info("cid", throwable10);
        org.slf4j.Marker marker12 = null;
        io.undertow.server.ServerConnection serverConnection14 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = new io.undertow.server.HttpServerExchange(serverConnection14, (long) (short) 0);
        long long17 = httpServerExchange16.getRequestStartTime();
        java.lang.String str18 = httpServerExchange16.getRequestURI();
        boolean boolean19 = httpServerExchange16.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange20 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = httpServerExchange16.startBlocking(blockingHttpExchange20);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper22 = null;
        io.undertow.server.HttpServerExchange httpServerExchange23 = httpServerExchange16.addRequestWrapper(streamSourceConduitConduitWrapper22);
        org.slf4j.Logger logger24 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker25 = null;
        io.undertow.util.HeaderMap headerMap27 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString28 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap30 = headerMap27.add(httpString28, (long) (short) -1);
        io.undertow.util.HttpString httpString31 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str32 = headerMap27.getFirst(httpString31);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey33 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable36 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable36.close();
        io.undertow.util.HttpString httpString38 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection39 = null;
        io.undertow.server.HttpServerExchange httpServerExchange41 = new io.undertow.server.HttpServerExchange(serverConnection39, (long) (short) 0);
        long long42 = httpServerExchange41.getRequestStartTime();
        java.lang.String str43 = httpServerExchange41.getRequestURI();
        boolean boolean44 = httpServerExchange41.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange45 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange46 = httpServerExchange41.startBlocking(blockingHttpExchange45);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper47 = null;
        io.undertow.server.HttpServerExchange httpServerExchange48 = httpServerExchange41.addRequestWrapper(streamSourceConduitConduitWrapper47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { str32, booleanAttachmentKey33, mDCCloseable36, httpString38, streamSourceConduitConduitWrapper47, 0.0d };
        logger24.info(marker25, "generated cid, error", objArray50);
        org.slf4j.Marker marker52 = null;
        boolean boolean53 = logger24.isWarnEnabled(marker52);
        logger0.warn(marker12, "hi%21", (java.lang.Object) httpServerExchange16, (java.lang.Object) boolean53);
        io.undertow.server.HttpServerExchange httpServerExchange56 = httpServerExchange16.setQueryString("ISO-8859-1");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(blockingHttpExchange21);
        org.junit.Assert.assertNotNull(httpServerExchange23);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(httpString28);
        org.junit.Assert.assertNotNull(headerMap30);
        org.junit.Assert.assertNotNull(httpString31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(booleanAttachmentKey33);
        org.junit.Assert.assertNotNull(mDCCloseable36);
        org.junit.Assert.assertNotNull(httpString38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(blockingHttpExchange46);
        org.junit.Assert.assertNotNull(httpServerExchange48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(httpServerExchange56);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        boolean boolean12 = httpServerExchange11.isUpgrade();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray2 = null;
        logger0.error("The server is stopped.", objArray2);
        org.slf4j.Marker marker4 = null;
        io.undertow.server.ServerConnection serverConnection7 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = new io.undertow.server.HttpServerExchange(serverConnection7, (long) (short) 0);
        long long10 = httpServerExchange9.getRequestStartTime();
        java.lang.String str11 = httpServerExchange9.getRequestURI();
        boolean boolean12 = httpServerExchange9.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange13 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange14 = httpServerExchange9.startBlocking(blockingHttpExchange13);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange9.addRequestWrapper(streamSourceConduitConduitWrapper15);
        boolean boolean17 = httpServerExchange9.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange19 = httpServerExchange9.setRequestPath("");
        logger0.warn(marker4, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        boolean boolean21 = logger0.isErrorEnabled();
        org.slf4j.Marker marker22 = null;
        logger0.info(marker22, "");
        boolean boolean25 = logger0.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(blockingHttpExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(httpServerExchange19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String str0 = com.networknt.utility.Util.getUUID();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "j_Bqwf8-SeCjYb03yNFwJA" + "'", str0, "j_Bqwf8-SeCjYb03yNFwJA");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.slf4j.MDC.MDCCloseable mDCCloseable2 = org.slf4j.MDC.putCloseable("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "generated cid, error");
        org.junit.Assert.assertNotNull(mDCCloseable2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        org.slf4j.Logger logger6 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker7 = null;
        java.lang.Throwable throwable9 = null;
        logger6.trace(marker7, "The server is stopped.", throwable9);
        boolean boolean11 = logger6.isInfoEnabled();
        io.undertow.util.AttachmentKey<java.lang.String> strAttachmentKey13 = io.undertow.server.HttpServerExchange.REMOTE_USER;
        io.undertow.server.ServerConnection serverConnection15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange17 = new io.undertow.server.HttpServerExchange(serverConnection15, (long) (short) 0);
        long long18 = httpServerExchange17.getRequestStartTime();
        java.lang.String str19 = httpServerExchange17.getRequestURI();
        boolean boolean20 = httpServerExchange17.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange22 = httpServerExchange17.startBlocking(blockingHttpExchange21);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper23 = null;
        io.undertow.server.HttpServerExchange httpServerExchange24 = httpServerExchange17.addRequestWrapper(streamSourceConduitConduitWrapper23);
        boolean boolean25 = httpServerExchange17.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange27 = httpServerExchange17.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange29 = httpServerExchange17.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        java.lang.Object[] objArray30 = new java.lang.Object[] { strAttachmentKey13, (short) 10, httpServerExchange17 };
        logger6.trace("ERR10042", objArray30);
        logger0.error("The server is stopped.", objArray30);
        org.slf4j.Marker marker33 = null;
        boolean boolean34 = logger0.isTraceEnabled(marker33);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strAttachmentKey13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(blockingHttpExchange22);
        org.junit.Assert.assertNotNull(httpServerExchange24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(httpServerExchange27);
        org.junit.Assert.assertNotNull(httpServerExchange29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        long long10 = httpServerExchange2.getMaxEntitySize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = httpServerExchange2.isHttp11();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.SCOPE_CLIENT_ID;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = httpServerExchange2.isHttp09();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        org.slf4j.Marker marker8 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable13 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable13.close();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "noCID", mDCCloseable13 };
        logger0.debug(marker8, "CorrelationHandler is loaded.", objArray15);
        org.slf4j.Marker marker17 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        logger0.error(marker17, "The server is stopped.", objArray19);
        org.slf4j.MDC.MDCCloseable mDCCloseable24 = org.slf4j.MDC.putCloseable("generated cid, error", "cid");
        logger0.debug("ERR10042", (java.lang.Object) mDCCloseable24);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mDCCloseable13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(mDCCloseable24);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        logger0.info("starting server");
        org.slf4j.Marker marker3 = null;
        logger0.info(marker3, "cId");
        java.lang.Throwable throwable7 = null;
        logger0.trace("generated cid, error", throwable7);
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        long long2 = headerMap1.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString3 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap5 = headerMap1.add(httpString3, (long) (short) 0);
        java.util.List<java.lang.String> strList6 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap7 = headerMap0.addAll(httpString3, (java.util.Collection<java.lang.String>) strList6);
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String str9 = headerMap0.getFirst(httpString8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(headerMap7);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        long long8 = httpServerExchange7.getRequestStartTime();
        io.undertow.server.HttpUpgradeListener httpUpgradeListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange7.upgradeChannel(httpUpgradeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange2.setPersistent(true);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.io.Receiver receiver9 = httpServerExchange8.getRequestReceiver();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(httpServerExchange8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.networknt.handler.config.HandlerConfig handlerConfig0 = com.networknt.handler.Handler.config;
        com.networknt.handler.Handler.config = handlerConfig0;
        com.networknt.handler.Handler.config = handlerConfig0;
        org.junit.Assert.assertNotNull(handlerConfig0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setRequestScheme("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<io.undertow.server.handlers.Cookie> cookieIterable16 = httpServerExchange2.requestCookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = httpServerExchange9.getHostAndPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestURI("The server is stopped.", true);
        io.undertow.util.HttpString httpString13 = httpServerExchange2.getProtocol();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNull(httpString13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        io.undertow.server.ServerConnection serverConnection5 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = new io.undertow.server.HttpServerExchange(serverConnection5, (long) (short) 0);
        boolean boolean8 = httpServerExchange7.isRequestComplete();
        boolean boolean9 = httpServerExchange7.isResponseStarted();
        io.undertow.server.handlers.Cookie cookie10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange7.setResponseCookie(cookie10);
        io.undertow.util.HttpString httpString12 = httpServerExchange7.getRequestMethod();
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.setProtocol(httpString12);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(httpServerExchange13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        boolean boolean4 = httpServerExchange2.isResponseChannelAvailable();
        io.undertow.util.HttpString httpString5 = httpServerExchange2.getProtocol();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(httpString5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        java.util.Collection<java.lang.String> strCollection6 = headerMap0.remove("CorrelationHandler is loaded.");
        io.undertow.util.HeaderMap headerMap7 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap10 = headerMap7.add(httpString8, (long) (short) -1);
        long long11 = headerMap7.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString12 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        java.lang.String[] strArray29 = new java.lang.String[] { "Exception:", "hi!", "cid", "localhost", "auditOnError", "starting server", "noCID", "cid", "ISO-8859-1", "cId", "The server is stopped.", "hi%21", "hi%21", "ISO-8859-1", "localhost", "\"generated cid, error\"" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        io.undertow.util.HeaderMap headerMap32 = headerMap7.addAll(httpString12, (java.util.Collection<java.lang.String>) strList30);
        boolean boolean34 = headerMap7.contains("starting server");
        io.undertow.util.HeaderMap headerMap35 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString36 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap38 = headerMap35.add(httpString36, (long) (short) -1);
        long long39 = headerMap35.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString40 = com.networknt.httpstring.HttpStringConstants.USER_ID;
        java.lang.String str41 = headerMap35.getLast(httpString40);
        java.lang.Iterable<java.lang.String> strIterable42 = headerMap7.eachValue(httpString40);
        int int43 = headerMap0.count(httpString40);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 55834574848L + "'", long11 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(headerMap32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(httpString36);
        org.junit.Assert.assertNotNull(headerMap38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 55834574848L + "'", long39 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strIterable42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.String str1 = com.networknt.utility.Util.urlEncode("handler");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "handler" + "'", str1, "handler");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        int int4 = headerMap3.size();
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString6 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap8 = headerMap5.add(httpString6, (long) (short) -1);
        long long9 = headerMap5.fastIterate();
        io.undertow.util.HttpString httpString10 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.undertow.util.HeaderMap headerMap28 = headerMap5.addAll(httpString10, (java.util.Collection<java.lang.String>) strList26);
        io.undertow.util.HeaderMap headerMap29 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap30 = new io.undertow.util.HeaderMap();
        long long31 = headerMap30.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString32 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap34 = headerMap30.add(httpString32, (long) (short) 0);
        java.util.List<java.lang.String> strList35 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap36 = headerMap29.addAll(httpString32, (java.util.Collection<java.lang.String>) strList35);
        io.undertow.util.HeaderMap headerMap37 = headerMap3.putAll(httpString10, (java.util.Collection<java.lang.String>) strList35);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HeaderValues headerValues39 = headerMap37.fiCurrent((long) '4');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(headerMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 55834574848L + "'", long9 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(headerMap28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(httpString32);
        org.junit.Assert.assertNotNull(headerMap34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(headerMap36);
        org.junit.Assert.assertNotNull(headerMap37);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.unDispatch();
        io.undertow.server.ServerConnection serverConnection8 = httpServerExchange7.getConnection();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNull(serverConnection8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.SERVICE_ID;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        org.slf4j.Marker marker8 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable13 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable13.close();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "noCID", mDCCloseable13 };
        logger0.debug(marker8, "CorrelationHandler is loaded.", objArray15);
        java.lang.Throwable throwable18 = null;
        logger0.warn("", throwable18);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mDCCloseable13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        int int14 = httpServerExchange13.getResponseCode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray2 = null;
        logger0.error("The server is stopped.", objArray2);
        org.slf4j.Marker marker4 = null;
        io.undertow.server.ServerConnection serverConnection7 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = new io.undertow.server.HttpServerExchange(serverConnection7, (long) (short) 0);
        long long10 = httpServerExchange9.getRequestStartTime();
        java.lang.String str11 = httpServerExchange9.getRequestURI();
        boolean boolean12 = httpServerExchange9.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange13 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange14 = httpServerExchange9.startBlocking(blockingHttpExchange13);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange9.addRequestWrapper(streamSourceConduitConduitWrapper15);
        boolean boolean17 = httpServerExchange9.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange19 = httpServerExchange9.setRequestPath("");
        logger0.warn(marker4, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        boolean boolean21 = logger0.isErrorEnabled();
        org.slf4j.Logger logger23 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker24 = null;
        java.lang.Throwable throwable26 = null;
        logger23.trace(marker24, "The server is stopped.", throwable26);
        boolean boolean28 = logger23.isTraceEnabled();
        java.lang.Throwable throwable30 = null;
        logger23.warn("Associate traceability Id \001 with correlation Id \001", throwable30);
        org.slf4j.Marker marker32 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        logger23.debug(marker32, "", objArray34);
        logger0.debug("handler", objArray34);
        org.slf4j.Marker marker37 = null;
        logger0.debug(marker37, "");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(blockingHttpExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(httpServerExchange19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isInfoEnabled();
        org.slf4j.Marker marker6 = null;
        boolean boolean7 = logger0.isDebugEnabled(marker6);
        org.slf4j.Marker marker8 = null;
        io.undertow.util.HeaderMap headerMap10 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString11 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap13 = headerMap10.add(httpString11, (long) (short) -1);
        org.slf4j.Logger logger14 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker15 = null;
        java.lang.Throwable throwable17 = null;
        logger14.trace(marker15, "The server is stopped.", throwable17);
        boolean boolean19 = logger14.isTraceEnabled();
        logger14.info("generated cid, error");
        org.slf4j.Marker marker22 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable27 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable27.close();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "noCID", mDCCloseable27 };
        logger14.debug(marker22, "CorrelationHandler is loaded.", objArray29);
        org.slf4j.Marker marker31 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        logger14.error(marker31, "The server is stopped.", objArray33);
        logger0.trace(marker8, "correlationId = \001", (java.lang.Object) headerMap10, (java.lang.Object) marker31);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(headerMap13);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mDCCloseable27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        int int10 = httpServerExchange2.getResponseCode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.undertow.server.handlers.Cookie> strMap11 = httpServerExchange2.getRequestCookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.setResponseContentLength(55834574848L);
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setRelativePath("ERR10042");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        org.slf4j.Marker marker5 = null;
        io.undertow.util.HeaderMap headerMap7 = new io.undertow.util.HeaderMap();
        long long8 = headerMap7.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString9 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap11 = headerMap7.add(httpString9, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap12 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap13 = new io.undertow.util.HeaderMap();
        long long14 = headerMap13.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString15 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap17 = headerMap13.add(httpString15, (long) (short) 0);
        java.util.List<java.lang.String> strList18 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap19 = headerMap12.addAll(httpString15, (java.util.Collection<java.lang.String>) strList18);
        io.undertow.util.HeaderMap headerMap21 = headerMap11.add(httpString15, (long) 10);
        io.undertow.util.HeaderMap headerMap22 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap23 = new io.undertow.util.HeaderMap();
        long long24 = headerMap23.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString25 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap27 = headerMap23.add(httpString25, (long) (short) 0);
        java.util.List<java.lang.String> strList28 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap29 = headerMap22.addAll(httpString25, (java.util.Collection<java.lang.String>) strList28);
        io.undertow.util.HeaderMap headerMap30 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString31 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap33 = headerMap30.add(httpString31, (long) (short) -1);
        long long34 = headerMap30.fastIterate();
        io.undertow.util.HttpString httpString35 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        int int36 = headerMap30.count(httpString35);
        java.lang.Iterable<java.lang.String> strIterable37 = headerMap22.eachValue(httpString35);
        io.undertow.util.HeaderMap headerMap39 = headerMap11.put(httpString35, "ERR10042");
        logger0.error(marker5, "auditStackTrace", (java.lang.Object) headerMap11);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(httpString9);
        org.junit.Assert.assertNotNull(headerMap11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertNotNull(headerMap17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(headerMap19);
        org.junit.Assert.assertNotNull(headerMap21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(httpString25);
        org.junit.Assert.assertNotNull(headerMap27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(headerMap29);
        org.junit.Assert.assertNotNull(httpString31);
        org.junit.Assert.assertNotNull(headerMap33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 55834574848L + "'", long34 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strIterable37);
        org.junit.Assert.assertNotNull(headerMap39);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap6 = new io.undertow.util.HeaderMap();
        long long7 = headerMap6.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap10 = headerMap6.add(httpString8, (long) (short) 0);
        java.util.List<java.lang.String> strList11 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap12 = headerMap5.addAll(httpString8, (java.util.Collection<java.lang.String>) strList11);
        io.undertow.util.HeaderMap headerMap14 = headerMap4.add(httpString8, (long) 10);
        io.undertow.util.HeaderMap headerMap15 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap16 = new io.undertow.util.HeaderMap();
        long long17 = headerMap16.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString18 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap20 = headerMap16.add(httpString18, (long) (short) 0);
        java.util.List<java.lang.String> strList21 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap22 = headerMap15.addAll(httpString18, (java.util.Collection<java.lang.String>) strList21);
        io.undertow.util.HeaderMap headerMap23 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString24 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap26 = headerMap23.add(httpString24, (long) (short) -1);
        long long27 = headerMap23.fastIterate();
        io.undertow.util.HttpString httpString28 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        int int29 = headerMap23.count(httpString28);
        java.lang.Iterable<java.lang.String> strIterable30 = headerMap15.eachValue(httpString28);
        io.undertow.util.HeaderMap headerMap32 = headerMap4.put(httpString28, "ERR10042");
        java.lang.String str34 = headerMap4.getFirst("CorrelationHandler is loaded.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(headerMap12);
        org.junit.Assert.assertNotNull(headerMap14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertNotNull(headerMap20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(headerMap22);
        org.junit.Assert.assertNotNull(httpString24);
        org.junit.Assert.assertNotNull(headerMap26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 55834574848L + "'", long27 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strIterable30);
        org.junit.Assert.assertNotNull(headerMap32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.lang.String str6 = httpServerExchange2.getRequestPath();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange8 = httpServerExchange2.startBlocking(blockingHttpExchange7);
        java.lang.Iterable<io.undertow.server.handlers.Cookie> cookieIterable9 = httpServerExchange2.responseCookies();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.channels.StreamSinkChannel streamSinkChannel10 = httpServerExchange2.getResponseChannel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(blockingHttpExchange8);
        org.junit.Assert.assertNotNull(cookieIterable9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        java.util.Map<java.lang.String, io.undertow.server.handlers.Cookie> strMap6 = httpServerExchange5.getResponseCookies();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterate();
        io.undertow.util.HttpString httpString5 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.undertow.util.HeaderMap headerMap23 = headerMap0.addAll(httpString5, (java.util.Collection<java.lang.String>) strList21);
        io.undertow.util.HeaderMap headerMap24 = headerMap0.clear();
        io.undertow.util.HeaderMap headerMap25 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString26 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap28 = headerMap25.add(httpString26, (long) (short) -1);
        long long29 = headerMap25.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString30 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        java.lang.String[] strArray47 = new java.lang.String[] { "Exception:", "hi!", "cid", "localhost", "auditOnError", "starting server", "noCID", "cid", "ISO-8859-1", "cId", "The server is stopped.", "hi%21", "hi%21", "ISO-8859-1", "localhost", "\"generated cid, error\"" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        io.undertow.util.HeaderMap headerMap50 = headerMap25.addAll(httpString30, (java.util.Collection<java.lang.String>) strList48);
        boolean boolean51 = headerMap24.contains(httpString30);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(headerMap23);
        org.junit.Assert.assertNotNull(headerMap24);
        org.junit.Assert.assertNotNull(httpString26);
        org.junit.Assert.assertNotNull(headerMap28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 55834574848L + "'", long29 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString30);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(headerMap50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange2.addQueryParam("correlation", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setReasonPhrase("localhost");
        boolean boolean13 = httpServerExchange12.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.XnioIoThread xnioIoThread14 = httpServerExchange12.getIoThread();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange10);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        int int5 = httpServerExchange2.getResponseCode();
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setQueryString("hi%21");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange7.endExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.networknt.httpstring.HttpStringConstants httpStringConstants0 = new com.networknt.httpstring.HttpStringConstants();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        io.undertow.util.HttpString httpString4 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str5 = headerMap0.getFirst(httpString4);
        io.undertow.util.HeaderMap headerMap6 = headerMap0.clear();
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(headerMap6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        boolean boolean6 = httpServerExchange2.isResponseChannelAvailable();
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange2.setProtocol(httpString7);
        io.undertow.server.DefaultResponseListener defaultResponseListener9 = null;
        io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange8.addDefaultResponseListener(defaultResponseListener9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNotNull(httpServerExchange8);
        org.junit.Assert.assertNotNull(httpServerExchange10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        java.lang.String str4 = httpServerExchange2.getRequestPath();
        long long5 = httpServerExchange2.getRequestStartTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        int int4 = headerMap3.size();
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString6 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap8 = headerMap5.add(httpString6, (long) (short) -1);
        long long9 = headerMap5.fastIterate();
        io.undertow.util.HttpString httpString10 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.undertow.util.HeaderMap headerMap28 = headerMap5.addAll(httpString10, (java.util.Collection<java.lang.String>) strList26);
        io.undertow.util.HeaderMap headerMap29 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap30 = new io.undertow.util.HeaderMap();
        long long31 = headerMap30.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString32 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap34 = headerMap30.add(httpString32, (long) (short) 0);
        java.util.List<java.lang.String> strList35 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap36 = headerMap29.addAll(httpString32, (java.util.Collection<java.lang.String>) strList35);
        io.undertow.util.HeaderMap headerMap37 = headerMap3.putAll(httpString10, (java.util.Collection<java.lang.String>) strList35);
        org.slf4j.Logger logger38 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker39 = null;
        logger38.trace(marker39, "Associate traceability Id \001 with correlation Id \001");
        io.undertow.util.HeaderMap headerMap43 = new io.undertow.util.HeaderMap();
        long long44 = headerMap43.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString45 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap47 = headerMap43.add(httpString45, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap48 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap49 = new io.undertow.util.HeaderMap();
        long long50 = headerMap49.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString51 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap53 = headerMap49.add(httpString51, (long) (short) 0);
        java.util.List<java.lang.String> strList54 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap55 = headerMap48.addAll(httpString51, (java.util.Collection<java.lang.String>) strList54);
        io.undertow.util.HeaderMap headerMap57 = headerMap47.add(httpString51, (long) 10);
        logger38.trace("correlation", (java.lang.Object) headerMap47);
        io.undertow.util.HttpString httpString59 = com.networknt.httpstring.HttpStringConstants.ENV_TAG;
        io.undertow.util.HeaderValues headerValues60 = headerMap47.get(httpString59);
        java.lang.Iterable<java.lang.String> strIterable61 = headerMap3.eachValue(httpString59);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(headerMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 55834574848L + "'", long9 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(headerMap28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(httpString32);
        org.junit.Assert.assertNotNull(headerMap34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(headerMap36);
        org.junit.Assert.assertNotNull(headerMap37);
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(httpString45);
        org.junit.Assert.assertNotNull(headerMap47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(httpString51);
        org.junit.Assert.assertNotNull(headerMap53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(headerMap55);
        org.junit.Assert.assertNotNull(headerMap57);
        org.junit.Assert.assertNotNull(httpString59);
        org.junit.Assert.assertNull(headerValues60);
        org.junit.Assert.assertNotNull(strIterable61);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isInfoEnabled();
        org.slf4j.Logger logger7 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker8 = null;
        java.lang.Throwable throwable10 = null;
        logger7.trace(marker8, "The server is stopped.", throwable10);
        boolean boolean12 = logger7.isTraceEnabled();
        logger7.info("generated cid, error");
        org.slf4j.Marker marker15 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable20 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable20.close();
        java.lang.Object[] objArray22 = new java.lang.Object[] { "noCID", mDCCloseable20 };
        logger7.debug(marker15, "CorrelationHandler is loaded.", objArray22);
        logger0.warn("auditStackTrace", objArray22);
        logger0.warn("cid");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mDCCloseable20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        boolean boolean8 = com.networknt.handler.Handler.start(httpServerExchange7);
        java.lang.String str9 = httpServerExchange7.getQueryString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange8 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange9 = httpServerExchange2.startBlocking(blockingHttpExchange8);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNull(blockingHttpExchange9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.networknt.handler.Handler handler0 = new com.networknt.handler.Handler();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.slf4j.spi.MDCAdapter mDCAdapter0 = org.slf4j.MDC.getMDCAdapter();
        org.junit.Assert.assertNotNull(mDCAdapter0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        org.slf4j.Logger logger9 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker10 = null;
        java.lang.Throwable throwable12 = null;
        logger9.trace(marker10, "The server is stopped.", throwable12);
        boolean boolean14 = logger9.isTraceEnabled();
        logger9.info("generated cid, error");
        org.slf4j.Marker marker17 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable22 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable22.close();
        java.lang.Object[] objArray24 = new java.lang.Object[] { "noCID", mDCCloseable22 };
        logger9.debug(marker17, "CorrelationHandler is loaded.", objArray24);
        org.slf4j.Marker marker26 = null;
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        logger9.error(marker26, "The server is stopped.", objArray28);
        logger0.warn("", objArray28);
        java.lang.Throwable throwable32 = null;
        logger0.trace("correlationId = \001", throwable32);
        org.slf4j.Marker marker34 = null;
        boolean boolean35 = logger0.isErrorEnabled(marker34);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mDCCloseable22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        boolean boolean4 = httpServerExchange2.isResponseStarted();
        io.undertow.server.handlers.Cookie cookie5 = null;
        io.undertow.server.HttpServerExchange httpServerExchange6 = httpServerExchange2.setResponseCookie(cookie5);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange8 = httpServerExchange2.startBlocking(blockingHttpExchange7);
        java.lang.String str9 = httpServerExchange2.getRequestScheme();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(httpServerExchange6);
        org.junit.Assert.assertNull(blockingHttpExchange8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestURI("The server is stopped.", true);
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("ERR10042");
        boolean boolean15 = com.networknt.handler.Handler.start(httpServerExchange14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        io.undertow.util.HeaderMap headerMap6 = httpServerExchange2.getRequestHeaders();
        io.undertow.security.api.SecurityContext securityContext7 = null;
        httpServerExchange2.setSecurityContext(securityContext7);
        io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange2.setQueryString("generated cid, error");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertNotNull(httpServerExchange10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.undertow.util.HttpString httpString0 = com.networknt.httpstring.HttpStringConstants.CONSUL_TOKEN;
        org.junit.Assert.assertNotNull(httpString0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.slf4j.MDC.MDCCloseable mDCCloseable2 = org.slf4j.MDC.putCloseable("audit", "");
        org.junit.Assert.assertNotNull(mDCCloseable2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        boolean boolean4 = httpServerExchange2.isResponseChannelAvailable();
        io.undertow.server.handlers.Cookie cookie5 = null;
        io.undertow.server.HttpServerExchange httpServerExchange6 = httpServerExchange2.setResponseCookie(cookie5);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange8 = httpServerExchange6.startBlocking(blockingHttpExchange7);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(httpServerExchange6);
        org.junit.Assert.assertNull(blockingHttpExchange8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        io.undertow.util.HeaderMap headerMap3 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString4 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap6 = headerMap3.add(httpString4, (long) (short) -1);
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str8 = headerMap3.getFirst(httpString7);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey9 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable12 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable12.close();
        io.undertow.util.HttpString httpString14 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange17 = new io.undertow.server.HttpServerExchange(serverConnection15, (long) (short) 0);
        long long18 = httpServerExchange17.getRequestStartTime();
        java.lang.String str19 = httpServerExchange17.getRequestURI();
        boolean boolean20 = httpServerExchange17.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange22 = httpServerExchange17.startBlocking(blockingHttpExchange21);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper23 = null;
        io.undertow.server.HttpServerExchange httpServerExchange24 = httpServerExchange17.addRequestWrapper(streamSourceConduitConduitWrapper23);
        java.lang.Object[] objArray26 = new java.lang.Object[] { str8, booleanAttachmentKey9, mDCCloseable12, httpString14, streamSourceConduitConduitWrapper23, 0.0d };
        logger0.info(marker1, "generated cid, error", objArray26);
        org.slf4j.Marker marker28 = null;
        boolean boolean29 = logger0.isWarnEnabled(marker28);
        org.slf4j.Marker marker30 = null;
        io.undertow.server.ServerConnection serverConnection32 = null;
        io.undertow.server.HttpServerExchange httpServerExchange34 = new io.undertow.server.HttpServerExchange(serverConnection32, (long) (short) 0);
        long long35 = httpServerExchange34.getRequestStartTime();
        java.lang.String str36 = httpServerExchange34.getRequestURI();
        boolean boolean37 = httpServerExchange34.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange38 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange39 = httpServerExchange34.startBlocking(blockingHttpExchange38);
        io.undertow.server.HttpServerExchange httpServerExchange41 = httpServerExchange34.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        boolean boolean42 = httpServerExchange41.isRequestChannelAvailable();
        logger0.debug(marker30, "ERR10042", (java.lang.Object) boolean42);
        org.slf4j.Marker marker44 = null;
        org.slf4j.Logger logger46 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker47 = null;
        java.lang.Throwable throwable49 = null;
        logger46.trace(marker47, "The server is stopped.", throwable49);
        boolean boolean51 = logger46.isTraceEnabled();
        logger46.info("generated cid, error");
        org.slf4j.Logger logger55 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker56 = null;
        java.lang.Throwable throwable58 = null;
        logger55.trace(marker56, "The server is stopped.", throwable58);
        boolean boolean60 = logger55.isTraceEnabled();
        logger55.info("generated cid, error");
        org.slf4j.Marker marker63 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable68 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable68.close();
        java.lang.Object[] objArray70 = new java.lang.Object[] { "noCID", mDCCloseable68 };
        logger55.debug(marker63, "CorrelationHandler is loaded.", objArray70);
        org.slf4j.Marker marker72 = null;
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        logger55.error(marker72, "The server is stopped.", objArray74);
        logger46.warn("", objArray74);
        logger0.warn(marker44, "correlationId = \001", objArray74);
        io.undertow.util.HttpString httpString79 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.server.ServerConnection serverConnection80 = null;
        io.undertow.server.HttpServerExchange httpServerExchange82 = new io.undertow.server.HttpServerExchange(serverConnection80, (long) (short) 0);
        long long83 = httpServerExchange82.getRequestStartTime();
        java.lang.String str84 = httpServerExchange82.getRequestURI();
        java.lang.String str85 = httpServerExchange82.getRequestPath();
        java.util.Map<java.lang.String, io.undertow.server.handlers.Cookie> strMap86 = httpServerExchange82.getResponseCookies();
        logger0.info("cId", (java.lang.Object) httpString79, (java.lang.Object) strMap86);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(booleanAttachmentKey9);
        org.junit.Assert.assertNotNull(mDCCloseable12);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(blockingHttpExchange22);
        org.junit.Assert.assertNotNull(httpServerExchange24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(blockingHttpExchange39);
        org.junit.Assert.assertNotNull(httpServerExchange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(mDCCloseable68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(httpString79);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(strMap86);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        long long3 = headerMap0.fiNextNonEmpty(0L);
        io.undertow.util.HeaderValues headerValues5 = headerMap0.get("starting server");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(headerValues5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        org.slf4j.Marker marker8 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable13 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable13.close();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "noCID", mDCCloseable13 };
        logger0.debug(marker8, "CorrelationHandler is loaded.", objArray15);
        org.slf4j.Marker marker17 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        logger0.error(marker17, "The server is stopped.", objArray19);
        org.slf4j.Marker marker21 = null;
        boolean boolean22 = logger0.isTraceEnabled(marker21);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mDCCloseable13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap6 = new io.undertow.util.HeaderMap();
        long long7 = headerMap6.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap10 = headerMap6.add(httpString8, (long) (short) 0);
        java.util.List<java.lang.String> strList11 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap12 = headerMap5.addAll(httpString8, (java.util.Collection<java.lang.String>) strList11);
        io.undertow.util.HeaderMap headerMap14 = headerMap4.add(httpString8, (long) 10);
        long long15 = headerMap14.fastIterateNonEmpty();
        io.undertow.util.HeaderMap headerMap16 = new io.undertow.util.HeaderMap();
        long long17 = headerMap16.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString18 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap20 = headerMap16.add(httpString18, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap21 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap22 = new io.undertow.util.HeaderMap();
        long long23 = headerMap22.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString24 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap26 = headerMap22.add(httpString24, (long) (short) 0);
        java.util.List<java.lang.String> strList27 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap28 = headerMap21.addAll(httpString24, (java.util.Collection<java.lang.String>) strList27);
        io.undertow.util.HeaderMap headerMap30 = headerMap20.add(httpString24, (long) 10);
        io.undertow.util.HeaderMap headerMap32 = headerMap14.put(httpString24, "starting server");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(headerMap12);
        org.junit.Assert.assertNotNull(headerMap14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 51539607552L + "'", long15 == 51539607552L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertNotNull(headerMap20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(httpString24);
        org.junit.Assert.assertNotNull(headerMap26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(headerMap28);
        org.junit.Assert.assertNotNull(headerMap30);
        org.junit.Assert.assertNotNull(headerMap32);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        org.slf4j.Marker marker5 = null;
        logger0.error(marker5, "\"generated cid, error\"", (java.lang.Object) 0.0d);
        java.lang.Throwable throwable10 = null;
        logger0.info("cid", throwable10);
        logger0.debug("\"The server is stopped.\"", (java.lang.Object) "\"generated cid, error\"");
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        int int5 = headerMap4.size();
        java.util.Collection<java.lang.String> strCollection7 = headerMap4.remove("hi%21");
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.ENV_TAG;
        io.undertow.util.HeaderMap headerMap10 = headerMap4.addLast(httpString8, "Associate traceability Id \001 with correlation Id \001");
        io.undertow.util.HttpString httpString11 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap13 = headerMap10.addFirst(httpString11, "hi%21");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(headerMap13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.dispatch(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.slf4j.MDC.put("Exception:", "cid");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.autogenCorrelationID;
        com.networknt.correlation.CorrelationHandler.config = correlationConfig0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        logger0.trace(marker1, "Associate traceability Id \001 with correlation Id \001");
        com.networknt.correlation.CorrelationConfig correlationConfig6 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean7 = correlationConfig6.isAutogenCorrelationID();
        boolean boolean8 = correlationConfig6.isEnabled();
        logger0.debug("{endpoint=[hi!, The server is stopped., hi%21, The server is stopped., , file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, cId, correlationId = \001, correlation, The server is stopped., Associate traceability Id \001 with correlation Id \001, cId, file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, noCID], X-Traceability-Id=[-1]}", (java.lang.Object) (-1L), (java.lang.Object) correlationConfig6);
        org.slf4j.Marker marker10 = null;
        io.undertow.util.HttpString httpString12 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        logger0.info(marker10, "\"The server is stopped.\"", (java.lang.Object) httpString12);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(httpString12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        boolean boolean10 = httpServerExchange2.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange14.setRequestPath("correlation");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = httpServerExchange14.getHostPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = httpServerExchange2.isHttp09();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.unDispatch();
        io.undertow.io.Sender sender8 = httpServerExchange7.getResponseSender();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(sender8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.networknt.correlation.CorrelationHandler correlationHandler0 = new com.networknt.correlation.CorrelationHandler();
        io.undertow.server.ServerConnection serverConnection1 = null;
        io.undertow.server.HttpServerExchange httpServerExchange3 = new io.undertow.server.HttpServerExchange(serverConnection1, (long) (short) 0);
        long long4 = httpServerExchange3.getRequestStartTime();
        java.lang.String str5 = httpServerExchange3.getRequestURI();
        boolean boolean6 = httpServerExchange3.isComplete();
        java.net.InetSocketAddress inetSocketAddress7 = null;
        io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange3.setSourceAddress(inetSocketAddress7);
        java.lang.Iterable<io.undertow.server.handlers.Cookie> cookieIterable9 = httpServerExchange3.responseCookies();
        // The following exception was thrown during execution in test generation
        try {
            correlationHandler0.handleRequest(httpServerExchange3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(httpServerExchange8);
        org.junit.Assert.assertNotNull(cookieIterable9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.slf4j.MDC.remove("{endpoint=[hi!, The server is stopped., hi%21, The server is stopped., , file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, cId, correlationId = \001, correlation, The server is stopped., Associate traceability Id \001 with correlation Id \001, cId, file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, noCID], X-Traceability-Id=[-1]}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setQueryString("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.BlockingHttpExchange blockingHttpExchange12 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange13 = httpServerExchange2.startBlocking(blockingHttpExchange12);
        java.util.concurrent.Executor executor14 = null;
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setDispatchExecutor(executor14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNull(blockingHttpExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray2 = null;
        logger0.error("The server is stopped.", objArray2);
        org.slf4j.Marker marker4 = null;
        io.undertow.server.ServerConnection serverConnection7 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = new io.undertow.server.HttpServerExchange(serverConnection7, (long) (short) 0);
        long long10 = httpServerExchange9.getRequestStartTime();
        java.lang.String str11 = httpServerExchange9.getRequestURI();
        boolean boolean12 = httpServerExchange9.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange13 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange14 = httpServerExchange9.startBlocking(blockingHttpExchange13);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange9.addRequestWrapper(streamSourceConduitConduitWrapper15);
        boolean boolean17 = httpServerExchange9.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange19 = httpServerExchange9.setRequestPath("");
        logger0.warn(marker4, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        io.undertow.util.HeaderMap headerMap22 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString23 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap25 = headerMap22.add(httpString23, (long) (short) -1);
        long long26 = headerMap22.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString27 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        java.lang.String[] strArray44 = new java.lang.String[] { "Exception:", "hi!", "cid", "localhost", "auditOnError", "starting server", "noCID", "cid", "ISO-8859-1", "cId", "The server is stopped.", "hi%21", "hi%21", "ISO-8859-1", "localhost", "\"generated cid, error\"" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        io.undertow.util.HeaderMap headerMap47 = headerMap22.addAll(httpString27, (java.util.Collection<java.lang.String>) strList45);
        logger0.warn("correlation", (java.lang.Object) httpString27, (java.lang.Object) "hi%21");
        org.slf4j.Marker marker50 = null;
        logger0.trace(marker50, "hi!");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(blockingHttpExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(httpServerExchange19);
        org.junit.Assert.assertNotNull(httpString23);
        org.junit.Assert.assertNotNull(headerMap25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 55834574848L + "'", long26 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString27);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(headerMap47);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        logger0.info("starting server");
        logger0.info("");
        org.slf4j.Marker marker5 = null;
        java.lang.Throwable throwable7 = null;
        logger0.info(marker5, "ERR10042", throwable7);
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString5 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        java.lang.String[] strArray22 = new java.lang.String[] { "Exception:", "hi!", "cid", "localhost", "auditOnError", "starting server", "noCID", "cid", "ISO-8859-1", "cId", "The server is stopped.", "hi%21", "hi%21", "ISO-8859-1", "localhost", "\"generated cid, error\"" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        io.undertow.util.HeaderMap headerMap25 = headerMap0.addAll(httpString5, (java.util.Collection<java.lang.String>) strList23);
        boolean boolean27 = headerMap0.contains("starting server");
        io.undertow.util.HeaderMap headerMap28 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap29 = new io.undertow.util.HeaderMap();
        long long30 = headerMap29.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString31 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap33 = headerMap29.add(httpString31, (long) (short) 0);
        java.util.List<java.lang.String> strList34 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap35 = headerMap28.addAll(httpString31, (java.util.Collection<java.lang.String>) strList34);
        io.undertow.util.HeaderMap headerMap36 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString37 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap39 = headerMap36.add(httpString37, (long) (short) -1);
        long long40 = headerMap36.fastIterate();
        io.undertow.util.HttpString httpString41 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        int int42 = headerMap36.count(httpString41);
        java.lang.Iterable<java.lang.String> strIterable43 = headerMap28.eachValue(httpString41);
        java.lang.String str44 = headerMap0.getLast(httpString41);
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(headerMap25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(httpString31);
        org.junit.Assert.assertNotNull(headerMap33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(headerMap35);
        org.junit.Assert.assertNotNull(httpString37);
        org.junit.Assert.assertNotNull(headerMap39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 55834574848L + "'", long40 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strIterable43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        java.lang.String str6 = httpServerExchange5.getReasonPhrase();
        java.lang.String str7 = httpServerExchange5.getResolvedPath();
        io.undertow.util.HttpString httpString8 = httpServerExchange5.getRequestMethod();
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.XnioIoThread xnioIoThread9 = httpServerExchange5.getIoThread();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(httpString8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        boolean boolean6 = httpServerExchange2.isResponseChannelAvailable();
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange2.setProtocol(httpString7);
        boolean boolean9 = httpServerExchange8.isResponseChannelAvailable();
        boolean boolean10 = httpServerExchange8.isResponseChannelAvailable();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNotNull(httpServerExchange8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        boolean boolean6 = httpServerExchange2.isResponseChannelAvailable();
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.server.HttpServerExchange httpServerExchange8 = httpServerExchange2.setProtocol(httpString7);
        boolean boolean9 = com.networknt.handler.Handler.startDefaultHandlers(httpServerExchange2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNotNull(httpServerExchange8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        int int12 = httpServerExchange11.getResponseCode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestURI("The server is stopped.", true);
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("ERR10042");
        io.undertow.security.api.SecurityContext securityContext15 = null;
        httpServerExchange14.setSecurityContext(securityContext15);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setResolvedPath("");
        io.undertow.io.Sender sender8 = httpServerExchange7.getResponseSender();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(sender8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.ResponseCommitListener responseCommitListener10 = null;
        httpServerExchange9.addResponseCommitListener(responseCommitListener10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        java.util.concurrent.Executor executor10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setDispatchExecutor(executor10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange7.setResponseCode(200);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange7.setReasonPhrase("");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange7.setResponseCode(200);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, io.undertow.server.handlers.Cookie> strMap10 = httpServerExchange7.getRequestCookies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Object obj3 = null;
        logger0.debug(marker1, "correlationId = \001", obj3, (java.lang.Object) "correlationId = \001");
        org.slf4j.Marker marker6 = null;
        boolean boolean7 = logger0.isErrorEnabled(marker6);
        org.slf4j.Marker marker8 = null;
        org.slf4j.Logger logger10 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker11 = null;
        java.lang.Throwable throwable13 = null;
        logger10.trace(marker11, "The server is stopped.", throwable13);
        boolean boolean15 = logger10.isInfoEnabled();
        org.slf4j.Marker marker16 = null;
        logger10.error(marker16, "ROOT", (java.lang.Object) "hi!");
        org.slf4j.Marker marker20 = null;
        org.slf4j.Logger logger22 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker23 = null;
        io.undertow.util.HeaderMap headerMap25 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString26 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap28 = headerMap25.add(httpString26, (long) (short) -1);
        io.undertow.util.HttpString httpString29 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str30 = headerMap25.getFirst(httpString29);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey31 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable34 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable34.close();
        io.undertow.util.HttpString httpString36 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection37 = null;
        io.undertow.server.HttpServerExchange httpServerExchange39 = new io.undertow.server.HttpServerExchange(serverConnection37, (long) (short) 0);
        long long40 = httpServerExchange39.getRequestStartTime();
        java.lang.String str41 = httpServerExchange39.getRequestURI();
        boolean boolean42 = httpServerExchange39.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange43 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange44 = httpServerExchange39.startBlocking(blockingHttpExchange43);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper45 = null;
        io.undertow.server.HttpServerExchange httpServerExchange46 = httpServerExchange39.addRequestWrapper(streamSourceConduitConduitWrapper45);
        java.lang.Object[] objArray48 = new java.lang.Object[] { str30, booleanAttachmentKey31, mDCCloseable34, httpString36, streamSourceConduitConduitWrapper45, 0.0d };
        logger22.info(marker23, "generated cid, error", objArray48);
        logger10.error(marker20, "auditStackTrace", objArray48);
        logger0.info(marker8, "\"generated cid, error\"", objArray48);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(httpString26);
        org.junit.Assert.assertNotNull(headerMap28);
        org.junit.Assert.assertNotNull(httpString29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(booleanAttachmentKey31);
        org.junit.Assert.assertNotNull(mDCCloseable34);
        org.junit.Assert.assertNotNull(httpString36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(blockingHttpExchange44);
        org.junit.Assert.assertNotNull(httpServerExchange46);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString1 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap3 = headerMap0.add(httpString1, (long) (short) -1);
        long long4 = headerMap0.fastIterate();
        io.undertow.util.HttpString httpString5 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.undertow.util.HeaderMap headerMap23 = headerMap0.addAll(httpString5, (java.util.Collection<java.lang.String>) strList21);
        io.undertow.util.HttpString httpString24 = null;
        io.undertow.util.HeaderMap headerMap25 = new io.undertow.util.HeaderMap();
        long long26 = headerMap25.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString27 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap29 = headerMap25.add(httpString27, (long) (short) 0);
        java.util.Collection<java.lang.String> strCollection31 = headerMap25.remove("CorrelationHandler is loaded.");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HeaderMap headerMap32 = headerMap23.addAll(httpString24, strCollection31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: headerName is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpString1);
        org.junit.Assert.assertNotNull(headerMap3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 55834574848L + "'", long4 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString5);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(headerMap23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(httpString27);
        org.junit.Assert.assertNotNull(headerMap29);
        org.junit.Assert.assertNotNull(strCollection31);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        java.util.concurrent.Executor executor5 = httpServerExchange2.getDispatchExecutor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(executor5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        logger0.trace(marker1, "Associate traceability Id \001 with correlation Id \001");
        com.networknt.correlation.CorrelationConfig correlationConfig6 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean7 = correlationConfig6.isAutogenCorrelationID();
        boolean boolean8 = correlationConfig6.isEnabled();
        logger0.debug("{endpoint=[hi!, The server is stopped., hi%21, The server is stopped., , file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, cId, correlationId = \001, correlation, The server is stopped., Associate traceability Id \001 with correlation Id \001, cId, file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, noCID], X-Traceability-Id=[-1]}", (java.lang.Object) (-1L), (java.lang.Object) correlationConfig6);
        boolean boolean10 = correlationConfig6.autogenCorrelationID;
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        java.lang.Throwable throwable7 = null;
        logger0.warn("Associate traceability Id \001 with correlation Id \001", throwable7);
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger11 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker12 = null;
        io.undertow.util.HeaderMap headerMap14 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString15 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap17 = headerMap14.add(httpString15, (long) (short) -1);
        io.undertow.util.HttpString httpString18 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str19 = headerMap14.getFirst(httpString18);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey20 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable23 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable23.close();
        io.undertow.util.HttpString httpString25 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection26 = null;
        io.undertow.server.HttpServerExchange httpServerExchange28 = new io.undertow.server.HttpServerExchange(serverConnection26, (long) (short) 0);
        long long29 = httpServerExchange28.getRequestStartTime();
        java.lang.String str30 = httpServerExchange28.getRequestURI();
        boolean boolean31 = httpServerExchange28.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange32 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange33 = httpServerExchange28.startBlocking(blockingHttpExchange32);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper34 = null;
        io.undertow.server.HttpServerExchange httpServerExchange35 = httpServerExchange28.addRequestWrapper(streamSourceConduitConduitWrapper34);
        java.lang.Object[] objArray37 = new java.lang.Object[] { str19, booleanAttachmentKey20, mDCCloseable23, httpString25, streamSourceConduitConduitWrapper34, 0.0d };
        logger11.info(marker12, "generated cid, error", objArray37);
        io.undertow.server.ServerConnection serverConnection39 = null;
        io.undertow.server.HttpServerExchange httpServerExchange41 = new io.undertow.server.HttpServerExchange(serverConnection39, (long) (short) 0);
        long long42 = httpServerExchange41.getRequestStartTime();
        java.lang.String str43 = httpServerExchange41.getRequestURI();
        boolean boolean44 = httpServerExchange41.isHostIncludedInRequestURI();
        logger0.trace(marker9, "cId", (java.lang.Object) objArray37, (java.lang.Object) httpServerExchange41);
        io.undertow.server.HttpServerExchange httpServerExchange47 = httpServerExchange41.setResponseContentLength((long) (byte) 1);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertNotNull(headerMap17);
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(booleanAttachmentKey20);
        org.junit.Assert.assertNotNull(mDCCloseable23);
        org.junit.Assert.assertNotNull(httpString25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(blockingHttpExchange33);
        org.junit.Assert.assertNotNull(httpServerExchange35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(httpServerExchange47);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, 0L);
        java.lang.String str3 = httpServerExchange2.getRequestCharset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISO-8859-1" + "'", str3, "ISO-8859-1");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestURI("The server is stopped.", true);
        java.lang.String str13 = httpServerExchange12.getReasonPhrase();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        correlationConfig0.autogenCorrelationID = false;
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        int int1 = com.networknt.utility.Util.parseInteger("ISO-8859-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        io.undertow.util.HeaderMap headerMap3 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString4 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap6 = headerMap3.add(httpString4, (long) (short) -1);
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str8 = headerMap3.getFirst(httpString7);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey9 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable12 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable12.close();
        io.undertow.util.HttpString httpString14 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange17 = new io.undertow.server.HttpServerExchange(serverConnection15, (long) (short) 0);
        long long18 = httpServerExchange17.getRequestStartTime();
        java.lang.String str19 = httpServerExchange17.getRequestURI();
        boolean boolean20 = httpServerExchange17.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange22 = httpServerExchange17.startBlocking(blockingHttpExchange21);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper23 = null;
        io.undertow.server.HttpServerExchange httpServerExchange24 = httpServerExchange17.addRequestWrapper(streamSourceConduitConduitWrapper23);
        java.lang.Object[] objArray26 = new java.lang.Object[] { str8, booleanAttachmentKey9, mDCCloseable12, httpString14, streamSourceConduitConduitWrapper23, 0.0d };
        logger0.info(marker1, "generated cid, error", objArray26);
        org.slf4j.Marker marker28 = null;
        boolean boolean29 = logger0.isWarnEnabled(marker28);
        org.slf4j.Marker marker30 = null;
        io.undertow.server.ServerConnection serverConnection32 = null;
        io.undertow.server.HttpServerExchange httpServerExchange34 = new io.undertow.server.HttpServerExchange(serverConnection32, (long) (short) 0);
        long long35 = httpServerExchange34.getRequestStartTime();
        java.lang.String str36 = httpServerExchange34.getRequestURI();
        boolean boolean37 = httpServerExchange34.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange38 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange39 = httpServerExchange34.startBlocking(blockingHttpExchange38);
        io.undertow.server.HttpServerExchange httpServerExchange41 = httpServerExchange34.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        boolean boolean42 = httpServerExchange41.isRequestChannelAvailable();
        logger0.debug(marker30, "ERR10042", (java.lang.Object) boolean42);
        java.lang.Throwable throwable45 = null;
        logger0.debug("audit", throwable45);
        org.slf4j.Marker marker47 = null;
        boolean boolean48 = logger0.isWarnEnabled(marker47);
        org.slf4j.Logger logger50 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker51 = null;
        java.lang.Throwable throwable53 = null;
        logger50.trace(marker51, "The server is stopped.", throwable53);
        boolean boolean55 = logger50.isInfoEnabled();
        org.slf4j.Marker marker56 = null;
        logger50.error(marker56, "ROOT", (java.lang.Object) "hi!");
        org.slf4j.Marker marker60 = null;
        org.slf4j.Logger logger62 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker63 = null;
        io.undertow.util.HeaderMap headerMap65 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString66 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap68 = headerMap65.add(httpString66, (long) (short) -1);
        io.undertow.util.HttpString httpString69 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str70 = headerMap65.getFirst(httpString69);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey71 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable74 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable74.close();
        io.undertow.util.HttpString httpString76 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection77 = null;
        io.undertow.server.HttpServerExchange httpServerExchange79 = new io.undertow.server.HttpServerExchange(serverConnection77, (long) (short) 0);
        long long80 = httpServerExchange79.getRequestStartTime();
        java.lang.String str81 = httpServerExchange79.getRequestURI();
        boolean boolean82 = httpServerExchange79.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange83 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange84 = httpServerExchange79.startBlocking(blockingHttpExchange83);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper85 = null;
        io.undertow.server.HttpServerExchange httpServerExchange86 = httpServerExchange79.addRequestWrapper(streamSourceConduitConduitWrapper85);
        java.lang.Object[] objArray88 = new java.lang.Object[] { str70, booleanAttachmentKey71, mDCCloseable74, httpString76, streamSourceConduitConduitWrapper85, 0.0d };
        logger62.info(marker63, "generated cid, error", objArray88);
        logger50.error(marker60, "auditStackTrace", objArray88);
        logger0.info("correlationId = \001", objArray88);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(booleanAttachmentKey9);
        org.junit.Assert.assertNotNull(mDCCloseable12);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(blockingHttpExchange22);
        org.junit.Assert.assertNotNull(httpServerExchange24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(blockingHttpExchange39);
        org.junit.Assert.assertNotNull(httpServerExchange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(logger62);
        org.junit.Assert.assertNotNull(httpString66);
        org.junit.Assert.assertNotNull(headerMap68);
        org.junit.Assert.assertNotNull(httpString69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(booleanAttachmentKey71);
        org.junit.Assert.assertNotNull(mDCCloseable74);
        org.junit.Assert.assertNotNull(httpString76);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(blockingHttpExchange84);
        org.junit.Assert.assertNotNull(httpServerExchange86);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        correlationConfig0.setAutogenCorrelationID(true);
        boolean boolean3 = correlationConfig0.isAutogenCorrelationID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.networknt.correlation.CorrelationHandler correlationHandler0 = new com.networknt.correlation.CorrelationHandler();
        com.networknt.handler.Handler.setLastHandler((io.undertow.server.HttpHandler) correlationHandler0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.slf4j.MDC.MDCCloseable mDCCloseable2 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable2.close();
        mDCCloseable2.close();
        org.junit.Assert.assertNotNull(mDCCloseable2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        java.lang.Throwable throwable7 = null;
        logger0.warn("Associate traceability Id \001 with correlation Id \001", throwable7);
        org.slf4j.Marker marker9 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        logger0.debug(marker9, "", objArray11);
        org.slf4j.Marker marker13 = null;
        java.lang.Throwable throwable15 = null;
        logger0.info(marker13, "hi%21", throwable15);
        java.lang.Throwable throwable18 = null;
        logger0.error("ROOT", throwable18);
        java.lang.Throwable throwable21 = null;
        logger0.info("generated cid, error", throwable21);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setMaxEntitySize((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        boolean boolean10 = httpServerExchange2.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper15);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange17 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange18 = httpServerExchange2.startBlocking(blockingHttpExchange17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = httpServerExchange2.getHostAndPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertNull(blockingHttpExchange18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        io.undertow.server.ExchangeCompletionListener exchangeCompletionListener12 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = httpServerExchange2.addExchangeCompleteListener(exchangeCompletionListener12);
        io.undertow.server.HttpServerExchange httpServerExchange15 = httpServerExchange2.setRequestScheme("");
        io.undertow.server.HttpServerExchange httpServerExchange17 = httpServerExchange2.setPersistent(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpServerExchange13);
        org.junit.Assert.assertNotNull(httpServerExchange15);
        org.junit.Assert.assertNotNull(httpServerExchange17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap1.add(httpString2, (long) (short) -1);
        long long5 = headerMap1.fastIterate();
        io.undertow.util.HttpString httpString6 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        io.undertow.util.HeaderMap headerMap24 = headerMap1.addAll(httpString6, (java.util.Collection<java.lang.String>) strList22);
        java.lang.String str25 = headerMap24.toString();
        io.undertow.util.HeaderMap headerMap26 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString27 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap29 = headerMap26.add(httpString27, (long) (short) -1);
        int int30 = headerMap29.size();
        io.undertow.util.HeaderMap headerMap31 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString32 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap34 = headerMap31.add(httpString32, (long) (short) -1);
        long long35 = headerMap31.fastIterate();
        io.undertow.util.HttpString httpString36 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "The server is stopped.", "hi%21", "The server is stopped.", "", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "cId", "correlationId = \001", "correlation", "The server is stopped.", "Associate traceability Id \001 with correlation Id \001", "cId", "file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", "noCID" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        io.undertow.util.HeaderMap headerMap54 = headerMap31.addAll(httpString36, (java.util.Collection<java.lang.String>) strList52);
        io.undertow.util.HeaderMap headerMap55 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap56 = new io.undertow.util.HeaderMap();
        long long57 = headerMap56.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString58 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap60 = headerMap56.add(httpString58, (long) (short) 0);
        java.util.List<java.lang.String> strList61 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap62 = headerMap55.addAll(httpString58, (java.util.Collection<java.lang.String>) strList61);
        io.undertow.util.HeaderMap headerMap63 = headerMap29.putAll(httpString36, (java.util.Collection<java.lang.String>) strList61);
        io.undertow.server.HttpServerExchange httpServerExchange65 = new io.undertow.server.HttpServerExchange(serverConnection0, headerMap24, headerMap63, (long) 200);
        java.util.Spliterator<io.undertow.util.HeaderValues> headerValuesSpliterator66 = headerMap63.spliterator();
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 55834574848L + "'", long5 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString6);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(headerMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{endpoint=[hi!, The server is stopped., hi%21, The server is stopped., , file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, cId, correlationId = \001, correlation, The server is stopped., Associate traceability Id \001 with correlation Id \001, cId, file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, noCID], X-Traceability-Id=[-1]}" + "'", str25, "{endpoint=[hi!, The server is stopped., hi%21, The server is stopped., , file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, cId, correlationId = \001, correlation, The server is stopped., Associate traceability Id \001 with correlation Id \001, cId, file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, noCID], X-Traceability-Id=[-1]}");
        org.junit.Assert.assertNotNull(httpString27);
        org.junit.Assert.assertNotNull(headerMap29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(httpString32);
        org.junit.Assert.assertNotNull(headerMap34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 55834574848L + "'", long35 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString36);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(headerMap54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(httpString58);
        org.junit.Assert.assertNotNull(headerMap60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(headerMap62);
        org.junit.Assert.assertNotNull(headerMap63);
        org.junit.Assert.assertNotNull(headerValuesSpliterator66);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        long long10 = httpServerExchange2.getMaxEntitySize();
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.unDispatch();
        java.lang.String str12 = httpServerExchange2.getRelativePath();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.slf4j.MDC.getCopyOfContextMap();
        java.lang.String str3 = com.networknt.utility.Util.substituteVariables("ERR10042", strMap2);
        java.lang.String str4 = com.networknt.utility.Util.substituteVariables("Exception:", strMap2);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ERR10042" + "'", str3, "ERR10042");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Exception:" + "'", str4, "Exception:");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.networknt.correlation.CorrelationConfig correlationConfig0 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean1 = correlationConfig0.isAutogenCorrelationID();
        boolean boolean2 = correlationConfig0.autogenCorrelationID;
        correlationConfig0.setAutogenCorrelationID(true);
        boolean boolean5 = correlationConfig0.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey10 = null;
        java.lang.Boolean boolean11 = httpServerExchange2.removeAttachment(booleanAttachmentKey10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = httpServerExchange2.isHttp10();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        io.undertow.util.HeaderMap headerMap3 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString4 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap6 = headerMap3.add(httpString4, (long) (short) -1);
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str8 = headerMap3.getFirst(httpString7);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey9 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable12 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable12.close();
        io.undertow.util.HttpString httpString14 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange17 = new io.undertow.server.HttpServerExchange(serverConnection15, (long) (short) 0);
        long long18 = httpServerExchange17.getRequestStartTime();
        java.lang.String str19 = httpServerExchange17.getRequestURI();
        boolean boolean20 = httpServerExchange17.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange22 = httpServerExchange17.startBlocking(blockingHttpExchange21);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper23 = null;
        io.undertow.server.HttpServerExchange httpServerExchange24 = httpServerExchange17.addRequestWrapper(streamSourceConduitConduitWrapper23);
        java.lang.Object[] objArray26 = new java.lang.Object[] { str8, booleanAttachmentKey9, mDCCloseable12, httpString14, streamSourceConduitConduitWrapper23, 0.0d };
        logger0.info(marker1, "generated cid, error", objArray26);
        org.slf4j.Marker marker28 = null;
        boolean boolean29 = logger0.isWarnEnabled(marker28);
        org.slf4j.Marker marker30 = null;
        io.undertow.server.ServerConnection serverConnection32 = null;
        io.undertow.server.HttpServerExchange httpServerExchange34 = new io.undertow.server.HttpServerExchange(serverConnection32, (long) (short) 0);
        long long35 = httpServerExchange34.getRequestStartTime();
        java.lang.String str36 = httpServerExchange34.getRequestURI();
        boolean boolean37 = httpServerExchange34.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange38 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange39 = httpServerExchange34.startBlocking(blockingHttpExchange38);
        io.undertow.server.HttpServerExchange httpServerExchange41 = httpServerExchange34.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        boolean boolean42 = httpServerExchange41.isRequestChannelAvailable();
        logger0.debug(marker30, "ERR10042", (java.lang.Object) boolean42);
        io.undertow.util.HeaderMap headerMap45 = new io.undertow.util.HeaderMap();
        long long46 = headerMap45.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString47 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap49 = headerMap45.add(httpString47, (long) (short) 0);
        int int50 = headerMap49.size();
        boolean boolean52 = headerMap49.contains("audit");
        logger0.debug("handler", (java.lang.Object) "audit");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(httpString4);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(booleanAttachmentKey9);
        org.junit.Assert.assertNotNull(mDCCloseable12);
        org.junit.Assert.assertNotNull(httpString14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(blockingHttpExchange22);
        org.junit.Assert.assertNotNull(httpServerExchange24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(blockingHttpExchange39);
        org.junit.Assert.assertNotNull(httpServerExchange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(httpString47);
        org.junit.Assert.assertNotNull(headerMap49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isInfoEnabled();
        io.undertow.util.AttachmentKey<java.lang.String> strAttachmentKey7 = io.undertow.server.HttpServerExchange.REMOTE_USER;
        io.undertow.server.ServerConnection serverConnection9 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = new io.undertow.server.HttpServerExchange(serverConnection9, (long) (short) 0);
        long long12 = httpServerExchange11.getRequestStartTime();
        java.lang.String str13 = httpServerExchange11.getRequestURI();
        boolean boolean14 = httpServerExchange11.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange15 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange16 = httpServerExchange11.startBlocking(blockingHttpExchange15);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper17 = null;
        io.undertow.server.HttpServerExchange httpServerExchange18 = httpServerExchange11.addRequestWrapper(streamSourceConduitConduitWrapper17);
        boolean boolean19 = httpServerExchange11.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange21 = httpServerExchange11.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange23 = httpServerExchange11.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        java.lang.Object[] objArray24 = new java.lang.Object[] { strAttachmentKey7, (short) 10, httpServerExchange11 };
        logger0.trace("ERR10042", objArray24);
        org.slf4j.Marker marker26 = null;
        io.undertow.server.ServerConnection serverConnection28 = null;
        io.undertow.server.HttpServerExchange httpServerExchange30 = new io.undertow.server.HttpServerExchange(serverConnection28, (long) (byte) 1);
        io.undertow.server.ServerConnection serverConnection31 = null;
        io.undertow.server.HttpServerExchange httpServerExchange33 = new io.undertow.server.HttpServerExchange(serverConnection31, (long) (short) 0);
        long long34 = httpServerExchange33.getRequestStartTime();
        java.lang.String str35 = httpServerExchange33.getRequestURI();
        boolean boolean36 = httpServerExchange33.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange37 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange38 = httpServerExchange33.startBlocking(blockingHttpExchange37);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper39 = null;
        io.undertow.server.HttpServerExchange httpServerExchange40 = httpServerExchange33.addRequestWrapper(streamSourceConduitConduitWrapper39);
        boolean boolean41 = httpServerExchange33.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange43 = httpServerExchange33.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange45 = httpServerExchange33.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper46 = null;
        io.undertow.server.HttpServerExchange httpServerExchange47 = httpServerExchange33.addRequestWrapper(streamSourceConduitConduitWrapper46);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange48 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange49 = httpServerExchange33.startBlocking(blockingHttpExchange48);
        logger0.trace(marker26, "\"The server is stopped.\"", (java.lang.Object) serverConnection28, (java.lang.Object) blockingHttpExchange48);
        io.undertow.server.ServerConnection serverConnection53 = null;
        io.undertow.server.HttpServerExchange httpServerExchange55 = new io.undertow.server.HttpServerExchange(serverConnection53, (long) (short) 0);
        long long56 = httpServerExchange55.getRequestStartTime();
        java.lang.String str57 = httpServerExchange55.getRequestURI();
        boolean boolean58 = httpServerExchange55.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress59 = null;
        io.undertow.server.HttpServerExchange httpServerExchange60 = httpServerExchange55.setSourceAddress(inetSocketAddress59);
        io.undertow.security.api.SecurityContext securityContext61 = null;
        httpServerExchange55.setSecurityContext(securityContext61);
        logger0.info("", (java.lang.Object) "audit", (java.lang.Object) httpServerExchange55);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strAttachmentKey7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(blockingHttpExchange16);
        org.junit.Assert.assertNotNull(httpServerExchange18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(httpServerExchange21);
        org.junit.Assert.assertNotNull(httpServerExchange23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(blockingHttpExchange38);
        org.junit.Assert.assertNotNull(httpServerExchange40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(httpServerExchange43);
        org.junit.Assert.assertNotNull(httpServerExchange45);
        org.junit.Assert.assertNotNull(httpServerExchange47);
        org.junit.Assert.assertNull(blockingHttpExchange49);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(httpServerExchange60);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        logger0.info("starting server");
        logger0.info("");
        org.slf4j.Marker marker5 = null;
        org.slf4j.Logger logger8 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker9 = null;
        java.lang.Throwable throwable11 = null;
        logger8.trace(marker9, "The server is stopped.", throwable11);
        boolean boolean13 = logger8.isInfoEnabled();
        io.undertow.util.AttachmentKey<java.lang.String> strAttachmentKey15 = io.undertow.server.HttpServerExchange.REMOTE_USER;
        io.undertow.server.ServerConnection serverConnection17 = null;
        io.undertow.server.HttpServerExchange httpServerExchange19 = new io.undertow.server.HttpServerExchange(serverConnection17, (long) (short) 0);
        long long20 = httpServerExchange19.getRequestStartTime();
        java.lang.String str21 = httpServerExchange19.getRequestURI();
        boolean boolean22 = httpServerExchange19.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange23 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange24 = httpServerExchange19.startBlocking(blockingHttpExchange23);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper25 = null;
        io.undertow.server.HttpServerExchange httpServerExchange26 = httpServerExchange19.addRequestWrapper(streamSourceConduitConduitWrapper25);
        boolean boolean27 = httpServerExchange19.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange29 = httpServerExchange19.setRequestPath("");
        io.undertow.server.HttpServerExchange httpServerExchange31 = httpServerExchange19.setRequestScheme("Associate traceability Id \001 with correlation Id \001");
        java.lang.Object[] objArray32 = new java.lang.Object[] { strAttachmentKey15, (short) 10, httpServerExchange19 };
        logger8.trace("ERR10042", objArray32);
        logger0.info(marker5, "\"The server is stopped.\"", (java.lang.Object) "cId", (java.lang.Object) objArray32);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strAttachmentKey15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(blockingHttpExchange24);
        org.junit.Assert.assertNotNull(httpServerExchange26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(httpServerExchange29);
        org.junit.Assert.assertNotNull(httpServerExchange31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[io.undertow.util.SimpleAttachmentKey<java.lang.String>, 10, HttpServerExchange{  null}]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        java.lang.Throwable throwable7 = null;
        logger0.warn("Associate traceability Id \001 with correlation Id \001", throwable7);
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger11 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker12 = null;
        io.undertow.util.HeaderMap headerMap14 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString15 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap17 = headerMap14.add(httpString15, (long) (short) -1);
        io.undertow.util.HttpString httpString18 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str19 = headerMap14.getFirst(httpString18);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey20 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable23 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable23.close();
        io.undertow.util.HttpString httpString25 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection26 = null;
        io.undertow.server.HttpServerExchange httpServerExchange28 = new io.undertow.server.HttpServerExchange(serverConnection26, (long) (short) 0);
        long long29 = httpServerExchange28.getRequestStartTime();
        java.lang.String str30 = httpServerExchange28.getRequestURI();
        boolean boolean31 = httpServerExchange28.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange32 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange33 = httpServerExchange28.startBlocking(blockingHttpExchange32);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper34 = null;
        io.undertow.server.HttpServerExchange httpServerExchange35 = httpServerExchange28.addRequestWrapper(streamSourceConduitConduitWrapper34);
        java.lang.Object[] objArray37 = new java.lang.Object[] { str19, booleanAttachmentKey20, mDCCloseable23, httpString25, streamSourceConduitConduitWrapper34, 0.0d };
        logger11.info(marker12, "generated cid, error", objArray37);
        io.undertow.server.ServerConnection serverConnection39 = null;
        io.undertow.server.HttpServerExchange httpServerExchange41 = new io.undertow.server.HttpServerExchange(serverConnection39, (long) (short) 0);
        long long42 = httpServerExchange41.getRequestStartTime();
        java.lang.String str43 = httpServerExchange41.getRequestURI();
        boolean boolean44 = httpServerExchange41.isHostIncludedInRequestURI();
        logger0.trace(marker9, "cId", (java.lang.Object) objArray37, (java.lang.Object) httpServerExchange41);
        io.undertow.server.HttpUpgradeListener httpUpgradeListener47 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange48 = httpServerExchange41.upgradeChannel("auditStackTrace", httpUpgradeListener47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(httpString15);
        org.junit.Assert.assertNotNull(headerMap17);
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(booleanAttachmentKey20);
        org.junit.Assert.assertNotNull(mDCCloseable23);
        org.junit.Assert.assertNotNull(httpString25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(blockingHttpExchange33);
        org.junit.Assert.assertNotNull(httpServerExchange35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        io.undertow.util.HeaderMap headerMap6 = httpServerExchange2.getRequestHeaders();
        io.undertow.security.api.SecurityContext securityContext7 = null;
        httpServerExchange2.setSecurityContext(securityContext7);
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange10 = httpServerExchange2.dispatch(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNotNull(headerMap6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        long long2 = headerMap1.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString3 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap5 = headerMap1.add(httpString3, (long) (short) 0);
        java.util.List<java.lang.String> strList6 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap7 = headerMap0.addAll(httpString3, (java.util.Collection<java.lang.String>) strList6);
        java.lang.String str10 = headerMap0.get("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", (int) (short) -1);
        io.undertow.util.HttpString httpString11 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.util.HeaderMap headerMap13 = headerMap0.put(httpString11, (long) '#');
        io.undertow.util.HeaderMap headerMap14 = headerMap13.clear();
        java.util.Iterator<io.undertow.util.HeaderValues> headerValuesItor15 = headerMap14.iterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(headerMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(headerMap13);
        org.junit.Assert.assertNotNull(headerMap14);
        org.junit.Assert.assertNotNull(headerValuesItor15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        org.slf4j.Marker marker5 = null;
        logger0.error(marker5, "\"generated cid, error\"", (java.lang.Object) 0.0d);
        boolean boolean9 = logger0.isErrorEnabled();
        org.slf4j.Marker marker10 = null;
        logger0.warn(marker10, "\"The server is stopped.\"");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.networknt.correlation.CorrelationHandler correlationHandler0 = new com.networknt.correlation.CorrelationHandler();
        correlationHandler0.register();
        org.slf4j.Logger logger2 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray4 = null;
        logger2.error("The server is stopped.", objArray4);
        org.slf4j.Marker marker6 = null;
        io.undertow.server.ServerConnection serverConnection9 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = new io.undertow.server.HttpServerExchange(serverConnection9, (long) (short) 0);
        long long12 = httpServerExchange11.getRequestStartTime();
        java.lang.String str13 = httpServerExchange11.getRequestURI();
        boolean boolean14 = httpServerExchange11.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange15 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange16 = httpServerExchange11.startBlocking(blockingHttpExchange15);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper17 = null;
        io.undertow.server.HttpServerExchange httpServerExchange18 = httpServerExchange11.addRequestWrapper(streamSourceConduitConduitWrapper17);
        boolean boolean19 = httpServerExchange11.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange21 = httpServerExchange11.setRequestPath("");
        logger2.warn(marker6, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        boolean boolean23 = logger2.isErrorEnabled();
        org.slf4j.Marker marker24 = null;
        io.undertow.util.HeaderMap headerMap26 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap27 = new io.undertow.util.HeaderMap();
        long long28 = headerMap27.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString29 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap31 = headerMap27.add(httpString29, (long) (short) 0);
        java.util.List<java.lang.String> strList32 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap33 = headerMap26.addAll(httpString29, (java.util.Collection<java.lang.String>) strList32);
        logger2.error(marker24, "hi%21", (java.lang.Object) httpString29);
        org.slf4j.Marker marker35 = null;
        io.undertow.server.ServerConnection serverConnection37 = null;
        io.undertow.server.HttpServerExchange httpServerExchange39 = new io.undertow.server.HttpServerExchange(serverConnection37, (long) (short) 0);
        long long40 = httpServerExchange39.getRequestStartTime();
        java.lang.String str41 = httpServerExchange39.getRequestURI();
        boolean boolean42 = httpServerExchange39.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress43 = null;
        io.undertow.server.HttpServerExchange httpServerExchange44 = httpServerExchange39.setDestinationAddress(inetSocketAddress43);
        org.slf4j.Logger logger45 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker46 = null;
        java.lang.Throwable throwable48 = null;
        logger45.trace(marker46, "The server is stopped.", throwable48);
        boolean boolean50 = logger45.isTraceEnabled();
        java.lang.Throwable throwable52 = null;
        logger45.warn("Associate traceability Id \001 with correlation Id \001", throwable52);
        org.slf4j.Marker marker54 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        logger45.debug(marker54, "", objArray56);
        org.slf4j.Marker marker58 = null;
        java.lang.Throwable throwable60 = null;
        logger45.info(marker58, "hi%21", throwable60);
        java.lang.Throwable throwable63 = null;
        logger45.error("ROOT", throwable63);
        org.slf4j.Marker marker65 = null;
        java.lang.Throwable throwable67 = null;
        logger45.warn(marker65, "cid", throwable67);
        logger2.info(marker35, "generated cid, error", (java.lang.Object) httpServerExchange44, (java.lang.Object) marker65);
        com.networknt.status.Status status70 = null;
        // The following exception was thrown during execution in test generation
        try {
            correlationHandler0.setExchangeStatus(httpServerExchange44, status70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(blockingHttpExchange16);
        org.junit.Assert.assertNotNull(httpServerExchange18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(httpServerExchange21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(httpString29);
        org.junit.Assert.assertNotNull(headerMap31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(headerMap33);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(httpServerExchange44);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.util.concurrent.Executor executor6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setDispatchExecutor(executor6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        boolean boolean4 = httpServerExchange2.isResponseStarted();
        io.undertow.server.handlers.Cookie cookie5 = null;
        io.undertow.server.HttpServerExchange httpServerExchange6 = httpServerExchange2.setResponseCookie(cookie5);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange8 = httpServerExchange2.startBlocking(blockingHttpExchange7);
        boolean boolean9 = httpServerExchange2.isResponseChannelAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(httpServerExchange6);
        org.junit.Assert.assertNull(blockingHttpExchange8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper10 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper10);
        com.networknt.correlation.CorrelationHandler correlationHandler12 = new com.networknt.correlation.CorrelationHandler();
        io.undertow.server.HttpHandler httpHandler13 = com.networknt.handler.Handler.getNext(httpServerExchange2, (io.undertow.server.HttpHandler) correlationHandler12);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(httpHandler13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestURI("The server is stopped.", true);
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("ERR10042");
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> strMap15 = httpServerExchange14.getPathParameters();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        long long2 = headerMap1.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString3 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap5 = headerMap1.add(httpString3, (long) (short) 0);
        java.lang.Iterable<java.lang.String> strIterable6 = headerMap0.eachValue(httpString3);
        io.undertow.util.HeaderMap headerMap7 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap10 = headerMap7.add(httpString8, (long) (short) -1);
        long long11 = headerMap7.fastIterate();
        io.undertow.util.HttpString httpString12 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        int int13 = headerMap7.count(httpString12);
        io.undertow.util.HeaderMap headerMap15 = headerMap0.addFirst(httpString12, "correlation");
        io.undertow.util.HttpString httpString16 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.Iterable<java.lang.String> strIterable17 = headerMap0.eachValue(httpString16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 55834574848L + "'", long11 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(headerMap15);
        org.junit.Assert.assertNotNull(httpString16);
        org.junit.Assert.assertNotNull(strIterable17);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setQueryString("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = httpServerExchange2.getHostName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.String str1 = com.networknt.utility.Util.urlDecode("generated cid, error");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "generated cid, error" + "'", str1, "generated cid, error");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        int int4 = httpServerExchange2.getStatusCode();
        boolean boolean5 = httpServerExchange2.isBlocking();
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setResolvedPath("");
        java.util.concurrent.Executor executor8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange7.setDispatchExecutor(executor8);
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange7.setStatusCode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid response code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray2 = null;
        logger0.error("The server is stopped.", objArray2);
        org.slf4j.Logger logger5 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker6 = null;
        java.lang.Throwable throwable8 = null;
        logger5.trace(marker6, "The server is stopped.", throwable8);
        boolean boolean10 = logger5.isTraceEnabled();
        logger5.info("generated cid, error");
        org.slf4j.Marker marker13 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable18 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable18.close();
        java.lang.Object[] objArray20 = new java.lang.Object[] { "noCID", mDCCloseable18 };
        logger5.debug(marker13, "CorrelationHandler is loaded.", objArray20);
        logger0.error("", objArray20);
        org.slf4j.Marker marker23 = null;
        logger0.info(marker23, "Associate traceability Id \001 with correlation Id \001");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(mDCCloseable18);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        logger0.trace(marker1, "Associate traceability Id \001 with correlation Id \001");
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        long long6 = headerMap5.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString7 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap9 = headerMap5.add(httpString7, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap10 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap11 = new io.undertow.util.HeaderMap();
        long long12 = headerMap11.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString13 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap15 = headerMap11.add(httpString13, (long) (short) 0);
        java.util.List<java.lang.String> strList16 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap17 = headerMap10.addAll(httpString13, (java.util.Collection<java.lang.String>) strList16);
        io.undertow.util.HeaderMap headerMap19 = headerMap9.add(httpString13, (long) 10);
        logger0.trace("correlation", (java.lang.Object) headerMap9);
        org.slf4j.Marker marker21 = null;
        io.undertow.util.HeaderMap headerMap23 = new io.undertow.util.HeaderMap();
        long long24 = headerMap23.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString25 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap27 = headerMap23.add(httpString25, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap28 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap29 = new io.undertow.util.HeaderMap();
        long long30 = headerMap29.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString31 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap33 = headerMap29.add(httpString31, (long) (short) 0);
        java.util.List<java.lang.String> strList34 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap35 = headerMap28.addAll(httpString31, (java.util.Collection<java.lang.String>) strList34);
        io.undertow.util.HeaderMap headerMap37 = headerMap27.add(httpString31, (long) 10);
        io.undertow.util.HeaderMap headerMap38 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString39 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap41 = headerMap38.add(httpString39, (long) (short) -1);
        logger0.error(marker21, "CorrelationHandler is loaded.", (java.lang.Object) headerMap27, (java.lang.Object) (short) -1);
        org.slf4j.Marker marker43 = null;
        logger0.info(marker43, "\"generated cid, error\"");
        org.slf4j.Marker marker46 = null;
        java.lang.Object[] objArray48 = null;
        logger0.debug(marker46, "", objArray48);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(httpString7);
        org.junit.Assert.assertNotNull(headerMap9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(httpString13);
        org.junit.Assert.assertNotNull(headerMap15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(headerMap17);
        org.junit.Assert.assertNotNull(headerMap19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(httpString25);
        org.junit.Assert.assertNotNull(headerMap27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(httpString31);
        org.junit.Assert.assertNotNull(headerMap33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(headerMap35);
        org.junit.Assert.assertNotNull(headerMap37);
        org.junit.Assert.assertNotNull(httpString39);
        org.junit.Assert.assertNotNull(headerMap41);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        org.slf4j.Marker marker5 = null;
        logger0.error(marker5, "\"generated cid, error\"", (java.lang.Object) 0.0d);
        java.lang.Throwable throwable10 = null;
        logger0.info("cid", throwable10);
        org.slf4j.Marker marker12 = null;
        io.undertow.server.ServerConnection serverConnection14 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = new io.undertow.server.HttpServerExchange(serverConnection14, (long) (short) 0);
        long long17 = httpServerExchange16.getRequestStartTime();
        java.lang.String str18 = httpServerExchange16.getRequestURI();
        boolean boolean19 = httpServerExchange16.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange20 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange21 = httpServerExchange16.startBlocking(blockingHttpExchange20);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper22 = null;
        io.undertow.server.HttpServerExchange httpServerExchange23 = httpServerExchange16.addRequestWrapper(streamSourceConduitConduitWrapper22);
        org.slf4j.Logger logger24 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker25 = null;
        io.undertow.util.HeaderMap headerMap27 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString28 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap30 = headerMap27.add(httpString28, (long) (short) -1);
        io.undertow.util.HttpString httpString31 = com.networknt.httpstring.HttpStringConstants.SCOPE_TOKEN;
        java.lang.String str32 = headerMap27.getFirst(httpString31);
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey33 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        org.slf4j.MDC.MDCCloseable mDCCloseable36 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable36.close();
        io.undertow.util.HttpString httpString38 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.server.ServerConnection serverConnection39 = null;
        io.undertow.server.HttpServerExchange httpServerExchange41 = new io.undertow.server.HttpServerExchange(serverConnection39, (long) (short) 0);
        long long42 = httpServerExchange41.getRequestStartTime();
        java.lang.String str43 = httpServerExchange41.getRequestURI();
        boolean boolean44 = httpServerExchange41.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange45 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange46 = httpServerExchange41.startBlocking(blockingHttpExchange45);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper47 = null;
        io.undertow.server.HttpServerExchange httpServerExchange48 = httpServerExchange41.addRequestWrapper(streamSourceConduitConduitWrapper47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { str32, booleanAttachmentKey33, mDCCloseable36, httpString38, streamSourceConduitConduitWrapper47, 0.0d };
        logger24.info(marker25, "generated cid, error", objArray50);
        org.slf4j.Marker marker52 = null;
        boolean boolean53 = logger24.isWarnEnabled(marker52);
        logger0.warn(marker12, "hi%21", (java.lang.Object) httpServerExchange16, (java.lang.Object) boolean53);
        boolean boolean55 = httpServerExchange16.isPersistent();
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(blockingHttpExchange21);
        org.junit.Assert.assertNotNull(httpServerExchange23);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(httpString28);
        org.junit.Assert.assertNotNull(headerMap30);
        org.junit.Assert.assertNotNull(httpString31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(booleanAttachmentKey33);
        org.junit.Assert.assertNotNull(mDCCloseable36);
        org.junit.Assert.assertNotNull(httpString38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(blockingHttpExchange46);
        org.junit.Assert.assertNotNull(httpServerExchange48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        com.networknt.correlation.CorrelationHandler correlationHandler8 = new com.networknt.correlation.CorrelationHandler();
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.next(httpServerExchange2, (io.undertow.server.HttpHandler) correlationHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        io.undertow.server.HttpServerExchange httpServerExchange11 = httpServerExchange2.setStatusCode((int) 'a');
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> strMap12 = httpServerExchange11.getPathParameters();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        java.lang.Throwable throwable7 = null;
        logger0.warn("Associate traceability Id \001 with correlation Id \001", throwable7);
        org.slf4j.Marker marker9 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        logger0.debug(marker9, "", objArray11);
        org.slf4j.Marker marker13 = null;
        java.lang.Throwable throwable15 = null;
        logger0.info(marker13, "hi%21", throwable15);
        java.lang.Object obj18 = null;
        com.networknt.correlation.CorrelationConfig correlationConfig19 = new com.networknt.correlation.CorrelationConfig();
        logger0.debug("audit", obj18, (java.lang.Object) correlationConfig19);
        boolean boolean21 = logger0.isErrorEnabled();
        java.lang.Throwable throwable23 = null;
        logger0.warn("auditOnError", throwable23);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        int int10 = httpServerExchange2.getResponseCode();
        java.lang.String str11 = httpServerExchange2.getRelativePath();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        io.undertow.util.HeaderMap headerMap6 = httpServerExchange2.getRequestHeaders();
        io.undertow.security.api.SecurityContext securityContext7 = null;
        httpServerExchange2.setSecurityContext(securityContext7);
        io.undertow.server.ServerConnection serverConnection9 = null;
        io.undertow.server.HttpServerExchange httpServerExchange11 = new io.undertow.server.HttpServerExchange(serverConnection9, (long) (short) 0);
        long long12 = httpServerExchange11.getRequestStartTime();
        java.lang.String str13 = httpServerExchange11.getRequestURI();
        boolean boolean14 = httpServerExchange11.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange11.setSourceAddress(inetSocketAddress15);
        io.undertow.server.HttpServerExchange httpServerExchange18 = httpServerExchange16.setResponseCode(200);
        io.undertow.server.BlockingHttpExchange blockingHttpExchange19 = httpServerExchange16.startBlocking();
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey20 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        java.lang.Boolean boolean21 = httpServerExchange16.getAttachment(booleanAttachmentKey20);
        java.lang.Boolean boolean23 = httpServerExchange2.putAttachment(booleanAttachmentKey20, (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertNotNull(httpServerExchange18);
        org.junit.Assert.assertNull(blockingHttpExchange19);
        org.junit.Assert.assertNotNull(booleanAttachmentKey20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        java.net.InetSocketAddress inetSocketAddress6 = null;
        io.undertow.server.HttpServerExchange httpServerExchange7 = httpServerExchange2.setSourceAddress(inetSocketAddress6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange7.setResponseCode(200);
        java.lang.String str10 = httpServerExchange7.getRelativePath();
        io.undertow.util.AttachmentKey<java.lang.Boolean> booleanAttachmentKey11 = io.undertow.server.HttpServerExchange.SECURE_REQUEST;
        java.lang.Boolean boolean12 = httpServerExchange7.getAttachment(booleanAttachmentKey11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(httpServerExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(booleanAttachmentKey11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        logger0.trace(marker1, "Associate traceability Id \001 with correlation Id \001");
        com.networknt.correlation.CorrelationConfig correlationConfig6 = new com.networknt.correlation.CorrelationConfig();
        boolean boolean7 = correlationConfig6.isAutogenCorrelationID();
        boolean boolean8 = correlationConfig6.isEnabled();
        logger0.debug("{endpoint=[hi!, The server is stopped., hi%21, The server is stopped., , file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, cId, correlationId = \001, correlation, The server is stopped., Associate traceability Id \001 with correlation Id \001, cId, file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class, noCID], X-Traceability-Id=[-1]}", (java.lang.Object) (-1L), (java.lang.Object) correlationConfig6);
        io.undertow.server.ServerConnection serverConnection11 = null;
        io.undertow.server.HttpServerExchange httpServerExchange13 = new io.undertow.server.HttpServerExchange(serverConnection11, (long) (short) 0);
        boolean boolean14 = httpServerExchange13.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange13.addRequestWrapper(streamSourceConduitConduitWrapper15);
        java.lang.String str17 = httpServerExchange13.getRelativePath();
        org.slf4j.Logger logger18 = com.networknt.handler.LightHttpHandler.logger;
        java.lang.Object[] objArray20 = null;
        logger18.error("The server is stopped.", objArray20);
        org.slf4j.Marker marker22 = null;
        io.undertow.server.ServerConnection serverConnection25 = null;
        io.undertow.server.HttpServerExchange httpServerExchange27 = new io.undertow.server.HttpServerExchange(serverConnection25, (long) (short) 0);
        long long28 = httpServerExchange27.getRequestStartTime();
        java.lang.String str29 = httpServerExchange27.getRequestURI();
        boolean boolean30 = httpServerExchange27.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange31 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange32 = httpServerExchange27.startBlocking(blockingHttpExchange31);
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper33 = null;
        io.undertow.server.HttpServerExchange httpServerExchange34 = httpServerExchange27.addRequestWrapper(streamSourceConduitConduitWrapper33);
        boolean boolean35 = httpServerExchange27.isDispatched();
        io.undertow.server.HttpServerExchange httpServerExchange37 = httpServerExchange27.setRequestPath("");
        logger18.warn(marker22, "\"generated cid, error\"", (java.lang.Object) "The server is stopped.", (java.lang.Object) "");
        boolean boolean39 = logger18.isErrorEnabled();
        org.slf4j.Marker marker40 = null;
        io.undertow.util.HeaderMap headerMap42 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap43 = new io.undertow.util.HeaderMap();
        long long44 = headerMap43.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString45 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap47 = headerMap43.add(httpString45, (long) (short) 0);
        java.util.List<java.lang.String> strList48 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap49 = headerMap42.addAll(httpString45, (java.util.Collection<java.lang.String>) strList48);
        logger18.error(marker40, "hi%21", (java.lang.Object) httpString45);
        logger0.trace("cId", (java.lang.Object) httpServerExchange13, (java.lang.Object) httpString45);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(httpServerExchange16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(blockingHttpExchange32);
        org.junit.Assert.assertNotNull(httpServerExchange34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(httpServerExchange37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(httpString45);
        org.junit.Assert.assertNotNull(headerMap47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(headerMap49);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        org.slf4j.Marker marker8 = null;
        org.slf4j.MDC.MDCCloseable mDCCloseable13 = org.slf4j.MDC.putCloseable("Associate traceability Id \001 with correlation Id \001", "cid");
        mDCCloseable13.close();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "noCID", mDCCloseable13 };
        logger0.debug(marker8, "CorrelationHandler is loaded.", objArray15);
        org.slf4j.Marker marker17 = null;
        java.lang.Throwable throwable19 = null;
        logger0.error(marker17, "", throwable19);
        logger0.debug("CorrelationHandler is loaded.");
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mDCCloseable13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        java.lang.String str5 = httpServerExchange2.getRequestPath();
        java.util.Map<java.lang.String, io.undertow.server.handlers.Cookie> strMap6 = httpServerExchange2.getResponseCookies();
        io.undertow.server.ServerConnection serverConnection7 = httpServerExchange2.getConnection();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(serverConnection7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getMaxEntitySize();
        boolean boolean4 = httpServerExchange2.isResponseChannelAvailable();
        io.undertow.server.handlers.Cookie cookie5 = null;
        io.undertow.server.HttpServerExchange httpServerExchange6 = httpServerExchange2.setResponseCookie(cookie5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = httpServerExchange6.isHttp10();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(httpServerExchange6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        long long1 = headerMap0.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString2 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap4 = headerMap0.add(httpString2, (long) (short) 0);
        io.undertow.util.HeaderMap headerMap5 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap6 = new io.undertow.util.HeaderMap();
        long long7 = headerMap6.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString8 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap10 = headerMap6.add(httpString8, (long) (short) 0);
        java.util.List<java.lang.String> strList11 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap12 = headerMap5.addAll(httpString8, (java.util.Collection<java.lang.String>) strList11);
        io.undertow.util.HeaderMap headerMap14 = headerMap4.add(httpString8, (long) 10);
        io.undertow.util.HeaderMap headerMap15 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap16 = new io.undertow.util.HeaderMap();
        long long17 = headerMap16.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString18 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap20 = headerMap16.add(httpString18, (long) (short) 0);
        java.util.List<java.lang.String> strList21 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap22 = headerMap15.addAll(httpString18, (java.util.Collection<java.lang.String>) strList21);
        io.undertow.util.HeaderMap headerMap23 = new io.undertow.util.HeaderMap();
        io.undertow.util.HttpString httpString24 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        io.undertow.util.HeaderMap headerMap26 = headerMap23.add(httpString24, (long) (short) -1);
        long long27 = headerMap23.fastIterate();
        io.undertow.util.HttpString httpString28 = com.networknt.httpstring.HttpStringConstants.ENDPOINT;
        int int29 = headerMap23.count(httpString28);
        java.lang.Iterable<java.lang.String> strIterable30 = headerMap15.eachValue(httpString28);
        io.undertow.util.HeaderMap headerMap32 = headerMap4.put(httpString28, "ERR10042");
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.util.HeaderValues headerValues34 = headerMap32.fiCurrent((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(httpString2);
        org.junit.Assert.assertNotNull(headerMap4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(httpString8);
        org.junit.Assert.assertNotNull(headerMap10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(headerMap12);
        org.junit.Assert.assertNotNull(headerMap14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(httpString18);
        org.junit.Assert.assertNotNull(headerMap20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(headerMap22);
        org.junit.Assert.assertNotNull(httpString24);
        org.junit.Assert.assertNotNull(headerMap26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 55834574848L + "'", long27 == 55834574848L);
        org.junit.Assert.assertNotNull(httpString28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strIterable30);
        org.junit.Assert.assertNotNull(headerMap32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        io.undertow.util.HeaderMap headerMap0 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap1 = new io.undertow.util.HeaderMap();
        long long2 = headerMap1.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString3 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap5 = headerMap1.add(httpString3, (long) (short) 0);
        java.util.List<java.lang.String> strList6 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap7 = headerMap0.addAll(httpString3, (java.util.Collection<java.lang.String>) strList6);
        java.lang.String str10 = headerMap0.get("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", (int) (short) -1);
        io.undertow.util.HttpString httpString11 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.util.HeaderMap headerMap13 = headerMap0.put(httpString11, (long) '#');
        io.undertow.util.HeaderMap headerMap14 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap15 = new io.undertow.util.HeaderMap();
        long long16 = headerMap15.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString17 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap19 = headerMap15.add(httpString17, (long) (short) 0);
        java.util.List<java.lang.String> strList20 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap21 = headerMap14.addAll(httpString17, (java.util.Collection<java.lang.String>) strList20);
        java.lang.String str24 = headerMap14.get("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class", (int) (short) -1);
        io.undertow.util.HttpString httpString25 = com.networknt.httpstring.HttpStringConstants.HASH_KEY;
        io.undertow.util.HeaderMap headerMap27 = headerMap14.put(httpString25, (long) '#');
        io.undertow.util.HeaderMap headerMap29 = headerMap0.put(httpString25, "ISO-8859-1");
        boolean boolean31 = headerMap0.contains("noCID");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(httpString3);
        org.junit.Assert.assertNotNull(headerMap5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(headerMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(httpString11);
        org.junit.Assert.assertNotNull(headerMap13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(httpString17);
        org.junit.Assert.assertNotNull(headerMap19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(headerMap21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(httpString25);
        org.junit.Assert.assertNotNull(headerMap27);
        org.junit.Assert.assertNotNull(headerMap29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange5 = httpServerExchange2.startBlocking();
        boolean boolean6 = httpServerExchange2.isPersistent();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(blockingHttpExchange5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = httpServerExchange9.isHttp09();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.networknt.handler.config.HandlerConfig handlerConfig0 = com.networknt.handler.LightHttpHandler.config;
        com.networknt.handler.Handler.config = handlerConfig0;
        org.junit.Assert.assertNotNull(handlerConfig0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isHostIncludedInRequestURI();
        io.undertow.server.BlockingHttpExchange blockingHttpExchange6 = null;
        io.undertow.server.BlockingHttpExchange blockingHttpExchange7 = httpServerExchange2.startBlocking(blockingHttpExchange6);
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.setRequestScheme("file:/home/anonymous/projects/tools/reseter-finder/exp/_downloads/light-4j/utility/target/classes/com/networknt/utility/Util.class");
        io.undertow.server.HttpServerExchange httpServerExchange12 = httpServerExchange2.setRequestURI("The server is stopped.", true);
        io.undertow.server.HttpServerExchange httpServerExchange14 = httpServerExchange2.setRequestScheme("ERR10042");
        java.net.InetSocketAddress inetSocketAddress15 = null;
        io.undertow.server.HttpServerExchange httpServerExchange16 = httpServerExchange14.setDestinationAddress(inetSocketAddress15);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(blockingHttpExchange7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertNotNull(httpServerExchange12);
        org.junit.Assert.assertNotNull(httpServerExchange14);
        org.junit.Assert.assertNotNull(httpServerExchange16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.slf4j.Logger logger0 = com.networknt.handler.LightHttpHandler.logger;
        org.slf4j.Marker marker1 = null;
        java.lang.Throwable throwable3 = null;
        logger0.trace(marker1, "The server is stopped.", throwable3);
        boolean boolean5 = logger0.isTraceEnabled();
        logger0.info("generated cid, error");
        org.slf4j.Marker marker8 = null;
        logger0.trace(marker8, "");
        org.slf4j.Marker marker11 = null;
        java.lang.Throwable throwable13 = null;
        logger0.info(marker11, "cId", throwable13);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.slf4j.MDC.put("cid", "ROOT");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        long long3 = httpServerExchange2.getRequestStartTime();
        java.lang.String str4 = httpServerExchange2.getRequestURI();
        boolean boolean5 = httpServerExchange2.isComplete();
        java.lang.String str6 = httpServerExchange2.getRelativePath();
        java.lang.String str7 = httpServerExchange2.getRelativePath();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper8 = null;
        io.undertow.server.HttpServerExchange httpServerExchange9 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper8);
        boolean boolean10 = httpServerExchange2.isResponseChannelAvailable();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(httpServerExchange9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        io.undertow.server.ServerConnection serverConnection0 = null;
        io.undertow.server.HttpServerExchange httpServerExchange2 = new io.undertow.server.HttpServerExchange(serverConnection0, (long) (short) 0);
        boolean boolean3 = httpServerExchange2.isRequestComplete();
        io.undertow.server.ConduitWrapper<org.xnio.conduits.StreamSourceConduit> streamSourceConduitConduitWrapper4 = null;
        io.undertow.server.HttpServerExchange httpServerExchange5 = httpServerExchange2.addRequestWrapper(streamSourceConduitConduitWrapper4);
        io.undertow.util.HeaderMap headerMap6 = httpServerExchange2.getRequestHeaders();
        io.undertow.util.HeaderMap headerMap7 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap8 = new io.undertow.util.HeaderMap();
        long long9 = headerMap8.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString10 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap12 = headerMap8.add(httpString10, (long) (short) 0);
        java.lang.Iterable<java.lang.String> strIterable13 = headerMap7.eachValue(httpString10);
        io.undertow.util.HeaderMap headerMap14 = new io.undertow.util.HeaderMap();
        io.undertow.util.HeaderMap headerMap15 = new io.undertow.util.HeaderMap();
        long long16 = headerMap15.fastIterateNonEmpty();
        io.undertow.util.HttpString httpString17 = com.networknt.httpstring.HttpStringConstants.CLIENT_ID;
        io.undertow.util.HeaderMap headerMap19 = headerMap15.add(httpString17, (long) (short) 0);
        java.util.List<java.lang.String> strList20 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap21 = headerMap14.addAll(httpString17, (java.util.Collection<java.lang.String>) strList20);
        io.undertow.util.HttpString httpString22 = com.networknt.httpstring.HttpStringConstants.TRACEABILITY_ID;
        java.util.List<java.lang.String> strList23 = com.networknt.utility.Util.METHODS;
        io.undertow.util.HeaderMap headerMap24 = headerMap14.putAll(httpString22, (java.util.Collection<java.lang.String>) strList23);
        io.undertow.util.HeaderMap headerMap25 = headerMap6.addAll(httpString10, (java.util.Collection<java.lang.String>) strList23);
        java.lang.String str26 = headerMap25.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(httpServerExchange5);
        org.junit.Assert.assertNotNull(headerMap6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(httpString10);
        org.junit.Assert.assertNotNull(headerMap12);
        org.junit.Assert.assertNotNull(strIterable13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(httpString17);
        org.junit.Assert.assertNotNull(headerMap19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(headerMap21);
        org.junit.Assert.assertNotNull(httpString22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(headerMap24);
        org.junit.Assert.assertNotNull(headerMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{client_id=[GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH]}" + "'", str26, "{client_id=[GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH]}");
    }
}
