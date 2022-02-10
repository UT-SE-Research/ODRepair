package org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive;

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
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) '4');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.ENVIRONMENT_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "environment" + "'", str0, "environment");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.springframework.core.io.support.ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classpath*:" + "'", str0, "classpath*:");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.Map<org.mockito.verification.VerificationMode, org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason> verificationModeMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(verificationModeMap0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.mockito.ArgumentMatcher<java.lang.Float> floatArgumentMatcher0 = null;
        float float1 = org.mockito.ArgumentMatchers.floatThat(floatArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', (-1L), 0L, 0L, 1L, "app-id" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, -1, 0, 0, 1, app-id]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, -1, 0, 0, 1, app-id]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.Object[] objArray6 = new java.lang.Object[] { "app-id", '#', (byte) -1, "Access-Control-Allow-Origin", (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber7 = org.mockito.Mockito.doReturn((java.lang.Object) "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.", objArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[app-id, #, -1, Access-Control-Allow-Origin, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[app-id, #, -1, Access-Control-Allow-Origin, -1.0]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.CONVERSION_SERVICE_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "conversionService" + "'", str0, "conversionService");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        char char1 = org.mockito.ArgumentMatchers.eq(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.only();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.mockito.Mockito.verify("_links.test", verificationMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass3 = reactiveWebApplicationContextRunner2.getClass();
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = org.springframework.context.support.AbstractApplicationContext.LIFECYCLE_PROCESSOR_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lifecycleProcessor" + "'", str0, "lifecycleProcessor");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        float float0 = org.mockito.ArgumentMatchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = org.springframework.core.io.ResourceLoader.CLASSPATH_URL_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classpath:" + "'", str0, "classpath:");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder1 = org.mockito.Mockito.inOrder(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String[] strArray1 = new java.lang.String[] { "app-id" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset((java.lang.Comparable<java.lang.String>[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.springframework.core.io.ResourceLoader resourceLoader0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(resourceLoader0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("Access-Control-Request-Method");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.context.annotation.Configurations configurations1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withConfiguration(configurations1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Configurations must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext1 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one base package must be specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(beanDefinitionRegistry0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.beans.factory.config.BeanDefinition beanDefinition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerBeanDefinition("lifecycleProcessor", beanDefinition2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "_links.test-part", "_links.info.templated", "Origin" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = annotationConfigReactiveWebServerApplicationContext0.getBean("_links.env.templated", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@6ba8fc70 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[_links.test-part, _links.info.templated, Origin]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[_links.test-part, _links.info.templated, Origin]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = org.springframework.context.support.AbstractApplicationContext.APPLICATION_EVENT_MULTICASTER_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "applicationEventMulticaster" + "'", str0, "applicationEventMulticaster");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition2 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinition("classpath:");
            org.junit.Assert.fail("Expected exception of type org.springframework.beans.factory.NoSuchBeanDefinitionException; message: No bean named 'classpath:' available");
        } catch (org.springframework.beans.factory.NoSuchBeanDefinitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.EndpointDelegate endpointDelegate0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint testEndpoint1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint(endpointDelegate0);
        // The following exception was thrown during execution in test generation
        try {
            testEndpoint1.write("classpath*:", "Origin");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        byte byte0 = org.mockito.ArgumentMatchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.mockito.stubbing.Answer answer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer(answer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: _links.env.href, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        org.springframework.beans.factory.config.BeanFactoryPostProcessor beanFactoryPostProcessor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.addBeanFactoryPostProcessor(beanFactoryPostProcessor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanFactoryPostProcessor must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("Authorization");
        org.springframework.beans.factory.support.BeanNameGenerator beanNameGenerator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.setBeanNameGenerator(beanNameGenerator3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Singleton object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.springframework.boot.autoconfigure.web.ResourceProperties resourceProperties0 = null;
        org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties webFluxProperties1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext5 = annotationConfigReactiveWebServerApplicationContext2.getParent();
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> handlerMethodArgumentResolverObjectProvider6 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.web.codec.CodecCustomizer> codecCustomizerObjectProvider7 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerObjectProvider8 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.view.ViewResolver> viewResolverObjectProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig webFluxConfig10 = new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig(resourceProperties0, webFluxProperties1, (org.springframework.beans.factory.ListableBeanFactory) annotationConfigReactiveWebServerApplicationContext2, handlerMethodArgumentResolverObjectProvider6, codecCustomizerObjectProvider7, resourceHandlerRegistrationCustomizerObjectProvider8, viewResolverObjectProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) 'a');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.mockito.ArgumentMatcher<java.lang.Character> charArgumentMatcher0 = null;
        char char1 = org.mockito.ArgumentMatchers.charThat(charArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.isSingleton("Access-Control-Allow-Origin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@706c640d has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doThrow(throwableArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory5 = annotationConfigReactiveWebServerApplicationContext0.getAutowireCapableBeanFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.mockito.ArgumentMatcher<java.lang.Double> doubleArgumentMatcher0 = null;
        double double1 = org.mockito.ArgumentMatchers.doubleThat(doubleArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.reactive.context.ReactiveWebApplicationContext reactiveWebApplicationContext3 = org.mockito.Mockito.verify((org.springframework.boot.web.reactive.context.ReactiveWebApplicationContext) annotationConfigReactiveWebServerApplicationContext0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type AnnotationConfigReactiveWebServerApplicationContext and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.mockito.ArgumentMatcher<java.lang.Byte> byteArgumentMatcher0 = null;
        byte byte1 = org.mockito.ArgumentMatchers.byteThat(byteArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM;
        java.lang.String[] strArray4 = new java.lang.String[] { "_links.env.templated", "_links.test", "app-id" };
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.mockito.ArgumentMatchers.refEq(reason0, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(reason5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        double double0 = org.mockito.ArgumentMatchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.only();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.context.annotation.AnnotationConfigRegistry annotationConfigRegistry5 = org.mockito.Mockito.verify((org.springframework.context.annotation.AnnotationConfigRegistry) annotationConfigReactiveWebServerApplicationContext0, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type AnnotationConfigReactiveWebServerApplicationContext and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.SYSTEM_ENVIRONMENT_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemEnvironment" + "'", str0, "systemEnvironment");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        boolean boolean0 = org.mockito.ArgumentMatchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.TOKEN_EXPIRED;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.TOKEN_EXPIRED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.TOKEN_EXPIRED));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader4 = annotationConfigReactiveWebServerApplicationContext3.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext5 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext5.setDisplayName("_links.env.href");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        boolean boolean10 = annotationConfigReactiveWebServerApplicationContext8.containsLocalBean("Authorization");
        org.springframework.context.MessageSource[] messageSourceArray11 = new org.springframework.context.MessageSource[] { annotationConfigReactiveWebServerApplicationContext0, annotationConfigReactiveWebServerApplicationContext3, annotationConfigReactiveWebServerApplicationContext5, annotationConfigReactiveWebServerApplicationContext8 };
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.clearInvocations(messageSourceArray11);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(messageSourceArray11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.verify(objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Answers and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("_links.length()");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_ISSUER;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_ISSUER + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_ISSUER));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.mockito.stubbing.Stubber stubber0 = null; // flaky: org.mockito.Mockito.doCallRealMethod();
// flaky:         org.junit.Assert.assertNotNull(stubber0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.LOAD_TIME_WEAVER_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loadTimeWeaver" + "'", str0, "loadTimeWeaver");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        short short0 = org.mockito.ArgumentMatchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("_links.length()");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = annotationConfigReactiveWebServerApplicationContext0.getType("Access-Control-Allow-Methods");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@2bda834 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.junit.Assert.assertNotNull(lenientStubber0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Set<org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext> annotationConfigReactiveWebServerApplicationContextSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(annotationConfigReactiveWebServerApplicationContextSet0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.self.templated", throwable2);
        java.lang.String str4 = cloudFoundryAuthorizationException3.toString();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.self.templated" + "'", str4, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.self.templated");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.mockito.MockSettings mockSettings0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(mockSettings0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_KEY_ID;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_KEY_ID + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_KEY_ID));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token("GET,POST");
            org.junit.Assert.fail("Expected exception of type org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException; message: JWT must have header, body and signature");
        } catch (org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        org.springframework.core.ResolvableType resolvableType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.ObjectProvider<org.springframework.boot.web.context.ConfigurableWebServerApplicationContext> configurableWebServerApplicationContextObjectProvider5 = annotationConfigReactiveWebServerApplicationContext0.getBeanProvider(resolvableType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@9d53ae2 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties webFluxProperties0 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.WebFluxRegistrations> webFluxRegistrationsObjectProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.EnableWebFluxConfiguration enableWebFluxConfiguration2 = new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.EnableWebFluxConfiguration(webFluxProperties0, webFluxRegistrationsObjectProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token("Access-Control-Request-Method");
            org.junit.Assert.fail("Expected exception of type org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException; message: JWT must have header, body and signature");
        } catch (org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String str0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.springframework.boot.autoconfigure.web.ResourceProperties resourceProperties0 = null;
        org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties webFluxProperties1 = null;
        org.springframework.beans.factory.ListableBeanFactory listableBeanFactory2 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> handlerMethodArgumentResolverObjectProvider3 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.web.codec.CodecCustomizer> codecCustomizerObjectProvider4 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerObjectProvider5 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.view.ViewResolver> viewResolverObjectProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig webFluxConfig7 = new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig(resourceProperties0, webFluxProperties1, listableBeanFactory2, handlerMethodArgumentResolverObjectProvider3, codecCustomizerObjectProvider4, resourceHandlerRegistrationCustomizerObjectProvider5, viewResolverObjectProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.String str7 = cloudFoundryAuthorizationException6.toString();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Authorization" + "'", str7, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Authorization");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner4.withClassLoader(classLoader5);
        java.lang.Class<?> wildcardClass7 = reactiveWebApplicationContextRunner6.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = reactiveWebApplicationContextRunner10.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = reactiveWebApplicationContextRunner14.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = reactiveWebApplicationContextRunner18.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner20 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader21 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner22 = reactiveWebApplicationContextRunner20.withClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = reactiveWebApplicationContextRunner22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass7;
        wildcardClassArray26[1] = wildcardClass11;
        wildcardClassArray26[2] = wildcardClass15;
        wildcardClassArray26[3] = wildcardClass19;
        wildcardClassArray26[4] = wildcardClass23;
        annotationConfigReactiveWebServerApplicationContext0.register(wildcardClassArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder38 = org.mockito.Mockito.inOrder((java.lang.Object[]) wildcardClassArray26);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.regex.Pattern pattern0 = null;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.mockito.ArgumentMatcher<java.lang.Integer> intArgumentMatcher0 = null;
        int int1 = org.mockito.ArgumentMatchers.intThat(intArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(5);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.springframework.boot.autoconfigure.web.ResourceProperties resourceProperties0 = null;
        org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties webFluxProperties1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext5 = annotationConfigReactiveWebServerApplicationContext2.getParent();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext2.getDisplayName();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext2.getServerNamespace();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext2.getServerNamespace();
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> handlerMethodArgumentResolverObjectProvider9 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.web.codec.CodecCustomizer> codecCustomizerObjectProvider10 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerObjectProvider11 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.view.ViewResolver> viewResolverObjectProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig webFluxConfig13 = new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig(resourceProperties0, webFluxProperties1, (org.springframework.beans.factory.ListableBeanFactory) annotationConfigReactiveWebServerApplicationContext2, handlerMethodArgumentResolverObjectProvider9, codecCustomizerObjectProvider10, resourceHandlerRegistrationCustomizerObjectProvider11, viewResolverObjectProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_links.env.href" + "'", str6, "_links.env.href");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext6 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader7 = annotationConfigReactiveWebServerApplicationContext6.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext8.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext11 = annotationConfigReactiveWebServerApplicationContext8.getParent();
        java.lang.String str12 = annotationConfigReactiveWebServerApplicationContext8.getDisplayName();
        java.lang.String str13 = annotationConfigReactiveWebServerApplicationContext8.getServerNamespace();
        java.lang.String[] strArray14 = annotationConfigReactiveWebServerApplicationContext8.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader15 = org.mockito.ArgumentMatchers.refEq(classLoader7, strArray14);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = reactiveWebApplicationContextRunner5.withClassLoader(classLoader15);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner17 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner19 = reactiveWebApplicationContextRunner17.withClassLoader(classLoader18);
        java.lang.ClassLoader classLoader20 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner21 = reactiveWebApplicationContextRunner17.withClassLoader(classLoader20);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext22 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader23 = annotationConfigReactiveWebServerApplicationContext22.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext24 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext24.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext27 = annotationConfigReactiveWebServerApplicationContext24.getParent();
        java.lang.String str28 = annotationConfigReactiveWebServerApplicationContext24.getDisplayName();
        java.lang.String str29 = annotationConfigReactiveWebServerApplicationContext24.getServerNamespace();
        java.lang.String[] strArray30 = annotationConfigReactiveWebServerApplicationContext24.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader31 = org.mockito.ArgumentMatchers.refEq(classLoader23, strArray30);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner32 = reactiveWebApplicationContextRunner21.withClassLoader(classLoader31);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1.0d, 0.0f, classLoader15, reactiveWebApplicationContextRunner21, "GET,POST", 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = annotationConfigReactiveWebServerApplicationContext0.getBean("signature", objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@7bead54b has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNull(applicationContext11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_links.env.href" + "'", str12, "_links.env.href");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner16);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner21);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNull(applicationContext27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_links.env.href" + "'", str28, "_links.env.href");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(classLoader31);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner32);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.BeanFactoryPostProcessor beanFactoryPostProcessor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.addBeanFactoryPostProcessor(beanFactoryPostProcessor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanFactoryPostProcessor must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast(4);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "&" + "'", str0, "&");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(genericDeclarationList0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str0 = org.springframework.context.support.AbstractApplicationContext.MESSAGE_SOURCE_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "messageSource" + "'", str0, "messageSource");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException> cloudFoundryAuthorizationExceptionOngoingStubbing7 = org.mockito.Mockito.when(cloudFoundryAuthorizationException5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_MOCKS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_MOCKS));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner1 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader2 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner3 = reactiveWebApplicationContextRunner1.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = reactiveWebApplicationContextRunner1.withClassLoader(classLoader4);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', classLoader4, "conversionService" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = org.mockito.Mockito.ignoreStubs(objArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Character");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner3);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, null, conversionService]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, null, conversionService]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = annotationConfigReactiveWebServerApplicationContext0.isPrototype("signature");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@4fa04ca8 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        java.lang.Class<?> wildcardClass4 = annotationConfigReactiveWebServerApplicationContext0.getClass();
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.publishEvent((java.lang.Object) "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.self.templated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@533ded5, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.mockito.ArgumentMatcher<java.lang.Long> longArgumentMatcher0 = null;
        long long1 = org.mockito.ArgumentMatchers.longThat(longArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        char char1 = org.mockito.ArgumentMatchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        annotationConfigReactiveWebServerApplicationContext0.setAllowCircularReferences(true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray6 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionNames();
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.Object[] objArray1 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder2 = org.mockito.Mockito.inOrder(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[4]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.calls(5);
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.only();
        java.lang.Object[] objArray4 = new java.lang.Object[] { "server.port=0", 5, verificationMode3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder5 = org.mockito.Mockito.inOrder(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNotNull(verificationMode3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.Iterable<org.springframework.core.AliasRegistry> aliasRegistryIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(aliasRegistryIterable0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        org.springframework.beans.factory.config.BeanFactoryPostProcessor beanFactoryPostProcessor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.addBeanFactoryPostProcessor(beanFactoryPostProcessor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanFactoryPostProcessor must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.Set<org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext> annotationConfigReactiveWebServerApplicationContextSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.Set<org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext>> annotationConfigReactiveWebServerApplicationContextSetOngoingStubbing1 = org.mockito.Mockito.when(annotationConfigReactiveWebServerApplicationContextSet0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray6 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerAlias("", "Access-Control-Allow-Methods");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'name' must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        long long1 = org.mockito.ArgumentMatchers.eq((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.Map<org.mockito.stubbing.BaseStubber, java.lang.reflect.AnnotatedElement> baseStubberMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(baseStubberMap0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigReactiveWebServerApplicationContext0.isPrototype("Access-Control-Allow-Origin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("loadTimeWeaver");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.registerShutdownHook();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_AUDIENCE;
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_AUDIENCE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_AUDIENCE));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.removeAlias("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias 'hi!' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("environment");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM;
        java.lang.String[] strArray4 = new java.lang.String[] { "_links.env.templated", "_links.test", "app-id" };
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.mockito.ArgumentMatchers.refEq(reason0, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(reason5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber3 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) annotationConfigReactiveWebServerApplicationContext0);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(configurableApplicationContext0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader4 = annotationConfigReactiveWebServerApplicationContext3.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = reactiveWebApplicationContextRunner2.withClassLoader(classLoader4);
        java.lang.Class<?>[] wildcardClassArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner7 = reactiveWebApplicationContextRunner2.withUserConfiguration(wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("Authorization");
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: LifecycleProcessor not initialized - call 'refresh' before invoking lifecycle methods via the context: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@39cbca75, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("POST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) annotationConfigReactiveWebServerApplicationContext0);
        org.springframework.context.ApplicationEvent applicationEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.publishEvent(applicationEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Event must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection5 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setAllowCircularReferences(false);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.refresh();
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start reactive web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ReactiveWebApplicationContext due to missing ReactiveWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        int int3 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionCount();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory4 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        org.mockito.verification.VerificationMode verificationMode6 = org.mockito.Mockito.atLeast((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.core.io.DefaultResourceLoader defaultResourceLoader7 = org.mockito.Mockito.verify((org.springframework.core.io.DefaultResourceLoader) annotationConfigReactiveWebServerApplicationContext0, verificationMode6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type AnnotationConfigReactiveWebServerApplicationContext and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory4);
        org.junit.Assert.assertNotNull(verificationMode6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("_links.test.templated");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("applicationEventMulticaster");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner4.withClassLoader(classLoader5);
        java.lang.Class<?> wildcardClass7 = reactiveWebApplicationContextRunner6.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = reactiveWebApplicationContextRunner10.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = reactiveWebApplicationContextRunner14.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = reactiveWebApplicationContextRunner18.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner20 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader21 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner22 = reactiveWebApplicationContextRunner20.withClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = reactiveWebApplicationContextRunner22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass7;
        wildcardClassArray26[1] = wildcardClass11;
        wildcardClassArray26[2] = wildcardClass15;
        wildcardClassArray26[3] = wildcardClass19;
        wildcardClassArray26[4] = wildcardClass23;
        annotationConfigReactiveWebServerApplicationContext0.register(wildcardClassArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) wildcardClassArray26);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.context.ApplicationEvent applicationEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.publishEvent(applicationEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Event must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM;
        java.lang.String[] strArray4 = new java.lang.String[] { "_links.env.templated", "_links.test", "app-id" };
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.mockito.ArgumentMatchers.refEq(reason0, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext6 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext(strArray4);
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start reactive web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ReactiveWebApplicationContext due to missing ReactiveWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.UNSUPPORTED_TOKEN_SIGNING_ALGORITHM));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(reason5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.springframework.core.io.DefaultResourceLoader defaultResourceLoader0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(defaultResourceLoader0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.removeAlias("classpath:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias 'classpath:' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        org.springframework.context.Lifecycle lifecycle10 = org.mockito.ArgumentMatchers.eq((org.springframework.context.Lifecycle) annotationConfigReactiveWebServerApplicationContext0);
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(lifecycle10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        org.springframework.beans.factory.config.BeanDefinition beanDefinition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerBeanDefinition("_links.test-part.href", beanDefinition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.Map<org.springframework.beans.factory.BeanFactory, org.springframework.core.env.PropertyResolver> beanFactoryMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(beanFactoryMap0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        long long0 = org.mockito.ArgumentMatchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(3);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.Throwable[] throwableArray7 = cloudFoundryAuthorizationException5.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber8 = org.mockito.Mockito.doThrow(throwableArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 2);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3: you are stubbing the behaviour of another mock inside before 'thenReturn' instruction if completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        long long3 = annotationConfigReactiveWebServerApplicationContext0.getStartupDate();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection4 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(annotationConfig0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        char char1 = org.mockito.ArgumentMatchers.eq('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.springframework.core.env.Environment environment0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(environment0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        double double1 = org.mockito.ArgumentMatchers.eq(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        double double1 = org.mockito.ArgumentMatchers.eq((double) '\000');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = annotationConfigReactiveWebServerApplicationContext0.getType("_links.length()");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        annotationConfigReactiveWebServerApplicationContext0.registerAlias("conversionService", "bearer");
        org.junit.Assert.assertNotNull(configurableEnvironment1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String[] strArray6 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionNames();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder7 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(testInfoEndpoint0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.never();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader4 = annotationConfigReactiveWebServerApplicationContext3.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = reactiveWebApplicationContextRunner2.withClassLoader(classLoader4);
        java.util.function.Function<org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner, org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner> reactiveWebApplicationContextRunnerFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner7 = reactiveWebApplicationContextRunner2.with(reactiveWebApplicationContextRunnerFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment5 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.springframework.beans.factory.config.BeanDefinition beanDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerBeanDefinition("conversionService", beanDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(configurableEnvironment5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory8 = annotationConfigReactiveWebServerApplicationContext0.getAutowireCapableBeanFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig3 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext0);
        org.springframework.boot.web.server.WebServer webServer4 = annotationConfigReactiveWebServerApplicationContext0.getWebServer();
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.info.templated");
        org.junit.Assert.assertNotNull(configurableListableBeanFactory2);
        org.junit.Assert.assertNull(webServer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.mockito.ArgumentMatcher<java.lang.Short> shortArgumentMatcher0 = null;
        short short1 = org.mockito.ArgumentMatchers.shortThat(shortArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        long long3 = annotationConfigReactiveWebServerApplicationContext0.getStartupDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = annotationConfigReactiveWebServerApplicationContext0.getBean("applicationEventMulticaster");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@5b609510 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.Iterable<org.springframework.core.env.EnvironmentCapable> environmentCapableIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(environmentCapableIterable0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.springframework.core.io.Resource[] resourceArray11 = annotationConfigReactiveWebServerApplicationContext0.getResources("&");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) resourceArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(resourceArray11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.springframework.core.env.EnvironmentCapable environmentCapable0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(environmentCapable0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.ClassLoader classLoader1 = org.mockito.ArgumentMatchers.same(classLoader0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        char char0 = org.mockito.ArgumentMatchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.function.Supplier<org.springframework.boot.web.reactive.context.ConfigurableReactiveWebApplicationContext> configurableReactiveWebApplicationContextSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner1 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner(configurableReactiveWebApplicationContextSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextFactory must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Mockito.spy((java.lang.Comparable<java.lang.String>) "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.String?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner0.withPropertyValues(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String[] strArray5 = new java.lang.String[] { "_links.test-part.href", "invalid-token", "_links.info.href", "", "app-id" };
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext6 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext(strArray5);
            org.junit.Assert.fail("Expected exception of type org.springframework.beans.factory.BeanDefinitionStoreException; message: Failed to read candidate component class: file [/home/anonymous/projects/tools/reseter-finder/exp/_downloads/spring-boot/spring-boot-project/spring-boot-autoconfigure/target/test-classes/org/springframework/boot/autoconfigure/condition/ConditionalOnPropertyTests$NameAndValueAttribute.class]; nested exception is java.lang.IllegalStateException: Error processing condition on org.springframework.boot.autoconfigure.condition.ConditionalOnPropertyTests$NameAndValueAttribute");
        } catch (org.springframework.beans.factory.BeanDefinitionStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.removeAlias("_links.test.templated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias '_links.test.templated' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.List<org.springframework.core.env.Environment> environmentList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(environmentList0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.core.ResolvableType resolvableType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isTypeMatch("Authorization", resolvableType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@5aaab0ae has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext4 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader5 = annotationConfigReactiveWebServerApplicationContext4.getClassLoader();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext4.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList7 = annotationConfigReactiveWebServerApplicationContext4.getBeanFactoryPostProcessors();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext4.isRunning();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment9 = annotationConfigReactiveWebServerApplicationContext4.getEnvironment();
        annotationConfigReactiveWebServerApplicationContext0.setEnvironment(configurableEnvironment9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(configurableEnvironment9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext11 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader12 = annotationConfigReactiveWebServerApplicationContext11.getClassLoader();
        java.lang.String str13 = annotationConfigReactiveWebServerApplicationContext11.getDisplayName();
        java.lang.String str14 = annotationConfigReactiveWebServerApplicationContext11.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner15 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader16 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner17 = reactiveWebApplicationContextRunner15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass18 = reactiveWebApplicationContextRunner17.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner19 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader20 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner21 = reactiveWebApplicationContextRunner19.withClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = reactiveWebApplicationContextRunner21.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner23 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader24 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner25 = reactiveWebApplicationContextRunner23.withClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = reactiveWebApplicationContextRunner25.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner27 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader28 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner29 = reactiveWebApplicationContextRunner27.withClassLoader(classLoader28);
        java.lang.Class<?> wildcardClass30 = reactiveWebApplicationContextRunner29.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner31 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader32 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner33 = reactiveWebApplicationContextRunner31.withClassLoader(classLoader32);
        java.lang.Class<?> wildcardClass34 = reactiveWebApplicationContextRunner33.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass18;
        wildcardClassArray37[1] = wildcardClass22;
        wildcardClassArray37[2] = wildcardClass26;
        wildcardClassArray37[3] = wildcardClass30;
        wildcardClassArray37[4] = wildcardClass34;
        annotationConfigReactiveWebServerApplicationContext11.register(wildcardClassArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = annotationConfigReactiveWebServerApplicationContext0.getBean("_links.env", (java.lang.Object[]) wildcardClassArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment4 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.springframework.beans.factory.config.BeanDefinition beanDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerBeanDefinition("_links.self.templated", beanDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(configurableEnvironment4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        annotationConfigReactiveWebServerApplicationContext0.setServerNamespace("_links.test.href");
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar> beanPostProcessorsRegistrarOngoingStubbing1 = null; // flaky: org.mockito.Mockito.when(beanPostProcessorsRegistrar0);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be 'a method call on a mock'.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because:?1. you stub either of: final/private/equals()/hashCode() methods.?   Those methods *cannot* be stubbed/verified.?   Mocking methods declared on non-public parent classes is not supported.?2. inside when() you don't call method on mock but on some other object.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        int int3 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionCount();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory4 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.removeBeanDefinition("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'beanName' must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.SYSTEM_PROPERTIES_BEAN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemProperties" + "'", str0, "systemProperties");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.Throwable[] throwableArray7 = cloudFoundryAuthorizationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = cloudFoundryAuthorizationException5.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder9 = org.mockito.Mockito.inOrder((java.lang.Object[]) throwableArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext9 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext9.setAllowBeanDefinitionOverriding(true);
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext9.isRunning();
        annotationConfigReactiveWebServerApplicationContext9.clearResourceCaches();
        annotationConfigReactiveWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigReactiveWebServerApplicationContext9);
        boolean boolean16 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("_links.info.href");
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEEP_STUBS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(defaultListableBeanFactory0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("&");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory5 = annotationConfigReactiveWebServerApplicationContext0.getDefaultListableBeanFactory();
        org.mockito.verification.VerificationMode verificationMode7 = org.mockito.Mockito.times((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.support.DefaultSingletonBeanRegistry defaultSingletonBeanRegistry8 = org.mockito.Mockito.verify((org.springframework.beans.factory.support.DefaultSingletonBeanRegistry) defaultListableBeanFactory5, verificationMode7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultListableBeanFactory and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(defaultListableBeanFactory5);
        org.junit.Assert.assertNotNull(verificationMode7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader7 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = reactiveWebApplicationContextRunner6.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner6.withClassLoader(classLoader9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = reactiveWebApplicationContextRunner6.withPropertyValues(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = annotationConfigReactiveWebServerApplicationContext0.getBean("_links.test-part.href", (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner8);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.removeAlias("server.port=0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No alias 'server.port=0' registered");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.self.templated", throwable2);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason4 = cloudFoundryAuthorizationException3.getReason();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable7 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException8 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.self.templated", throwable7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason9 = cloudFoundryAuthorizationException8.getReason();
        cloudFoundryAuthorizationException3.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException8);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason11 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason13 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable15 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException16 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason13, "_links.self.templated", throwable15);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException17 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason11, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException16);
        java.lang.Throwable[] throwableArray18 = cloudFoundryAuthorizationException16.getSuppressed();
        cloudFoundryAuthorizationException8.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException16);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason4 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason4.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason9 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason9.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason11 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason11.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason13 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason13.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        int int0 = org.mockito.ArgumentMatchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.springframework.core.ResolvableType resolvableType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = annotationConfigReactiveWebServerApplicationContext0.getBeanNamesForType(resolvableType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@1c9c3e2f has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str9 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_links.env.href" + "'", str8, "_links.env.href");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.EndpointDelegate endpointDelegate1 = cloudFoundryReactiveConfiguration0.endpointDelegate();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.core.io.ProtocolResolver protocolResolver6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.addProtocolResolver(protocolResolver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_links.env.href, started on Wed Dec 31 18:00:00 CST 1969" + "'", str5, "_links.env.href, started on Wed Dec 31 18:00:00 CST 1969");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.junit.Assert.assertNotNull(mockitoFramework0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.springframework.core.Ordered ordered0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(ordered0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext9 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext9.setAllowBeanDefinitionOverriding(true);
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext9.isRunning();
        annotationConfigReactiveWebServerApplicationContext9.clearResourceCaches();
        annotationConfigReactiveWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigReactiveWebServerApplicationContext9);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext15 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str16 = annotationConfigReactiveWebServerApplicationContext15.toString();
        boolean boolean17 = annotationConfigReactiveWebServerApplicationContext15.isRunning();
        annotationConfigReactiveWebServerApplicationContext15.registerShutdownHook();
        annotationConfigReactiveWebServerApplicationContext9.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigReactiveWebServerApplicationContext15);
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment4 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = annotationConfigReactiveWebServerApplicationContext0.isSingleton("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@692ee437 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(configurableEnvironment4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        org.springframework.beans.factory.config.BeanDefinition beanDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerBeanDefinition("_links.test.templated", beanDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.refresh();
            org.junit.Assert.fail("Expected exception of type org.springframework.context.ApplicationContextException; message: Unable to start reactive web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ReactiveWebApplicationContext due to missing ReactiveWebServerFactory bean.");
        } catch (org.springframework.context.ApplicationContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.self.templated", throwable2);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason4 = cloudFoundryAuthorizationException3.getReason();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable7 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException8 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.self.templated", throwable7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason9 = cloudFoundryAuthorizationException8.getReason();
        cloudFoundryAuthorizationException3.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException8);
        org.springframework.http.HttpStatus httpStatus11 = cloudFoundryAuthorizationException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason4 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason4.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason9 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason9.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + httpStatus11 + "' != '" + org.springframework.http.HttpStatus.UNAUTHORIZED + "'", httpStatus11.equals(org.springframework.http.HttpStatus.UNAUTHORIZED));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.core.ResolvableType resolvableType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = annotationConfigReactiveWebServerApplicationContext0.getBeanNamesForType(resolvableType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@41181b30 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.springframework.core.io.Resource[] resourceArray11 = annotationConfigReactiveWebServerApplicationContext0.getResources("&");
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection12 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(resourceArray11);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.http.HttpStatus httpStatus3 = cloudFoundryAuthorizationException2.getStatusCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor1 = null; // flaky: cloudFoundryReactiveConfiguration0.interceptor();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.EndpointDelegate endpointDelegate2 = cloudFoundryReactiveConfiguration0.endpointDelegate();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext9 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext9.setAllowBeanDefinitionOverriding(true);
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext9.isRunning();
        annotationConfigReactiveWebServerApplicationContext9.clearResourceCaches();
        annotationConfigReactiveWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigReactiveWebServerApplicationContext9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = annotationConfigReactiveWebServerApplicationContext0.getBean("_links.length()");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.core.io.Resource resource7 = annotationConfigReactiveWebServerApplicationContext0.getResource("_links.test.href");
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(resource7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("applicationEventMulticaster");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        org.springframework.http.HttpStatus httpStatus1 = reason0.getStatus();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + httpStatus1 + "' != '" + org.springframework.http.HttpStatus.UNAUTHORIZED + "'", httpStatus1.equals(org.springframework.http.HttpStatus.UNAUTHORIZED));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext11 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext11.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext14 = annotationConfigReactiveWebServerApplicationContext11.getParent();
        java.lang.String str15 = annotationConfigReactiveWebServerApplicationContext11.getDisplayName();
        java.lang.String str16 = annotationConfigReactiveWebServerApplicationContext11.getServerNamespace();
        java.lang.String str17 = annotationConfigReactiveWebServerApplicationContext11.getServerNamespace();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment18 = annotationConfigReactiveWebServerApplicationContext11.getEnvironment();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner19 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader20 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner21 = reactiveWebApplicationContextRunner19.withClassLoader(classLoader20);
        java.lang.ClassLoader classLoader22 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner23 = reactiveWebApplicationContextRunner19.withClassLoader(classLoader22);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner25 = reactiveWebApplicationContextRunner19.withPropertyValues(strArray24);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner26 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext27 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader28 = annotationConfigReactiveWebServerApplicationContext27.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext29 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext29.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext32 = annotationConfigReactiveWebServerApplicationContext29.getParent();
        java.lang.String str33 = annotationConfigReactiveWebServerApplicationContext29.getDisplayName();
        java.lang.String str34 = annotationConfigReactiveWebServerApplicationContext29.getServerNamespace();
        java.lang.String[] strArray35 = annotationConfigReactiveWebServerApplicationContext29.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader36 = org.mockito.ArgumentMatchers.refEq(classLoader28, strArray35);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner37 = reactiveWebApplicationContextRunner26.withClassLoader(classLoader36);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext38 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext38.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext41 = annotationConfigReactiveWebServerApplicationContext38.getParent();
        java.lang.String str42 = annotationConfigReactiveWebServerApplicationContext38.getDisplayName();
        java.lang.String str43 = annotationConfigReactiveWebServerApplicationContext38.getServerNamespace();
        java.lang.String[] strArray44 = annotationConfigReactiveWebServerApplicationContext38.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner45 = reactiveWebApplicationContextRunner37.withPropertyValues(strArray44);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner46 = reactiveWebApplicationContextRunner25.withSystemProperties(strArray44);
        org.springframework.core.env.PropertyResolver propertyResolver47 = org.mockito.ArgumentMatchers.refEq((org.springframework.core.env.PropertyResolver) configurableEnvironment18, strArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = annotationConfigReactiveWebServerApplicationContext0.getBean("", (java.lang.Object[]) strArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNull(applicationContext14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_links.env.href" + "'", str15, "_links.env.href");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(configurableEnvironment18);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner21);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner25);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNull(applicationContext32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_links.env.href" + "'", str33, "_links.env.href");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNull(classLoader36);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner37);
        org.junit.Assert.assertNull(applicationContext41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "_links.env.href" + "'", str42, "_links.env.href");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner45);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner46);
        org.junit.Assert.assertNull(propertyResolver47);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext3.setAllowBeanDefinitionOverriding(true);
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext3.isRunning();
        annotationConfigReactiveWebServerApplicationContext3.destroy();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = reactiveWebApplicationContextRunner0.withParent((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext3);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner9 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader10 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner11 = reactiveWebApplicationContextRunner9.withClassLoader(classLoader10);
        java.lang.Class<?> wildcardClass12 = reactiveWebApplicationContextRunner11.getClass();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext13 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext13.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext16 = annotationConfigReactiveWebServerApplicationContext13.getParent();
        java.lang.String str17 = annotationConfigReactiveWebServerApplicationContext13.getDisplayName();
        java.lang.String str18 = annotationConfigReactiveWebServerApplicationContext13.getServerNamespace();
        java.lang.String[] strArray19 = annotationConfigReactiveWebServerApplicationContext13.getBeanDefinitionNames();
        java.lang.Class<?> wildcardClass20 = strArray19.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass12;
        wildcardClassArray23[1] = wildcardClass20;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner28 = reactiveWebApplicationContextRunner8.withUserConfiguration(wildcardClassArray23);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner8);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(applicationContext16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_links.env.href" + "'", str17, "_links.env.href");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner28);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.EndpointDelegate endpointDelegate0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint testEndpoint1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint(endpointDelegate0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = testEndpoint1.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = testEndpoint1.readPart("_links.test");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Class<?> wildcardClass1 = objAnswer0.getClass();
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.env");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason3 = cloudFoundryAuthorizationException2.getReason();
        org.junit.Assert.assertNull(reason3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.containsBeanDefinition("_links.length()");
        annotationConfigReactiveWebServerApplicationContext0.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = annotationConfigReactiveWebServerApplicationContext0.getBean("systemEnvironment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: _links.env.href has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection6 = annotationConfigReactiveWebServerApplicationContext0.getProtocolResolvers();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(protocolResolverCollection6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig3 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext0);
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList4 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        org.junit.Assert.assertNotNull(configurableListableBeanFactory2);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext7 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment8 = annotationConfigReactiveWebServerApplicationContext7.getEnvironment();
        annotationConfigReactiveWebServerApplicationContext0.setEnvironment(configurableEnvironment8);
        annotationConfigReactiveWebServerApplicationContext0.setServerNamespace("_links.test");
        org.junit.Assert.assertNotNull(configurableEnvironment8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        boolean boolean5 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token("_links.test-part");
            org.junit.Assert.fail("Expected exception of type org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException; message: JWT must have header, body and signature");
        } catch (org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner4.withClassLoader(classLoader5);
        java.lang.Class<?> wildcardClass7 = reactiveWebApplicationContextRunner6.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = reactiveWebApplicationContextRunner10.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = reactiveWebApplicationContextRunner14.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = reactiveWebApplicationContextRunner18.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner20 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader21 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner22 = reactiveWebApplicationContextRunner20.withClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = reactiveWebApplicationContextRunner22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass7;
        wildcardClassArray26[1] = wildcardClass11;
        wildcardClassArray26[2] = wildcardClass15;
        wildcardClassArray26[3] = wildcardClass19;
        wildcardClassArray26[4] = wildcardClass23;
        annotationConfigReactiveWebServerApplicationContext0.register(wildcardClassArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) wildcardClassArray26);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        boolean boolean10 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("_links.env");
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_links.env.href" + "'", str8, "_links.env.href");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException3 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "_links.self.templated", throwable2);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason4 = cloudFoundryAuthorizationException3.getReason();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason5 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable7 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException8 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason5, "_links.self.templated", throwable7);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason9 = cloudFoundryAuthorizationException8.getReason();
        cloudFoundryAuthorizationException3.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException8);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason11 = cloudFoundryAuthorizationException8.getReason();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason4 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason4.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason5 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason5.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason9 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason9.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason11 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason11.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor1 = null; // flaky: cloudFoundryReactiveConfiguration0.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryReactiveConfiguration0.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer3 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor5 = cloudFoundryReactiveConfiguration4.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes6 = cloudFoundryReactiveConfiguration4.EndpointMediaTypes();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointHandlerMapping cloudFoundryWebFluxEndpointHandlerMapping8 = cloudFoundryReactiveConfiguration0.cloudFoundryWebEndpointServletHandlerMapping(webEndpointDiscoverer3, endpointMediaTypes6, cloudFoundrySecurityInterceptor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor5);
        org.junit.Assert.assertNotNull(endpointMediaTypes6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner0.withPropertyValues(strArray5);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner7 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader9 = annotationConfigReactiveWebServerApplicationContext8.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext10 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext10.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext13 = annotationConfigReactiveWebServerApplicationContext10.getParent();
        java.lang.String str14 = annotationConfigReactiveWebServerApplicationContext10.getDisplayName();
        java.lang.String str15 = annotationConfigReactiveWebServerApplicationContext10.getServerNamespace();
        java.lang.String[] strArray16 = annotationConfigReactiveWebServerApplicationContext10.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader17 = org.mockito.ArgumentMatchers.refEq(classLoader9, strArray16);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner7.withClassLoader(classLoader17);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext19 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext19.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext22 = annotationConfigReactiveWebServerApplicationContext19.getParent();
        java.lang.String str23 = annotationConfigReactiveWebServerApplicationContext19.getDisplayName();
        java.lang.String str24 = annotationConfigReactiveWebServerApplicationContext19.getServerNamespace();
        java.lang.String[] strArray25 = annotationConfigReactiveWebServerApplicationContext19.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner26 = reactiveWebApplicationContextRunner18.withPropertyValues(strArray25);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner27 = reactiveWebApplicationContextRunner6.withSystemProperties(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(applicationContext13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_links.env.href" + "'", str14, "_links.env.href");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNull(applicationContext22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_links.env.href" + "'", str23, "_links.env.href");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner26);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.EndpointDelegate endpointDelegate0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint testEndpoint1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint(endpointDelegate0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = testEndpoint1.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = testEndpoint1.readPart("classpath*:");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = testEndpoint1.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = testEndpoint1.readPart("Origin");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = testEndpoint1.readAll();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isActive();
        org.junit.Assert.assertNotNull(configurableListableBeanFactory2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig3 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext0);
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig4 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext0);
        org.springframework.context.ApplicationContext applicationContext5 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        org.junit.Assert.assertNotNull(configurableListableBeanFactory2);
        org.junit.Assert.assertNull(applicationContext5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.env");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "applicationEventMulticaster", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        java.lang.String str6 = cloudFoundryAuthorizationException4.toString();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env" + "'", str6, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.env");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_TOKEN;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException2 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "conversionService");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason3 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable5 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason3, "_links.self.templated", throwable5);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason7 = cloudFoundryAuthorizationException6.getReason();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason8 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable10 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException11 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason8, "_links.self.templated", throwable10);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason12 = cloudFoundryAuthorizationException11.getReason();
        cloudFoundryAuthorizationException6.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException11);
        cloudFoundryAuthorizationException2.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException11);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_TOKEN + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_TOKEN));
        org.junit.Assert.assertTrue("'" + reason3 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason3.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason7 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason7.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason8 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason8.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason12 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason12.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) '#');
        org.mockito.stubbing.Stubber stubber2 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode1);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.springframework.core.io.Resource[] resourceArray11 = annotationConfigReactiveWebServerApplicationContext0.getResources("&");
        java.lang.String[] strArray12 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionNames();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(resourceArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.springframework.core.io.Resource[] resourceArray11 = annotationConfigReactiveWebServerApplicationContext0.getResources("&");
        annotationConfigReactiveWebServerApplicationContext0.close();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(resourceArray11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration reactiveWebServerFactoryAutoConfiguration0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration();
        org.springframework.boot.autoconfigure.web.ServerProperties serverProperties1 = null;
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryCustomizer reactiveWebServerFactoryCustomizer2 = reactiveWebServerFactoryAutoConfiguration0.reactiveWebServerFactoryCustomizer(serverProperties1);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atLeast((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.core.Ordered ordered5 = org.mockito.Mockito.verify((org.springframework.core.Ordered) reactiveWebServerFactoryCustomizer2, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ReactiveWebServerFactoryCustomizer and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebServerFactoryCustomizer2);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext1 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader2 = annotationConfigReactiveWebServerApplicationContext1.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext3.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext6 = annotationConfigReactiveWebServerApplicationContext3.getParent();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext3.getDisplayName();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext3.getServerNamespace();
        java.lang.String[] strArray9 = annotationConfigReactiveWebServerApplicationContext3.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader10 = org.mockito.ArgumentMatchers.refEq(classLoader2, strArray9);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner11 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader10);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext12 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        boolean boolean14 = annotationConfigReactiveWebServerApplicationContext12.containsLocalBean("Authorization");
        java.lang.String[] strArray16 = annotationConfigReactiveWebServerApplicationContext12.getAliases("_links.env");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner17 = reactiveWebApplicationContextRunner0.withPropertyValues(strArray16);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext19 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader20 = annotationConfigReactiveWebServerApplicationContext19.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext21 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext21.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext24 = annotationConfigReactiveWebServerApplicationContext21.getParent();
        java.lang.String str25 = annotationConfigReactiveWebServerApplicationContext21.getDisplayName();
        java.lang.String str26 = annotationConfigReactiveWebServerApplicationContext21.getServerNamespace();
        java.lang.String[] strArray27 = annotationConfigReactiveWebServerApplicationContext21.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader28 = org.mockito.ArgumentMatchers.refEq(classLoader20, strArray27);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner29 = reactiveWebApplicationContextRunner18.withClassLoader(classLoader28);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext30 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext30.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext33 = annotationConfigReactiveWebServerApplicationContext30.getParent();
        java.lang.String str34 = annotationConfigReactiveWebServerApplicationContext30.getDisplayName();
        java.lang.String str35 = annotationConfigReactiveWebServerApplicationContext30.getServerNamespace();
        java.lang.String[] strArray36 = annotationConfigReactiveWebServerApplicationContext30.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner37 = reactiveWebApplicationContextRunner29.withPropertyValues(strArray36);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner38 = reactiveWebApplicationContextRunner17.withPropertyValues(strArray36);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNull(applicationContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_links.env.href" + "'", str7, "_links.env.href");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner17);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNull(applicationContext24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_links.env.href" + "'", str25, "_links.env.href");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner29);
        org.junit.Assert.assertNull(applicationContext33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_links.env.href" + "'", str34, "_links.env.href");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner37);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner38);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        int int3 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionCount();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory4 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        org.springframework.core.ResolvableType resolvableType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigReactiveWebServerApplicationContext0.isTypeMatch("_links.test.href", resolvableType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@1fba945a has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("Authorization");
        java.lang.String[] strArray4 = annotationConfigReactiveWebServerApplicationContext0.getAliases("_links.env");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext0.isAlias("_links.test.templated");
        org.springframework.context.annotation.ScopeMetadataResolver scopeMetadataResolver7 = null;
        annotationConfigReactiveWebServerApplicationContext0.setScopeMetadataResolver(scopeMetadataResolver7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory5 = annotationConfigReactiveWebServerApplicationContext0.getDefaultListableBeanFactory();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.support.AbstractBeanFactory abstractBeanFactory6 = org.mockito.Mockito.spy((org.springframework.beans.factory.support.AbstractBeanFactory) defaultListableBeanFactory5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(defaultListableBeanFactory5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint testEndpoint0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(testEndpoint0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        int int1 = org.mockito.ArgumentMatchers.eq(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader3);
        org.springframework.boot.context.annotation.Configurations configurations5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner0.withConfiguration(configurations5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Configurations must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 6);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.Class<?>[] wildcardClassArray0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(wildcardClassArray0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("_links.env.templated");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext2.containsBeanDefinition("_links.length()");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata1, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext2);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader9 = annotationConfigReactiveWebServerApplicationContext8.getClassLoader();
        java.lang.String str10 = annotationConfigReactiveWebServerApplicationContext8.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList11 = annotationConfigReactiveWebServerApplicationContext8.getBeanFactoryPostProcessors();
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext8.isRunning();
        beanPostProcessorsRegistrar0.setBeanFactory((org.springframework.beans.factory.BeanFactory) annotationConfigReactiveWebServerApplicationContext8);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext14 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext14.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext17 = annotationConfigReactiveWebServerApplicationContext14.getParent();
        java.lang.String str18 = annotationConfigReactiveWebServerApplicationContext14.getDisplayName();
        java.lang.String str19 = annotationConfigReactiveWebServerApplicationContext14.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory20 = annotationConfigReactiveWebServerApplicationContext14.getBeanFactory();
        java.lang.String str21 = annotationConfigReactiveWebServerApplicationContext14.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray23 = annotationConfigReactiveWebServerApplicationContext14.getResources("Origin");
        beanPostProcessorsRegistrar0.setBeanFactory((org.springframework.beans.factory.BeanFactory) annotationConfigReactiveWebServerApplicationContext14);
        org.springframework.core.type.AnnotationMetadata annotationMetadata25 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext26 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext26.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext26.setId("signature");
        boolean boolean32 = annotationConfigReactiveWebServerApplicationContext26.containsBeanDefinition("loadTimeWeaver");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata25, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(applicationContext17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_links.env.href" + "'", str18, "_links.env.href");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(resourceArray23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) annotationConfigReactiveWebServerApplicationContext0);
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNotNull(mockingDetails2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext0.isAlias("app-id");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.mockito.Mockito.verify((java.lang.CharSequence) "&");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = annotationConfigReactiveWebServerApplicationContext0.getBean("_links.info.href");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@67b3c9fa has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment4 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        org.springframework.core.io.ProtocolResolver protocolResolver5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.addProtocolResolver(protocolResolver5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(configurableEnvironment4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext2.containsBeanDefinition("_links.length()");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata1, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext2);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay9 = org.mockito.Mockito.after((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.context.annotation.ImportBeanDefinitionRegistrar importBeanDefinitionRegistrar10 = org.mockito.Mockito.verify((org.springframework.context.annotation.ImportBeanDefinitionRegistrar) beanPostProcessorsRegistrar0, (org.mockito.verification.VerificationMode) verificationAfterDelay9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type BeanPostProcessorsRegistrar and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(verificationAfterDelay9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner4.withClassLoader(classLoader5);
        java.lang.Class<?> wildcardClass7 = reactiveWebApplicationContextRunner6.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = reactiveWebApplicationContextRunner10.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = reactiveWebApplicationContextRunner14.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = reactiveWebApplicationContextRunner18.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner20 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader21 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner22 = reactiveWebApplicationContextRunner20.withClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = reactiveWebApplicationContextRunner22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass7;
        wildcardClassArray26[1] = wildcardClass11;
        wildcardClassArray26[2] = wildcardClass15;
        wildcardClassArray26[3] = wildcardClass19;
        wildcardClassArray26[4] = wildcardClass23;
        annotationConfigReactiveWebServerApplicationContext0.register(wildcardClassArray26);
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Authorization");
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.springframework.boot.web.context.ConfigurableWebServerApplicationContext configurableWebServerApplicationContext0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(configurableWebServerApplicationContext0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("Access-Control-Allow-Methods");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.Throwable[] throwableArray7 = cloudFoundryAuthorizationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = cloudFoundryAuthorizationException5.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber9 = org.mockito.Mockito.doThrow(throwableArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.verification.VerificationMode> verificationModeOngoingStubbing2 = null; // flaky: org.mockito.Mockito.when(verificationMode1);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3: you are stubbing the behaviour of another mock inside before 'thenReturn' instruction if completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (byte) 10);
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.ArgumentMatchers.same(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNull(verificationWithTimeout2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext4 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader5 = annotationConfigReactiveWebServerApplicationContext4.getClassLoader();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext4.getDisplayName();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext4.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = reactiveWebApplicationContextRunner10.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = reactiveWebApplicationContextRunner14.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = reactiveWebApplicationContextRunner18.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner20 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader21 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner22 = reactiveWebApplicationContextRunner20.withClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = reactiveWebApplicationContextRunner22.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner24 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader25 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner26 = reactiveWebApplicationContextRunner24.withClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = reactiveWebApplicationContextRunner26.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass11;
        wildcardClassArray30[1] = wildcardClass15;
        wildcardClassArray30[2] = wildcardClass19;
        wildcardClassArray30[3] = wildcardClass23;
        wildcardClassArray30[4] = wildcardClass27;
        annotationConfigReactiveWebServerApplicationContext4.register(wildcardClassArray30);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.publishEvent((java.lang.Object) wildcardClassArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: _links.env.href, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.registerShutdownHook();
        annotationConfigReactiveWebServerApplicationContext0.setAllowCircularReferences(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = annotationConfigReactiveWebServerApplicationContext0.isSingleton("environment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@3ca6b6ea has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("Access-Control-Allow-Origin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection4 = annotationConfigReactiveWebServerApplicationContext0.getProtocolResolvers();
        org.springframework.beans.factory.config.BeanDefinition beanDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.registerBeanDefinition("_links.info.href", beanDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: BeanDefinition must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(protocolResolverCollection4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader4 = annotationConfigReactiveWebServerApplicationContext3.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = reactiveWebApplicationContextRunner2.withClassLoader(classLoader4);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = org.mockito.Mockito.spy(reactiveWebApplicationContextRunner5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection3 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection4 = annotationConfigReactiveWebServerApplicationContext0.getProtocolResolvers();
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection3);
        org.junit.Assert.assertNotNull(protocolResolverCollection4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext2.containsBeanDefinition("_links.length()");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata1, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext2);
        annotationConfigReactiveWebServerApplicationContext2.registerShutdownHook();
        java.lang.String str9 = annotationConfigReactiveWebServerApplicationContext2.getApplicationName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.containsLocalBean("_links.env.href");
        boolean boolean5 = annotationConfigReactiveWebServerApplicationContext0.containsBeanDefinition("_links.self.href");
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext9 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext9.setAllowBeanDefinitionOverriding(true);
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext9.isRunning();
        annotationConfigReactiveWebServerApplicationContext9.clearResourceCaches();
        annotationConfigReactiveWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigReactiveWebServerApplicationContext9);
        org.springframework.beans.factory.BeanFactory beanFactory15 = annotationConfigReactiveWebServerApplicationContext9.getParentBeanFactory();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(beanFactory15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestInfoEndpoint();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = testInfoEndpoint0.readAll();
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory5 = annotationConfigReactiveWebServerApplicationContext0.getDefaultListableBeanFactory();
        org.springframework.core.io.ProtocolResolver protocolResolver6 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.addProtocolResolver(protocolResolver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(defaultListableBeanFactory5);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(4);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.mockito.ArgumentMatcher<java.lang.Boolean> booleanArgumentMatcher0 = null;
        boolean boolean1 = org.mockito.ArgumentMatchers.booleanThat(booleanArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token token1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.Token("app-id");
            org.junit.Assert.fail("Expected exception of type org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException; message: JWT must have header, body and signature");
        } catch (org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig3 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext0);
        annotationConfigReactiveWebServerApplicationContext0.setAllowCircularReferences(false);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory2);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException6 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException5);
        java.lang.Throwable[] throwableArray7 = cloudFoundryAuthorizationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = cloudFoundryAuthorizationException5.getSuppressed();
        java.lang.Object[] objArray9 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) throwableArray8);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) reason0);
        org.springframework.http.HttpStatus httpStatus2 = reason0.getStatus();
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertTrue("'" + httpStatus2 + "' != '" + org.springframework.http.HttpStatus.UNAUTHORIZED + "'", httpStatus2.equals(org.springframework.http.HttpStatus.UNAUTHORIZED));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setAllowCircularReferences(false);
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(beanFactoryPostProcessorList0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.util.Collection<org.springframework.beans.factory.Aware> awareCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(awareCollection0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext2.containsBeanDefinition("_links.length()");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata1, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext2);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader9 = annotationConfigReactiveWebServerApplicationContext8.getClassLoader();
        java.lang.String str10 = annotationConfigReactiveWebServerApplicationContext8.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList11 = annotationConfigReactiveWebServerApplicationContext8.getBeanFactoryPostProcessors();
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext8.isRunning();
        beanPostProcessorsRegistrar0.setBeanFactory((org.springframework.beans.factory.BeanFactory) annotationConfigReactiveWebServerApplicationContext8);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner15 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader16 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner17 = reactiveWebApplicationContextRunner15.withClassLoader(classLoader16);
        java.lang.ClassLoader classLoader18 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner19 = reactiveWebApplicationContextRunner15.withClassLoader(classLoader18);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner21 = reactiveWebApplicationContextRunner15.withPropertyValues(strArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = annotationConfigReactiveWebServerApplicationContext8.getBean("POST", (java.lang.Object[]) strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@7700d76b has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner17);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner21);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor1 = null; // flaky: cloudFoundryReactiveConfiguration0.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryReactiveConfiguration0.EndpointMediaTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration3 = org.mockito.Mockito.verify(cloudFoundryReactiveConfiguration0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type CloudFoundryReactiveConfiguration and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        int int3 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionCount();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory4 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        long long5 = annotationConfigReactiveWebServerApplicationContext0.getStartupDate();
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition6 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinition("lifecycleProcessor");
            org.junit.Assert.fail("Expected exception of type org.springframework.beans.factory.NoSuchBeanDefinitionException; message: No bean named 'lifecycleProcessor' available");
        } catch (org.springframework.beans.factory.NoSuchBeanDefinitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint testEndpoint0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(testEndpoint0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint1 = testEndpointConfiguration0.testEnvEndpoint();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint2 = testEndpointConfiguration0.testInfoEnvEndpoint();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestInfoEndpoint testInfoEndpoint3 = testEndpointConfiguration0.testInfoEnvEndpoint();
        org.junit.Assert.assertNotNull(testEnvEndpoint1);
        org.junit.Assert.assertNotNull(testInfoEndpoint2);
        org.junit.Assert.assertNotNull(testInfoEndpoint3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.springframework.core.env.Environment environment0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(environment0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable4 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.self.templated", throwable4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason6 = cloudFoundryAuthorizationException5.getReason();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason7 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason9 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable11 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException12 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason9, "_links.self.templated", throwable11);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException13 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason7, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException12);
        cloudFoundryAuthorizationException5.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException13);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException15 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "hi!", (java.lang.Throwable) cloudFoundryAuthorizationException13);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE));
        org.junit.Assert.assertTrue("'" + reason2 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason2.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason6 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason6.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason7 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason7.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason9 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason9.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment4 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(configurableEnvironment4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.springframework.boot.autoconfigure.web.ResourceProperties resourceProperties0 = null;
        org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties webFluxProperties1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment3 = annotationConfigReactiveWebServerApplicationContext2.getEnvironment();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext2.getServerNamespace();
        int int5 = annotationConfigReactiveWebServerApplicationContext2.getBeanDefinitionCount();
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> handlerMethodArgumentResolverObjectProvider6 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.web.codec.CodecCustomizer> codecCustomizerObjectProvider7 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerObjectProvider8 = null;
        org.springframework.beans.factory.ObjectProvider<org.springframework.web.reactive.result.view.ViewResolver> viewResolverObjectProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig webFluxConfig10 = new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig(resourceProperties0, webFluxProperties1, (org.springframework.beans.factory.ListableBeanFactory) annotationConfigReactiveWebServerApplicationContext2, handlerMethodArgumentResolverObjectProvider6, codecCustomizerObjectProvider7, resourceHandlerRegistrationCustomizerObjectProvider8, viewResolverObjectProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration webFluxAutoConfiguration0 = new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration();
        org.springframework.boot.web.reactive.filter.OrderedHiddenHttpMethodFilter orderedHiddenHttpMethodFilter1 = webFluxAutoConfiguration0.hiddenHttpMethodFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.springframework.boot.web.reactive.filter.OrderedHiddenHttpMethodFilter> orderedHiddenHttpMethodFilterOngoingStubbing2 = org.mockito.Mockito.when(orderedHiddenHttpMethodFilter1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedHiddenHttpMethodFilter1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext1 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader2 = annotationConfigReactiveWebServerApplicationContext1.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner3 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass4 = classLoader2.getClass();
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationName();
        org.springframework.core.io.Resource[] resourceArray9 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        annotationConfigReactiveWebServerApplicationContext0.setAllowCircularReferences(false);
        org.springframework.core.io.Resource[] resourceArray13 = annotationConfigReactiveWebServerApplicationContext0.getResources("Origin");
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(resourceArray9);
        org.junit.Assert.assertNotNull(resourceArray13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason0 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason2 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException4 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason2, "_links.env");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException5 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason0, "applicationEventMulticaster", (java.lang.Throwable) cloudFoundryAuthorizationException4);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason6 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable8 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException9 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason6, "_links.self.templated", throwable8);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason10 = cloudFoundryAuthorizationException9.getReason();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason11 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable13 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException14 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason11, "_links.self.templated", throwable13);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason15 = cloudFoundryAuthorizationException14.getReason();
        cloudFoundryAuthorizationException9.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException14);
        cloudFoundryAuthorizationException5.addSuppressed((java.lang.Throwable) cloudFoundryAuthorizationException9);
        org.junit.Assert.assertTrue("'" + reason0 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE + "'", reason0.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.INVALID_SIGNATURE));
        org.junit.Assert.assertTrue("'" + reason6 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason6.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason10 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason10.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason11 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason11.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertTrue("'" + reason15 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason15.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpointConfiguration testEndpointConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpointConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint1 = testEndpointConfiguration0.testEnvEndpoint();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = testEnvEndpoint1.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = testEnvEndpoint1.readAll();
        org.junit.Assert.assertNotNull(testEnvEndpoint1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext2.containsBeanDefinition("_links.length()");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata1, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext2);
        boolean boolean9 = annotationConfigReactiveWebServerApplicationContext2.containsLocalBean("POST");
        annotationConfigReactiveWebServerApplicationContext2.setId("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getId();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner4.withClassLoader(classLoader5);
        java.lang.Class<?> wildcardClass7 = reactiveWebApplicationContextRunner6.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner8 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader9 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = reactiveWebApplicationContextRunner8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = reactiveWebApplicationContextRunner10.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = reactiveWebApplicationContextRunner14.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner16 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader17 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = reactiveWebApplicationContextRunner18.getClass();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner20 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader21 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner22 = reactiveWebApplicationContextRunner20.withClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = reactiveWebApplicationContextRunner22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass7;
        wildcardClassArray26[1] = wildcardClass11;
        wildcardClassArray26[2] = wildcardClass15;
        wildcardClassArray26[3] = wildcardClass19;
        wildcardClassArray26[4] = wildcardClass23;
        annotationConfigReactiveWebServerApplicationContext0.register(wildcardClassArray26);
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Authorization");
        org.springframework.core.ResolvableType resolvableType41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = annotationConfigReactiveWebServerApplicationContext0.isTypeMatch("environment", resolvableType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: Authorization has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.lang.Throwable[] throwableArray0 = null;
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doThrow(throwableArray0);
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.EndpointDelegate endpointDelegate0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint testEndpoint1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEndpoint(endpointDelegate0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = testEndpoint1.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = testEndpoint1.readPart("classpath*:");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = testEndpoint1.readAll();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = testEndpoint1.readPart("org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException: _links.self.templated");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        long long3 = annotationConfigReactiveWebServerApplicationContext0.getStartupDate();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = annotationConfigReactiveWebServerApplicationContext0.getBean("Access-Control-Request-Method");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@7c2bbf07 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration httpHandlerAutoConfiguration0 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEnvEndpoint testEnvEndpoint0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.TestEnvEndpoint();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = testEnvEndpoint0.readAll();
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader4 = annotationConfigReactiveWebServerApplicationContext3.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = reactiveWebApplicationContextRunner2.withClassLoader(classLoader4);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext6 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment7 = annotationConfigReactiveWebServerApplicationContext6.getEnvironment();
        java.lang.ClassLoader classLoader8 = annotationConfigReactiveWebServerApplicationContext6.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner9 = reactiveWebApplicationContextRunner2.withParent((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext6);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason10 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason reason12 = org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION;
        java.lang.Throwable throwable14 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException15 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason12, "_links.self.templated", throwable14);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException cloudFoundryAuthorizationException16 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException(reason10, "Authorization", (java.lang.Throwable) cloudFoundryAuthorizationException15);
        java.lang.Throwable[] throwableArray17 = cloudFoundryAuthorizationException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = cloudFoundryAuthorizationException15.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber19 = org.mockito.Mockito.doReturn((java.lang.Object) reactiveWebApplicationContextRunner9, (java.lang.Object[]) throwableArray18);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3: you are stubbing the behaviour of another mock inside before 'thenReturn' instruction if completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner5);
        org.junit.Assert.assertNotNull(configurableEnvironment7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner9);
        org.junit.Assert.assertTrue("'" + reason10 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED + "'", reason10.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.ACCESS_DENIED));
        org.junit.Assert.assertTrue("'" + reason12 + "' != '" + org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION + "'", reason12.equals(org.springframework.boot.actuate.autoconfigure.cloudfoundry.CloudFoundryAuthorizationException.Reason.MISSING_AUTHORIZATION));
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext1 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader2 = annotationConfigReactiveWebServerApplicationContext1.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext3.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext6 = annotationConfigReactiveWebServerApplicationContext3.getParent();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext3.getDisplayName();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext3.getServerNamespace();
        java.lang.String[] strArray9 = annotationConfigReactiveWebServerApplicationContext3.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader10 = org.mockito.ArgumentMatchers.refEq(classLoader2, strArray9);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner11 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader10);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext12 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext12.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext15 = annotationConfigReactiveWebServerApplicationContext12.getParent();
        java.lang.String str16 = annotationConfigReactiveWebServerApplicationContext12.getDisplayName();
        java.lang.String str17 = annotationConfigReactiveWebServerApplicationContext12.getServerNamespace();
        java.lang.String[] strArray18 = annotationConfigReactiveWebServerApplicationContext12.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner19 = reactiveWebApplicationContextRunner11.withPropertyValues(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNull(applicationContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_links.env.href" + "'", str7, "_links.env.href");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner11);
        org.junit.Assert.assertNull(applicationContext15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_links.env.href" + "'", str16, "_links.env.href");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner19);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        boolean boolean2 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.registerShutdownHook();
        annotationConfigReactiveWebServerApplicationContext0.close();
        annotationConfigReactiveWebServerApplicationContext0.close();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("classpath*:");
        org.springframework.context.ApplicationEvent applicationEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.publishEvent(applicationEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Event must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.String str1 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext2.setAllowCircularReferences(false);
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext0.publishEvent((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@69ac5336, started on Wed Dec 31 18:00:00 CST 1969");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner0.withPropertyValues(strArray5);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner7 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader9 = annotationConfigReactiveWebServerApplicationContext8.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext10 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext10.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext13 = annotationConfigReactiveWebServerApplicationContext10.getParent();
        java.lang.String str14 = annotationConfigReactiveWebServerApplicationContext10.getDisplayName();
        java.lang.String str15 = annotationConfigReactiveWebServerApplicationContext10.getServerNamespace();
        java.lang.String[] strArray16 = annotationConfigReactiveWebServerApplicationContext10.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader17 = org.mockito.ArgumentMatchers.refEq(classLoader9, strArray16);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner7.withClassLoader(classLoader17);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext19 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext19.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext22 = annotationConfigReactiveWebServerApplicationContext19.getParent();
        java.lang.String str23 = annotationConfigReactiveWebServerApplicationContext19.getDisplayName();
        java.lang.String str24 = annotationConfigReactiveWebServerApplicationContext19.getServerNamespace();
        java.lang.String[] strArray25 = annotationConfigReactiveWebServerApplicationContext19.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner26 = reactiveWebApplicationContextRunner18.withPropertyValues(strArray25);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner27 = reactiveWebApplicationContextRunner6.withSystemProperties(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber28 = org.mockito.Mockito.doReturn((java.lang.Object) strArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(applicationContext13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_links.env.href" + "'", str14, "_links.env.href");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNull(applicationContext22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_links.env.href" + "'", str23, "_links.env.href");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner26);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner27);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        boolean boolean3 = annotationConfigReactiveWebServerApplicationContext0.isBeanNameInUse("_links.self.href");
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.test.templated");
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) "systemEnvironment");
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList3 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        boolean boolean4 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory5 = annotationConfigReactiveWebServerApplicationContext0.getDefaultListableBeanFactory();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext6 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext(defaultListableBeanFactory5);
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(defaultListableBeanFactory5);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (short) 0);
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.ArgumentMatchers.eq(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNull(verificationMode2);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext1 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        beanPostProcessorsRegistrar0.setBeanFactory((org.springframework.beans.factory.BeanFactory) annotationConfigReactiveWebServerApplicationContext1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor1 = null; // flaky: cloudFoundryReactiveConfiguration0.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryReactiveConfiguration0.EndpointMediaTypes();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext3.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext6 = annotationConfigReactiveWebServerApplicationContext3.getParent();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext3.getDisplayName();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext3.getServerNamespace();
        java.lang.String str9 = annotationConfigReactiveWebServerApplicationContext3.getServerNamespace();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment10 = annotationConfigReactiveWebServerApplicationContext3.getEnvironment();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration11 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor12 = cloudFoundryReactiveConfiguration11.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes13 = cloudFoundryReactiveConfiguration11.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer14 = cloudFoundryReactiveConfiguration0.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext3, endpointMediaTypes13);
// flaky:         org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNull(applicationContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_links.env.href" + "'", str7, "_links.env.href");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(configurableEnvironment10);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor12);
        org.junit.Assert.assertNotNull(endpointMediaTypes13);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer14);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Access-Control-Allow-Methods");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.String str0 = org.springframework.context.ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ",; \t\n" + "'", str0, ",; \t\n");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str3 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        org.springframework.core.ResolvableType resolvableType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = annotationConfigReactiveWebServerApplicationContext0.isTypeMatch("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.", resolvableType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext@26e9e346 has not been refreshed yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.lang.Object obj0 = null;
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails(obj0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner0.withPropertyValues(strArray5);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner7 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader9 = annotationConfigReactiveWebServerApplicationContext8.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext10 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext10.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext13 = annotationConfigReactiveWebServerApplicationContext10.getParent();
        java.lang.String str14 = annotationConfigReactiveWebServerApplicationContext10.getDisplayName();
        java.lang.String str15 = annotationConfigReactiveWebServerApplicationContext10.getServerNamespace();
        java.lang.String[] strArray16 = annotationConfigReactiveWebServerApplicationContext10.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader17 = org.mockito.ArgumentMatchers.refEq(classLoader9, strArray16);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner7.withClassLoader(classLoader17);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext19 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext19.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext22 = annotationConfigReactiveWebServerApplicationContext19.getParent();
        java.lang.String str23 = annotationConfigReactiveWebServerApplicationContext19.getDisplayName();
        java.lang.String str24 = annotationConfigReactiveWebServerApplicationContext19.getServerNamespace();
        java.lang.String[] strArray25 = annotationConfigReactiveWebServerApplicationContext19.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner26 = reactiveWebApplicationContextRunner18.withPropertyValues(strArray25);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner27 = reactiveWebApplicationContextRunner6.withSystemProperties(strArray25);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext28 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader29 = annotationConfigReactiveWebServerApplicationContext28.getClassLoader();
        java.lang.String str30 = annotationConfigReactiveWebServerApplicationContext28.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList31 = annotationConfigReactiveWebServerApplicationContext28.getBeanFactoryPostProcessors();
        boolean boolean32 = annotationConfigReactiveWebServerApplicationContext28.isRunning();
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory33 = annotationConfigReactiveWebServerApplicationContext28.getDefaultListableBeanFactory();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner34 = reactiveWebApplicationContextRunner6.withParent((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext28);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext35 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader36 = annotationConfigReactiveWebServerApplicationContext35.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner37 = reactiveWebApplicationContextRunner6.withClassLoader(classLoader36);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(applicationContext13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_links.env.href" + "'", str14, "_links.env.href");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNull(applicationContext22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_links.env.href" + "'", str23, "_links.env.href");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner26);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner27);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(defaultListableBeanFactory33);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner34);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner37);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.springframework.context.ApplicationContext applicationContext0 = null;
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig1 = new org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig(applicationContext0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar beanPostProcessorsRegistrar0 = new org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration.BeanPostProcessorsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext2 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext2.setDisplayName("_links.env.href");
        boolean boolean6 = annotationConfigReactiveWebServerApplicationContext2.containsBeanDefinition("_links.length()");
        beanPostProcessorsRegistrar0.registerBeanDefinitions(annotationMetadata1, (org.springframework.beans.factory.support.BeanDefinitionRegistry) annotationConfigReactiveWebServerApplicationContext2);
        annotationConfigReactiveWebServerApplicationContext2.registerShutdownHook();
        org.springframework.core.io.ProtocolResolver protocolResolver9 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotationConfigReactiveWebServerApplicationContext2.addProtocolResolver(protocolResolver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ProtocolResolver must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.util.Collection<org.springframework.context.ApplicationContext> applicationContextCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(applicationContextCollection0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig annotationConfig0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(annotationConfig0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.toString();
        annotationConfigReactiveWebServerApplicationContext0.close();
        org.springframework.boot.web.server.WebServer webServer8 = annotationConfigReactiveWebServerApplicationContext0.getWebServer();
        org.junit.Assert.assertNull(webServer8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setAllowBeanDefinitionOverriding(true);
        annotationConfigReactiveWebServerApplicationContext0.setId("signature");
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.toString();
        annotationConfigReactiveWebServerApplicationContext0.close();
        java.util.Collection<org.springframework.core.io.ProtocolResolver> protocolResolverCollection8 = annotationConfigReactiveWebServerApplicationContext0.getProtocolResolvers();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList9 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactoryPostProcessors();
        org.junit.Assert.assertNotNull(protocolResolverCollection8);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList9);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection5 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("_links.env.href, started on Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '4');
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader4 = annotationConfigReactiveWebServerApplicationContext3.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner5 = reactiveWebApplicationContextRunner2.withClassLoader(classLoader4);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext6 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment7 = annotationConfigReactiveWebServerApplicationContext6.getEnvironment();
        java.lang.ClassLoader classLoader8 = annotationConfigReactiveWebServerApplicationContext6.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner9 = reactiveWebApplicationContextRunner2.withParent((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext6);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner10 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader11 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner12 = reactiveWebApplicationContextRunner10.withClassLoader(classLoader11);
        java.lang.ClassLoader classLoader13 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner14 = reactiveWebApplicationContextRunner10.withClassLoader(classLoader13);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext15 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader16 = annotationConfigReactiveWebServerApplicationContext15.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext17 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext17.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext20 = annotationConfigReactiveWebServerApplicationContext17.getParent();
        java.lang.String str21 = annotationConfigReactiveWebServerApplicationContext17.getDisplayName();
        java.lang.String str22 = annotationConfigReactiveWebServerApplicationContext17.getServerNamespace();
        java.lang.String[] strArray23 = annotationConfigReactiveWebServerApplicationContext17.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader24 = org.mockito.ArgumentMatchers.refEq(classLoader16, strArray23);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner25 = reactiveWebApplicationContextRunner14.withClassLoader(classLoader24);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext26 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader27 = annotationConfigReactiveWebServerApplicationContext26.getClassLoader();
        java.lang.String str28 = annotationConfigReactiveWebServerApplicationContext26.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList29 = annotationConfigReactiveWebServerApplicationContext26.getBeanFactoryPostProcessors();
        java.lang.Class<?> wildcardClass30 = annotationConfigReactiveWebServerApplicationContext26.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner36 = reactiveWebApplicationContextRunner14.withUserConfiguration(wildcardClassArray33);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner37 = reactiveWebApplicationContextRunner2.withUserConfiguration(wildcardClassArray33);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner5);
        org.junit.Assert.assertNotNull(configurableEnvironment7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner9);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner12);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner14);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNull(applicationContext20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_links.env.href" + "'", str21, "_links.env.href");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(classLoader24);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner25);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner36);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner37);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests cloudFoundryWebFluxEndpointIntegrationTests0 = null; // flaky: new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             cloudFoundryWebFluxEndpointIntegrationTests0.linksToOtherEndpointsWithRestrictedAccess();
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 7 recorded:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)?-> at org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.linksToOtherEndpointsWithRestrictedAccess(CloudFoundryWebFluxEndpointIntegrationTests.java:155)??This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext3 = annotationConfigReactiveWebServerApplicationContext0.getParent();
        java.lang.String str4 = annotationConfigReactiveWebServerApplicationContext0.getDisplayName();
        java.lang.String str5 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.lang.String str6 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        java.util.Collection<org.springframework.context.ApplicationListener<?>> wildcardApplicationListenerCollection7 = annotationConfigReactiveWebServerApplicationContext0.getApplicationListeners();
        boolean boolean8 = annotationConfigReactiveWebServerApplicationContext0.isRunning();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext9 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext9.setAllowBeanDefinitionOverriding(true);
        boolean boolean12 = annotationConfigReactiveWebServerApplicationContext9.isRunning();
        annotationConfigReactiveWebServerApplicationContext9.clearResourceCaches();
        annotationConfigReactiveWebServerApplicationContext0.setResourceLoader((org.springframework.core.io.ResourceLoader) annotationConfigReactiveWebServerApplicationContext9);
        java.lang.String str15 = annotationConfigReactiveWebServerApplicationContext0.toString();
        org.junit.Assert.assertNull(applicationContext3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_links.env.href" + "'", str4, "_links.env.href");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardApplicationListenerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_links.env.href, started on Wed Dec 31 18:00:00 CST 1969" + "'", str15, "_links.env.href, started on Wed Dec 31 18:00:00 CST 1969");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJhd2Vzb21lIjp0cnVlfQ.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests cloudFoundryWebFluxEndpointIntegrationTests0 = null; // flaky: new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             cloudFoundryWebFluxEndpointIntegrationTests0.responseToOptionsRequestIncludesCorsHeaders();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unstarted application context org.springframework.boot.test.context.assertj.AssertableReactiveWebApplicationContext[startupFailure=org.springframework.beans.factory.BeanCreationException] failed to start");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner0 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader1 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner2 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = reactiveWebApplicationContextRunner0.withClassLoader(classLoader3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner0.withPropertyValues(strArray5);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner7 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext8 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader9 = annotationConfigReactiveWebServerApplicationContext8.getClassLoader();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext10 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext10.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext13 = annotationConfigReactiveWebServerApplicationContext10.getParent();
        java.lang.String str14 = annotationConfigReactiveWebServerApplicationContext10.getDisplayName();
        java.lang.String str15 = annotationConfigReactiveWebServerApplicationContext10.getServerNamespace();
        java.lang.String[] strArray16 = annotationConfigReactiveWebServerApplicationContext10.getBeanDefinitionNames();
        java.lang.ClassLoader classLoader17 = org.mockito.ArgumentMatchers.refEq(classLoader9, strArray16);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner18 = reactiveWebApplicationContextRunner7.withClassLoader(classLoader17);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext19 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext19.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext22 = annotationConfigReactiveWebServerApplicationContext19.getParent();
        java.lang.String str23 = annotationConfigReactiveWebServerApplicationContext19.getDisplayName();
        java.lang.String str24 = annotationConfigReactiveWebServerApplicationContext19.getServerNamespace();
        java.lang.String[] strArray25 = annotationConfigReactiveWebServerApplicationContext19.getBeanDefinitionNames();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner26 = reactiveWebApplicationContextRunner18.withPropertyValues(strArray25);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner27 = reactiveWebApplicationContextRunner6.withSystemProperties(strArray25);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext28 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader29 = annotationConfigReactiveWebServerApplicationContext28.getClassLoader();
        java.lang.String str30 = annotationConfigReactiveWebServerApplicationContext28.getDisplayName();
        java.util.List<org.springframework.beans.factory.config.BeanFactoryPostProcessor> beanFactoryPostProcessorList31 = annotationConfigReactiveWebServerApplicationContext28.getBeanFactoryPostProcessors();
        boolean boolean32 = annotationConfigReactiveWebServerApplicationContext28.isRunning();
        org.springframework.beans.factory.support.DefaultListableBeanFactory defaultListableBeanFactory33 = annotationConfigReactiveWebServerApplicationContext28.getDefaultListableBeanFactory();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner34 = reactiveWebApplicationContextRunner6.withParent((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext28);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext35 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment36 = annotationConfigReactiveWebServerApplicationContext35.getEnvironment();
        java.lang.String str37 = annotationConfigReactiveWebServerApplicationContext35.getServerNamespace();
        int int38 = annotationConfigReactiveWebServerApplicationContext35.getBeanDefinitionCount();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer39 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Class<?> wildcardClass40 = objAnswer39.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        annotationConfigReactiveWebServerApplicationContext35.register(wildcardClassArray43);
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner47 = reactiveWebApplicationContextRunner34.withUserConfiguration(wildcardClassArray43);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner2);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(applicationContext13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_links.env.href" + "'", str14, "_links.env.href");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner18);
        org.junit.Assert.assertNull(applicationContext22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_links.env.href" + "'", str23, "_links.env.href");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner26);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner27);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(beanFactoryPostProcessorList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(defaultListableBeanFactory33);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner34);
        org.junit.Assert.assertNotNull(configurableEnvironment36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertTrue("'" + objAnswer39 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer39.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner47);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader1 = annotationConfigReactiveWebServerApplicationContext0.getClassLoader();
        annotationConfigReactiveWebServerApplicationContext0.setDisplayName("_links.info.href");
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner4 = new org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner();
        java.lang.ClassLoader classLoader5 = null;
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner6 = reactiveWebApplicationContextRunner4.withClassLoader(classLoader5);
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext7 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        java.lang.ClassLoader classLoader8 = annotationConfigReactiveWebServerApplicationContext7.getClassLoader();
        org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner reactiveWebApplicationContextRunner9 = reactiveWebApplicationContextRunner6.withClassLoader(classLoader8);
        annotationConfigReactiveWebServerApplicationContext0.setClassLoader(classLoader8);
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(reactiveWebApplicationContextRunner9);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext0 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment1 = annotationConfigReactiveWebServerApplicationContext0.getEnvironment();
        java.lang.String str2 = annotationConfigReactiveWebServerApplicationContext0.getServerNamespace();
        int int3 = annotationConfigReactiveWebServerApplicationContext0.getBeanDefinitionCount();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory4 = annotationConfigReactiveWebServerApplicationContext0.getBeanFactory();
        annotationConfigReactiveWebServerApplicationContext0.clearResourceCaches();
        org.springframework.core.io.Resource resource7 = annotationConfigReactiveWebServerApplicationContext0.getResource(",; \t\n");
        org.junit.Assert.assertNotNull(configurableEnvironment1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(configurableListableBeanFactory4);
        org.junit.Assert.assertNotNull(resource7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor1 = null; // flaky: cloudFoundryReactiveConfiguration0.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes2 = cloudFoundryReactiveConfiguration0.EndpointMediaTypes();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext3 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext3.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext6 = annotationConfigReactiveWebServerApplicationContext3.getParent();
        java.lang.String str7 = annotationConfigReactiveWebServerApplicationContext3.getDisplayName();
        java.lang.String str8 = annotationConfigReactiveWebServerApplicationContext3.getServerNamespace();
        java.lang.String str9 = annotationConfigReactiveWebServerApplicationContext3.getServerNamespace();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment10 = annotationConfigReactiveWebServerApplicationContext3.getEnvironment();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration11 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor12 = cloudFoundryReactiveConfiguration11.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes13 = cloudFoundryReactiveConfiguration11.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer14 = cloudFoundryReactiveConfiguration0.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext3, endpointMediaTypes13);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration15 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor16 = cloudFoundryReactiveConfiguration15.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes17 = cloudFoundryReactiveConfiguration15.EndpointMediaTypes();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext18 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext18.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext21 = annotationConfigReactiveWebServerApplicationContext18.getParent();
        java.lang.String str22 = annotationConfigReactiveWebServerApplicationContext18.getDisplayName();
        java.lang.String str23 = annotationConfigReactiveWebServerApplicationContext18.getServerNamespace();
        java.lang.String str24 = annotationConfigReactiveWebServerApplicationContext18.getServerNamespace();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment25 = annotationConfigReactiveWebServerApplicationContext18.getEnvironment();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration26 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor27 = cloudFoundryReactiveConfiguration26.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes28 = cloudFoundryReactiveConfiguration26.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer29 = cloudFoundryReactiveConfiguration15.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext18, endpointMediaTypes28);
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration30 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor31 = cloudFoundryReactiveConfiguration30.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes32 = cloudFoundryReactiveConfiguration30.EndpointMediaTypes();
        org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext annotationConfigReactiveWebServerApplicationContext33 = new org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext();
        annotationConfigReactiveWebServerApplicationContext33.setDisplayName("_links.env.href");
        org.springframework.context.ApplicationContext applicationContext36 = annotationConfigReactiveWebServerApplicationContext33.getParent();
        java.lang.String str37 = annotationConfigReactiveWebServerApplicationContext33.getDisplayName();
        java.lang.String str38 = annotationConfigReactiveWebServerApplicationContext33.getServerNamespace();
        java.lang.String str39 = annotationConfigReactiveWebServerApplicationContext33.getServerNamespace();
        org.springframework.core.env.ConfigurableEnvironment configurableEnvironment40 = annotationConfigReactiveWebServerApplicationContext33.getEnvironment();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration cloudFoundryReactiveConfiguration41 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundryWebFluxEndpointIntegrationTests.CloudFoundryReactiveConfiguration();
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.CloudFoundrySecurityInterceptor cloudFoundrySecurityInterceptor42 = cloudFoundryReactiveConfiguration41.interceptor();
        org.springframework.boot.actuate.endpoint.web.EndpointMediaTypes endpointMediaTypes43 = cloudFoundryReactiveConfiguration41.EndpointMediaTypes();
        org.springframework.boot.actuate.endpoint.web.annotation.WebEndpointDiscoverer webEndpointDiscoverer44 = cloudFoundryReactiveConfiguration30.webEndpointDiscoverer((org.springframework.context.ApplicationContext) annotationConfigReactiveWebServerApplicationContext33, endpointMediaTypes43);
        org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer[] endpointDiscovererArray46 = new org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer[3];
        @SuppressWarnings("unchecked")
        org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer<org.springframework.boot.actuate.endpoint.web.ExposableWebEndpoint, org.springframework.boot.actuate.endpoint.web.WebOperation>[] exposableWebEndpointEndpointDiscovererArray47 = (org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer<org.springframework.boot.actuate.endpoint.web.ExposableWebEndpoint, org.springframework.boot.actuate.endpoint.web.WebOperation>[]) endpointDiscovererArray46;
        exposableWebEndpointEndpointDiscovererArray47[0] = webEndpointDiscoverer14;
        exposableWebEndpointEndpointDiscovererArray47[1] = webEndpointDiscoverer29;
        exposableWebEndpointEndpointDiscovererArray47[2] = webEndpointDiscoverer44;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(exposableWebEndpointEndpointDiscovererArray47);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor54.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor1);
        org.junit.Assert.assertNotNull(endpointMediaTypes2);
        org.junit.Assert.assertNull(applicationContext6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_links.env.href" + "'", str7, "_links.env.href");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(configurableEnvironment10);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor12);
        org.junit.Assert.assertNotNull(endpointMediaTypes13);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer14);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor16);
        org.junit.Assert.assertNotNull(endpointMediaTypes17);
        org.junit.Assert.assertNull(applicationContext21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_links.env.href" + "'", str22, "_links.env.href");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(configurableEnvironment25);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor27);
        org.junit.Assert.assertNotNull(endpointMediaTypes28);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer29);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor31);
        org.junit.Assert.assertNotNull(endpointMediaTypes32);
        org.junit.Assert.assertNull(applicationContext36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_links.env.href" + "'", str37, "_links.env.href");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(configurableEnvironment40);
        org.junit.Assert.assertNotNull(cloudFoundrySecurityInterceptor42);
        org.junit.Assert.assertNotNull(endpointMediaTypes43);
        org.junit.Assert.assertNotNull(webEndpointDiscoverer44);
        org.junit.Assert.assertNotNull(endpointDiscovererArray46);
        org.junit.Assert.assertNotNull(exposableWebEndpointEndpointDiscovererArray47);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.ReactiveCloudFoundrySecurityService reactiveCloudFoundrySecurityService0 = null;
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.ReactiveTokenValidator reactiveTokenValidator1 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.ReactiveTokenValidator(reactiveCloudFoundrySecurityService0);
    }
}
