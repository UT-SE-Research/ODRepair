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
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.form((java.lang.Object) ":", (java.lang.Object) "http.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.part("", "OK", (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.acceptEncoding("file");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.headers(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.headers(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.useCaches(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("Parsing URI failed", "missing", file4);
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.writePartHeader("http.proxyPort", "malformed");
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "12345");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: 12345");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.part("a", "POST", "bar", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.connectTimeout((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.part("Parsing URI failed", "; charset=", number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.connectTimeout((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "3");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: 3");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.acceptCharset("hello world");
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.disconnect();
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.part("", (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "OK");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: OK");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.ifNoneMatch("If-None-Match");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.acceptJson();
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.openOutput();
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest2.form((java.lang.Object) "Basic", (java.lang.Object) 100.0f, "http.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.receive(appendable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.send((java.lang.CharSequence) "Accept-Charset");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.readTimeout((int) (short) 100);
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.contentType("malformed");
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.receive(outputStream6);
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.chunk((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.followRedirects(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.referer("error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.send((java.lang.CharSequence) "Security exception configuring SSL context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.io.PrintStream printStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.receive(printStream6);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "c");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: c");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.followRedirects(true);
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.partHeader("%2B", "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.body(strAtomicReference9, "Cache-Control");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.part("localhost", "");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.io.InputStream inputStream4 = null;
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.copy(inputStream4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.basic("c", "baz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        java.io.InputStream inputStream8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.copy(inputStream8, outputStream9);
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest2.part("", "Width", "=", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.acceptCharset("malformed");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.partHeader("DELETE", "f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.code(atomicInteger6);
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("%2B", (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest5.openOutput();
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.referer("GET");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.header("hello world", (java.lang.Number) 100.0f);
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.header("", "Referer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.readTimeout((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest7.writePartHeader("post", "", "v2");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.userAgent("Content-Disposition");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "Referer");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Referer");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.part("HEAD", "http.maxConnections");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.followRedirects(false);
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.startPart();
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.ifNoneMatch("no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Security exception configuring SSL context");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Security exception configuring SSL context");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest8.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.ifNoneMatch("content1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.readTimeout(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.send((java.lang.CharSequence) "hello not compressed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "--00content0boundary00");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: --00content0boundary00");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.part("Parsing URI failed", "hello world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ifModifiedSince((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.part("content3", "https.proxyPort");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.referer("v2");
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
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "file");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: file");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.accept("eid");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("description", "Accept-Charset", "DELETE", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.followRedirects(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "Last-Modified");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Last-Modified");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        java.io.InputStream inputStream12 = null;
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest8.copy(inputStream12, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.io.InputStream inputStream6 = null;
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.copy(inputStream6, outputStream7);
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        java.util.concurrent.atomic.AtomicInteger atomicInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.code(atomicInteger8);
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.send(inputStream6);
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.chunk(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.followRedirects(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.form((java.lang.Object) "[]=", (java.lang.Object) "body");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.connectTimeout((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.part("localhost", (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.contentLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyAuthorization("Width");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "abcd");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: abcd");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "1");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: 1");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest10.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.contentType("Referer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "Parsing URI failed");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Parsing URI failed");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.form((java.lang.Object) '#', (java.lang.Object) "abcd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        java.io.Reader reader13 = null;
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.copy(reader13, writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.contentLength("name=user&number=100&zip=12345");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"name=user&number=100&zip=12345\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest13.form(obj14, (java.lang.Object) "content3", "Last-Modified");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.send(reader6);
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.body(strAtomicReference11, "p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.body(strAtomicReference13, "Exception not thrown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.receive(writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "Accept-Charset");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Accept-Charset");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.part("v2", inputStream9);
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.part("\"; filename=\"", "Location", "&", "POST");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.send(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.part("output", "a", "Accept-Encoding", file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.partHeader("3", "malformed");
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.proxyAuthorization("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.connectTimeout((int) ' ');
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.ifModifiedSince(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.body(strAtomicReference11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("c", "description");
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
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.readTimeout((int) (byte) 0);
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.writePartHeader("4", "HEAD");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.basic("", "hello not compressed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.form((java.lang.Object) "OPTIONS", (java.lang.Object) "5", "OPTIONS");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.body(strAtomicReference6, "chunked");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.contentType("error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.accept("no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.io.Reader reader4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.copy(reader4, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.receive(appendable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.contentType("No Content", "Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.followRedirects(false);
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("OPTIONS", "d", file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.part("TRACE", "If-None-Match");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.trustAllHosts();
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

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.part("d", "no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.acceptCharset("malformed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.writePartHeader("UTF-8", "world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest7.part("If-None-Match", "Location", "content2", inputStream11);
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.receive(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.ifModifiedSince((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.receive(appendable8);
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.contentLength("=");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"=\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "content4");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: content4");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.ifModifiedSince((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.contentLength(0);
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.acceptCharset("hello");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.contentType("http.keepAlive", "malformed");
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.followRedirects(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest7.part("name=", ".txt");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        java.net.URL uRL3 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = com.github.kevinsawicki.http.HttpRequest.post(uRL3);
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest4.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest5.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest6.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest6.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest1.form((java.lang.Object) 0, (java.lang.Object) "chunked", "Referer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest4);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.referer("world");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.header(":", "v1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "Location");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Location");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "name");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: name");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.header("http.maxConnections", (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.contentLength("The connection has already been created. This method must be called before reading or writing to the request.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"The connection has already been created. This method must be called before reading or writing to the request.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.headers(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.contentType("", "name=user&number=100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.send(file8);
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.contentLength("; charset=");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"; charset=\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "Server");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Server");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.connectTimeout(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.part("4", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.receive(file8);
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.userAgent("Size must be greater than zero");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest14.part(":", "size");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("number", "Last-Modified", "If-None-Match", "--00content0boundary00");
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.copy(inputStream11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "b");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: b");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.header("Content-Length", "error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.receive(appendable6);
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
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        java.io.Reader reader12 = null;
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.copy(reader12, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "If-None-Match");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: If-None-Match");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "Content-Disposition");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Content-Disposition");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.part("&", "hello");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.writePartHeader("contents", "Last-Modified");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "Proxy-Authorization");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Proxy-Authorization");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "size");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: size");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        java.io.PrintStream printStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.receive(printStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.contentLength((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest10.closeOutputQuietly();
        java.net.URL uRL13 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = com.github.kevinsawicki.http.HttpRequest.post(uRL13);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.form((java.lang.Object) "size", (java.lang.Object) httpRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.part("HEAD", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest11.form((java.lang.Object) "a", (java.lang.Object) "stream", "hello not compressed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        java.lang.Appendable appendable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest12.receive(appendable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.proxyAuthorization("name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.part(":", "contents", "Exception not thrown", "Width");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: form-data; name=\"");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.trustAllHosts();
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest3.part("name", "OK", "%2B", inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.io.Reader reader4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.copy(reader4, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.form((java.lang.Object) "aserver", (java.lang.Object) "content4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentType("baz");
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentType("chunked");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put(uRL0);
        java.net.URL uRL3 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest4 = com.github.kevinsawicki.http.HttpRequest.get(uRL3);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.form((java.lang.Object) 100.0f, (java.lang.Object) uRL3);
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.send(inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.proxyBasic("Proxy-Authorization", "no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.writePartHeader("Parsing URI failed", "\"; filename=\"", "http.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.header("Referer", "5");
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.part("https.proxyHost", "http.maxConnections", "browser 1.0", "[]=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Content-Encoding");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Content-Encoding");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.trustAllHosts();
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.contentLength((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.part("bar", "h1", "browser 1.0", file11);
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Location");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Location");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.chunk((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.referer("size");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.proxyBasic("contents", "size");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.github.kevinsawicki.http.HttpRequest.ConnectionFactory connectionFactory0 = null;
        com.github.kevinsawicki.http.HttpRequest.setConnectionFactory(connectionFactory0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest12.readTimeout(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.part("Referer", (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.connectTimeout((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "bar");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: bar");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.part("v1", "&", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.send((java.lang.CharSequence) "bar");
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.connectTimeout((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest14.acceptEncoding("00content0boundary00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.ifModifiedSince((long) (-1));
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest8.writePartHeader("", "malformed", "name=user&number=100&zip=12345");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.send(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.part("chunked", "name=user&number=100&zip=12345", (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.accept("v2");
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("Content-Disposition", "The connection has already been created. This method must be called before reading or writing to the request.", "12345");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.proxyAuthorization("baz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.connectTimeout((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.contentLength("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest3.part("http.nonProxyHosts", "us er", "b", file12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.proxyAuthorization("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.part(".txt", "e", "&", "PUT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.acceptEncoding("error");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        java.io.InputStream inputStream12 = null;
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.copy(inputStream12, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.receive(appendable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest14.followRedirects(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest7.acceptGzipEncoding();
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
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ifModifiedSince((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "Exception not thrown");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Exception not thrown");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest12.body(strAtomicReference13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.part("%2B", "Parsing URI failed", "bar", "content3");
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.partHeader("content2", "no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest21 = httpRequest17.form((java.lang.Object) "p4ssw0rd", (java.lang.Object) "\"; filename=\"", "bar");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.chunk((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest16.authorization("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.ifModifiedSince((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.send(file8);
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest14.send(inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Basic");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Basic");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
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
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.connectTimeout((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "http.nonProxyHosts");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: http.nonProxyHosts");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.writePartHeader("PUT", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "+");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: +");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.acceptCharset("http.keepAlive");
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
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Exception not thrown");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Exception not thrown");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.writePartHeader("", "content1", "localhost");
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest16.followRedirects(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.ifModifiedSince(100L);
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest12.useCaches(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "[]=");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: []=");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "3");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: 3");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.closeOutput();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest15.body(strAtomicReference16, "http.proxyHost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.acceptJson();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "\"; filename=\"");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: \"; filename=\"");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.part("content2", (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest8.part("http.maxConnections", "=", "POST", "b");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest5.part("world", "hello world");
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.part("Size must be greater than zero", "Parsing URI failed", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.startPart();
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("e", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: p4ssw0rd");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest7.acceptJson();
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.writePartHeader("h2", "--00content0boundary00", "baz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.part("http.keepAlive", "UTF-8", "Authorization", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) (byte) 10);
        java.net.URL uRL5 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest6 = com.github.kevinsawicki.http.HttpRequest.post(uRL5);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest6.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest7.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest16.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest1.form((java.lang.Object) "Parsing URI failed", (java.lang.Object) httpRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest6);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest18);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.useCaches(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        java.net.URL uRL14 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = com.github.kevinsawicki.http.HttpRequest.post(uRL14);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest15.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest17.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest22 = httpRequest17.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest24 = httpRequest22.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest25 = httpRequest22.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest26 = httpRequest25.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest28 = httpRequest25.uncompress(false);
        java.net.URL uRL29 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest30 = com.github.kevinsawicki.http.HttpRequest.post(uRL29);
        com.github.kevinsawicki.http.HttpRequest httpRequest31 = httpRequest30.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest32 = httpRequest31.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest34 = httpRequest32.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest37 = httpRequest32.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest39 = httpRequest37.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest40 = httpRequest37.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest41 = httpRequest40.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest43 = httpRequest40.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest45 = httpRequest40.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest47 = httpRequest12.form((java.lang.Object) httpRequest28, (java.lang.Object) httpRequest45, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
        org.junit.Assert.assertNotNull(httpRequest15);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
        org.junit.Assert.assertNotNull(httpRequest19);
        org.junit.Assert.assertNotNull(httpRequest22);
        org.junit.Assert.assertNotNull(httpRequest24);
        org.junit.Assert.assertNotNull(httpRequest25);
        org.junit.Assert.assertNotNull(httpRequest26);
        org.junit.Assert.assertNotNull(httpRequest28);
        org.junit.Assert.assertNotNull(httpRequest30);
        org.junit.Assert.assertNotNull(httpRequest31);
        org.junit.Assert.assertNotNull(httpRequest32);
        org.junit.Assert.assertNotNull(httpRequest34);
        org.junit.Assert.assertNotNull(httpRequest37);
        org.junit.Assert.assertNotNull(httpRequest39);
        org.junit.Assert.assertNotNull(httpRequest40);
        org.junit.Assert.assertNotNull(httpRequest41);
        org.junit.Assert.assertNotNull(httpRequest43);
        org.junit.Assert.assertNotNull(httpRequest45);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.body(strAtomicReference13, "Cache-Control");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.acceptCharset("Width");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.chunk((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "Parsing URI failed");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Parsing URI failed");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "hello compressed");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: hello compressed");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.referer("http.maxConnections");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.writePartHeader("Basic", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.contentType("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.partHeader("compress", "00content0boundary00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest2.part("malformed", "Content-Type", file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.readTimeout((int) (byte) 1);
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
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.form(obj15, (java.lang.Object) "TLS");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ifNoneMatch("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.connectTimeout((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.connectTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: form-data; name=\"");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest17.partHeader("Content-Encoding", "PUT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.part("", "eid", number11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.headers(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "%2B");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: %2B");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest10.send((java.lang.CharSequence) "5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest1.part("Content-Type", "content2", "&", file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.contentLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.body(strAtomicReference14, "user");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.uncompress(false);
        java.util.concurrent.atomic.AtomicInteger atomicInteger17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.code(atomicInteger17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest12.part("browser 1.0", "POST");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.useCaches(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        java.net.URL uRL14 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = com.github.kevinsawicki.http.HttpRequest.post(uRL14);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest15.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest17.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest22 = httpRequest17.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest24 = httpRequest22.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest25 = httpRequest22.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest26 = httpRequest25.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest28 = httpRequest25.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest30 = httpRequest25.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest32 = httpRequest10.form((java.lang.Object) false, (java.lang.Object) "abcd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
        org.junit.Assert.assertNotNull(httpRequest15);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
        org.junit.Assert.assertNotNull(httpRequest19);
        org.junit.Assert.assertNotNull(httpRequest22);
        org.junit.Assert.assertNotNull(httpRequest24);
        org.junit.Assert.assertNotNull(httpRequest25);
        org.junit.Assert.assertNotNull(httpRequest26);
        org.junit.Assert.assertNotNull(httpRequest28);
        org.junit.Assert.assertNotNull(httpRequest30);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.authorization("User-Agent");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("Cache-Control", (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest3.basic("The connection has already been created. This method must be called before reading or writing to the request.", "Authorization");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.useCaches(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.receive(writer6);
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "Content-Length");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Content-Length");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.trustAllCerts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.openOutput();
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.proxyAuthorization("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.useProxy("malformed", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.closeOutput();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest11.headers(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest17);
        org.junit.Assert.assertNotNull(httpRequest18);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "description");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: description");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.acceptCharset("baz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest5.acceptEncoding("&");
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.part("--00content0boundary00", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("eid", inputStream3);
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest15.body(strAtomicReference16, "http.maxConnections");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.receive(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest15.useCaches(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest15.authorization("Date");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "Security exception configuring SSL context");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Security exception configuring SSL context");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.contentType("Date", "Accept-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.part("d", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
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
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest8.send((java.lang.CharSequence) "%2B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.userAgent("The connection has already been created. This method must be called before reading or writing to the request.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest13.part("name=", "name=user&number=100", "", inputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest16.followRedirects(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest11.part("bar", "4", "v2", inputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.chunk(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("UTF-8", "No Content", (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete((java.lang.CharSequence) "The connection has already been created. This method must be called before reading or writing to the request.");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: The connection has already been created. This method must be called before reading or writing to the request.");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest16.acceptEncoding("eid");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        java.net.URL uRL8 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest9 = com.github.kevinsawicki.http.HttpRequest.delete(uRL8);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest9.bufferSize((int) (byte) 10);
        java.lang.Object obj12 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest7.form((java.lang.Object) httpRequest11, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest9);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest10.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.openOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "chunked");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: chunked");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
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
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.header("ETag", "Security exception configuring SSL context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest16.proxyAuthorization("http.proxyPort");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest14.part(".txt", "; charset=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.part("hello not compressed", (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get((java.lang.CharSequence) "; charset=");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: ; charset=");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.receive(writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.body(strAtomicReference6);
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest13.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.useProxy("malformed", 1);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest17.headers(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.accept("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest14.proxyAuthorization("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.part("Basic", file15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.basic("Security exception configuring SSL context", "name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.authorization("2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.contentType("p4ssw0rd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.writePartHeader("GET", "TLS");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest8.part("missing", "gzip", "http.keepAlive", file14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest12.send((java.lang.CharSequence) "e");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        java.util.concurrent.atomic.AtomicReference<java.lang.String> strAtomicReference18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest17.body(strAtomicReference18, "description");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest3.part("Cache-Control", file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.contentType("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.get(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.send((java.lang.CharSequence) "OK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest2.contentLength("http.maxConnections");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"http.maxConnections\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.proxyBasic("localhost", "malformed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.accept("gzip");
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
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.receive(writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest15.acceptCharset("Expires");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.part("h2", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest16.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest16.authorization("file");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.accept(":");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest3.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.useProxy("malformed", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest21 = httpRequest18.proxyBasic("http.keepAlive", "4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest17);
        org.junit.Assert.assertNotNull(httpRequest18);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head((java.lang.CharSequence) "missing");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: missing");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest3.bufferSize((int) (byte) 1);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest3.receive(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest15.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest15.part("content1", (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest1.proxyBasic("Cache-Control", "Basic");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest2.proxyBasic("content2", "Date");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post((java.lang.CharSequence) "http.proxyPort");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: http.proxyPort");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest12.closeOutputQuietly();
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.form((java.lang.Object) '#', (java.lang.Object) "", "content");
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
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.proxyBasic("content4", "+");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.bufferSize((int) (byte) 100);
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.useProxy("malformed", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.closeOutput();
        java.io.Reader reader19 = null;
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest21 = httpRequest18.copy(reader19, writer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest17);
        org.junit.Assert.assertNotNull(httpRequest18);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.proxyBasic("h2", "content1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest3.authorization("no-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.part("12345", file15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.referer("TRACE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutputQuietly();
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.part("c", inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.partHeader("Security exception configuring SSL context", "OPTIONS");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.useCaches(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "name=");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: name=");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest14.acceptEncoding("; charset=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest10.send(inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.bufferSize((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest9 = httpRequest7.contentType("UTF-8");
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
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.chunk((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest13.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.useProxy("+", (int) (byte) 1);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest16.part("b", file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.ignoreCloseExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.readTimeout(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.form((java.lang.Object) "zip", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest10.useProxy("TRACE", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest13.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test422");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.put((java.lang.CharSequence) "&");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: &");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test423");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest15.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest17.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest17.startPart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
        org.junit.Assert.assertNotNull(httpRequest17);
        org.junit.Assert.assertNotNull(httpRequest19);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test424");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.contentLength("stream");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"stream\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test425");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest3.contentType("--00content0boundary00", "localhost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test426");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.useCaches(true);
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
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.acceptEncoding("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test428");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.followRedirects(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test429");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest8.part("UTF-8", (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test430");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.writePartHeader("contents", "no-cache", "stream");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test431");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest13.useProxy("+", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest20 = httpRequest13.form((java.lang.Object) "--00content0boundary00", (java.lang.Object) "User-Agent", "form-data; name=\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test432");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutput();
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test433");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest4 = httpRequest2.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test434");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest3.contentType("[]=", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test435");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.closeOutput();
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test436");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest6 = httpRequest1.writePartHeader("content3", "Content-Type");
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
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest15.uncompress(true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest15.trustAllHosts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test438");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest11.useProxy("malformed", 1);
        java.io.PrintStream printStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest19 = httpRequest17.receive(printStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest17);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test439");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest15.closeOutputQuietly();
        java.io.File file20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest21 = httpRequest15.part("name=user&number=100&zip=12345", "00content0boundary00", "stream", file20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
        org.junit.Assert.assertNotNull(httpRequest16);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test440");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest14.acceptGzipEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test441");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest7 = httpRequest3.uncompress(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest3.ignoreCloseExceptions(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest3.uncompress(true);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest3.send(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest7);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test442");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.useProxy("chunked", 1);
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest11.ignoreCloseExceptions(false);
        java.io.PrintStream printStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest13.receive(printStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test443");
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.options((java.lang.CharSequence) "Basic");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: Basic");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test444");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.bufferSize((int) (short) 10);
        com.github.kevinsawicki.http.HttpRequest httpRequest16 = httpRequest11.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest11.uncompress(true);
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest16);
        org.junit.Assert.assertNotNull(httpRequest18);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test445");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest13 = httpRequest12.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest17 = httpRequest13.writePartHeader("PUT", "OPTIONS", "c");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test446");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest10.ifModifiedSince((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test447");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.delete(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest1.bufferSize((int) (byte) 10);
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test448");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.proxyBasic("http.proxyHost", "http.maxConnections");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test449");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest12.proxyBasic("5", "f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test450");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.post(uRL0);
        com.github.kevinsawicki.http.HttpRequest httpRequest2 = httpRequest1.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest3 = httpRequest2.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest3.ignoreCloseExceptions(true);
        com.github.kevinsawicki.http.HttpRequest httpRequest8 = httpRequest3.useProxy("Proxy-Authorization", 0);
        com.github.kevinsawicki.http.HttpRequest httpRequest10 = httpRequest8.bufferSize(100);
        com.github.kevinsawicki.http.HttpRequest httpRequest11 = httpRequest8.closeOutputQuietly();
        com.github.kevinsawicki.http.HttpRequest httpRequest12 = httpRequest11.closeOutput();
        com.github.kevinsawicki.http.HttpRequest httpRequest14 = httpRequest11.uncompress(false);
        com.github.kevinsawicki.http.HttpRequest httpRequest15 = httpRequest11.closeOutput();
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest18 = httpRequest15.part("hi!", (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpRequest1);
        org.junit.Assert.assertNotNull(httpRequest2);
        org.junit.Assert.assertNotNull(httpRequest3);
        org.junit.Assert.assertNotNull(httpRequest5);
        org.junit.Assert.assertNotNull(httpRequest8);
        org.junit.Assert.assertNotNull(httpRequest10);
        org.junit.Assert.assertNotNull(httpRequest11);
        org.junit.Assert.assertNotNull(httpRequest12);
        org.junit.Assert.assertNotNull(httpRequest14);
        org.junit.Assert.assertNotNull(httpRequest15);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test451");
        java.net.URL uRL0 = null;
        com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.head(uRL0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest5 = httpRequest1.part("https.proxyHost", "--00content0boundary00", ":");
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
        // The following exception was thrown during execution in test generation
        try {
            com.github.kevinsawicki.http.HttpRequest httpRequest1 = com.github.kevinsawicki.http.HttpRequest.trace((java.lang.CharSequence) "b");
            org.junit.Assert.fail("Expected exception of type com.github.kevinsawicki.http.HttpRequest.HttpRequestException; message: java.net.MalformedURLException: no protocol: b");
        } catch (com.github.kevinsawicki.http.HttpRequest.HttpRequestException e) {
            // Expected exception.
        }
    }
}

