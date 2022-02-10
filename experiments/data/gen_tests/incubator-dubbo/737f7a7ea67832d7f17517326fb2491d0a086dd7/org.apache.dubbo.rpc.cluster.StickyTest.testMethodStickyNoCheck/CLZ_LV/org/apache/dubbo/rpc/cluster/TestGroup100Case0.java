package org.apache.dubbo.rpc.cluster;

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
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.QOS_LIVE_PROBE_EXTENSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.application.liveness-probe" + "'", str0, "dubbo.application.liveness-probe");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DOT_REGEX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\\." + "'", str0, "\\.");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_MIGRATION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.migration.file" + "'", str0, "dubbo.migration.file");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.EXPORT_ASYNC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "export-async" + "'", str0, "export-async");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doCallRealMethod();
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_PARAMETER_DESC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Object;" + "'", str0, "Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Object;");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CONFIG_NAMESPACE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "namespace" + "'", str0, "namespace");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROTOCOL_SERVER_SERVLET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servlet" + "'", str0, "servlet");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.METADATA_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metadata-type" + "'", str0, "metadata-type");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.MAX_PROXY_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65535 + "'", int0 == 65535);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SERIALIZE_BLOCKED_LIST_FILE_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security/serialize.blockedlist" + "'", str0, "security/serialize.blockedlist");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.FORKS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "forks" + "'", str0, "forks");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SERVICE_FILTER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "service.filter" + "'", str0, "service.filter");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROVIDER_SIDE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "provider" + "'", str0, "provider");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_ASYNC_THREAD_NUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_WITH_CLZ_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "generic.include.class" + "'", str0, "generic.include.class");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(verificationModeIterable0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLASS_DESERIALIZE_ALLOWED_LIST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.security.serialize.allowedClassList" + "'", str0, "dubbo.security.serialize.allowedClassList");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_THREAD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Dubbo" + "'", str0, "Dubbo");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_ENV_KEYS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.env.keys" + "'", str0, "dubbo.env.keys");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.MONITOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "monitor" + "'", str0, "monitor");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.mockito.ArgumentMatcher<java.lang.Short> shortArgumentMatcher0 = null;
        short short1 = org.mockito.ArgumentMatchers.shortThat(shortArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_CALLBACK_INSTANCES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.LOCALHOST_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "127.0.0.1" + "'", str0, "127.0.0.1");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.util.regex.Pattern pattern0 = null;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.LOCALHOST_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.BROADCAST_CLUSTER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "broadcast" + "'", str0, "broadcast");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REGISTRY_DELAY_NOTIFICATION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "delay-notification" + "'", str0, "delay-notification");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pid" + "'", str0, "pid");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CACHE_CLEAR_TASK_INTERVAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.application.url.cache.task.interval" + "'", str0, "dubbo.application.url.cache.task.interval");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.LenientStubber lenientStubber1 = org.mockito.Mockito.verify(lenientStubber0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultLenientStubber and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        int int0 = org.apache.dubbo.common.lang.Prioritized.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TIMESTAMP_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "timestamp" + "'", str0, "timestamp");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.THREADPOOL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "threadpool" + "'", str0, "threadpool");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CONFIG_CONFIGFILE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "config-file" + "'", str0, "config-file");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.THREADS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "threads" + "'", str0, "threads");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.Iterable<java.lang.reflect.Type> typeIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(typeIterable0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CACHE_CLEAR_WAITING_THRESHOLD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.application.url.cache.clear.waiting" + "'", str0, "dubbo.application.url.cache.clear.waiting");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLUSTER_INTERCEPTOR_COMPATIBLE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.application.cluster.interceptor.compatible" + "'", str0, "dubbo.application.cluster.interceptor.compatible");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_KEY_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default." + "'", str0, "default.");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.BACKLOG_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "backlog" + "'", str0, "backlog");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.METADATA_MAPPING_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metadata" + "'", str0, "metadata");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_FAILBACK_TIMES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.EXTRA_KEYS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "extra-keys" + "'", str0, "extra-keys");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) "can't be interface!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Object> objOngoingStubbing1 = null; // flaky: org.mockito.Mockito.when((java.lang.Object) 3);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be 'a method call on a mock'.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because:?1. you stub either of: final/private/equals()/hashCode() methods.?   Those methods *cannot* be stubbed/verified.?   Mocking methods declared on non-public parent classes is not supported.?2. inside when() you don't call method on mock but on some other object.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROTOCOL_SEPARATOR_ENCODED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "%3A%2F%2F" + "'", str0, "%3A%2F%2F");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REGISTRY_LOCAL_FILE_CACHE_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file.cache" + "'", str0, "file.cache");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String[] strArray5 = new java.lang.String[] { "Exception occurred when loading extension class (interface:", "monitor", "Extension instance (name:", ").", "pid" };
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.reset(strArray5);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "security/serialize.blockedlist", ") is not an extension, because it is NOT annotated with @", "set" };
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.verifyNoInteractions(objArray3);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[security/serialize.blockedlist, ) is not an extension, because it is NOT annotated with @, set]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[security/serialize.blockedlist, ) is not an extension, because it is NOT annotated with @, set]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.COMPOSITE_METADATA_STORAGE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "composite" + "'", str0, "composite");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.mockito.Mockito.clearAllCaches();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REMOVE_VALUE_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_SERIALIZATION_GSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gson" + "'", str0, "gson");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains(")!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.METHOD_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "method" + "'", str0, "method");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_SERVICE_NAME_MAPPING_PROPERTIES_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "META-INF/dubbo/service-name-mapping.properties" + "'", str0, "META-INF/dubbo/service-name-mapping.properties");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.LAZY_CONNECT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lazy" + "'", str0, "lazy");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CALLBACK_INSTANCES_LIMIT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "callbacks" + "'", str0, "callbacks");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito mockito1 = org.mockito.Mockito.verify(mockito0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Mockito and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PORT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        float float0 = org.mockito.ArgumentMatchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_SERIALIZATION_PROTOBUF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "protobuf-json" + "'", str0, "protobuf-json");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SHUTDOWN_WAIT_SECONDS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.service.shutdown.wait.seconds" + "'", str0, "dubbo.service.shutdown.wait.seconds");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.INTERFACES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "interfaces" + "'", str0, "interfaces");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REGISTRY_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "|" + "'", str0, "|");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable1 = org.mockito.ArgumentMatchers.same(verificationModeIterable0);
        org.junit.Assert.assertNotNull(verificationModeIterable0);
        org.junit.Assert.assertNull(verificationModeIterable1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CONFIG_ENABLE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "highest-priority" + "'", str0, "highest-priority");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.regex.Pattern pattern0 = org.apache.dubbo.common.constants.CommonConstants.SEMICOLON_SPLIT_PATTERN;
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "\\s*[;]+\\s*");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.COMMA_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) "org.apache");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TIME_COUNTDOWN_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "timeout-countdown" + "'", str0, "timeout-countdown");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.mockito.Mockito mockito0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(mockito0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_DUBBO_PROPERTIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.properties" + "'", str0, "dubbo.properties");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.mockito.ArgumentMatcher<java.lang.Double> doubleArgumentMatcher0 = null;
        double double1 = org.mockito.ArgumentMatchers.doubleThat(doubleArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.STUB_EVENT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.stub.event" + "'", str0, "dubbo.stub.event");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_ALIVE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.RELEASE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "release" + "'", str0, "release");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.HIDE_KEY_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "." + "'", str0, ".");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        boolean boolean0 = org.mockito.ArgumentMatchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ENABLE_NATIVE_JAVA_GENERIC_SERIALIZE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.security.serialize.generic.native-java-enable" + "'", str0, "dubbo.security.serialize.generic.native-java-enable");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SEMICOLON_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ";" + "'", str0, ";");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SEPARATOR_REGEX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_|-" + "'", str0, "_|-");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_SERIALIZATION_BEAN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bean" + "'", str0, "bean");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.mockito.Mockito mockito0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockito0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TRIPLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tri" + "'", str0, "tri");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("[");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SSL_ENABLED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl-enabled" + "'", str0, "ssl-enabled");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.Object[] objArray1 = new java.lang.Object[] { ", description file:" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[, description file:]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[, description file:]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.util.Map<java.io.Serializable, java.io.Serializable> serializableMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(serializableMap0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLASSIFIER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classifier" + "'", str0, "classifier");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(0L);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.mockito.stubbing.BaseStubber baseStubber0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(baseStubber0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type8 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray7);
        org.apache.dubbo.common.extension.ExtensionLoader.resetExtensionLoader((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROXY_CLASS_REF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "refClass" + "'", str0, "refClass");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.eq(objAnswer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNull(objAnswer1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) 0L);
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROTOBUF_MESSAGE_CLASS_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "com.google.protobuf.Message" + "'", str0, "com.google.protobuf.Message");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GROUP_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "group" + "'", str0, "group");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith(", class line:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.eq(objAnswer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNull(objAnswer1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.INVOKER_LISTENER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invoker.listener" + "'", str0, "invoker.listener");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "timeout" + "'", str0, "timeout");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PATH_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "path" + "'", str0, "path");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.INVOCATION_INTERCEPTOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invocation.interceptor" + "'", str0, "invocation.interceptor");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.Throwable[] throwableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doThrow(throwableArray0);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        byte byte0 = org.mockito.ArgumentMatchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.$INVOKE_ASYNC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "$invokeAsync" + "'", str0, "$invokeAsync");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.APPLICATION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application" + "'", str0, "application");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.QUEUES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "queues" + "'", str0, "queues");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_LOADBALANCE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "random" + "'", str0, "random");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.HOST_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_LABELS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.labels" + "'", str0, "dubbo.labels");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_RAW_RETURN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raw.return" + "'", str0, "raw.return");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_THREADPOOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "limited" + "'", str0, "limited");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) "gson");
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        double double0 = org.mockito.ArgumentMatchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_PREFERRED_NETWORK_INTERFACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.network.interface.preferred" + "'", str0, "dubbo.network.interface.preferred");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.EXPORTER_LISTENER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exporter.listener" + "'", str0, "exporter.listener");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.THREAD_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "threadname" + "'", str0, "threadname");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLASSPATH_URL_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "classpath:" + "'", str0, "classpath:");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.QOS_READY_PROBE_EXTENSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.application.readiness-probe" + "'", str0, "dubbo.application.readiness-probe");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REFER_ASYNC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "refer-async" + "'", str0, "refer-async");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        int int0 = org.apache.dubbo.common.lang.Prioritized.NORMAL_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_ATTACHMENT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_TO" + "'", str0, "_TO");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REFERENCE_INTERCEPTOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "reference.interceptor" + "'", str0, "reference.interceptor");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_PROPERTIES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.properties.file" + "'", str0, "dubbo.properties.file");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SHUTDOWN_WAIT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.service.shutdown.wait" + "'", str0, "dubbo.service.shutdown.wait");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray0 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset((java.lang.Object[]) loadingStrategyArray0);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        long long0 = org.mockito.ArgumentMatchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_RETRIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.mockito.ArgumentMatcher<java.lang.Boolean> booleanArgumentMatcher0 = null;
        boolean boolean1 = org.mockito.ArgumentMatchers.booleanThat(booleanArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROTOCOL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "protocol" + "'", str0, "protocol");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(mockitoFramework0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PREFERRED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "preferred" + "'", str0, "preferred");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.EXECUTOR_SERVICE_COMPONENT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.util.concurrent.ExecutorService" + "'", str0, "java.util.concurrent.ExecutorService");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.KEEP_ALIVE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "keep.alive" + "'", str0, "keep.alive");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REMOTE_METADATA_STORAGE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "remote" + "'", str0, "remote");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Comparator<java.lang.Object> objComparator0 = org.apache.dubbo.common.lang.Prioritized.COMPARATOR;
        org.junit.Assert.assertNotNull(objComparator0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.mockito.ArgumentMatcher<java.lang.Float> floatArgumentMatcher0 = null;
        float float1 = org.mockito.ArgumentMatchers.floatThat(floatArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable1 = org.mockito.ArgumentMatchers.same(verificationModeIterable0);
        java.lang.Iterable[] iterableArray3 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.mockito.verification.VerificationMode>[] verificationModeIterableArray4 = (java.lang.Iterable<org.mockito.verification.VerificationMode>[]) iterableArray3;
        verificationModeIterableArray4[0] = verificationModeIterable0;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(verificationModeIterableArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationModeIterable0);
        org.junit.Assert.assertNull(verificationModeIterable1);
        org.junit.Assert.assertNotNull(iterableArray3);
        org.junit.Assert.assertNotNull(verificationModeIterableArray4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CONFIG_MAPPING_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "config" + "'", str0, "config");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.URL_MERGE_PROCESSOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "url-merge-processor" + "'", str0, "url-merge-processor");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.regex.Pattern pattern0 = org.apache.dubbo.common.constants.CommonConstants.COMMA_SPLIT_PATTERN;
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "\\s*[,]+\\s*");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.RETRIES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "retries" + "'", str0, "retries");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.Collection<org.mockito.Mockito> mockitoCollection0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mockitoCollection0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.FILTER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DOT_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "." + "'", str0, ".");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.QOS_STARTUP_PROBE_EXTENSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.application.startup-probe" + "'", str0, "dubbo.application.startup-probe");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_THREADS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.Object[] objArray5 = new java.lang.Object[] { "dubbo.application.liveness-probe", '4', "Error occurred when loading extension class (interface:", 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber6 = org.mockito.Mockito.doReturn((java.lang.Object) "Extension name == null", objArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[dubbo.application.liveness-probe, 4, Error occurred when loading extension class (interface:, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[dubbo.application.liveness-probe, 4, Error occurred when loading extension class (interface:, 1]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 100.0f, "dubbo.service.shutdown.wait", "host" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder5 = org.mockito.Mockito.inOrder(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100.0, dubbo.service.shutdown.wait, host]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100.0, dubbo.service.shutdown.wait, host]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.regex.Pattern pattern0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(pattern0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.Mockito.after((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockitoFramework mockitoFramework3 = org.mockito.Mockito.verify(mockitoFramework0, (org.mockito.verification.VerificationMode) verificationAfterDelay2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultMockitoFramework and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoFramework0);
        org.junit.Assert.assertNotNull(verificationAfterDelay2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CHECK_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "check" + "'", str0, "check");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CONSUMER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "consumer" + "'", str0, "consumer");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray0 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) loadingStrategyArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("|");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PASSWORD_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ENABLED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "enabled" + "'", str0, "enabled");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        int int0 = org.apache.dubbo.common.lang.Prioritized.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.verification.VerificationMode> verificationModeOngoingStubbing2 = org.mockito.Mockito.when((org.mockito.verification.VerificationMode) verificationAfterDelay1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ANYHOST_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "anyhost" + "'", str0, "anyhost");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.$INVOKE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "$invoke" + "'", str0, "$invoke");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '#');
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass3 = verificationMode2.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type10 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray9);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay11 = org.mockito.ArgumentMatchers.refEq(verificationAfterDelay1, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder12 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(verificationAfterDelay11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.Mockito.after((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = org.mockito.Mockito.verify((java.lang.Comparable<java.lang.String>) "|", (org.mockito.verification.VerificationMode) verificationAfterDelay2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROPERTIES_CHAR_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_VERSION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo" + "'", str0, "dubbo");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doReturn((java.lang.Object) "metadata", (java.lang.Object[]) loadingStrategyArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.mockito.ArgumentMatcher<java.lang.Byte> byteArgumentMatcher0 = null;
        byte byte1 = org.mockito.ArgumentMatchers.byteThat(byteArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REGISTER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "register" + "'", str0, "register");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_PROTOCOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo" + "'", str0, "dubbo");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_PROXY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javassist" + "'", str0, "javassist");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLUSTER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cluster" + "'", str0, "cluster");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo" + "'", str0, "dubbo");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_CORE_THREADS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type8 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SERVICE_PATH_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "service.path.prefix" + "'", str0, "service.path.prefix");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.METRICS_PROTOCOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.protocol" + "'", str0, "metrics.protocol");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("Error destroying extension");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.METHODS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "methods" + "'", str0, "methods");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.util.Map<java.io.Serializable, java.io.Serializable> serializableMap0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.mockito.Mockito.verify(wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass1 = lenientStubber0.getClass();
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.never();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence2 = org.mockito.Mockito.verify((java.lang.CharSequence) "sticky", verificationMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUMP_DIRECTORY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dump.directory" + "'", str0, "dump.directory");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TAG_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.tag" + "'", str0, "dubbo.tag");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 200);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROTOCOL_SERVER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "server" + "'", str0, "server");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 65535);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REMOTE_APPLICATION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "remote.application" + "'", str0, "remote.application");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(1000);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ASYNC_THREAD_NUM_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "async-thread-num" + "'", str0, "async-thread-num");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0.0.0" + "'", str0, "0.0.0");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        int int0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_QUEUES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_ATTACHMENT_KEY_LOWER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_to" + "'", str0, "_to");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_CLIENT_THREADPOOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cached" + "'", str0, "cached");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("Extension instance (name:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_PROTOCOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo" + "'", str0, "dubbo");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.FILE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file" + "'", str0, "file");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type8 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder9 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_METADATA_STORAGE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Comparator<java.lang.Object> objComparator0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(objComparator0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.only();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_DUBBO_MIGRATION_FILE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo-migration.yaml" + "'", str0, "dubbo-migration.yaml");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.apache.dubbo.common.extension.ExtensionLoader.destroyAll();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.LenientStubber> lenientStubberOngoingStubbing1 = org.mockito.Mockito.when(lenientStubber0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_DIRECTORY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo" + "'", str0, "dubbo");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        short short0 = org.mockito.ArgumentMatchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.USERNAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "username" + "'", str0, "username");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLASS_DESERIALIZE_BLOCKED_LIST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.security.serialize.blockedClassList" + "'", str0, "dubbo.security.serialize.blockedClassList");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.regex.Pattern pattern0 = org.apache.dubbo.common.constants.CommonConstants.EQUAL_SPLIT_PATTERN;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "\\s*[=]+\\s*");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_SERIALIZATION_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.LOADBALANCE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loadbalance" + "'", str0, "loadbalance");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SERVICE_NAME_MAPPING_PROPERTIES_FILE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "service-name-mapping.properties-path" + "'", str0, "service-name-mapping.properties-path");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.$ECHO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "$echo" + "'", str0, "$echo");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray0 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray0);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) loadingStrategyArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "generic" + "'", str0, "generic");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 200);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = org.mockito.ArgumentMatchers.eq(type0);
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.regex.Pattern pattern0 = org.apache.dubbo.common.constants.CommonConstants.D_REGISTRY_SPLIT_PATTERN;
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "\\s*[|]+\\s*");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.apache.dubbo.common.extension.LoadingStrategy loadingStrategy0 = null;
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] { loadingStrategy0 };
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder3 = org.mockito.Mockito.inOrder((java.lang.Object[]) loadingStrategyArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument(s) passed is null!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 100);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(lenientStubber0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 1000);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROTOCOL_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "://" + "'", str0, "://");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type8 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        char char0 = org.mockito.ArgumentMatchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DUBBO_IP_TO_BIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DUBBO_IP_TO_BIND" + "'", str0, "DUBBO_IP_TO_BIND");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.HEARTBEAT_EVENT;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet1 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type8 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.VERSION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "version" + "'", str0, "version");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GENERIC_SERIALIZATION_NATIVE_JAVA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nativejava" + "'", str0, "nativejava");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SIDE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "side" + "'", str0, "side");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.IO_THREADS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "iothreads" + "'", str0, "iothreads");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) '4');
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ALIVE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "alive" + "'", str0, "alive");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("composite");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray3 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0, mockitoSessionBuilder2 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList4 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList4, mockitoSessionBuilderArray3);
        java.util.Map[] mapArray7 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.io.Serializable, java.io.Serializable>[] serializableMapArray8 = (java.util.Map<java.io.Serializable, java.io.Serializable>[]) mapArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.io.Serializable, java.io.Serializable>[] serializableMapArray9 = mockitoSessionBuilderList4.toArray((java.util.Map<java.io.Serializable, java.io.Serializable>[]) mapArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mapArray7);
        org.junit.Assert.assertNotNull(serializableMapArray8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.String> strOngoingStubbing1 = org.mockito.Mockito.when(").");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray1 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet2 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet2, mockitoSessionBuilderArray1);
        boolean boolean5 = mockitoSessionBuilderSet2.equals((java.lang.Object) "anyhost");
        boolean boolean7 = mockitoSessionBuilderSet2.equals((java.lang.Object) "true");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.Map<java.io.Serializable, java.io.Serializable> serializableMap0 = org.mockito.ArgumentMatchers.anyMap();
        java.util.Map[] mapArray2 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.io.Serializable, java.io.Serializable>[] serializableMapArray3 = (java.util.Map<java.io.Serializable, java.io.Serializable>[]) mapArray2;
        serializableMapArray3[0] = serializableMap0;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(serializableMapArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap0);
        org.junit.Assert.assertNotNull(mapArray2);
        org.junit.Assert.assertNotNull(serializableMapArray3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doThrow(throwableArray0);
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) 200);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '#');
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass3 = verificationMode2.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type10 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray9);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay11 = org.mockito.ArgumentMatchers.refEq(verificationAfterDelay1, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(verificationAfterDelay11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.MOCK_HEARTBEAT_EVENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "H" + "'", str0, "H");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mockitoSet0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.util.List<org.apache.dubbo.common.extension.LoadingStrategy> loadingStrategyList0 = org.apache.dubbo.common.extension.ExtensionLoader.getLoadingStrategies();
        org.junit.Assert.assertNotNull(loadingStrategyList0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REFERENCE_FILTER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "reference.filter" + "'", str0, "reference.filter");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray1 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList2 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList2, mockitoSessionBuilderArray1);
        java.util.Set<org.mockito.Mockito> mockitoSet4 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream5 = mockitoSet4.parallelStream();
        boolean boolean6 = mockitoSessionBuilderList2.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet4);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator7 = mockitoSet4.spliterator();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream8 = mockitoSet4.parallelStream();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream9 = mockitoSet4.parallelStream();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSet4);
        org.junit.Assert.assertNotNull(mockitoStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(mockitoSpliterator7);
        org.junit.Assert.assertNotNull(mockitoStream8);
        org.junit.Assert.assertNotNull(mockitoStream9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator1 = mockitoSet0.spliterator();
        org.junit.Assert.assertNotNull(mockitoSet0);
        org.junit.Assert.assertNotNull(mockitoSpliterator1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("DUBBO_IP_TO_BIND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(genericDeclarationList0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.METRICS_PORT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics.port" + "'", str0, "metrics.port");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.GROUP_CHAR_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.PROVIDER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "provider" + "'", str0, "provider");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.SERVICE_NAME_MAPPING_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "service-name-mapping" + "'", str0, "service-name-mapping");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray0 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray0);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray0);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) loadingStrategyArray0);
        org.junit.Assert.assertNotNull(loadingStrategyArray0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        boolean boolean3 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder1);
        java.util.Set<org.mockito.Mockito> mockitoSet4 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream5 = mockitoSet4.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator6 = mockitoSet4.spliterator();
        boolean boolean7 = mockitoSessionBuilderSet0.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet4);
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream8 = mockitoSet4.parallelStream();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSet4);
        org.junit.Assert.assertNotNull(mockitoStream5);
        org.junit.Assert.assertNotNull(mockitoSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mockitoStream8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains(":");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        char char0 = org.apache.dubbo.common.constants.CommonConstants.COMMA_SEPARATOR_CHAR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ',' + "'", char0 == ',');
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Extension name");
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        org.mockito.stubbing.LenientStubber lenientStubber3 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass4 = lenientStubber3.getClass();
        org.mockito.stubbing.LenientStubber lenientStubber5 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass6 = lenientStubber5.getClass();
        org.mockito.verification.VerificationMode verificationMode8 = org.mockito.Mockito.description("Extension name");
        java.lang.Class<?> wildcardClass9 = verificationMode8.getClass();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] { wildcardClass2, wildcardClass4, wildcardClass6, wildcardClass9 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(typeArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(lenientStubber3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(lenientStubber5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(verificationMode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.util.Set<java.util.Spliterator<org.mockito.Mockito>> mockitoSpliteratorSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockitoSpliteratorSet0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.util.HashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockitoSessionBuilderSet0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean2 = mockitoSessionBuilderSet0.remove((java.lang.Object) "$echo");
        mockitoSessionBuilderSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderCollection4 = org.mockito.Mockito.verify((java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ConcurrentHashSet and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(mockitoSpliterator0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("config");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.READONLY_EVENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "R" + "'", str0, "R");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.INTERFACE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "interface" + "'", str0, "interface");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = org.mockito.ArgumentMatchers.anyList();
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList1 = org.mockito.ArgumentMatchers.same(genericDeclarationList0);
        org.junit.Assert.assertNotNull(genericDeclarationList0);
        org.junit.Assert.assertNull(genericDeclarationList1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(mockitoSessionBuilderList0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CORE_THREADS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "corethreads" + "'", str0, "corethreads");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.util.Set<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArraySet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(loadingStrategyArraySet0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("iothreads");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.mockito.ArgumentMatcher<java.lang.Integer> intArgumentMatcher0 = null;
        int int1 = org.mockito.ArgumentMatchers.intThat(intArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        int int0 = org.mockito.ArgumentMatchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.util.List<java.lang.String> strList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(strList0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.util.RandomAccess randomAccess0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(randomAccess0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.util.Collection<org.mockito.verification.VerificationMode> verificationModeCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable1 = org.mockito.Mockito.spy((java.lang.Iterable<org.mockito.verification.VerificationMode>) verificationModeCollection0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationModeCollection0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) ' ');
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CLASS_DESERIALIZE_BLOCK_ALL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dubbo.security.serialize.blockAllClassExceptAllow" + "'", str0, "dubbo.security.serialize.blockAllClassExceptAllow");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.util.Set<java.util.RandomAccess> randomAccessSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(randomAccessSet0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 2);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.util.regex.Pattern pattern0 = org.apache.dubbo.common.constants.CommonConstants.REGISTRY_SPLIT_PATTERN;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "\\s*[|;]+\\s*");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.util.Collection<java.util.RandomAccess> randomAccessCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.apache.dubbo.common.extension.LoadingStrategy loadingStrategy0 = null;
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] { loadingStrategy0 };
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(loadingStrategyArrayHolder0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Extension name");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray3 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder2 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList4 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList4, mockitoSessionBuilderArray3);
        java.util.Set<org.mockito.Mockito> mockitoSet6 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream7 = mockitoSet6.parallelStream();
        boolean boolean8 = mockitoSessionBuilderList4.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet6);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator9 = mockitoSet6.spliterator();
        org.mockito.verification.VerificationMode verificationMode10 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass11 = verificationMode10.getClass();
        java.lang.String[] strArray17 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type18 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass11, strArray17);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator19 = org.mockito.ArgumentMatchers.refEq(mockitoSpliterator9, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber20 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode1, (java.lang.Object[]) strArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mockitoSet6);
        org.junit.Assert.assertNotNull(mockitoStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(mockitoSpliterator9);
        org.junit.Assert.assertNotNull(verificationMode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(mockitoSpliterator19);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet1 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean3 = mockitoSessionBuilderSet1.remove((java.lang.Object) "$echo");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder4 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray5 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder4 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList6 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList6, mockitoSessionBuilderArray5);
        java.util.Set<org.mockito.Mockito> mockitoSet8 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream9 = mockitoSet8.parallelStream();
        boolean boolean10 = mockitoSessionBuilderList6.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet8);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder11 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray12 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder11 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet13 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet13, mockitoSessionBuilderArray12);
        boolean boolean16 = mockitoSessionBuilderSet13.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder17 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray18 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder17 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList19 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList19, mockitoSessionBuilderArray18);
        java.util.Set<org.mockito.Mockito> mockitoSet21 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream22 = mockitoSet21.parallelStream();
        boolean boolean23 = mockitoSessionBuilderList19.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet21);
        boolean boolean24 = mockitoSessionBuilderSet13.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet21);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet25 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder26 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder27 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder26);
        boolean boolean28 = mockitoSessionBuilderSet25.add(mockitoSessionBuilder26);
        java.util.Set<org.mockito.Mockito> mockitoSet29 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream30 = mockitoSet29.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator31 = mockitoSet29.spliterator();
        boolean boolean32 = mockitoSessionBuilderSet25.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet29);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet33 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet33.clear();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder35 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray36 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder35 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet37 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet37, mockitoSessionBuilderArray36);
        boolean boolean40 = mockitoSessionBuilderSet37.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder41 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray42 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder41 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList43 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList43, mockitoSessionBuilderArray42);
        java.util.Set<org.mockito.Mockito> mockitoSet45 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream46 = mockitoSet45.parallelStream();
        boolean boolean47 = mockitoSessionBuilderList43.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet45);
        boolean boolean48 = mockitoSessionBuilderSet37.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet45);
        boolean boolean49 = mockitoSessionBuilderSet33.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet45);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet50 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet50.clear();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder52 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray53 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder52 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet54 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet54, mockitoSessionBuilderArray53);
        boolean boolean57 = mockitoSessionBuilderSet54.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder58 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray59 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder58 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList60 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList60, mockitoSessionBuilderArray59);
        java.util.Set<org.mockito.Mockito> mockitoSet62 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream63 = mockitoSet62.parallelStream();
        boolean boolean64 = mockitoSessionBuilderList60.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet62);
        boolean boolean65 = mockitoSessionBuilderSet54.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet62);
        boolean boolean66 = mockitoSessionBuilderSet50.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet62);
        java.util.AbstractCollection[] abstractCollectionArray68 = new java.util.AbstractCollection[5];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>[] mockitoSessionBuilderCollectionArray69 = (java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>[]) abstractCollectionArray68;
        mockitoSessionBuilderCollectionArray69[0] = mockitoSessionBuilderList6;
        mockitoSessionBuilderCollectionArray69[1] = mockitoSessionBuilderSet13;
        mockitoSessionBuilderCollectionArray69[2] = mockitoSessionBuilderSet25;
        mockitoSessionBuilderCollectionArray69[3] = mockitoSessionBuilderSet33;
        mockitoSessionBuilderCollectionArray69[4] = mockitoSessionBuilderSet50;
        java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>[] mockitoSessionBuilderCollectionArray80 = mockitoSessionBuilderSet1.toArray(mockitoSessionBuilderCollectionArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber81 = org.mockito.Mockito.doReturn((java.lang.Object) "callbacks", (java.lang.Object[]) mockitoSessionBuilderCollectionArray69);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder4);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mockitoSet8);
        org.junit.Assert.assertNotNull(mockitoStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder11);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder17);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(mockitoSet21);
        org.junit.Assert.assertNotNull(mockitoStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder26);
        org.junit.Assert.assertNull(mockitoSessionBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(mockitoSet29);
        org.junit.Assert.assertNotNull(mockitoStream30);
        org.junit.Assert.assertNotNull(mockitoSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder35);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder41);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(mockitoSet45);
        org.junit.Assert.assertNotNull(mockitoStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder52);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder58);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(mockitoSet62);
        org.junit.Assert.assertNotNull(mockitoStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(abstractCollectionArray68);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderCollectionArray69);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderCollectionArray80);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream1 = mockitoSet0.parallelStream();
        java.lang.AutoCloseable autoCloseable2 = org.mockito.ArgumentMatchers.same((java.lang.AutoCloseable) mockitoStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.BaseStream<org.mockito.Mockito, java.util.stream.Stream<org.mockito.Mockito>> mockitoBaseStream3 = org.mockito.Mockito.spy((java.util.stream.BaseStream<org.mockito.Mockito, java.util.stream.Stream<org.mockito.Mockito>>) mockitoStream1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mockito cannot mock this class: class java.util.stream.ReferencePipeline$Head.??Mockito can only mock non-private & non-final classes.?If you're not sure why you're getting this error, please report to the mailing list.???Java               : 1.8?JVM vendor name    : Oracle Corporation?JVM vendor version : 25.151-b12?JVM name           : Java HotSpot(TM) 64-Bit Server VM?JVM version        : 1.8.0_151-b12?JVM info           : mixed mode?OS name            : Linux?OS version         : 4.15.0-142-generic???Underlying exception : org.mockito.exceptions.base.MockitoException: ?Cannot create mock for class java.util.stream.ReferencePipeline$Head??The type is not public and its mock class is loaded by a different class loader.?This can have multiple reasons:? - You are mocking a class with additional interfaces of another class loader? - Mockito is loaded by a different class loader than the mocked type (e.g. with OSGi)? - The thread's context class loader is different than the mock's class loader");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSet0);
        org.junit.Assert.assertNotNull(mockitoStream1);
        org.junit.Assert.assertNull(autoCloseable2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.REVISION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "revision" + "'", str0, "revision");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.stubbing.Answer[] answerArray2 = new org.mockito.stubbing.Answer[1];
        @SuppressWarnings("unchecked")
        org.mockito.stubbing.Answer<java.lang.Object>[] objAnswerArray3 = (org.mockito.stubbing.Answer<java.lang.Object>[]) answerArray2;
        objAnswerArray3[0] = objAnswer0;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(objAnswerArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
        org.junit.Assert.assertNotNull(answerArray2);
        org.junit.Assert.assertNotNull(objAnswerArray3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.mockito.ArgumentMatcher<java.lang.Character> charArgumentMatcher0 = null;
        char char1 = org.mockito.ArgumentMatchers.charThat(charArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.UTF8ENCODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        boolean boolean3 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder1);
        java.util.Set<org.mockito.Mockito> mockitoSet4 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream5 = mockitoSet4.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator6 = mockitoSet4.spliterator();
        boolean boolean7 = mockitoSessionBuilderSet0.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet4);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator8 = mockitoSet4.spliterator();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream9 = mockitoSet4.parallelStream();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSet4);
        org.junit.Assert.assertNotNull(mockitoStream5);
        org.junit.Assert.assertNotNull(mockitoSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mockitoSpliterator8);
        org.junit.Assert.assertNotNull(mockitoStream9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.util.Collection<org.mockito.verification.VerificationMode> verificationModeCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Iterable<org.mockito.verification.VerificationMode>> verificationModeIterableOngoingStubbing1 = org.mockito.Mockito.when((java.lang.Iterable<org.mockito.verification.VerificationMode>) verificationModeCollection0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationModeCollection0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        int int1 = org.mockito.ArgumentMatchers.eq(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        loadingStrategyArrayHolder0.set(loadingStrategyArray1);
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray5 = loadingStrategyArrayHolder0.get();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray6 = loadingStrategyArrayHolder0.get();
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray6);
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(loadingStrategyArray5);
        org.junit.Assert.assertNotNull(loadingStrategyArray6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream1 = mockitoSet0.parallelStream();
        java.util.Set<org.mockito.Mockito> mockitoSet2 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream3 = mockitoSet2.parallelStream();
        java.lang.AutoCloseable autoCloseable4 = org.mockito.ArgumentMatchers.same((java.lang.AutoCloseable) mockitoStream3);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet5 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder6 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder7 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder6);
        boolean boolean8 = mockitoSessionBuilderSet5.add(mockitoSessionBuilder6);
        java.util.Set<org.mockito.Mockito> mockitoSet9 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream10 = mockitoSet9.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator11 = mockitoSet9.spliterator();
        boolean boolean12 = mockitoSessionBuilderSet5.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet9);
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream13 = mockitoSet9.parallelStream();
        java.util.stream.Stream[] streamArray15 = new java.util.stream.Stream[3];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<org.mockito.Mockito>[] mockitoStreamArray16 = (java.util.stream.Stream<org.mockito.Mockito>[]) streamArray15;
        mockitoStreamArray16[0] = mockitoStream1;
        mockitoStreamArray16[1] = mockitoStream3;
        mockitoStreamArray16[2] = mockitoStream13;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoStreamArray16);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSet0);
        org.junit.Assert.assertNotNull(mockitoStream1);
        org.junit.Assert.assertNotNull(mockitoSet2);
        org.junit.Assert.assertNotNull(mockitoStream3);
        org.junit.Assert.assertNull(autoCloseable4);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder6);
        org.junit.Assert.assertNull(mockitoSessionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(mockitoSet9);
        org.junit.Assert.assertNotNull(mockitoStream10);
        org.junit.Assert.assertNotNull(mockitoSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mockitoStream13);
        org.junit.Assert.assertNotNull(streamArray15);
        org.junit.Assert.assertNotNull(mockitoStreamArray16);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '#');
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass3 = verificationMode2.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type10 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray9);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay11 = org.mockito.ArgumentMatchers.refEq(verificationAfterDelay1, strArray9);
        org.mockito.MockingDetails mockingDetails12 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationAfterDelay11);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(verificationAfterDelay11);
        org.junit.Assert.assertNotNull(mockingDetails12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.never();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        java.lang.reflect.Type type2 = org.mockito.ArgumentMatchers.same((java.lang.reflect.Type) wildcardClass1);
        org.apache.dubbo.common.extension.ExtensionLoader.resetExtensionLoader((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.util.Map<java.lang.CharSequence, org.mockito.MockitoFramework> charSequenceMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(charSequenceMap0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.lang.Iterable<java.lang.Throwable[]> throwableArrayIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        java.lang.Class<?> wildcardClass1 = throwableArrayIterable0.getClass();
        org.junit.Assert.assertNotNull(throwableArrayIterable0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("gson");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.util.Collection<java.util.List<java.lang.reflect.GenericDeclaration>> genericDeclarationListCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(genericDeclarationListCollection0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        java.lang.Object[] objArray2 = mockitoSessionBuilderSet0.toArray();
        java.util.Iterator<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderItor3 = mockitoSessionBuilderSet0.iterator();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilderItor3);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        boolean boolean3 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder1);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder4 = org.mockito.Mockito.mockitoSession();
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet5 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder6 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder7 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder6);
        boolean boolean8 = mockitoSessionBuilderSet5.add(mockitoSessionBuilder6);
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray9 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder1, mockitoSessionBuilder4, mockitoSessionBuilder6 };
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet10 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet10, mockitoSessionBuilderArray9);
        mockitoSessionBuilderSet10.clear();
        java.util.Iterator<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderItor13 = mockitoSessionBuilderSet10.iterator();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder4);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder6);
        org.junit.Assert.assertNull(mockitoSessionBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderItor13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DISABLED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disabled" + "'", str0, "disabled");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        long long1 = org.mockito.ArgumentMatchers.eq((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        java.util.AbstractSet[] abstractSetArray3 = new java.util.AbstractSet[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<org.mockito.session.MockitoSessionBuilder>[] mockitoSessionBuilderSetArray4 = (java.util.AbstractSet<org.mockito.session.MockitoSessionBuilder>[]) abstractSetArray3;
        mockitoSessionBuilderSetArray4[0] = mockitoSessionBuilderSet0;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoSessionBuilderSetArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(abstractSetArray3);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderSetArray4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean2 = mockitoSessionBuilderSet0.remove((java.lang.Object) "$echo");
        boolean boolean4 = mockitoSessionBuilderSet0.equals((java.lang.Object) (byte) 1);
        mockitoSessionBuilderSet0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream1 = mockitoSet0.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator2 = mockitoSet0.spliterator();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream3 = mockitoSet0.stream();
        org.junit.Assert.assertNotNull(mockitoSet0);
        org.junit.Assert.assertNotNull(mockitoStream1);
        org.junit.Assert.assertNotNull(mockitoSpliterator2);
        org.junit.Assert.assertNotNull(mockitoStream3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.util.regex.Pattern pattern0 = org.apache.dubbo.common.constants.CommonConstants.EQUAL_SPLIT_PATTERN;
        java.util.regex.Pattern pattern1 = org.mockito.ArgumentMatchers.eq(pattern0);
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "\\s*[=]+\\s*");
        org.junit.Assert.assertNull(pattern1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEEP_STUBS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.DEFAULT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.util.AbstractList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mockitoSessionBuilderList0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        java.lang.Class<?> wildcardClass1 = objAnswer0.getClass();
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_MOCKS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_MOCKS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.util.Set<org.mockito.verification.VerificationMode> verificationModeSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(verificationModeSet0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray1 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList2 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList2, mockitoSessionBuilderArray1);
        java.util.Set<org.mockito.Mockito> mockitoSet4 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream5 = mockitoSet4.parallelStream();
        boolean boolean6 = mockitoSessionBuilderList2.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet4);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator7 = mockitoSet4.spliterator();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream8 = mockitoSet4.stream();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSet4);
        org.junit.Assert.assertNotNull(mockitoStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(mockitoSpliterator7);
        org.junit.Assert.assertNotNull(mockitoStream8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.util.Map<java.util.stream.BaseStream<org.mockito.Mockito, java.util.stream.Stream<org.mockito.Mockito>>, java.util.Collection<org.mockito.Mockito>> mockitoBaseStreamMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoBaseStreamMap0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockitoSpliterator0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ANY_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*" + "'", str0, "*");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doThrow(throwableArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        java.lang.Object[] objArray2 = mockitoSessionBuilderSet0.toArray();
        mockitoSessionBuilderSet0.clear();
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet4 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder5 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder6 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder5);
        boolean boolean7 = mockitoSessionBuilderSet4.add(mockitoSessionBuilder5);
        java.util.Set<org.mockito.Mockito> mockitoSet8 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream9 = mockitoSet8.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator10 = mockitoSet8.spliterator();
        boolean boolean11 = mockitoSessionBuilderSet4.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet8);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator12 = mockitoSet8.spliterator();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream13 = mockitoSet8.stream();
        boolean boolean14 = mockitoSessionBuilderSet0.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet8);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder5);
        org.junit.Assert.assertNull(mockitoSessionBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mockitoSet8);
        org.junit.Assert.assertNotNull(mockitoStream9);
        org.junit.Assert.assertNotNull(mockitoSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mockitoSpliterator12);
        org.junit.Assert.assertNotNull(mockitoStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.mockito.ArgumentMatcher<java.lang.Long> longArgumentMatcher0 = null;
        long long1 = org.mockito.ArgumentMatchers.longThat(longArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.util.List<org.mockito.verification.VerificationMode> verificationModeList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(verificationModeList0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray3 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder2 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet4 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet4, mockitoSessionBuilderArray3);
        boolean boolean7 = mockitoSessionBuilderSet4.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray9 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder8 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList10 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList10, mockitoSessionBuilderArray9);
        java.util.Set<org.mockito.Mockito> mockitoSet12 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream13 = mockitoSet12.parallelStream();
        boolean boolean14 = mockitoSessionBuilderList10.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet12);
        boolean boolean15 = mockitoSessionBuilderSet4.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet12);
        boolean boolean16 = mockitoSessionBuilderSet0.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet12);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet17 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean19 = mockitoSessionBuilderSet17.remove((java.lang.Object) "$echo");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder20 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray21 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder20 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList22 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList22, mockitoSessionBuilderArray21);
        java.util.Set<org.mockito.Mockito> mockitoSet24 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream25 = mockitoSet24.parallelStream();
        boolean boolean26 = mockitoSessionBuilderList22.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet24);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator27 = mockitoSet24.spliterator();
        boolean boolean28 = mockitoSessionBuilderSet17.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet24);
        boolean boolean29 = mockitoSessionBuilderSet0.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet24);
        boolean boolean31 = mockitoSessionBuilderSet0.remove((java.lang.Object) ") is not an interface!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber32 = org.mockito.Mockito.doReturn((java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder8);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mockitoSet12);
        org.junit.Assert.assertNotNull(mockitoStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder20);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mockitoSet24);
        org.junit.Assert.assertNotNull(mockitoStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(mockitoSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        loadingStrategyArrayHolder0.set(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.mockito.verification.VerificationMode verificationMode6 = org.mockito.Mockito.never();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray7 = org.mockito.Mockito.verify(loadingStrategyArray1, verificationMode6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type LoadingStrategy[] and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(verificationMode6);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet1 = org.mockito.ArgumentMatchers.same(mockitoSessionBuilderSet0);
        java.lang.String str2 = mockitoSessionBuilderSet0.toString();
        boolean boolean4 = mockitoSessionBuilderSet0.equals((java.lang.Object) ", class file:");
        org.junit.Assert.assertNull(mockitoSessionBuilderSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder1 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray2 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray2);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray2);
        loadingStrategyArrayHolder1.set(loadingStrategyArray2);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray2);
        loadingStrategyArrayHolder0.set(loadingStrategyArray2);
        org.junit.Assert.assertNotNull(loadingStrategyArray2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("method");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        java.lang.Object[] objArray1 = mockitoSessionBuilderSet0.toArray();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder3 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNull(mockitoSessionBuilder3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.description("Extension name");
        java.lang.Class<?> wildcardClass4 = verificationMode3.getClass();
        org.apache.dubbo.common.extension.ExtensionLoader.resetExtensionLoader((java.lang.Class) wildcardClass4);
        boolean boolean6 = mockitoSessionBuilderSet0.contains((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.Mockito.spy((java.lang.reflect.AnnotatedElement) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.Class?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        java.lang.Object[] objArray2 = mockitoSessionBuilderSet0.toArray();
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet4 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>(2147483647);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder5 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray6 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder5 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList7 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList7, mockitoSessionBuilderArray6);
        java.util.Set<org.mockito.Mockito> mockitoSet9 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream10 = mockitoSet9.parallelStream();
        boolean boolean11 = mockitoSessionBuilderList7.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet9);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator12 = mockitoSet9.spliterator();
        boolean boolean13 = mockitoSessionBuilderSet4.contains((java.lang.Object) mockitoSet9);
        boolean boolean14 = mockitoSessionBuilderSet0.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder5);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(mockitoSet9);
        org.junit.Assert.assertNotNull(mockitoStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mockitoSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(mockitoSessionBuilderSet0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        loadingStrategyArrayHolder0.set(loadingStrategyArray1);
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray5 = loadingStrategyArrayHolder0.get();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray6 = loadingStrategyArrayHolder0.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder7 = org.mockito.Mockito.verify(loadingStrategyArrayHolder0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Holder and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(loadingStrategyArray5);
        org.junit.Assert.assertNotNull(loadingStrategyArray6);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.CONSUMER_SIDE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "consumer" + "'", str0, "consumer");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        java.util.Comparator<java.lang.Object> objComparator0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(objComparator0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet1 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>(2147483647);
        java.lang.String str2 = mockitoSessionBuilderSet1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        boolean boolean3 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder1);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet4 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder5 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder6 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder5);
        boolean boolean7 = mockitoSessionBuilderSet4.add(mockitoSessionBuilder5);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray9 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder1, mockitoSessionBuilder5, mockitoSessionBuilder8 };
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet10 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet10, mockitoSessionBuilderArray9);
        java.util.Iterator<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderItor12 = mockitoSessionBuilderSet10.iterator();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder5);
        org.junit.Assert.assertNull(mockitoSessionBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder8);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderItor12);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        java.lang.String str0 = org.apache.dubbo.common.constants.CommonConstants.ANYHOST_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0.0.0.0" + "'", str0, "0.0.0.0");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Can't create adaptive extension");
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.calls(3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.verify(verificationMode1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Description and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.Mockito.after((long) '#');
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass4 = verificationMode3.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type11 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass4, strArray10);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay12 = org.mockito.ArgumentMatchers.refEq(verificationAfterDelay2, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence13 = org.mockito.Mockito.verify((java.lang.CharSequence) "check", (org.mockito.verification.VerificationMode) verificationAfterDelay2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay2);
        org.junit.Assert.assertNotNull(verificationMode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(verificationAfterDelay12);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        loadingStrategyArrayHolder0.set(loadingStrategyArray1);
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray5 = loadingStrategyArrayHolder0.get();
        org.mockito.verification.VerificationMode verificationMode7 = org.mockito.Mockito.atMost((int) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray8 = org.mockito.Mockito.verify(loadingStrategyArray5, verificationMode7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type LoadingStrategy[] and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(loadingStrategyArray5);
        org.junit.Assert.assertNotNull(verificationMode7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.util.Set<java.lang.reflect.Type> typeSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(typeSet0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.ArgumentMatchers.eq((java.lang.Comparable<java.lang.String>) "servlet");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet1 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>(0);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet2 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder3 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder4 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder3);
        boolean boolean5 = mockitoSessionBuilderSet2.add(mockitoSessionBuilder3);
        java.util.Set<org.mockito.Mockito> mockitoSet6 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream7 = mockitoSet6.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator8 = mockitoSet6.spliterator();
        boolean boolean9 = mockitoSessionBuilderSet2.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet6);
        java.util.Set<org.mockito.Mockito> mockitoSet10 = org.mockito.ArgumentMatchers.eq(mockitoSet6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mockitoSessionBuilderSet1.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder3);
        org.junit.Assert.assertNull(mockitoSessionBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mockitoSet6);
        org.junit.Assert.assertNotNull(mockitoStream7);
        org.junit.Assert.assertNotNull(mockitoSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(mockitoSet10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        java.util.List<java.util.Spliterator<org.mockito.Mockito>> mockitoSpliteratorList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(mockitoSpliteratorList0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        java.util.List<java.util.HashSet<org.mockito.session.MockitoSessionBuilder>> mockitoSessionBuilderSetList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderSetList0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        char char1 = org.mockito.ArgumentMatchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMostOnce();
        boolean boolean2 = mockitoSessionBuilderSet0.contains((java.lang.Object) verificationMode1);
        java.util.Iterator<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderItor3 = mockitoSessionBuilderSet0.iterator();
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderItor3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        long long1 = org.mockito.ArgumentMatchers.eq((long) '\000');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor32.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor32.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.util.regex.Pattern pattern0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(pattern0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        loadingStrategyArrayHolder0.set(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        float float1 = org.mockito.ArgumentMatchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray3 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder2 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet4 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet4, mockitoSessionBuilderArray3);
        boolean boolean7 = mockitoSessionBuilderSet4.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray9 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder8 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList10 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList10, mockitoSessionBuilderArray9);
        java.util.Set<org.mockito.Mockito> mockitoSet12 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream13 = mockitoSet12.parallelStream();
        boolean boolean14 = mockitoSessionBuilderList10.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet12);
        boolean boolean15 = mockitoSessionBuilderSet4.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet12);
        boolean boolean16 = mockitoSessionBuilderSet0.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet12);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet17 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean19 = mockitoSessionBuilderSet17.remove((java.lang.Object) "$echo");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder20 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray21 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder20 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList22 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList22, mockitoSessionBuilderArray21);
        java.util.Set<org.mockito.Mockito> mockitoSet24 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream25 = mockitoSet24.parallelStream();
        boolean boolean26 = mockitoSessionBuilderList22.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet24);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator27 = mockitoSet24.spliterator();
        boolean boolean28 = mockitoSessionBuilderSet17.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet24);
        boolean boolean29 = mockitoSessionBuilderSet0.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet24);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet30 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder31 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder32 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder31);
        boolean boolean33 = mockitoSessionBuilderSet30.add(mockitoSessionBuilder31);
        java.util.Set<org.mockito.Mockito> mockitoSet34 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream35 = mockitoSet34.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator36 = mockitoSet34.spliterator();
        boolean boolean37 = mockitoSessionBuilderSet30.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet34);
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator38 = mockitoSet34.spliterator();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream39 = mockitoSet34.stream();
        boolean boolean40 = mockitoSessionBuilderSet0.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet34);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder8);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mockitoSet12);
        org.junit.Assert.assertNotNull(mockitoStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder20);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mockitoSet24);
        org.junit.Assert.assertNotNull(mockitoStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(mockitoSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder31);
        org.junit.Assert.assertNull(mockitoSessionBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(mockitoSet34);
        org.junit.Assert.assertNotNull(mockitoStream35);
        org.junit.Assert.assertNotNull(mockitoSpliterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mockitoSpliterator38);
        org.junit.Assert.assertNotNull(mockitoStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        java.util.Map<java.util.stream.Stream<org.mockito.Mockito>, java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>> mockitoStreamMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoStreamMap0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean2 = mockitoSessionBuilderSet0.remove((java.lang.Object) "$echo");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder3 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray4 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder3 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList5 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList5, mockitoSessionBuilderArray4);
        java.util.Set<org.mockito.Mockito> mockitoSet7 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream8 = mockitoSet7.parallelStream();
        boolean boolean9 = mockitoSessionBuilderList5.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet7);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder10 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray11 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder10 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet12 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet12, mockitoSessionBuilderArray11);
        boolean boolean15 = mockitoSessionBuilderSet12.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder16 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray17 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder16 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList18 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList18, mockitoSessionBuilderArray17);
        java.util.Set<org.mockito.Mockito> mockitoSet20 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream21 = mockitoSet20.parallelStream();
        boolean boolean22 = mockitoSessionBuilderList18.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet20);
        boolean boolean23 = mockitoSessionBuilderSet12.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet20);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet24 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder25 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder26 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder25);
        boolean boolean27 = mockitoSessionBuilderSet24.add(mockitoSessionBuilder25);
        java.util.Set<org.mockito.Mockito> mockitoSet28 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream29 = mockitoSet28.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator30 = mockitoSet28.spliterator();
        boolean boolean31 = mockitoSessionBuilderSet24.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet28);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet32 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet32.clear();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder34 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray35 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder34 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet36 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet36, mockitoSessionBuilderArray35);
        boolean boolean39 = mockitoSessionBuilderSet36.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder40 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray41 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder40 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList42 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList42, mockitoSessionBuilderArray41);
        java.util.Set<org.mockito.Mockito> mockitoSet44 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream45 = mockitoSet44.parallelStream();
        boolean boolean46 = mockitoSessionBuilderList42.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet44);
        boolean boolean47 = mockitoSessionBuilderSet36.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet44);
        boolean boolean48 = mockitoSessionBuilderSet32.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet44);
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet49 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet49.clear();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder51 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray52 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder51 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet53 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet53, mockitoSessionBuilderArray52);
        boolean boolean56 = mockitoSessionBuilderSet53.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder57 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray58 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder57 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList59 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList59, mockitoSessionBuilderArray58);
        java.util.Set<org.mockito.Mockito> mockitoSet61 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream62 = mockitoSet61.parallelStream();
        boolean boolean63 = mockitoSessionBuilderList59.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet61);
        boolean boolean64 = mockitoSessionBuilderSet53.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet61);
        boolean boolean65 = mockitoSessionBuilderSet49.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet61);
        java.util.AbstractCollection[] abstractCollectionArray67 = new java.util.AbstractCollection[5];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>[] mockitoSessionBuilderCollectionArray68 = (java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>[]) abstractCollectionArray67;
        mockitoSessionBuilderCollectionArray68[0] = mockitoSessionBuilderList5;
        mockitoSessionBuilderCollectionArray68[1] = mockitoSessionBuilderSet12;
        mockitoSessionBuilderCollectionArray68[2] = mockitoSessionBuilderSet24;
        mockitoSessionBuilderCollectionArray68[3] = mockitoSessionBuilderSet32;
        mockitoSessionBuilderCollectionArray68[4] = mockitoSessionBuilderSet49;
        java.util.AbstractCollection<org.mockito.session.MockitoSessionBuilder>[] mockitoSessionBuilderCollectionArray79 = mockitoSessionBuilderSet0.toArray(mockitoSessionBuilderCollectionArray68);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) mockitoSessionBuilderCollectionArray79);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder3);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(mockitoSet7);
        org.junit.Assert.assertNotNull(mockitoStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder10);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder16);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mockitoSet20);
        org.junit.Assert.assertNotNull(mockitoStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder25);
        org.junit.Assert.assertNull(mockitoSessionBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(mockitoSet28);
        org.junit.Assert.assertNotNull(mockitoStream29);
        org.junit.Assert.assertNotNull(mockitoSpliterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder34);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder40);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(mockitoSet44);
        org.junit.Assert.assertNotNull(mockitoStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder51);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder57);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(mockitoSet61);
        org.junit.Assert.assertNotNull(mockitoStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(abstractCollectionArray67);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderCollectionArray68);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderCollectionArray79);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]> loadingStrategyArrayHolder0 = new org.apache.dubbo.common.utils.Holder<org.apache.dubbo.common.extension.LoadingStrategy[]>();
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray1 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray1);
        loadingStrategyArrayHolder0.set(loadingStrategyArray1);
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray5 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray5);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray5);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray5);
        loadingStrategyArrayHolder0.set(loadingStrategyArray5);
        org.apache.dubbo.common.extension.LoadingStrategy[] loadingStrategyArray10 = new org.apache.dubbo.common.extension.LoadingStrategy[] {};
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray10);
        org.apache.dubbo.common.extension.ExtensionLoader.setLoadingStrategies(loadingStrategyArray10);
        loadingStrategyArrayHolder0.set(loadingStrategyArray10);
        org.junit.Assert.assertNotNull(loadingStrategyArray1);
        org.junit.Assert.assertNotNull(loadingStrategyArray5);
        org.junit.Assert.assertNotNull(loadingStrategyArray10);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray1 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0 };
        java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet2 = new java.util.LinkedHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderSet2, mockitoSessionBuilderArray1);
        boolean boolean5 = mockitoSessionBuilderSet2.equals((java.lang.Object) "anyhost");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder6 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray7 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder6 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList8 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList8, mockitoSessionBuilderArray7);
        java.util.Set<org.mockito.Mockito> mockitoSet10 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream11 = mockitoSet10.parallelStream();
        boolean boolean12 = mockitoSessionBuilderList8.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet10);
        boolean boolean13 = mockitoSessionBuilderSet2.containsAll((java.util.Collection<org.mockito.Mockito>) mockitoSet10);
        java.lang.Object[] objArray14 = mockitoSessionBuilderSet2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder6);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(mockitoSet10);
        org.junit.Assert.assertNotNull(mockitoStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 1);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        mockitoSessionBuilderSet0.clear();
        java.util.Iterator<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderItor2 = mockitoSessionBuilderSet0.iterator();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderItor2);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        java.util.Collection<org.mockito.ArgumentMatchers> argumentMatchersCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(argumentMatchersCollection0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mockitoStream0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray1 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0 };
        java.util.ArrayList<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList2 = new java.util.ArrayList<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.mockito.session.MockitoSessionBuilder>) mockitoSessionBuilderList2, mockitoSessionBuilderArray1);
        java.util.Set<org.mockito.Mockito> mockitoSet4 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream5 = mockitoSet4.parallelStream();
        boolean boolean6 = mockitoSessionBuilderList2.retainAll((java.util.Collection<org.mockito.Mockito>) mockitoSet4);
        java.lang.Object[] objArray7 = mockitoSessionBuilderList2.toArray();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSet4);
        org.junit.Assert.assertNotNull(mockitoStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        java.util.List<java.util.stream.Stream<org.mockito.Mockito>> mockitoStreamList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(mockitoStreamList0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        java.lang.Object[] objArray0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(objArray0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        boolean boolean2 = mockitoSessionBuilderSet0.remove((java.lang.Object) "$echo");
        boolean boolean4 = mockitoSessionBuilderSet0.contains((java.lang.Object) "async-thread-num");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream1 = mockitoSet0.stream();
        org.junit.Assert.assertNotNull(mockitoSet0);
        org.junit.Assert.assertNotNull(mockitoStream1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        boolean boolean3 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder1);
        java.util.Set<org.mockito.Mockito> mockitoSet4 = org.mockito.ArgumentMatchers.anySet();
        java.util.stream.Stream<org.mockito.Mockito> mockitoStream5 = mockitoSet4.parallelStream();
        java.util.Spliterator<org.mockito.Mockito> mockitoSpliterator6 = mockitoSet4.spliterator();
        boolean boolean7 = mockitoSessionBuilderSet0.removeAll((java.util.Collection<org.mockito.Mockito>) mockitoSet4);
        java.lang.String str8 = mockitoSessionBuilderSet0.toString();
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mockitoSet4);
        org.junit.Assert.assertNotNull(mockitoStream5);
        org.junit.Assert.assertNotNull(mockitoSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = new org.apache.dubbo.common.utils.ConcurrentHashSet<org.mockito.session.MockitoSessionBuilder>();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.ArgumentMatchers.eq(mockitoSessionBuilder1);
        boolean boolean3 = mockitoSessionBuilderSet0.add(mockitoSessionBuilder1);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atMostOnce();
        java.lang.Class<?> wildcardClass5 = verificationMode4.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "true", "dubbo.migration.file", "s*[,]+s*", "Can't create adaptive extension", "org.apache" };
        java.lang.reflect.Type type12 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.Type) wildcardClass5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray13 = mockitoSessionBuilderSet0.toArray((java.lang.CharSequence[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: org.mockito.internal.session.DefaultMockitoSessionBuilder");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNull(mockitoSessionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(verificationMode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("protocol");
        org.junit.Assert.assertNotNull(verificationMode1);
    }
}
