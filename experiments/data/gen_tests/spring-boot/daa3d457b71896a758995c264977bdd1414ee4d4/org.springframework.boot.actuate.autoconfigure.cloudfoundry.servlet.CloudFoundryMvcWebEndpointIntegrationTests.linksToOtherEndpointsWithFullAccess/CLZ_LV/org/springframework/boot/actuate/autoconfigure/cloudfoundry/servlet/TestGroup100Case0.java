package org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet;

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
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.ArgumentMatchers.same((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.LOAD_TIME_WEAVER_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loadTimeWeaver" + "'", str0, "loadTimeWeaver");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        char char1 = org.mockito.ArgumentMatchers.eq(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.springframework.context.support.AbstractApplicationContext.MESSAGE_SOURCE_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "messageSource" + "'", str0, "messageSource");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "&" + "'", str0, "&");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.only();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext(defaultListableBeanFactory0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanFactory must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_ATOM_XML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/atom+xml" + "'", str0, "application/atom+xml");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.SYSTEM_PROPERTIES_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemProperties" + "'", str0, "systemProperties");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.SCOPE_SESSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "session" + "'", str0, "session");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doCallRealMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.RandomAccess randomAccess0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(randomAccess0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_RSS_XML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/rss+xml" + "'", str0, "application/rss+xml");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.util.MimeType mimeType1 = org.springframework.util.MimeType.valueOf("_links.info.templated");
            org.junit.Assert.fail("Expected exception of type org.springframework.util.InvalidMimeTypeException; message: Invalid mime type \"_links.info.templated\": does not contain '/'");
        } catch (org.springframework.util.InvalidMimeTypeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        char char0 = org.mockito.ArgumentMatchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.CharSequence> charSequenceOngoingStubbing1 = org.mockito.Mockito.when(charSequence0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = org.springframework.http.MediaType.TEXT_XML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/xml" + "'", str0, "text/xml");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_STREAM_JSON_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/stream+json" + "'", str0, "application/stream+json");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType2 = new org.springframework.http.MediaType(mediaType0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.springframework.boot.web.client.RestTemplateBuilder restTemplateBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService cloudFoundrySecurityService3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService(restTemplateBuilder0, "Access-Control-Allow-Methods", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: RestTemplateBuilder must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/problem+json" + "'", str0, "application/problem+json");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_ATOM_XML;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.util.Collection<org.springframework.http.HttpStatus> httpStatusCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(httpStatusCollection0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mimeTypeList0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_PDF_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/pdf" + "'", str0, "application/pdf");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.lang.Class<?> wildcardClass3 = mediaType0.getClass();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.CONTEXT_PARAMETERS_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "contextParameters" + "'", str0, "contextParameters");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str0 = org.springframework.http.MediaType.TEXT_HTML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/html" + "'", str0, "text/html");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.http.MediaType> mediaTypeList1 = org.springframework.http.MediaType.parseMediaTypes("systemProperties");
            org.junit.Assert.fail("Expected exception of type org.springframework.http.InvalidMediaTypeException; message: Invalid mime type \"systemProperties\": does not contain '/'");
        } catch (org.springframework.http.InvalidMediaTypeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_MOCKS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_MOCKS));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.springframework.util.MimeType mimeType0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(mimeType0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int1 = org.mockito.ArgumentMatchers.eq((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_KEY_ID;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_KEY_ID + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_KEY_ID));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.TOKEN_EXPIRED;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.TOKEN_EXPIRED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.TOKEN_EXPIRED));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.Iterable<org.springframework.http.MediaType> mediaTypeIterable0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(mediaTypeIterable0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "request" + "'", str0, "request");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.springframework.web.context.WebApplicationContext.ROOT" + "'", str0, "org.springframework.web.context.WebApplicationContext.ROOT");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = org.springframework.core.io.ResourceLoader.CLASSPATH_URL_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classpath:" + "'", str0, "classpath:");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.mockito.stubbing.Answer answer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer(answer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(testEndpoint0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.EndpointDelegate endpointDelegate1 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint2 = testEndpointConfiguration0.testEndpoint(endpointDelegate1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = testEndpoint2.readPart("POST");
        org.junit.Assert.assertNotNull(testEndpoint2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.http.HttpStatus httpStatus1 = reason0.getStatus();
        org.springframework.http.HttpStatus httpStatus2 = reason0.getStatus();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus1 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus1.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus2 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus2.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.SERVLET_CONTEXT_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servletContext" + "'", str0, "servletContext");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = org.springframework.context.support.AbstractApplicationContext.APPLICATION_EVENT_MULTICASTER_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "applicationEventMulticaster" + "'", str0, "applicationEventMulticaster");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.TEXT_XML;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.lang.Class<?> wildcardClass3 = mediaType0.getClass();
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType5 = null;
        boolean boolean6 = mediaType4.isCompatibleWith(mediaType5);
        java.lang.Class<?> wildcardClass7 = mediaType4.getClass();
        java.lang.Class[] classArray9 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass3;
        wildcardClassArray10[1] = wildcardClass7;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext15 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext(wildcardClassArray10);
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str0 = org.springframework.http.MediaType.IMAGE_PNG_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "image/png" + "'", str0, "image/png");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder4 = org.mockito.Mockito.inOrder((java.lang.Object[]) throwableArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Access-Control-Request-Method");
        org.springframework.http.HttpStatus httpStatus3 = reason0.getStatus();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus3 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus3.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.springframework.http.MediaType mediaType0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(mediaType0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_XHTML_XML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/xhtml+xml" + "'", str0, "application/xhtml+xml");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_TOKEN;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_TOKEN + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_TOKEN));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.TEXT_PLAIN;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/json" + "'", str0, "application/json");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason3 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason3, "_links.env.href");
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException5);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason7 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason7, "Access-Control-Request-Method");
        java.lang.Throwable[] throwableArray10 = cloudFoundryAuthorizationException9.getSuppressed();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason11 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException13 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason11, "Access-Control-Request-Method");
        cloudFoundryAuthorizationException9.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException13);
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException13);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason16 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason18 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException20 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason18, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason21 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException23 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason21, "_links.env.href");
        cloudFoundryAuthorizationException20.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException23);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException25 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason16, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException20);
        cloudFoundryAuthorizationException13.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException25);
        java.lang.String str27 = cloudFoundryAuthorizationException13.toString();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason3 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason3.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason7 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason7.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + reason11 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason11.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason16 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason16.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason18 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason18.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason21 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason21.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Access-Control-Request-Method" + "'", str27, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Access-Control-Request-Method");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = annotationConfigServletWebServerApplicationContext0.getType("_links.info.templated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@766488d9 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.Set<java.lang.Class<?>> wildcardClassSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(wildcardClassSet0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.mockito.ArgumentMatcher<java.lang.Short> shortArgumentMatcher0 = null;
        short short1 = org.mockito.ArgumentMatchers.shortThat(shortArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer1 = null;
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryWebEndpointServletHandlerMapping cloudFoundryWebEndpointServletHandlerMapping4 = cloudFoundryMvcConfiguration0.cloudFoundryWebEndpointServletHandlerMapping(webEndpointDiscoverer1, endpointMediaTypes2, cloudFoundrySecurityInterceptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.springframework.boot.web.client.RestTemplateBuilder restTemplateBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService cloudFoundrySecurityService3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService(restTemplateBuilder0, "Authorization", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: RestTemplateBuilder must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) "session");
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Access-Control-Request-Method");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.beans.factory.support.BeanNameGenerator beanNameGenerator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.setBeanNameGenerator(beanNameGenerator2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Singleton object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.CONVERSION_SERVICE_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "conversionService" + "'", str0, "conversionService");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint[] testEndpointArray0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(testEndpointArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(testEndpointArray0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = org.springframework.web.context.ConfigurableWebApplicationContext.APPLICATION_CONTEXT_ID_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.springframework.web.context.WebApplicationContext:" + "'", str0, "org.springframework.web.context.WebApplicationContext:");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber4 = org.mockito.Mockito.doThrow(throwableArray3);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.List<org.springframework.http.MediaType> mediaTypeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType.sortByQualityValue(mediaTypeList0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'mediaTypes' must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.springframework.boot.web.client.RestTemplateBuilder restTemplateBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService cloudFoundrySecurityService3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService(restTemplateBuilder0, "&", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: RestTemplateBuilder must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.ALL;
        double double1 = mediaType0.getQualityValue();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = annotationConfigServletWebServerApplicationContext0.isSingleton("Access-Control-Request-Method");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@596d5355 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6d43e4c8, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        byte byte0 = org.mockito.ArgumentMatchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.nio.charset.Charset charset3 = mediaType1.getCharset();
        java.lang.String str5 = mediaType1.getParameter("request");
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = annotationConfigServletWebServerApplicationContext0.getConfigLocations();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getConfigLocations()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType2 = new org.springframework.http.MediaType("text/xml", "application/stream+json");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid token character '/' in token \"text/xml\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.mockito.ArgumentMatcher<java.lang.Long> longArgumentMatcher0 = null;
        long long1 = org.mockito.ArgumentMatchers.longThat(longArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.lang.Class<?> wildcardClass3 = mediaType0.getClass();
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType5 = null;
        boolean boolean6 = mediaType4.isCompatibleWith(mediaType5);
        java.lang.Class<?> wildcardClass7 = mediaType4.getClass();
        org.springframework.http.MediaType mediaType8 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType9 = null;
        boolean boolean10 = mediaType8.isCompatibleWith(mediaType9);
        java.lang.Class<?> wildcardClass11 = mediaType8.getClass();
        org.springframework.http.MediaType mediaType12 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType13 = null;
        boolean boolean14 = mediaType12.isCompatibleWith(mediaType13);
        java.lang.Class<?> wildcardClass15 = mediaType12.getClass();
        org.springframework.http.MediaType mediaType16 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType17 = null;
        boolean boolean18 = mediaType16.isCompatibleWith(mediaType17);
        java.lang.Class<?> wildcardClass19 = mediaType16.getClass();
        org.springframework.http.MediaType mediaType20 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType21 = null;
        boolean boolean22 = mediaType20.isCompatibleWith(mediaType21);
        java.lang.Class<?> wildcardClass23 = mediaType20.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[6];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass3;
        wildcardClassArray26[1] = wildcardClass7;
        wildcardClassArray26[2] = wildcardClass11;
        wildcardClassArray26[3] = wildcardClass15;
        wildcardClassArray26[4] = wildcardClass19;
        wildcardClassArray26[5] = wildcardClass23;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext39 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext(wildcardClassArray26);
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(mediaType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(mediaType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/octet-stream" + "'", str0, "application/octet-stream");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.mockito.ArgumentMatcher<java.lang.Double> doubleArgumentMatcher0 = null;
        double double1 = org.mockito.ArgumentMatchers.doubleThat(doubleArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_AUDIENCE;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_AUDIENCE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_AUDIENCE));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        boolean boolean0 = org.mockito.ArgumentMatchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.Comparator<org.springframework.http.MediaType> mediaTypeComparator0 = org.springframework.http.MediaType.SPECIFICITY_COMPARATOR;
        org.junit.Assert.assertNotNull(mediaTypeComparator0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.removeAlias("servletContext");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias 'servletContext' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = annotationConfigServletWebServerApplicationContext0.getBean("application/stream+json");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@51d85f4e has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason3 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason3, "_links.env.href");
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.String str7 = cloudFoundryAuthorizationException5.toString();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason3 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason3.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env.href" + "'", str7, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env.href");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token("application/stream+json");
            org.junit.Assert.fail("Expected exception of type org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException; message: JWT must have header, body and signature");
        } catch (org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str2 = annotationConfigServletWebServerApplicationContext1.getServerNamespace();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer4 = cloudFoundryMvcConfiguration0.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1, endpointMediaTypes3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: EndpointMediaTypes must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String[] strArray0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.SYSTEM_ENVIRONMENT_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemEnvironment" + "'", str0, "systemEnvironment");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str0 = org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.DISPATCHER_SERVLET_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dispatcherServlet" + "'", str0, "dispatcherServlet");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        javax.servlet.ServletContext servletContext2 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader3 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader3);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@4369008d, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext0);
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.setEnvironment(configurableEnvironment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Environment must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertNull(applicationEventPublisher4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_XML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/xml" + "'", str0, "application/xml");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String str0 = org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "multipart/form-data" + "'", str0, "multipart/form-data");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str1 = annotationConfigServletWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext10 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext(strArray8);
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.junit.Assert.assertNotNull(mockitoFramework0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 0);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.ProtocolResolver protocolResolver4 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.addProtocolResolver(protocolResolver4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("applicationEventMulticaster");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.beans.factory.config.BeanDefinition beanDefinition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.registerBeanDefinition("application/stream+json", beanDefinition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str4 = annotationConfigServletWebServerApplicationContext3.getServerNamespace();
        java.lang.String[] strArray11 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext3.scan(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber13 = org.mockito.Mockito.doReturn((java.lang.Object) mediaType1, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory4 = annotationConfigServletWebServerApplicationContext0.getAutowireCapableBeanFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@457d7802 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason4 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason4, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason7 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason7, "_links.env.href");
        cloudFoundryAuthorizationException6.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException9);
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException9);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + reason4 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason4.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason7 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason7.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.Object[] objArray1 = new java.lang.Object[] { "Access-Control-Request-Method" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[Access-Control-Request-Method]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[Access-Control-Request-Method]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.Iterable<org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext> servletWebServerApplicationContextIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(servletWebServerApplicationContextIterable0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str0 = org.springframework.context.support.AbstractApplicationContext.LIFECYCLE_PROCESSOR_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lifecycleProcessor" + "'", str0, "lifecycleProcessor");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockitoSet0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException7 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.env.href");
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber10 = org.mockito.Mockito.doReturn((java.lang.Object) cloudFoundryAuthorizationException4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = annotationConfigServletWebServerApplicationContext0.getConfigLocations();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getConfigLocations()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.String str0 = org.springframework.http.MediaType.IMAGE_JPEG_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "image/jpeg" + "'", str0, "image/jpeg");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@66f7bf2e, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection4 = annotationConfigServletWebServerApplicationContext0.getProtocolResolvers();
        org.springframework.core.io.Resource[] resourceArray6 = annotationConfigServletWebServerApplicationContext0.getResources("Access-Control-Allow-Methods");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) resourceArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertNotNull(protocolResolverCollection4);
        org.junit.Assert.assertNotNull(resourceArray6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.List<org.mockito.stubbing.Answer<java.lang.Object>> objAnswerList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(objAnswerList0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason1 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason1, "Access-Control-Request-Method");
        java.lang.Throwable[] throwableArray4 = cloudFoundryAuthorizationException3.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber5 = org.mockito.Mockito.doReturn((java.lang.Object) "_links.test-part.templated", (java.lang.Object[]) throwableArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason1 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason1.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.String str0 = org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/event-stream" + "'", str0, "text/event-stream");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (byte) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_JSON;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType0);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.util.MimeType[] mimeTypeArray3 = new org.springframework.util.MimeType[] { mediaType0 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList4 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList4, mimeTypeArray3);
        java.util.List<org.springframework.http.MediaType> mediaTypeList6 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList4);
        java.util.List<org.springframework.http.MediaType> mediaTypeList7 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList4);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(mimeTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mediaTypeList6);
        org.junit.Assert.assertNotNull(mediaTypeList7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.includes(mediaType1);
        java.nio.charset.Charset charset3 = mediaType0.getCharset();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(charset3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException7 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.env.href");
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        org.springframework.http.HttpStatus httpStatus10 = cloudFoundryAuthorizationException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus10 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus10.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String str0 = org.springframework.http.MediaType.IMAGE_GIF_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "image/gif" + "'", str0, "image/gif");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean2 = annotationConfigServletWebServerApplicationContext0.containsBeanDefinition("_links.info.href");
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.register((java.lang.Class<?>[]) classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one annotated class must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        float float1 = org.mockito.ArgumentMatchers.eq(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((-1L));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.Set<java.lang.Enum<org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason>> reasonEnumSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(reasonEnumSet0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(testEndpoint0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str1 = annotationConfigServletWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        org.springframework.beans.factory.BeanFactory beanFactory10 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.refresh();
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(beanFactory10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = annotationConfigServletWebServerApplicationContext0.isPrototype("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@53b4602d has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str1 = annotationConfigServletWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason10 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException12 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason10, "Access-Control-Request-Method");
        java.lang.Throwable[] throwableArray13 = cloudFoundryAuthorizationException12.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber14 = org.mockito.Mockito.doReturn((java.lang.Object) strArray8, (java.lang.Object[]) throwableArray13);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + reason10 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason10.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException7 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.env.href");
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason9 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException11 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason9, "Access-Control-Request-Method");
        java.lang.Throwable[] throwableArray12 = cloudFoundryAuthorizationException11.getSuppressed();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason13 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException15 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason13, "Access-Control-Request-Method");
        cloudFoundryAuthorizationException11.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException15);
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException15);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason18 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason20 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException22 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason20, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason23 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException25 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason23, "_links.env.href");
        cloudFoundryAuthorizationException22.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException25);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException27 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason18, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException22);
        cloudFoundryAuthorizationException15.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException27);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException29 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "", (java.lang.Throwable) cloudFoundryAuthorizationException15);
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason9 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason9.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + reason13 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason13.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason18 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason18.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason20 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason20.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason23 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason23.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = mediaType0.getParameters();
        java.lang.String str4 = mediaType0.getSubtype();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "octet-stream" + "'", str4, "octet-stream");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException7 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.env.href");
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        org.springframework.http.HttpStatus httpStatus10 = cloudFoundryAuthorizationException9.getStatusCode();
        org.springframework.http.HttpStatus httpStatus11 = cloudFoundryAuthorizationException9.getStatusCode();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus10 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus10.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus11 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus11.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext0);
        javax.servlet.ServletConfig servletConfig5 = annotationConfigServletWebServerApplicationContext0.getServletConfig();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        org.springframework.context.MessageSource messageSource8 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext6);
        annotationConfigServletWebServerApplicationContext6.destroy();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.publishEvent((java.lang.Object) annotationConfigServletWebServerApplicationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@3550da29, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertNull(applicationEventPublisher4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNull(messageSource8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.util.MimeType[] mimeTypeArray3 = new org.springframework.util.MimeType[] { mediaType0 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList4 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList4, mimeTypeArray3);
        java.util.List<org.springframework.http.MediaType> mediaTypeList6 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList4);
        org.springframework.http.MediaType.sortByQualityValue(mediaTypeList6);
        org.springframework.http.MediaType.sortBySpecificityAndQuality(mediaTypeList6);
        org.springframework.http.MediaType.sortBySpecificity(mediaTypeList6);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(mimeTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mediaTypeList6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        int int4 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionCount();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_PDF;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.IMAGE_GIF;
        boolean boolean4 = mediaType2.isCompatibleWith((org.springframework.util.MimeType) mediaType3);
        org.springframework.http.MediaType mediaType5 = org.springframework.http.MediaType.TEXT_HTML;
        org.springframework.http.MediaType mediaType6 = org.springframework.http.MediaType.TEXT_XML;
        org.springframework.http.MediaType mediaType7 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType8 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType9 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset10 = mediaType9.getCharset();
        org.springframework.http.MediaType mediaType11 = new org.springframework.http.MediaType(mediaType8, charset10);
        org.springframework.http.MediaType mediaType12 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType13 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean14 = mediaType12.isCompatibleWith(mediaType13);
        java.nio.charset.Charset charset15 = mediaType13.getCharset();
        org.springframework.http.MediaType mediaType16 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType17 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean18 = mediaType16.isCompatibleWith(mediaType17);
        org.springframework.http.MediaType mediaType19 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType20 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType21 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean22 = mediaType20.isCompatibleWith(mediaType21);
        java.nio.charset.Charset charset23 = mediaType21.getCharset();
        org.springframework.http.MediaType mediaType24 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType25 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean26 = mediaType24.includes(mediaType25);
        org.springframework.http.MediaType mediaType27 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType28 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean29 = mediaType27.isCompatibleWith(mediaType28);
        java.nio.charset.Charset charset30 = mediaType28.getCharset();
        org.springframework.http.MediaType mediaType31 = org.springframework.http.MediaType.TEXT_HTML;
        boolean boolean32 = mediaType28.isCompatibleWith((org.springframework.util.MimeType) mediaType31);
        org.springframework.http.MediaType mediaType33 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType34 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType35 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean36 = mediaType34.isCompatibleWith(mediaType35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = mediaType34.getParameters();
        org.springframework.http.MediaType mediaType38 = new org.springframework.http.MediaType(mediaType33, strMap37);
        org.springframework.http.MediaType mediaType39 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType40 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean41 = mediaType39.isCompatibleWith(mediaType40);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = mediaType39.getParameters();
        org.springframework.http.MediaType mediaType43 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType44 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType45 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean46 = mediaType44.isCompatibleWith(mediaType45);
        org.springframework.http.MediaType mediaType47 = org.springframework.http.MediaType.IMAGE_PNG;
        org.springframework.http.MediaType mediaType48 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType47);
        org.springframework.http.MediaType mediaType49 = org.springframework.http.MediaType.APPLICATION_JSON;
        org.springframework.http.MediaType mediaType50 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType49);
        org.springframework.http.MediaType mediaType51 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType52 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean53 = mediaType51.isCompatibleWith(mediaType52);
        org.springframework.http.MediaType mediaType56 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType57 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset58 = mediaType57.getCharset();
        org.springframework.http.MediaType mediaType59 = new org.springframework.http.MediaType(mediaType56, charset58);
        org.springframework.http.MediaType mediaType60 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset58);
        org.springframework.http.MediaType mediaType61 = org.springframework.http.MediaType.APPLICATION_JSON;
        org.springframework.util.MimeType[] mimeTypeArray62 = new org.springframework.util.MimeType[] { mediaType0, mediaType1, mediaType2, mediaType5, mediaType6, mediaType7, mediaType8, mediaType13, mediaType17, mediaType19, mediaType21, mediaType24, mediaType31, mediaType38, mediaType39, mediaType43, mediaType44, mediaType47, mediaType50, mediaType52, mediaType60, mediaType61 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList63 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList63, mimeTypeArray62);
        java.util.AbstractCollection<org.springframework.util.MimeType> mimeTypeCollection65 = org.mockito.ArgumentMatchers.eq((java.util.AbstractCollection<org.springframework.util.MimeType>) mimeTypeList63);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mediaType5);
        org.junit.Assert.assertNotNull(mediaType6);
        org.junit.Assert.assertNotNull(mediaType7);
        org.junit.Assert.assertNotNull(mediaType8);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(mediaType12);
        org.junit.Assert.assertNotNull(mediaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(charset15);
        org.junit.Assert.assertNotNull(mediaType16);
        org.junit.Assert.assertNotNull(mediaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(mediaType19);
        org.junit.Assert.assertNotNull(mediaType20);
        org.junit.Assert.assertNotNull(mediaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(charset23);
        org.junit.Assert.assertNotNull(mediaType24);
        org.junit.Assert.assertNotNull(mediaType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mediaType27);
        org.junit.Assert.assertNotNull(mediaType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(charset30);
        org.junit.Assert.assertNotNull(mediaType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mediaType33);
        org.junit.Assert.assertNotNull(mediaType34);
        org.junit.Assert.assertNotNull(mediaType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(mediaType39);
        org.junit.Assert.assertNotNull(mediaType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(mediaType43);
        org.junit.Assert.assertNotNull(mediaType44);
        org.junit.Assert.assertNotNull(mediaType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(mediaType47);
        org.junit.Assert.assertNotNull(mediaType48);
        org.junit.Assert.assertNotNull(mediaType49);
        org.junit.Assert.assertNotNull(mediaType50);
        org.junit.Assert.assertNotNull(mediaType51);
        org.junit.Assert.assertNotNull(mediaType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(mediaType56);
        org.junit.Assert.assertNotNull(mediaType57);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(mediaType61);
        org.junit.Assert.assertNotNull(mimeTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(mimeTypeCollection65);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.mockito.ArgumentMatcher<java.lang.Boolean> booleanArgumentMatcher0 = null;
        boolean boolean1 = org.mockito.ArgumentMatchers.booleanThat(booleanArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String str0 = org.springframework.web.context.ConfigurableWebApplicationContext.SERVLET_CONFIG_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servletConfig" + "'", str0, "servletConfig");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.Resource resource5 = annotationConfigServletWebServerApplicationContext0.getResource("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = annotationConfigServletWebServerApplicationContext0.getConfigLocations();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getConfigLocations()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resource5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        javax.servlet.ServletContext servletContext2 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader3 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader3);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.setConfigLocation("_links.self.templated");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support setConfigLocation(). Do you still have an 'contextConfigLocations' init-param set?");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_XHTML_XML;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        boolean boolean4 = annotationConfigServletWebServerApplicationContext0.isActive();
        org.springframework.core.io.ProtocolResolver protocolResolver5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.addProtocolResolver(protocolResolver5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.springframework.core.env.ConfigurablePropertyResolver configurablePropertyResolver0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(configurablePropertyResolver0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = annotationConfigServletWebServerApplicationContext0.isTypeMatch("application/pdf", resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@4b3d7f14 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (short) 1);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        java.lang.String str4 = annotationConfigServletWebServerApplicationContext0.getApplicationName();
        org.mockito.Mockito mockito6 = new org.mockito.Mockito();
        org.springframework.http.MediaType mediaType7 = org.springframework.http.MediaType.APPLICATION_JSON;
        org.springframework.http.MediaType mediaType9 = org.springframework.http.MediaType.IMAGE_GIF;
        java.lang.Object[] objArray10 = new java.lang.Object[] { mockito6, mediaType7, "application/rss+xml", mediaType9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = annotationConfigServletWebServerApplicationContext0.getBean("hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@206cb2ec has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(mediaType7);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.setConfigLocation("org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env.href");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support setConfigLocation(). Do you still have an 'contextConfigLocations' init-param set?");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str1 = annotationConfigServletWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.parseMediaType("messageSource");
            org.junit.Assert.fail("Expected exception of type org.springframework.http.InvalidMediaTypeException; message: Invalid mime type \"messageSource\": does not contain '/'");
        } catch (org.springframework.http.InvalidMediaTypeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        int int1 = org.mockito.ArgumentMatchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean5 = mediaType3.isCompatibleWith(mediaType4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = mediaType3.getParameters();
        org.springframework.http.MediaType mediaType7 = new org.springframework.http.MediaType(mediaType2, strMap6);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType8 = new org.springframework.http.MediaType("", "&", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'type' must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str0 = org.springframework.http.MediaType.TEXT_MARKDOWN_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/markdown" + "'", str0, "text/markdown");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("application/octet-stream");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundrySecurityService cloudFoundrySecurityService0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.TokenValidator tokenValidator1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.TokenValidator(cloudFoundrySecurityService0);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenValidator1.validate(token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.CONTEXT_ATTRIBUTES_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "contextAttributes" + "'", str0, "contextAttributes");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.mockito.ArgumentMatcher<java.lang.Integer> intArgumentMatcher0 = null;
        int int1 = org.mockito.ArgumentMatchers.intThat(intArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        boolean boolean5 = annotationConfigServletWebServerApplicationContext0.isBeanNameInUse("app-id");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigServletWebServerApplicationContext0.isPrototype("_links.env");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@5fb6dd85 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext1.removeAlias("text/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias 'text/xml' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean5 = mediaType3.isCompatibleWith(mediaType4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = mediaType3.getParameters();
        org.springframework.http.MediaType mediaType7 = new org.springframework.http.MediaType(mediaType2, strMap6);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType8 = new org.springframework.http.MediaType("", "application/xhtml+xml", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'type' must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection4 = annotationConfigServletWebServerApplicationContext0.getProtocolResolvers();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition6 = annotationConfigServletWebServerApplicationContext0.getBeanDefinition("systemEnvironment");
            org.junit.Assert.fail("Expected exception of type org.springframework.beans.factory.NoSuchBeanDefinitionException; message: No bean named 'systemEnvironment' available");
        } catch (org.springframework.beans.factory.NoSuchBeanDefinitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertNotNull(protocolResolverCollection4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType3 = null;
        boolean boolean4 = mediaType2.isCompatibleWith(mediaType3);
        java.lang.Class<?> wildcardClass5 = mediaType2.getClass();
        org.springframework.http.MediaType mediaType6 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType7 = null;
        boolean boolean8 = mediaType6.isCompatibleWith(mediaType7);
        java.lang.Class<?> wildcardClass9 = mediaType6.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass5;
        wildcardClassArray12[1] = wildcardClass9;
        annotationConfigServletWebServerApplicationContext0.register(wildcardClassArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable18 = org.mockito.Mockito.verify((java.lang.Cloneable) wildcardClassArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class[] and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mediaType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        annotationConfigServletWebServerApplicationContext0.setId("_links.test-part");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2deb324a, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.IMAGE_PNG;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType0);
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType5 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset6 = mediaType5.getCharset();
        org.springframework.http.MediaType mediaType7 = new org.springframework.http.MediaType(mediaType4, charset6);
        org.springframework.http.MediaType mediaType8 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset6);
        boolean boolean9 = mediaType1.includes(mediaType8);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertNotNull(mediaType5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        int int0 = org.mockito.ArgumentMatchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Throwable[]> throwableArrayOngoingStubbing4 = org.mockito.Mockito.when(throwableArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.Resource resource5 = annotationConfigServletWebServerApplicationContext0.getResource("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigServletWebServerApplicationContext0.isPrototype("loadTimeWeaver");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@65aaef16 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resource5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("signature");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        boolean boolean5 = annotationConfigServletWebServerApplicationContext0.isBeanNameInUse("app-id");
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = annotationConfigServletWebServerApplicationContext0.getBeanNamesForType(resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1826a60f has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.Resource resource5 = annotationConfigServletWebServerApplicationContext0.getResource("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigServletWebServerApplicationContext0.isSingleton("&");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@471ce08 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resource5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory5 = annotationConfigServletWebServerApplicationContext0.getAutowireCapableBeanFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6c5987c7 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        double double1 = org.mockito.ArgumentMatchers.eq((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_PROBLEM_XML_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/problem+xml" + "'", str0, "application/problem+xml");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        java.lang.ClassLoader classLoader11 = annotationConfigServletWebServerApplicationContext0.getClassLoader();
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry12 = org.mockito.ArgumentMatchers.eq((org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigServletWebServerApplicationContext0);
        java.lang.String str13 = annotationConfigServletWebServerApplicationContext0.getId();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNull(beanDefinitionRegistry12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType3 = new org.springframework.http.MediaType("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.", "application/octet-stream", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid token character '/' in token \"application/octet-stream\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.ObjectProvider<org.springframework.core.env.Environment> environmentObjectProvider4 = annotationConfigServletWebServerApplicationContext0.getBeanProvider(resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@b0c765e has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = annotationConfigServletWebServerApplicationContext0.getBeanNamesForType(resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1ecd0c91 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType3 = null;
        boolean boolean4 = mediaType2.isCompatibleWith(mediaType3);
        java.nio.charset.Charset charset5 = mediaType2.getCharset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = mediaType2.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType7 = new org.springframework.http.MediaType("session", "", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'subtype' must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(charset5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.Mockito mockito1 = new org.mockito.Mockito();
        org.mockito.Mockito mockito2 = new org.mockito.Mockito();
        org.mockito.ArgumentMatchers[] argumentMatchersArray3 = new org.mockito.ArgumentMatchers[] { mockito0, mockito1, mockito2 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(argumentMatchersArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(argumentMatchersArray3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.ENVIRONMENT_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "environment" + "'", str0, "environment");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("text/markdown");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str0 = org.springframework.web.context.WebApplicationContext.SCOPE_APPLICATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application" + "'", str0, "application");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) resourceArray3);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        annotationConfigServletWebServerApplicationContext0.close();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        long long1 = org.mockito.ArgumentMatchers.eq(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType2 = null;
        boolean boolean3 = mediaType1.isCompatibleWith(mediaType2);
        java.nio.charset.Charset charset4 = mediaType1.getCharset();
        org.springframework.http.MediaType mediaType5 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType6 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean7 = mediaType5.isCompatibleWith(mediaType6);
        java.nio.charset.Charset charset8 = mediaType6.getCharset();
        java.lang.String str10 = mediaType6.getParameter("request");
        org.springframework.http.MediaType mediaType11 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType12 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean13 = mediaType11.isCompatibleWith(mediaType12);
        org.springframework.http.MediaType mediaType14 = org.springframework.http.MediaType.IMAGE_GIF;
        org.springframework.http.MediaType mediaType15 = org.springframework.http.MediaType.APPLICATION_PROBLEM_XML;
        org.springframework.http.MediaType mediaType16 = org.springframework.http.MediaType.APPLICATION_ATOM_XML;
        org.springframework.http.MediaType mediaType17 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType18 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean19 = mediaType17.isCompatibleWith(mediaType18);
        org.springframework.http.MediaType mediaType20 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType21 = null;
        boolean boolean22 = mediaType20.isCompatibleWith(mediaType21);
        org.springframework.http.MediaType mediaType23 = org.springframework.http.MediaType.APPLICATION_JSON;
        org.springframework.http.MediaType mediaType24 = org.springframework.http.MediaType.APPLICATION_PDF;
        org.springframework.http.MediaType mediaType25 = org.springframework.http.MediaType.IMAGE_GIF;
        boolean boolean26 = mediaType24.isCompatibleWith((org.springframework.util.MimeType) mediaType25);
        org.springframework.http.MediaType mediaType27 = org.springframework.http.MediaType.IMAGE_PNG;
        org.springframework.http.MediaType mediaType28 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType27);
        org.springframework.http.MediaType mediaType29 = org.springframework.http.MediaType.IMAGE_PNG;
        org.springframework.http.MediaType mediaType30 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset31 = mediaType30.getCharset();
        org.springframework.http.MediaType mediaType32 = org.springframework.http.MediaType.APPLICATION_PROBLEM_XML;
        boolean boolean33 = mediaType30.isCompatibleWith(mediaType32);
        org.springframework.http.MediaType mediaType34 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType35 = org.springframework.http.MediaType.ALL;
        org.springframework.http.MediaType[] mediaTypeArray36 = new org.springframework.http.MediaType[] { mediaType0, mediaType1, mediaType6, mediaType12, mediaType14, mediaType15, mediaType16, mediaType18, mediaType21, mediaType23, mediaType24, mediaType28, mediaType29, mediaType32, mediaType34, mediaType35 };
        java.util.ArrayList<org.springframework.http.MediaType> mediaTypeList37 = new java.util.ArrayList<org.springframework.http.MediaType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.springframework.http.MediaType>) mediaTypeList37, mediaTypeArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.springframework.http.MediaType.toString((java.util.Collection<org.springframework.http.MediaType>) mediaTypeList37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charset4);
        org.junit.Assert.assertNotNull(mediaType5);
        org.junit.Assert.assertNotNull(mediaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(charset8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(mediaType11);
        org.junit.Assert.assertNotNull(mediaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(mediaType14);
        org.junit.Assert.assertNotNull(mediaType15);
        org.junit.Assert.assertNotNull(mediaType16);
        org.junit.Assert.assertNotNull(mediaType17);
        org.junit.Assert.assertNotNull(mediaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mediaType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mediaType23);
        org.junit.Assert.assertNotNull(mediaType24);
        org.junit.Assert.assertNotNull(mediaType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mediaType27);
        org.junit.Assert.assertNotNull(mediaType28);
        org.junit.Assert.assertNotNull(mediaType29);
        org.junit.Assert.assertNotNull(mediaType30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(mediaType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mediaType34);
        org.junit.Assert.assertNotNull(mediaType35);
        org.junit.Assert.assertNotNull(mediaTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        java.lang.ClassLoader classLoader11 = annotationConfigServletWebServerApplicationContext0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.setConfigLocation("_links.test.href");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support setConfigLocation(). Do you still have an 'contextConfigLocations' init-param set?");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = annotationConfigServletWebServerApplicationContext6.isPrototype("text/html");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@18ad411a has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        java.lang.String[] strArray5 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext7 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext8 = annotationConfigServletWebServerApplicationContext7.getServletContext();
        org.springframework.http.MediaType mediaType9 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType10 = null;
        boolean boolean11 = mediaType9.isCompatibleWith(mediaType10);
        java.lang.Class<?> wildcardClass12 = mediaType9.getClass();
        org.springframework.http.MediaType mediaType13 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType14 = null;
        boolean boolean15 = mediaType13.isCompatibleWith(mediaType14);
        java.lang.Class<?> wildcardClass16 = mediaType13.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass12;
        wildcardClassArray19[1] = wildcardClass16;
        annotationConfigServletWebServerApplicationContext7.register(wildcardClassArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = annotationConfigServletWebServerApplicationContext0.getBean("org.springframework.web.context.WebApplicationContext.ROOT", (java.lang.Object[]) wildcardClassArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@5bce50c4 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(servletContext8);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset1 = mediaType0.getCharset();
        java.lang.String str2 = mediaType0.getType();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "application" + "'", str2, "application");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext3.getServletContext();
        org.springframework.core.io.Resource[] resourceArray6 = annotationConfigServletWebServerApplicationContext3.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection7 = annotationConfigServletWebServerApplicationContext3.getProtocolResolvers();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigServletWebServerApplicationContext3.getResources("Access-Control-Allow-Methods");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext10 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext11 = annotationConfigServletWebServerApplicationContext10.getServletContext();
        javax.servlet.ServletContext servletContext12 = annotationConfigServletWebServerApplicationContext10.getServletContext();
        java.lang.ClassLoader classLoader13 = null;
        annotationConfigServletWebServerApplicationContext10.setClassLoader(classLoader13);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext15 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext15.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory18 = annotationConfigServletWebServerApplicationContext15.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher19 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext15);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList20 = annotationConfigServletWebServerApplicationContext15.getBeanFactoryPostProcessors();
        java.lang.String str21 = annotationConfigServletWebServerApplicationContext15.toString();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext22 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext23 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean25 = annotationConfigServletWebServerApplicationContext23.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext22.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext23);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext27 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext27.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory30 = annotationConfigServletWebServerApplicationContext27.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher31 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext27);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList32 = annotationConfigServletWebServerApplicationContext27.getBeanFactoryPostProcessors();
        java.lang.String str33 = annotationConfigServletWebServerApplicationContext27.toString();
        org.springframework.core.AliasRegistry[] aliasRegistryArray34 = new org.springframework.core.AliasRegistry[] { annotationConfigServletWebServerApplicationContext0, annotationConfigServletWebServerApplicationContext3, annotationConfigServletWebServerApplicationContext10, annotationConfigServletWebServerApplicationContext15, annotationConfigServletWebServerApplicationContext22, annotationConfigServletWebServerApplicationContext27 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(aliasRegistryArray34);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(servletContext4);
        org.junit.Assert.assertNotNull(resourceArray6);
        org.junit.Assert.assertNotNull(protocolResolverCollection7);
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNull(servletContext11);
        org.junit.Assert.assertNull(servletContext12);
        org.junit.Assert.assertNull(beanFactory18);
        org.junit.Assert.assertNull(applicationEventPublisher19);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(beanFactory30);
        org.junit.Assert.assertNull(applicationEventPublisher31);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList32);
        org.junit.Assert.assertNotNull(aliasRegistryArray34);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        annotationConfigServletWebServerApplicationContext0.setDisplayName("application/xml");
        java.lang.Class<?> wildcardClass6 = annotationConfigServletWebServerApplicationContext0.getClass();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext3.getServletContext();
        org.springframework.http.MediaType mediaType5 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType6 = null;
        boolean boolean7 = mediaType5.isCompatibleWith(mediaType6);
        java.lang.Class<?> wildcardClass8 = mediaType5.getClass();
        org.springframework.http.MediaType mediaType9 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType10 = null;
        boolean boolean11 = mediaType9.isCompatibleWith(mediaType10);
        java.lang.Class<?> wildcardClass12 = mediaType9.getClass();
        java.lang.Class[] classArray14 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass8;
        wildcardClassArray15[1] = wildcardClass12;
        annotationConfigServletWebServerApplicationContext3.register(wildcardClassArray15);
        annotationConfigServletWebServerApplicationContext0.register(wildcardClassArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = annotationConfigServletWebServerApplicationContext0.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@297ee61f has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext4);
        org.junit.Assert.assertNotNull(mediaType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.EndpointDelegate endpointDelegate1 = null; // flaky: cloudFoundryMvcConfiguration0.endpointDelegate();
// flaky:         endpointDelegate1.write("application/xhtml+xml", "application/rss+xml");
// flaky:         org.junit.Assert.assertNotNull(endpointDelegate1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.nio.charset.Charset charset3 = mediaType0.getCharset();
        double double4 = mediaType0.getQualityValue();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.EndpointDelegate endpointDelegate0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint(endpointDelegate0);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint2 = org.mockito.ArgumentMatchers.eq(testEndpoint1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = testEndpoint2.readPart("GET,POST");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(testEndpoint2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        float float1 = org.mockito.ArgumentMatchers.eq((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.Mockito mockito1 = org.mockito.ArgumentMatchers.same(mockito0);
        org.junit.Assert.assertNull(mockito1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.core.io.Resource resource4 = annotationConfigServletWebServerApplicationContext0.getResource("&");
        org.junit.Assert.assertNotNull(resource4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env.href");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@595e5f5d, started on Wed Dec 31 18:00:00 CST 1969, parent: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@5a81543c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6d589e5c, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason3 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason3, "_links.env.href");
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.Throwable[] throwableArray7 = cloudFoundryAuthorizationException5.getSuppressed();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason3 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason3.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.springframework.http.MediaType mediaType1 = new org.springframework.http.MediaType("contextParameters");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.IMAGE_PNG;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType2);
        boolean boolean4 = mediaType1.includes((org.springframework.util.MimeType) mediaType2);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection4 = annotationConfigServletWebServerApplicationContext0.getProtocolResolvers();
        org.springframework.core.io.ProtocolResolver protocolResolver5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.addProtocolResolver(protocolResolver5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertNotNull(protocolResolverCollection4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint1 = testEndpointConfiguration0.testInfoEnvEndpoint();
        org.junit.Assert.assertNotNull(testInfoEndpoint1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason1 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason1, "_links.env.href");
        java.lang.Throwable[] throwableArray4 = cloudFoundryAuthorizationException3.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber5 = org.mockito.Mockito.doReturn((java.lang.Object) 10L, (java.lang.Object[]) throwableArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason1 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason1.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection4 = annotationConfigServletWebServerApplicationContext0.getProtocolResolvers();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigServletWebServerApplicationContext0.isTypeMatch("applicationEventMulticaster", resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@7e3ba7a has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertNotNull(protocolResolverCollection4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        annotationConfigServletWebServerApplicationContext0.registerShutdownHook();
        java.lang.String[] strArray4 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigServletWebServerApplicationContext0.isTypeMatch("&", resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@45481769 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean2 = annotationConfigServletWebServerApplicationContext0.containsBeanDefinition("_links.info.href");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.http.MediaType> mediaTypeList1 = org.springframework.http.MediaType.parseMediaTypes("org.springframework.web.context.WebApplicationContext:");
            org.junit.Assert.fail("Expected exception of type org.springframework.http.InvalidMediaTypeException; message: Invalid mime type \"org.springframework.web.context.WebApplicationContext:\": does not contain '/'");
        } catch (org.springframework.http.InvalidMediaTypeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        annotationConfigServletWebServerApplicationContext0.registerShutdownHook();
        java.lang.String[] strArray4 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.nio.charset.Charset charset3 = mediaType0.getCharset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = mediaType0.getParameters();
        org.springframework.http.MediaType mediaType5 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType0);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(mediaType5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext0);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList5 = annotationConfigServletWebServerApplicationContext0.getBeanFactoryPostProcessors();
        java.lang.String str6 = annotationConfigServletWebServerApplicationContext0.toString();
        org.springframework.core.io.Resource[] resourceArray8 = annotationConfigServletWebServerApplicationContext0.getResources("messageSource");
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertNull(applicationEventPublisher4);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList5);
        org.junit.Assert.assertNotNull(resourceArray8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.nio.charset.Charset charset0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(charset0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        short short0 = org.mockito.ArgumentMatchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        javax.servlet.ServletContext servletContext2 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = annotationConfigServletWebServerApplicationContext0.getBean("systemProperties");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@4ad7a25b has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.springframework.context.support.AbstractApplicationContext abstractApplicationContext0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(abstractApplicationContext0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        boolean boolean4 = annotationConfigServletWebServerApplicationContext0.isActive();
        boolean boolean6 = annotationConfigServletWebServerApplicationContext0.containsLocalBean("_links.env");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@1862338f, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        boolean boolean5 = annotationConfigServletWebServerApplicationContext0.isActive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.util.MimeType[] mimeTypeArray3 = new org.springframework.util.MimeType[] { mediaType0 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList4 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList4, mimeTypeArray3);
        java.util.List<org.springframework.http.MediaType> mediaTypeList6 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList4);
        org.springframework.http.MediaType.sortBySpecificity(mediaTypeList6);
        org.springframework.http.MediaType.sortBySpecificityAndQuality(mediaTypeList6);
        org.springframework.http.MediaType.sortByQualityValue(mediaTypeList6);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(mimeTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mediaTypeList6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token("text/event-stream");
            org.junit.Assert.fail("Expected exception of type org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException; message: JWT must have header, body and signature");
        } catch (org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason4 = cloudFoundryAuthorizationException2.getReason();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber5 = org.mockito.Mockito.doReturn((java.lang.Object) cloudFoundryAuthorizationException2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + reason4 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason4.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.refresh();
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.regex.Pattern pattern0 = null;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        boolean boolean5 = annotationConfigServletWebServerApplicationContext0.isBeanNameInUse("app-id");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory6 = annotationConfigServletWebServerApplicationContext0.getAutowireCapableBeanFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2babca69 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        boolean boolean4 = annotationConfigServletWebServerApplicationContext0.isActive();
        boolean boolean6 = annotationConfigServletWebServerApplicationContext0.containsLocalBean("_links.env");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory7 = annotationConfigServletWebServerApplicationContext0.getAutowireCapableBeanFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@5f52b307 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.EndpointDelegate endpointDelegate1 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint2 = testEndpointConfiguration0.testEndpoint(endpointDelegate1);
        // The following exception was thrown during execution in test generation
        try {
            testEndpoint2.write("_links.info.href", "octet-stream");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(testEndpoint2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("application/xhtml+xml");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        annotationConfigServletWebServerApplicationContext0.setId("_links.test-part");
        org.mockito.verification.VerificationMode verificationMode6 = org.mockito.Mockito.description("_links.test.href");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.core.AliasRegistry aliasRegistry7 = org.mockito.Mockito.verify((org.springframework.core.AliasRegistry) annotationConfigServletWebServerApplicationContext0, verificationMode6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type AnnotationConfigServletWebServerApplicationContext and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(verificationMode6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason4 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason6 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException8 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason6, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason9 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException11 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason9, "_links.env.href");
        cloudFoundryAuthorizationException8.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException11);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException13 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason4, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException8);
        org.springframework.http.HttpStatus httpStatus14 = cloudFoundryAuthorizationException13.getStatusCode();
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException13);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + reason4 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason4.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason6 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason6.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason9 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason9.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus14 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus14.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.beans.factory.config.BeanFactoryPostProcessor beanFactoryPostProcessor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.addBeanFactoryPostProcessor(beanFactoryPostProcessor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanFactoryPostProcessor must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.lang.String str0 = org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/x-www-form-urlencoded" + "'", str0, "application/x-www-form-urlencoded");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        long long0 = org.mockito.ArgumentMatchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEnvEndpoint();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = testEnvEndpoint0.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = testEnvEndpoint0.readAll();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        long long4 = annotationConfigServletWebServerApplicationContext0.getStartupDate();
        org.springframework.core.io.Resource resource6 = annotationConfigServletWebServerApplicationContext0.getResource("application/rss+xml");
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(resource6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        javax.servlet.ServletContext servletContext2 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader3 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader3);
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment5 = annotationConfigServletWebServerApplicationContext0.getEnvironment();
        annotationConfigServletWebServerApplicationContext0.clearResourceCaches();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext2);
        org.junit.Assert.assertNotNull(configurableEnvironment5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env.href");
        java.lang.Throwable[] throwableArray3 = cloudFoundryAuthorizationException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) throwableArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        float float0 = org.mockito.ArgumentMatchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.Resource resource5 = annotationConfigServletWebServerApplicationContext0.getResource("hi!");
        annotationConfigServletWebServerApplicationContext0.setAllowBeanDefinitionOverriding(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resource5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) "session");
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) "session");
        org.mockito.MockingDetails[] mockingDetailsArray4 = new org.mockito.MockingDetails[] { mockingDetails1, mockingDetails3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockingDetailsArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNotNull(mockingDetailsArray4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean1 = annotationConfigServletWebServerApplicationContext0.isActive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests cloudFoundryMvcWebEndpointIntegrationTests0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests();
// flaky:         cloudFoundryMvcWebEndpointIntegrationTests0.linksToOtherEndpointsForbidden();
        cloudFoundryMvcWebEndpointIntegrationTests0.responseToOptionsRequestIncludesCorsHeaders();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = annotationConfigServletWebServerApplicationContext0.isPrototype("contextParameters");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@57e94aa7 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.IMAGE_GIF;
        boolean boolean4 = mediaType0.isCompatibleWith(mediaType3);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.HashSet<java.lang.Class<?>> wildcardClassSet0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(wildcardClassSet0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.IMAGE_JPEG;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset1 = mediaType0.getCharset();
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_PROBLEM_XML;
        boolean boolean3 = mediaType0.isCompatibleWith(mediaType2);
        java.lang.String str4 = mediaType0.getType();
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application" + "'", str4, "application");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint1 = testEndpointConfiguration0.testEnvEndpoint();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint2 = testEndpointConfiguration0.testInfoEnvEndpoint();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = testInfoEndpoint2.readAll();
        org.junit.Assert.assertNotNull(testEnvEndpoint1);
        org.junit.Assert.assertNotNull(testInfoEndpoint2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.util.MimeType[] mimeTypeArray3 = new org.springframework.util.MimeType[] { mediaType0 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList4 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList4, mimeTypeArray3);
        java.util.List<org.springframework.http.MediaType> mediaTypeList6 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList4);
        org.springframework.http.MediaType.sortByQualityValue(mediaTypeList6);
        org.springframework.http.MediaType.sortByQualityValue(mediaTypeList6);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(mimeTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mediaTypeList6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.publishEvent((java.lang.Object) "_links.length()");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@402b6999, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        javax.servlet.ServletContext servletContext2 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader3 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader3);
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment5 = annotationConfigServletWebServerApplicationContext0.getEnvironment();
        org.springframework.core.env.ConfigurablePropertyResolver configurablePropertyResolver6 = org.mockito.ArgumentMatchers.same((org.springframework.core.env.ConfigurablePropertyResolver) configurableEnvironment5);
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext2);
        org.junit.Assert.assertNotNull(configurableEnvironment5);
        org.junit.Assert.assertNull(configurablePropertyResolver6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        java.lang.String str6 = annotationConfigServletWebServerApplicationContext0.getId();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType1 = new org.springframework.http.MediaType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'type' must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset4 = mediaType3.getCharset();
        org.springframework.http.MediaType mediaType5 = new org.springframework.http.MediaType(mediaType2, charset4);
        org.springframework.http.MediaType mediaType6 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset4);
        java.nio.charset.Charset charset7 = mediaType6.getCharset();
        org.springframework.http.MediaType mediaType8 = org.springframework.http.MediaType.TEXT_HTML;
        org.springframework.http.MediaType mediaType9 = mediaType6.copyQualityValue(mediaType8);
        java.lang.String str11 = mediaType6.getParameter("conversionService");
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(mediaType8);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.nio.charset.Charset charset3 = mediaType1.getCharset();
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.TEXT_HTML;
        boolean boolean5 = mediaType1.isCompatibleWith((org.springframework.util.MimeType) mediaType4);
        org.springframework.http.MediaType mediaType6 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType7 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType8 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean9 = mediaType7.isCompatibleWith(mediaType8);
        java.nio.charset.Charset charset10 = mediaType8.getCharset();
        org.springframework.http.MediaType mediaType11 = org.springframework.http.MediaType.TEXT_HTML;
        boolean boolean12 = mediaType8.isCompatibleWith((org.springframework.util.MimeType) mediaType11);
        boolean boolean13 = mediaType6.isCompatibleWith(mediaType11);
        boolean boolean14 = mediaType4.includes((org.springframework.util.MimeType) mediaType6);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mediaType6);
        org.junit.Assert.assertNotNull(mediaType7);
        org.junit.Assert.assertNotNull(mediaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertNotNull(mediaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEEP_STUBS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(0L);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        boolean boolean4 = annotationConfigServletWebServerApplicationContext0.isActive();
        java.lang.String str5 = annotationConfigServletWebServerApplicationContext0.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = annotationConfigServletWebServerApplicationContext0.getBean("Access-Control-Request-Method");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@cffd0bf has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.EndpointDelegate endpointDelegate0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint(endpointDelegate0);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint2 = org.mockito.ArgumentMatchers.eq(testEndpoint1);
        // The following exception was thrown during execution in test generation
        try {
            testEndpoint1.write("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.", "bearer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(testEndpoint2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.util.MimeType[] mimeTypeArray3 = new org.springframework.util.MimeType[] { mediaType0 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList4 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList4, mimeTypeArray3);
        java.util.List<org.springframework.http.MediaType> mediaTypeList6 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList4);
        org.springframework.http.MediaType.sortBySpecificity(mediaTypeList6);
        org.springframework.http.MediaType.sortBySpecificityAndQuality(mediaTypeList6);
        org.springframework.http.MediaType.sortBySpecificity(mediaTypeList6);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(mimeTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mediaTypeList6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.includes(mediaType1);
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean5 = mediaType3.isCompatibleWith(mediaType4);
        org.springframework.util.MimeType[] mimeTypeArray6 = new org.springframework.util.MimeType[] { mediaType3 };
        java.util.ArrayList<org.springframework.util.MimeType> mimeTypeList7 = new java.util.ArrayList<org.springframework.util.MimeType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.springframework.util.MimeType>) mimeTypeList7, mimeTypeArray6);
        java.util.List<org.springframework.http.MediaType> mediaTypeList9 = org.springframework.http.MediaType.asMediaTypes((java.util.List<org.springframework.util.MimeType>) mimeTypeList7);
        org.springframework.http.MediaType.sortBySpecificity(mediaTypeList9);
        boolean boolean11 = mediaType0.equals((java.lang.Object) mediaTypeList9);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mimeTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(mediaTypeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.http.MediaType> mediaTypeList1 = org.springframework.http.MediaType.parseMediaTypes("_links.self.templated");
            org.junit.Assert.fail("Expected exception of type org.springframework.http.InvalidMediaTypeException; message: Invalid mime type \"_links.self.templated\": does not contain '/'");
        } catch (org.springframework.http.InvalidMediaTypeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.String[] strArray2 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ",; \t\n" + "'", str0, ",; \t\n");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 0);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException7 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.env.href");
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        org.springframework.http.HttpStatus httpStatus10 = cloudFoundryAuthorizationException9.getStatusCode();
        java.lang.String str11 = cloudFoundryAuthorizationException9.toString();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + httpStatus10 + "' != '" + org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE + "'", httpStatus10.equals(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: application/pdf" + "'", str11, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: application/pdf");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        javax.servlet.ServletConfig servletConfig4 = annotationConfigServletWebServerApplicationContext0.getServletConfig();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException7 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.env.href");
        cloudFoundryAuthorizationException4.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException11 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "octet-stream");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason13 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException15 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason13, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason16 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException18 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason16, "_links.env.href");
        cloudFoundryAuthorizationException15.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException18);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason20 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException22 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason20, "Access-Control-Request-Method");
        java.lang.Throwable[] throwableArray23 = cloudFoundryAuthorizationException22.getSuppressed();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason24 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException26 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason24, "Access-Control-Request-Method");
        cloudFoundryAuthorizationException22.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException26);
        cloudFoundryAuthorizationException15.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException26);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException29 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "hi!", (java.lang.Throwable) cloudFoundryAuthorizationException15);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason13 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason13.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason16 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason16.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason20 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason20.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + reason24 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason24.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.context.ApplicationEvent applicationEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.publishEvent(applicationEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Event must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.Resource resource5 = annotationConfigServletWebServerApplicationContext0.getResource("hi!");
        annotationConfigServletWebServerApplicationContext0.setAllowBeanDefinitionOverriding(false);
        org.springframework.beans.factory.config.BeanFactoryPostProcessor beanFactoryPostProcessor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.addBeanFactoryPostProcessor(beanFactoryPostProcessor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanFactoryPostProcessor must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resource5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        int int1 = org.mockito.ArgumentMatchers.eq(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        boolean boolean5 = annotationConfigServletWebServerApplicationContext0.isBeanNameInUse("app-id");
        org.springframework.beans.factory.BeanFactory beanFactory6 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        java.lang.String[] strArray7 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(beanFactory6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        org.springframework.context.annotation.AnnotationConfigRegistry annotationConfigRegistry5 = org.mockito.ArgumentMatchers.same((org.springframework.context.annotation.AnnotationConfigRegistry) annotationConfigServletWebServerApplicationContext0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotationConfigRegistry5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        boolean boolean1 = mediaType0.isConcrete();
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean4 = mediaType2.includes(mediaType3);
        org.springframework.http.MediaType mediaType5 = mediaType0.copyQualityValue(mediaType3);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mediaType5);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.TEXT_MARKDOWN;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean4 = mediaType2.isCompatibleWith(mediaType3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = mediaType2.getParameters();
        org.springframework.http.MediaType mediaType6 = new org.springframework.http.MediaType(mediaType1, strMap5);
        org.springframework.http.MediaType mediaType9 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType10 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset11 = mediaType10.getCharset();
        org.springframework.http.MediaType mediaType12 = new org.springframework.http.MediaType(mediaType9, charset11);
        org.springframework.http.MediaType mediaType13 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset11);
        java.nio.charset.Charset charset14 = mediaType13.getCharset();
        org.springframework.http.MediaType mediaType15 = new org.springframework.http.MediaType(mediaType6, charset14);
        boolean boolean16 = mediaType0.isCompatibleWith(mediaType6);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertNotNull(mediaType10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext2 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext3 = annotationConfigServletWebServerApplicationContext2.getServletContext();
        org.springframework.context.MessageSource messageSource4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext2);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext5 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext6 = annotationConfigServletWebServerApplicationContext5.getServletContext();
        org.springframework.http.MediaType mediaType7 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType8 = null;
        boolean boolean9 = mediaType7.isCompatibleWith(mediaType8);
        java.lang.Class<?> wildcardClass10 = mediaType7.getClass();
        org.springframework.http.MediaType mediaType11 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType12 = null;
        boolean boolean13 = mediaType11.isCompatibleWith(mediaType12);
        java.lang.Class<?> wildcardClass14 = mediaType11.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass10;
        wildcardClassArray17[1] = wildcardClass14;
        annotationConfigServletWebServerApplicationContext5.register(wildcardClassArray17);
        annotationConfigServletWebServerApplicationContext2.register(wildcardClassArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber24 = org.mockito.Mockito.doReturn((java.lang.Object) objAnswer0, (java.lang.Object[]) wildcardClassArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor17.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
// flaky:         org.junit.Assert.assertNotNull(stubber1);
        org.junit.Assert.assertNull(servletContext3);
        org.junit.Assert.assertNull(messageSource4);
        org.junit.Assert.assertNull(servletContext6);
        org.junit.Assert.assertNotNull(mediaType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext0);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList5 = annotationConfigServletWebServerApplicationContext0.getBeanFactoryPostProcessors();
        java.lang.String str6 = annotationConfigServletWebServerApplicationContext0.toString();
        org.springframework.core.io.Resource[] resourceArray8 = annotationConfigServletWebServerApplicationContext0.getResources("messageSource");
        org.springframework.core.io.Resource resource10 = annotationConfigServletWebServerApplicationContext0.getResource("application");
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertNull(applicationEventPublisher4);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList5);
        org.junit.Assert.assertNotNull(resourceArray8);
        org.junit.Assert.assertNotNull(resource10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        java.lang.String[] strArray5 = annotationConfigServletWebServerApplicationContext0.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = annotationConfigServletWebServerApplicationContext0.getBean("text/html");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@58de391a has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.MULTIPART_FORM_DATA;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.includes(mediaType1);
        boolean boolean4 = mediaType1.equals((java.lang.Object) "Authorization");
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint1 = org.mockito.Mockito.spy(testEnvEndpoint0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        java.lang.ClassLoader classLoader11 = annotationConfigServletWebServerApplicationContext0.getClassLoader();
        java.lang.String str12 = annotationConfigServletWebServerApplicationContext0.getDisplayName();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String str0 = org.springframework.core.io.support.ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classpath*:" + "'", str0, "classpath*:");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.core.io.Resource[] resourceArray3 = annotationConfigServletWebServerApplicationContext0.getResources("application/octet-stream");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext4 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext4.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory7 = annotationConfigServletWebServerApplicationContext4.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher8 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext4);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList9 = annotationConfigServletWebServerApplicationContext4.getBeanFactoryPostProcessors();
        java.lang.String str10 = annotationConfigServletWebServerApplicationContext4.toString();
        org.springframework.core.io.Resource[] resourceArray12 = annotationConfigServletWebServerApplicationContext4.getResources("messageSource");
        javax.servlet.ServletContext servletContext13 = annotationConfigServletWebServerApplicationContext4.getServletContext();
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext4);
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resourceArray3);
        org.junit.Assert.assertNull(beanFactory7);
        org.junit.Assert.assertNull(applicationEventPublisher8);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList9);
        org.junit.Assert.assertNotNull(resourceArray12);
        org.junit.Assert.assertNull(servletContext13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset4 = mediaType3.getCharset();
        org.springframework.http.MediaType mediaType5 = new org.springframework.http.MediaType(mediaType2, charset4);
        org.springframework.http.MediaType mediaType6 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset4);
        java.nio.charset.Charset charset7 = mediaType6.getCharset();
        org.springframework.http.MediaType mediaType8 = org.springframework.http.MediaType.TEXT_HTML;
        org.springframework.http.MediaType mediaType9 = mediaType6.copyQualityValue(mediaType8);
        java.lang.String str10 = mediaType6.toString();
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(mediaType8);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "session/applicationeventmulticaster;charset=UTF-8" + "'", str10, "session/applicationeventmulticaster;charset=UTF-8");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.removeAlias("classpath*:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias 'classpath*:' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("application");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.MediaType mediaType3 = new org.springframework.http.MediaType("application/json", "image/gif", strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid token character '/' in token \"application/json\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.mockito.ArgumentMatcher<java.lang.Byte> byteArgumentMatcher0 = null;
        byte byte1 = org.mockito.ArgumentMatchers.byteThat(byteArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        annotationConfigServletWebServerApplicationContext0.clearResourceCaches();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) '#');
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.ArgumentMatchers.eq(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNull(verificationWithTimeout2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory1 = cloudFoundryMvcConfiguration0.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes3 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType5 = null;
        boolean boolean6 = mediaType4.isCompatibleWith(mediaType5);
        java.lang.Class<?> wildcardClass7 = mediaType4.getClass();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext8 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext9 = annotationConfigServletWebServerApplicationContext8.getServletContext();
        java.lang.ClassLoader classLoader10 = null;
        annotationConfigServletWebServerApplicationContext8.setClassLoader(classLoader10);
        annotationConfigServletWebServerApplicationContext8.setDisplayName("application/xml");
        java.lang.Class<?> wildcardClass14 = annotationConfigServletWebServerApplicationContext8.getClass();
        java.util.LinkedHashSet<java.lang.Class<?>> wildcardClassSet15 = new java.util.LinkedHashSet<java.lang.Class<?>>();
        boolean boolean16 = wildcardClassSet15.add(wildcardClass7);
        boolean boolean17 = wildcardClassSet15.add(wildcardClass14);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext18 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext19 = annotationConfigServletWebServerApplicationContext18.getServletContext();
        java.lang.String[] strArray20 = annotationConfigServletWebServerApplicationContext18.getBeanDefinitionNames();
        java.util.Set<java.lang.Class<?>> wildcardClassSet21 = org.mockito.ArgumentMatchers.refEq((java.util.Set<java.lang.Class<?>>) wildcardClassSet15, strArray20);
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes22 = org.mockito.ArgumentMatchers.refEq(endpointMediaTypes3, strArray20);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNotNull(endpointMediaTypes3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(servletContext9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(servletContext19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNull(wildcardClassSet21);
        org.junit.Assert.assertNull(endpointMediaTypes22);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory1 = cloudFoundryMvcConfiguration0.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext3.getServletContext();
        org.springframework.context.MessageSource messageSource5 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext3);
        annotationConfigServletWebServerApplicationContext3.destroy();
        boolean boolean8 = annotationConfigServletWebServerApplicationContext3.isBeanNameInUse("app-id");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory10 = cloudFoundryMvcConfiguration9.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes11 = cloudFoundryMvcConfiguration9.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes12 = cloudFoundryMvcConfiguration9.EndpointMediaTypes();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext13 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext14 = annotationConfigServletWebServerApplicationContext13.getServletContext();
        java.lang.String[] strArray15 = annotationConfigServletWebServerApplicationContext13.getBeanDefinitionNames();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes16 = org.mockito.ArgumentMatchers.refEq(endpointMediaTypes12, strArray15);
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer17 = cloudFoundryMvcConfiguration0.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext3, endpointMediaTypes12);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNull(servletContext4);
        org.junit.Assert.assertNull(messageSource5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory10);
        org.junit.Assert.assertNotNull(endpointMediaTypes11);
        org.junit.Assert.assertNotNull(endpointMediaTypes12);
        org.junit.Assert.assertNull(servletContext14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(endpointMediaTypes16);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer17);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        double double0 = org.mockito.ArgumentMatchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType4 = null;
        boolean boolean5 = mediaType3.isCompatibleWith(mediaType4);
        java.nio.charset.Charset charset6 = mediaType3.getCharset();
        boolean boolean7 = mediaType1.includes((org.springframework.util.MimeType) mediaType3);
        boolean boolean9 = mediaType1.equals((java.lang.Object) "GET,POST");
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_PDF;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.IMAGE_GIF;
        boolean boolean2 = mediaType0.isCompatibleWith((org.springframework.util.MimeType) mediaType1);
        boolean boolean3 = mediaType1.isConcrete();
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType1);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mediaType4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.context.MessageSource messageSource2 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext0);
        annotationConfigServletWebServerApplicationContext0.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver4 = null;
        annotationConfigServletWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver4);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        java.lang.ClassLoader classLoader8 = null;
        annotationConfigServletWebServerApplicationContext6.setClassLoader(classLoader8);
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        java.lang.ClassLoader classLoader11 = annotationConfigServletWebServerApplicationContext0.getClassLoader();
        java.lang.ClassLoader classLoader12 = org.mockito.ArgumentMatchers.same(classLoader11);
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(messageSource2);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.IMAGE_PNG;
        org.springframework.http.MediaType mediaType1 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType0);
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.asMediaType((org.springframework.util.MimeType) mediaType0);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertNotNull(mediaType1);
        org.junit.Assert.assertNotNull(mediaType2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.lang.Class<?>[] wildcardClassArray0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(wildcardClassArray0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.EndpointDelegate endpointDelegate1 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestEndpoint testEndpoint2 = testEndpointConfiguration0.testEndpoint(endpointDelegate1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = testEndpoint2.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = testEndpoint2.readPart("conversionService");
        org.junit.Assert.assertNotNull(testEndpoint2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        annotationConfigServletWebServerApplicationContext0.setDisplayName("application/xml");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigServletWebServerApplicationContext6.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection10 = annotationConfigServletWebServerApplicationContext6.getProtocolResolvers();
        org.springframework.core.io.Resource[] resourceArray12 = annotationConfigServletWebServerApplicationContext6.getResources("Access-Control-Allow-Methods");
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        boolean boolean15 = annotationConfigServletWebServerApplicationContext0.isAlias("servletConfig");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason16 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason18 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException20 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason18, "Access-Control-Request-Method");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason21 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException23 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason21, "_links.env.href");
        cloudFoundryAuthorizationException20.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException23);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException25 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason16, "application/pdf", (java.lang.Throwable) cloudFoundryAuthorizationException20);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.publishEvent((java.lang.Object) cloudFoundryAuthorizationException20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: application/xml, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(protocolResolverCollection10);
        org.junit.Assert.assertNotNull(resourceArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + reason16 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason16.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason18 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason18.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + reason21 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason21.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext0);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList5 = annotationConfigServletWebServerApplicationContext0.getBeanFactoryPostProcessors();
        java.lang.String str6 = annotationConfigServletWebServerApplicationContext0.toString();
        org.springframework.core.io.Resource[] resourceArray8 = annotationConfigServletWebServerApplicationContext0.getResources("messageSource");
        javax.servlet.ServletContext servletContext9 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        boolean boolean11 = annotationConfigServletWebServerApplicationContext0.containsBeanDefinition("");
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertNull(applicationEventPublisher4);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList5);
        org.junit.Assert.assertNotNull(resourceArray8);
        org.junit.Assert.assertNull(servletContext9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.String str0 = org.springframework.http.MediaType.ALL_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*/*" + "'", str0, "*/*");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("application/problem+xml");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str1 = annotationConfigServletWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        org.springframework.beans.factory.BeanFactory beanFactory10 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        java.lang.String str11 = annotationConfigServletWebServerApplicationContext0.getDisplayName();
        annotationConfigServletWebServerApplicationContext0.setDisplayName("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(beanFactory10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.junit.Assert.assertNotNull(lenientStubber0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType3 = null;
        boolean boolean4 = mediaType2.isCompatibleWith(mediaType3);
        java.lang.Class<?> wildcardClass5 = mediaType2.getClass();
        org.springframework.http.MediaType mediaType6 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType7 = null;
        boolean boolean8 = mediaType6.isCompatibleWith(mediaType7);
        java.lang.Class<?> wildcardClass9 = mediaType6.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass5;
        wildcardClassArray12[1] = wildcardClass9;
        annotationConfigServletWebServerApplicationContext0.register(wildcardClassArray12);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList18 = annotationConfigServletWebServerApplicationContext0.getBeanFactoryPostProcessors();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mediaType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList18);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("_links.length()");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory1 = cloudFoundryMvcConfiguration0.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext3.getServletContext();
        org.springframework.context.MessageSource messageSource5 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext3);
        annotationConfigServletWebServerApplicationContext3.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver7 = null;
        annotationConfigServletWebServerApplicationContext3.setScopeMetadataResolver(scopeMetadataResolver7);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext9 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext10 = annotationConfigServletWebServerApplicationContext9.getServletContext();
        java.lang.ClassLoader classLoader11 = null;
        annotationConfigServletWebServerApplicationContext9.setClassLoader(classLoader11);
        annotationConfigServletWebServerApplicationContext3.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext9);
        java.lang.ClassLoader classLoader14 = annotationConfigServletWebServerApplicationContext3.getClassLoader();
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry15 = org.mockito.ArgumentMatchers.eq((org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigServletWebServerApplicationContext3);
        boolean boolean16 = annotationConfigServletWebServerApplicationContext3.isRunning();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration17 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory18 = cloudFoundryMvcConfiguration17.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes19 = cloudFoundryMvcConfiguration17.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes20 = cloudFoundryMvcConfiguration17.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer21 = cloudFoundryMvcConfiguration0.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext3, endpointMediaTypes20);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext22 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext23 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean25 = annotationConfigServletWebServerApplicationContext23.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext22.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext23);
        annotationConfigServletWebServerApplicationContext3.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext22);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNull(servletContext4);
        org.junit.Assert.assertNull(messageSource5);
        org.junit.Assert.assertNull(servletContext10);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNull(beanDefinitionRegistry15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory18);
        org.junit.Assert.assertNotNull(endpointMediaTypes19);
        org.junit.Assert.assertNotNull(endpointMediaTypes20);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.core.io.Resource resource5 = annotationConfigServletWebServerApplicationContext0.getResource("hi!");
        org.springframework.core.io.Resource resource7 = annotationConfigServletWebServerApplicationContext0.getResource("application/problem+xml");
        org.springframework.context.Lifecycle lifecycle8 = org.mockito.ArgumentMatchers.same((org.springframework.context.Lifecycle) annotationConfigServletWebServerApplicationContext0);
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNotNull(resource5);
        org.junit.Assert.assertNotNull(resource7);
        org.junit.Assert.assertNull(lifecycle8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        annotationConfigServletWebServerApplicationContext0.setDisplayName("application/xml");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext7 = annotationConfigServletWebServerApplicationContext6.getServletContext();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigServletWebServerApplicationContext6.getResources("application/octet-stream");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection10 = annotationConfigServletWebServerApplicationContext6.getProtocolResolvers();
        org.springframework.core.io.Resource[] resourceArray12 = annotationConfigServletWebServerApplicationContext6.getResources("Access-Control-Allow-Methods");
        annotationConfigServletWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext6);
        boolean boolean14 = annotationConfigServletWebServerApplicationContext0.isRunning();
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext7);
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(protocolResolverCollection10);
        org.junit.Assert.assertNotNull(resourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        org.springframework.http.MediaType mediaType0 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType1 = null;
        boolean boolean2 = mediaType0.isCompatibleWith(mediaType1);
        java.nio.charset.Charset charset3 = mediaType0.getCharset();
        org.springframework.http.MediaType mediaType4 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType5 = null;
        boolean boolean6 = mediaType4.isCompatibleWith(mediaType5);
        java.nio.charset.Charset charset7 = mediaType4.getCharset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = mediaType4.getParameters();
        org.springframework.http.MediaType mediaType9 = new org.springframework.http.MediaType(mediaType0, strMap8);
        org.junit.Assert.assertNotNull(mediaType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(mediaType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charset7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext4 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext5 = annotationConfigServletWebServerApplicationContext4.getServletContext();
        java.lang.String[] strArray6 = annotationConfigServletWebServerApplicationContext4.getBeanDefinitionNames();
        annotationConfigServletWebServerApplicationContext4.registerShutdownHook();
        java.lang.String[] strArray8 = annotationConfigServletWebServerApplicationContext4.getBeanDefinitionNames();
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext1 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        java.lang.ClassLoader classLoader2 = null;
        annotationConfigServletWebServerApplicationContext0.setClassLoader(classLoader2);
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        javax.servlet.ServletConfig servletConfig5 = null;
        annotationConfigServletWebServerApplicationContext0.setServletConfig(servletConfig5);
        org.junit.Assert.assertNull(servletContext1);
        org.junit.Assert.assertNull(servletContext4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext5 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext6 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean8 = annotationConfigServletWebServerApplicationContext6.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext5.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext6);
        java.lang.String[] strArray10 = annotationConfigServletWebServerApplicationContext5.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext1.publishEvent((java.lang.Object) strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@219ec9c7, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext1 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean3 = annotationConfigServletWebServerApplicationContext1.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext0.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext1);
        javax.servlet.ServletConfig servletConfig5 = annotationConfigServletWebServerApplicationContext0.getServletConfig();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        org.springframework.http.MediaType mediaType2 = new org.springframework.http.MediaType("_links.self.href", "bearer");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        java.lang.String str3 = annotationConfigServletWebServerApplicationContext0.getDisplayName();
        annotationConfigServletWebServerApplicationContext0.registerShutdownHook();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory1 = cloudFoundryMvcConfiguration0.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes3 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext4 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext5 = annotationConfigServletWebServerApplicationContext4.getServletContext();
        java.lang.String[] strArray6 = annotationConfigServletWebServerApplicationContext4.getBeanDefinitionNames();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes7 = org.mockito.ArgumentMatchers.refEq(endpointMediaTypes3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext8 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext(strArray6);
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNotNull(endpointMediaTypes3);
        org.junit.Assert.assertNull(servletContext5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(endpointMediaTypes7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        org.springframework.http.MediaType mediaType2 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType3 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset4 = mediaType3.getCharset();
        org.springframework.http.MediaType mediaType5 = new org.springframework.http.MediaType(mediaType2, charset4);
        org.springframework.http.MediaType mediaType6 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset4);
        java.nio.charset.Charset charset7 = mediaType6.getCharset();
        org.springframework.http.MediaType mediaType8 = org.springframework.http.MediaType.TEXT_HTML;
        org.springframework.http.MediaType mediaType9 = mediaType6.copyQualityValue(mediaType8);
        org.springframework.http.MediaType mediaType10 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset11 = mediaType10.getCharset();
        org.springframework.http.MediaType mediaType12 = org.springframework.http.MediaType.TEXT_MARKDOWN;
        org.springframework.http.MediaType mediaType13 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType14 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        org.springframework.http.MediaType mediaType15 = org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
        boolean boolean16 = mediaType14.isCompatibleWith(mediaType15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = mediaType14.getParameters();
        org.springframework.http.MediaType mediaType18 = new org.springframework.http.MediaType(mediaType13, strMap17);
        org.springframework.http.MediaType mediaType21 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;
        org.springframework.http.MediaType mediaType22 = org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_UTF8;
        java.nio.charset.Charset charset23 = mediaType22.getCharset();
        org.springframework.http.MediaType mediaType24 = new org.springframework.http.MediaType(mediaType21, charset23);
        org.springframework.http.MediaType mediaType25 = new org.springframework.http.MediaType("session", "applicationEventMulticaster", charset23);
        java.nio.charset.Charset charset26 = mediaType25.getCharset();
        org.springframework.http.MediaType mediaType27 = new org.springframework.http.MediaType(mediaType18, charset26);
        org.springframework.http.MediaType mediaType28 = new org.springframework.http.MediaType(mediaType12, charset26);
        boolean boolean29 = mediaType10.isCompatibleWith(mediaType12);
        org.springframework.http.MediaType mediaType30 = mediaType8.copyQualityValue(mediaType12);
        org.junit.Assert.assertNotNull(mediaType2);
        org.junit.Assert.assertNotNull(mediaType3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(mediaType8);
        org.junit.Assert.assertNotNull(mediaType9);
        org.junit.Assert.assertNotNull(mediaType10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(mediaType12);
        org.junit.Assert.assertNotNull(mediaType13);
        org.junit.Assert.assertNotNull(mediaType14);
        org.junit.Assert.assertNotNull(mediaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(mediaType21);
        org.junit.Assert.assertNotNull(mediaType22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(mediaType30);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        org.springframework.util.MimeType mimeType1 = org.springframework.util.MimeType.valueOf("application/atom+xml");
        org.junit.Assert.assertNotNull(mimeType1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.lang.String[] strArray75 = new java.lang.String[] { "text/event-stream", "text/event-stream", "_links.self.templated", "hi!", "image/gif", "_links.test.templated", "_links.info.href", "Authorization", "Authorization", "application/xhtml+xml", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: application/pdf", "environment", "Access-Control-Allow-Methods", "application/octet-stream", "_links.env.href", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Access-Control-Request-Method", "classpath*:", "text/event-stream", "Access-Control-Allow-Origin", "application/xml", "", "hi!", "application/atom+xml", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: application/pdf", "session", "_links.env", "_links.test-part.href", "hi!", "POST", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: application/pdf", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Access-Control-Request-Method", "_links.info.templated", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.", "application/json", "application/problem+json", "Authorization", "_links.test-part.templated", "signature", "_links.test-part", "application/x-www-form-urlencoded", "servletContext", "application", "application/x-www-form-urlencoded", "_links.test.templated", "_links.env", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env.href", "app-id", "session", "Access-Control-Allow-Origin", "loadTimeWeaver", "Authorization", "systemProperties", "_links.self.templated", "signature", "servletContext", "application/xml", "environment", "application", "systemProperties", "dispatcherServlet", "application/octet-stream", "image/jpeg", "dispatcherServlet", "systemEnvironment", "_links.env.templated", "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: application/pdf", "loadTimeWeaver", "_links.test.templated", "contextParameters", "text/event-stream", "_links.info.templated", "_links.env", "Access-Control-Allow-Methods", "systemEnvironment", "conversionService" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.http.MediaType> mediaTypeList78 = org.springframework.http.MediaType.parseMediaTypes((java.util.List<java.lang.String>) strList76);
            org.junit.Assert.fail("Expected exception of type org.springframework.http.InvalidMediaTypeException; message: Invalid mime type \"_links.self.templated\": does not contain '/'");
        } catch (org.springframework.http.InvalidMediaTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.TestInfoEndpoint();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = testInfoEndpoint0.readAll();
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        org.springframework.context.ApplicationEventPublisher applicationEventPublisher4 = org.mockito.ArgumentMatchers.eq((org.springframework.context.ApplicationEventPublisher) annotationConfigServletWebServerApplicationContext0);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList5 = annotationConfigServletWebServerApplicationContext0.getBeanFactoryPostProcessors();
        java.lang.String str6 = annotationConfigServletWebServerApplicationContext0.toString();
        org.springframework.core.io.Resource[] resourceArray8 = annotationConfigServletWebServerApplicationContext0.getResources("messageSource");
        javax.servlet.ServletContext servletContext9 = annotationConfigServletWebServerApplicationContext0.getServletContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = annotationConfigServletWebServerApplicationContext0.isSingleton("classpath*:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@568099d1 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertNull(applicationEventPublisher4);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList5);
        org.junit.Assert.assertNotNull(resourceArray8);
        org.junit.Assert.assertNull(servletContext9);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        annotationConfigServletWebServerApplicationContext0.setServerNamespace("request");
        org.springframework.beans.factory.BeanFactory beanFactory3 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        boolean boolean4 = annotationConfigServletWebServerApplicationContext0.isActive();
        boolean boolean6 = annotationConfigServletWebServerApplicationContext0.containsLocalBean("_links.env");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigServletWebServerApplicationContext0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6de12cf3, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beanFactory3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext0 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        java.lang.String str1 = annotationConfigServletWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.springframework.web.context.WebApplicationContext:", "_links.env", "application/json", "contextParameters", "application/json", "messageSource" };
        annotationConfigServletWebServerApplicationContext0.scan(strArray8);
        org.springframework.beans.factory.BeanFactory beanFactory10 = annotationConfigServletWebServerApplicationContext0.getParentBeanFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = annotationConfigServletWebServerApplicationContext0.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GenericWebApplicationContext does not support getNamespace()");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(beanFactory10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory1 = cloudFoundryMvcConfiguration0.tomcat();
        org.springframework.boot.web.server.AbstractConfigurableWebServerFactory abstractConfigurableWebServerFactory2 = org.mockito.ArgumentMatchers.same((org.springframework.boot.web.server.AbstractConfigurableWebServerFactory) tomcatServletWebServerFactory1);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext4 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        boolean boolean6 = annotationConfigServletWebServerApplicationContext4.containsBeanDefinition("_links.info.href");
        annotationConfigServletWebServerApplicationContext3.setParent((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext4);
        java.lang.String[] strArray8 = annotationConfigServletWebServerApplicationContext3.getBeanDefinitionNames();
        org.springframework.boot.web.server.AbstractConfigurableWebServerFactory abstractConfigurableWebServerFactory9 = org.mockito.ArgumentMatchers.refEq((org.springframework.boot.web.server.AbstractConfigurableWebServerFactory) tomcatServletWebServerFactory1, strArray8);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory1);
        org.junit.Assert.assertNull(abstractConfigurableWebServerFactory2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(abstractConfigurableWebServerFactory9);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory1 = cloudFoundryMvcConfiguration0.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryMvcConfiguration0.EndpointMediaTypes();
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext3 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext4 = annotationConfigServletWebServerApplicationContext3.getServletContext();
        org.springframework.context.MessageSource messageSource5 = org.mockito.ArgumentMatchers.eq((org.springframework.context.MessageSource) annotationConfigServletWebServerApplicationContext3);
        annotationConfigServletWebServerApplicationContext3.destroy();
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver7 = null;
        annotationConfigServletWebServerApplicationContext3.setScopeMetadataResolver(scopeMetadataResolver7);
        org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext annotationConfigServletWebServerApplicationContext9 = new org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext();
        javax.servlet.ServletContext servletContext10 = annotationConfigServletWebServerApplicationContext9.getServletContext();
        java.lang.ClassLoader classLoader11 = null;
        annotationConfigServletWebServerApplicationContext9.setClassLoader(classLoader11);
        annotationConfigServletWebServerApplicationContext3.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigServletWebServerApplicationContext9);
        java.lang.ClassLoader classLoader14 = annotationConfigServletWebServerApplicationContext3.getClassLoader();
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry15 = org.mockito.ArgumentMatchers.eq((org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigServletWebServerApplicationContext3);
        boolean boolean16 = annotationConfigServletWebServerApplicationContext3.isRunning();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration cloudFoundryMvcConfiguration17 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests.CloudFoundryMvcConfiguration();
        org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory tomcatServletWebServerFactory18 = cloudFoundryMvcConfiguration17.tomcat();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes19 = cloudFoundryMvcConfiguration17.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes20 = cloudFoundryMvcConfiguration17.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer21 = cloudFoundryMvcConfiguration0.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigServletWebServerApplicationContext3, endpointMediaTypes20);
        org.springframework.core.ResolvableType resolvableType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = annotationConfigServletWebServerApplicationContext3.isTypeMatch("conversionService", resolvableType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@4c381c31 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNull(servletContext4);
        org.junit.Assert.assertNull(messageSource5);
        org.junit.Assert.assertNull(servletContext10);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNull(beanDefinitionRegistry15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tomcatServletWebServerFactory18);
        org.junit.Assert.assertNotNull(endpointMediaTypes19);
        org.junit.Assert.assertNotNull(endpointMediaTypes20);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer21);
    }
}
