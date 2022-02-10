package com.github.kevinsawicki.http;

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
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "%2B");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: %2B");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "a");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: a");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("compress", "The connection has already been created. This method must be called before reading or writing to the request.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("Referer", (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("", "file", (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "--00content0boundary00");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: --00content0boundary00");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.connectTimeout(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("v1", (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.receive(writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("4", "+", "a", inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("=", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("", ".txt");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.code(atomicInteger2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.userAgent("Last-Modified");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "name=user&number=100");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: name=user&number=100");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.writePartHeader("v1", ":");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.part("hello world", "form-data; name=\"", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.InputStream inputStream2 = null;
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.copy(inputStream2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.Reader reader3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.copy(reader3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: form-data; name=\"");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send((java.lang.CharSequence) "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.acceptCharset("f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("2", "http.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.body(strAtomicReference3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.connectTimeout((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.headers(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest2.part("contents", "abcd", "Authorization", "hello not compressed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.send(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.followRedirects(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.send(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "OPTIONS");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: OPTIONS");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("hello", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.code(atomicInteger2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.proxyAuthorization("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "OK");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: OK");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.send(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "content2");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: content2");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "hello world");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: hello world");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.receive(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.readTimeout((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("name=user&number=100&zip=12345", "c", (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.receive(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "file");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: file");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.receive(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.header("&", (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "hello not compressed");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: hello not compressed");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ifModifiedSince((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.basic("f", "us er");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: hi!");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.referer("name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "eid");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: eid");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.part("http.keepAlive", (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.Reader reader3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.copy(reader3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.part("hello world", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.contentType("Referer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest3.part("content3", "GET", "post", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.proxyBasic("Content-Disposition", "No Content");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "Proxy-Authorization");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Proxy-Authorization");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.contentType("Exception not thrown", "HEAD");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest6.writePartHeader("http.proxyPort", "5", "Expires");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.contentLength("no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"no-cache\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.referer("https.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.writePartHeader("hello world", "4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: ");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ifModifiedSince((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "DELETE");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: DELETE");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "v1");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: v1");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.body(strAtomicReference2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.receive(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.send(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("http.proxyHost", "browser 1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.send(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.ifModifiedSince((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.receive(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.PrintStream printStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.receive(printStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "Size must be greater than zero");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Size must be greater than zero");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "content2");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: content2");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.readTimeout((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.part("Expires", "DELETE", (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "https.proxyPort");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: https.proxyPort");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest6.part("+", "Content-Disposition", "DELETE", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.writePartHeader(":", "no-cache", "world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.chunk(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.part("body", "https.proxyPort", "Location", "d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.part("Date", "Exception not thrown", "compress", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ifNoneMatch("Accept-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.receive(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.authorization("world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.acceptEncoding("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest4.part("1", file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.form((java.lang.Object) "TLS", (java.lang.Object) "GET");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.code(atomicInteger3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.readTimeout((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.send(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.acceptEncoding("Accept-Charset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.authorization("f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.writePartHeader("", "e", "PUT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.chunk(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.InputStream inputStream7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.copy(inputStream7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.InputStream inputStream5 = null;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.copy(inputStream5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.receive(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "http.maxConnections");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: http.maxConnections");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "Security exception configuring SSL context");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Security exception configuring SSL context");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.body(strAtomicReference2, "User-Agent");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.ifModifiedSince((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest6.part("Content-Disposition", "2", "2", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.part("error", "00content0boundary00", "p4ssw0rd", "world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.receive(writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "malformed");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: malformed");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest3.part("\"; filename=\"", "", "hello not compressed", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "HEAD");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: HEAD");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.connectTimeout(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.receive(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.Reader reader7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.copy(reader7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.InputStream inputStream3 = null;
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.copy(inputStream3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.body(strAtomicReference5, "Accept-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.connectTimeout((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.part("2", "error", "", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.body(strAtomicReference5, "5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.send((java.lang.CharSequence) "00content0boundary00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.proxyBasic("d", "no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.partHeader("Last-Modified", "c");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.receive(appendable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "name");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: name");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest4.header("If-None-Match", "name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "hello compressed");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: hello compressed");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.receive(outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.writePartHeader("Width", "chunked", "content");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.part("localhost", "p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.followRedirects(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("size", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest4.part("Content-Encoding", "hello compressed", file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("hello", "Exception not thrown", "http.keepAlive", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.header("=", (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.referer("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.part("Content-Type", "1", "GET");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.contentLength(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.headers(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.part("content1", "content", (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.referer(":");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.acceptEncoding("h1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) ":");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: :");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.userAgent("http.maxConnections");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.part("--00content0boundary00--", "The connection has already been created. This method must be called before reading or writing to the request.", "output", file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength("5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.receive(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.part("name", "chunked", "v1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.part("file", "number", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.part("e", number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.partHeader("form-data; name=\"", "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.proxyAuthorization("HEAD");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.proxyBasic("a", "Last-Modified");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.body(strAtomicReference7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.receive(appendable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.chunk((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest4.contentType("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "body");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: body");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.receive(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength("%2B");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"%2B\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.receive(printStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.chunk((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.userAgent("abcd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.contentType("name=", "Width");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.InputStream inputStream7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.copy(inputStream7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.header("aserver", "Proxy-Authorization");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength("no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"no-cache\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("Security exception configuring SSL context", "bar", "chunked", inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.proxyAuthorization("https.proxyPort");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "missing");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: missing");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.authorization("name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "content3");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: content3");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest6.part("http.maxConnections", "TRACE", (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send((java.lang.CharSequence) "v2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.header("UTF-8", (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("c", "e");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.proxyBasic("hello world", "http.proxyPort");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "3");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: 3");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.send(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.net.URL uRL5 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = com.github.kevinsawicki.http.HttpRequest.head(uRL5);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest1.form((java.lang.Object) 10, (java.lang.Object) "c");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.send(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "Content-Type");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Content-Type");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.basic("file", "3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.code(atomicInteger7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.chunk((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.ifNoneMatch("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.ifModifiedSince((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("Authorization", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.body(strAtomicReference4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.acceptEncoding("http.maxConnections");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.userAgent("form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.accept("p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.accept("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.send(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.contentType("p4ssw0rd", "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.form(obj2, (java.lang.Object) "12345");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("hello compressed", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.headers(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.ifModifiedSince((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest4.part("Accept", "hello world", "2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("name=user&number=100&zip=12345", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest1.part("content4", "=", "12345", inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.readTimeout(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.header("Expires", (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.form((java.lang.Object) "number", (java.lang.Object) "00content0boundary00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.form((java.lang.Object) "name", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.form((java.lang.Object) ' ', (java.lang.Object) "Date", "eid");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("", (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest5.part("foo", "PUT", file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.connectTimeout((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.accept("zip");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "b");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: b");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.referer("gzip");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.part("compress", file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.proxyAuthorization("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest3.part(".txt", "e", "&", "PUT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.part("content", "Date", "If-None-Match", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        java.io.InputStream inputStream4 = null;
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.copy(inputStream4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.acceptCharset("e");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest6.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        java.io.Reader reader11 = null;
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.copy(reader11, writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.form((java.lang.Object) "https.proxyPort", (java.lang.Object) "no-cache", "h2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.connectTimeout(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.form(obj4, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.body(strAtomicReference7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest5.writePartHeader("no-cache", "description", "Parsing URI failed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest4.part("us er", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.proxyBasic("GET", "; charset=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.connectTimeout((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.ifModifiedSince((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.send((java.lang.CharSequence) "content2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest6.part("world", "d", file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.receive(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "http.keepAlive");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: http.keepAlive");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.referer("; charset=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.followRedirects(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        java.io.InputStream inputStream2 = null;
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.copy(inputStream2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.chunk(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "size");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: size");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.authorization("http.nonProxyHosts");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.send(inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.body(strAtomicReference7, "DELETE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.part("", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.receive(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("http.proxyHost", "Authorization", file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ifNoneMatch("TRACE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.authorization("OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.headers(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.net.URL uRL6 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = com.github.kevinsawicki.http.HttpRequest.head(uRL6);
        com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest9.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest9.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest9.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest4.form((java.lang.Object) "hello", (java.lang.Object) httpRequest13, "world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest9);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest7.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.receive(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "zip");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: zip");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest7.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ifNoneMatch("p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.acceptCharset("h2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.part("baz", "b", (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.part("5", "Parsing URI failed", "=", "Accept-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest4.basic("Authorization", "ETag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.receive(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.form((java.lang.Object) "zip", (java.lang.Object) "content3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest6.part("Accept-Charset", "12345", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: form-data; name=\"");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.receive(outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.part("stream", file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.header("hello not compressed", (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("%2B", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.form((java.lang.Object) "abcd", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.acceptEncoding("compress");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "Width");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Width");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.contentType("", "hello not compressed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.receive(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.part("post", "Content-Type", "content3", file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest6.part("00content0boundary00", "d", "post", file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("chunked", (int) 'a');
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest10.send(inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.code(atomicInteger7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.body(strAtomicReference7, "compress");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.proxyBasic("Referer", "file");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        java.io.Reader reader6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.copy(reader6, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.contentType(":", "Authorization");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.code(atomicInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.authorization("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.form((java.lang.Object) (byte) 10, (java.lang.Object) "h2", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.code(atomicInteger2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.writePartHeader("f", "Content-Disposition", "http.keepAlive");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.send(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.body(strAtomicReference8, "content");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.receive(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        java.io.PrintStream printStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.receive(printStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "stream");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: stream");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.headers(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.connectTimeout(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.acceptCharset("DELETE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.code(atomicInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.part("2", "TRACE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.send(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("chunked", (int) 'a');
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest10.form(obj14, (java.lang.Object) "content1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("chunked", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.connectTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.acceptCharset("v2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.followRedirects(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.contentLength("hello world");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hello world\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.contentLength("Exception not thrown");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Exception not thrown\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.bufferSize((int) (byte) 10);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.body(strAtomicReference9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.acceptCharset("file");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.send(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.receive(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "name");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: name");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.contentLength("output");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"output\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.part("Date", "Accept-Encoding", (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Content-Length");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Content-Length");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.chunk((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.bufferSize(1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.contentLength("Proxy-Authorization");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Proxy-Authorization\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.header("name=user&number=100", (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.receive(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.connectTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest5.part("missing", "Exception not thrown", (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest7.writePartHeader("No Content", "User-Agent", ".txt");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("gzip", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.connectTimeout((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest7.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.accept("form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.writePartHeader("Cache-Control", "h2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.part("12345", "http.nonProxyHosts", "p4ssw0rd", file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(false);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.receive(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.userAgent("eid");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.connectTimeout(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "abcd");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: abcd");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.header("Width", "\"; filename=\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        java.net.URL uRL7 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = com.github.kevinsawicki.http.HttpRequest.options(uRL7);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest1.form((java.lang.Object) 0.0d, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.readTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("chunked", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.contentLength("Expires");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Expires\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.accept("world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("chunked", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.acceptCharset("Parsing URI failed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.chunk((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.basic("us er", "malformed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.proxyAuthorization("3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.authorization("Accept-Charset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "chunked");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: chunked");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.userAgent("hello compressed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.body(strAtomicReference4, "abcd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        java.io.Reader reader7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest6.copy(reader7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.headers(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.bufferSize((int) (byte) 10);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.part("Content-Type", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest5.part("localhost", "=", "http.proxyPort", inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("If-None-Match", "Location", "5", inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.proxyAuthorization("Last-Modified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.readTimeout(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest8.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.part("h2", "hello");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(true);
        java.io.InputStream inputStream4 = null;
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.copy(inputStream4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.proxyAuthorization("Last-Modified");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.receive(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest4.part("http.keepAlive", (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) (short) 1);
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.authorization("Accept-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.receive(appendable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.chunk(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest1.part("Cache-Control", "Basic", "eid", file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.body(strAtomicReference4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("chunked", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest10.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("https.proxyHost", "\"; filename=\"", file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(false);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.receive(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.connectTimeout(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("3", "No Content");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.send(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest5.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.acceptCharset("content");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.part("file", "+", "OK", "us er");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "Content-Type");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Content-Type");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.connectTimeout((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.writePartHeader("TRACE", "gzip");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.bufferSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.contentLength("name=user&number=100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"name=user&number=100\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test422");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.acceptEncoding("hello");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test423");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.receive(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test424");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.acceptCharset("name=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test425");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.writePartHeader("; charset=", ".txt", "--00content0boundary00--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test426");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test427");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(false);
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test428");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest5.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test429");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest10.part("foo", "baz", "TLS", inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test430");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.code(atomicInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test431");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "no-cache");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: no-cache");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test432");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.contentLength(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test433");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.send(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test434");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.connectTimeout((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test435");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.body(strAtomicReference4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test436");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.part("form-data; name=\"", "gzip", "", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test437");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "post");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: post");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test438");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest4.acceptEncoding("foo");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test439");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test440");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.send(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test441");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.acceptCharset("Authorization");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test442");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.acceptCharset("p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test443");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "h1");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: h1");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test444");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "Server");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Server");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test445");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.contentLength((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test446");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.ifModifiedSince((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test447");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.uncompress(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.part("No Content", "Proxy-Authorization", file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test448");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest1.closeOutput();
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test449");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.useProxy("Content-Type", (-1));
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest7.form(obj8, (java.lang.Object) 0, "user");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test450");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test451");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.readTimeout((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test452");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.bufferSize((int) (short) 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.useProxy("name=user&number=100&zip=12345", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest7.form((java.lang.Object) "TRACE", (java.lang.Object) "No Content", "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test453");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.closeOutput();
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test454");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.useProxy("c", (int) (short) 1);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.receive(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test455");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test456");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.referer("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test457");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "2");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: 2");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test458");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.uncompress(true);
        java.io.Reader reader8 = null;
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.copy(reader8, writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test459");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.bufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.ifNoneMatch("http.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test460");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.connectTimeout((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test461");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.header("Width", (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test462");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test463");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useProxy("error", 0);
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.code(atomicInteger5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test464");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.body(strAtomicReference2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }
}

