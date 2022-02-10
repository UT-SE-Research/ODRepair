package org.apache.skywalking.apm.commons.datacarrier.consumer;

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
        org.junit.Assert.assertEquals((double) 10, (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        char char1 = org.mockito.ArgumentMatchers.eq('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doCallRealMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        char char1 = org.mockito.ArgumentMatchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = org.mockito.ArgumentMatchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.util.regex.Pattern pattern0 = null;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.junit.Assert.assertNotEquals("data", (-1.0d), (double) (byte) 100, (double) 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        float float0 = org.mockito.ArgumentMatchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        int int0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.Set<java.lang.Object> objSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(objSet0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.junit.Assert.assertNotEquals("data", (java.lang.Object) 1L, (java.lang.Object) (-1L));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(serializableArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer1, (long) (byte) 10);
        java.lang.Runnable[] runnableArray4 = new java.lang.Runnable[] { objConsumerThread3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(runnableArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(runnableArray4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Collection<java.lang.Object>> objCollectionIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.util.Collection<java.lang.Object>> objCollectionConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.util.Collection<java.lang.Object>>("", objCollectionIConsumer1, 10L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        double double0 = org.mockito.ArgumentMatchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy5 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier6 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy5);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer22 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.MockingDetails mockingDetails27 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay29 = org.mockito.Mockito.after((long) (byte) 100);
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy34 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier35 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy34);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 0, 'a', (short) 100, (byte) 100, 10, (byte) 1, "consumer", (short) 0, (short) 10, (byte) 100, false, "consumerThreads", 100.0f, 0.0f, (byte) -1, objAnswer20, "consumerThreads", objAnswer22, 0.0f, (short) -1, (byte) 0, true, (byte) 100, serializableMapDataCarrier35, 1L, '\000' };
        java.util.ArrayList<java.lang.Object> objList39 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList39, objArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection41 = org.mockito.Mockito.spy((java.util.Collection<java.lang.Object>) objList39);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer20 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer20.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertTrue("'" + objAnswer22 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer22.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(mockingDetails27);
        org.junit.Assert.assertNotNull(verificationAfterDelay29);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        byte byte0 = org.mockito.ArgumentMatchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.mockito.ArgumentMatcher<java.lang.Byte> byteArgumentMatcher0 = null;
        byte byte1 = org.mockito.ArgumentMatchers.byteThat(byteArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.mockito.stubbing.Answer[] answerArray1 = new org.mockito.stubbing.Answer[0];
        @SuppressWarnings("unchecked")
        org.mockito.stubbing.Answer<java.lang.Object>[] objAnswerArray2 = (org.mockito.stubbing.Answer<java.lang.Object>[]) answerArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(objAnswerArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray1);
        org.junit.Assert.assertNotNull(objAnswerArray2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("driver");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        char char0 = org.mockito.ArgumentMatchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("consumerThreads");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.junit.Assert.assertNotEquals((long) '#', (long) (short) 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.lang.Object[]> objArrayDataCarrier2 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.lang.Object[]>(0, (int) (byte) 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.junit.Assert.assertNotEquals((float) (-1L), 100.0f, (float) (byte) 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.junit.Assert.assertNotEquals("data", (java.lang.Object) 0L, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        short short1 = org.mockito.ArgumentMatchers.eq((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier8 = serializableMapDataCarrier5.consume(serializableMapIConsumer6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<java.lang.Runnable> runnableChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Runnable> runnableIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.lang.Runnable> runnableConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.lang.Runnable>("hi!", runnableChannels1, runnableIConsumer2, (int) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<java.lang.String> strChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.String> strIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.lang.String> strConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.lang.String>("driver", strChannels1, strIConsumer2, (int) (short) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.junit.Assert.assertTrue("hi!", true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.mockito.ArgumentMatcher<java.lang.Integer> intArgumentMatcher0 = null;
        int int1 = org.mockito.ArgumentMatchers.intThat(intArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Collection<java.util.Collection<java.lang.Object>> objCollectionCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(objCollectionCollection0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(objConsumerThread0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier10 = serializableMapDataCarrier5.consume(serializableMapIConsumer8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.Set<java.lang.Object> objSet0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(objSet0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray7 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber9 = org.mockito.Mockito.doReturn((java.lang.Object) "consumer", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(mockitoSessionBuilder8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(objAnswer0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray1, objArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) "data", (java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<java.util.Collection<java.lang.Object>> objCollectionChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Collection<java.lang.Object>> objCollectionIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.util.Collection<java.lang.Object>> objCollectionConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.util.Collection<java.lang.Object>>("consumer", objCollectionChannels1, objCollectionIConsumer2, (int) '\000', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(genericDeclarationList0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer1, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            objConsumerThread3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.junit.Assert.assertEquals("driver", (double) 0, (double) 1, (double) 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.lang.reflect.GenericDeclaration> genericDeclarationDataCarrier3 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.lang.reflect.GenericDeclaration>((-1), 10, bufferStrategy2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.util.Map<java.lang.Object, java.lang.reflect.GenericDeclaration> objMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(objMap0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.junit.Assert.assertNotEquals((float) 0L, (float) 100, (float) (byte) 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest0.testConsumerLessThanChannel();
        consumerTest0.testConsumerOnError();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.CharSequence charSequence0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.junit.Assert.assertTrue("", true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray0 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList1 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList1, sampleDataArray0);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atMost((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList5 = org.mockito.Mockito.verify((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList1, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ArrayList and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sampleDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.mockito.Mockito mockito0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(mockito0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.mockito.ArgumentMatcher<java.lang.Short> shortArgumentMatcher0 = null;
        short short1 = org.mockito.ArgumentMatchers.shortThat(shortArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) "driver");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.mockito.ArgumentMatcher<java.lang.Double> doubleArgumentMatcher0 = null;
        double double1 = org.mockito.ArgumentMatchers.doubleThat(doubleArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.junit.Assert.assertNotNull((java.lang.Object) 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        int int1 = org.mockito.ArgumentMatchers.eq(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.junit.Assert.assertNotEquals("", (double) 1.0f, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        int int1 = org.mockito.ArgumentMatchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray1, objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder4 = org.mockito.Mockito.inOrder(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (byte) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.mockito.ArgumentMatcher<java.lang.Long> longArgumentMatcher0 = null;
        long long1 = org.mockito.ArgumentMatchers.longThat(longArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier11 = serializableMapDataCarrier5.consume(serializableMapIConsumer9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.junit.Assert.assertNotEquals((java.lang.Object) '4', (java.lang.Object) (short) -1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(consumerTest0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.junit.Assert.assertEquals((double) (byte) 10, (double) ' ', 100.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        org.mockito.MockingDetails mockingDetails5 = org.mockito.Mockito.mockingDetails((java.lang.Object) 1.0d);
        org.mockito.MockingDetails mockingDetails7 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        org.mockito.MockingDetails[] mockingDetailsArray8 = new org.mockito.MockingDetails[] { mockingDetails1, mockingDetails3, mockingDetails5, mockingDetails7 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockingDetailsArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNotNull(mockingDetails5);
        org.junit.Assert.assertNotNull(mockingDetails7);
        org.junit.Assert.assertNotNull(mockingDetailsArray8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.Thread thread0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(thread0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.junit.Assert.assertTrue("consumer", true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.junit.Assert.assertFalse(false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.util.Set<org.mockito.verification.VerificationMode> verificationModeSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(verificationModeSet0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) 100.0f, (java.lang.Object) 1L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        short short0 = org.mockito.ArgumentMatchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.IS_OCCUR_ERROR = false;
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(verificationModeIterable0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.mockito.ArgumentMatcher<java.lang.Boolean> booleanArgumentMatcher0 = null;
        boolean boolean1 = org.mockito.ArgumentMatchers.booleanThat(booleanArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<org.mockito.MockSettings> mockSettingsChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<org.mockito.MockSettings> mockSettingsIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<org.mockito.MockSettings> mockSettingsConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<org.mockito.MockSettings>("consumer", mockSettingsChannels1, mockSettingsIConsumer2, (int) ' ', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray0 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataQueue1 = new java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataQueue1, sampleDataArray0);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.BUFFER = sampleDataQueue1;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.BUFFER = sampleDataQueue1;
        org.junit.Assert.assertNotNull(sampleDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        boolean boolean0 = org.mockito.ArgumentMatchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.ArgumentMatchers> argumentMatchersDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.ArgumentMatchers>("data", "consumer", 1, (int) 'a');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("data");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.junit.Assert.assertNotEquals("driver", (long) '#', (long) (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.util.AbstractCollection<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataCollection0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(sampleDataCollection0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.stubbing.BaseStubber> baseStubberDataCarrier3 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.stubbing.BaseStubber>((int) (byte) -1, (int) (byte) 1, bufferStrategy2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.Collection<java.util.Set<java.lang.Object>> objSetCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(objSetCollection0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.junit.Assert.assertNotNull("driver", (java.lang.Object) "consumer");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (short) 1);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.onExit();
        sampleConsumer0.i = ' ';
        sampleConsumer0.init();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.Collection<java.util.Collection<java.lang.Object>> objCollectionCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int2 = sampleConsumer1.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer3.nothingToConsume();
        sampleConsumer3.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray6 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList7 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, sampleDataArray6);
        java.lang.Throwable throwable9 = null;
        sampleConsumer3.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, throwable9);
        sampleConsumer1.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7);
        java.lang.Object[] objArray12 = new java.lang.Object[] { objCollectionCollection0, sampleConsumer1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollectionCollection0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.Set<org.mockito.MockingDetails> mockingDetailsSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockingDetailsSet0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.junit.Assert.assertFalse("hi!", false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer2.nothingToConsume();
        sampleConsumer2.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray5 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList6 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, sampleDataArray5);
        java.lang.Throwable throwable8 = null;
        sampleConsumer2.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, throwable8);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Cloneable> cloneableOngoingStubbing11 = org.mockito.Mockito.when((java.lang.Cloneable) sampleDataList6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sampleDataArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.junit.Assert.assertEquals("data", (double) '#', 1.0d, (double) (short) 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.util.concurrent.BlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataQueue0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(sampleDataQueue0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        boolean boolean0 = org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.IS_OCCUR_ERROR;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer1.nothingToConsume();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, sampleConsumer1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray7 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder1, strArray7);
        java.lang.Comparable<java.lang.String> strComparable9 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(mockitoSessionBuilder8);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.Thread thread0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(thread0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (byte) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_MOCKS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_MOCKS));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("data");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.junit.Assert.assertEquals((long) (short) -1, (long) (byte) -1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Collection<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(serializableMapCollection0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.nothingToConsume();
        java.lang.Class<?> wildcardClass2 = sampleConsumer0.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.mockito.ArgumentMatchers.same((java.lang.reflect.AnnotatedElement) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(annotatedElement3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.nothingToConsume();
        sampleConsumer0.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray3 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList4 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList4, sampleDataArray3);
        java.lang.Throwable throwable6 = null;
        sampleConsumer0.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList4, throwable6);
        java.util.AbstractCollection[] abstractCollectionArray9 = new java.util.AbstractCollection[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<org.apache.skywalking.apm.commons.datacarrier.SampleData>[] sampleDataCollectionArray10 = (java.util.AbstractCollection<org.apache.skywalking.apm.commons.datacarrier.SampleData>[]) abstractCollectionArray9;
        sampleDataCollectionArray10[0] = sampleDataList4;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(sampleDataCollectionArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sampleDataArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(abstractCollectionArray9);
        org.junit.Assert.assertNotNull(sampleDataCollectionArray10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        long long1 = org.mockito.ArgumentMatchers.eq((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy13 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier14 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy13);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap15 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean16 = serializableMapDataCarrier14.produce(serializableMap15);
        boolean boolean17 = serializableMapDataCarrier5.produce(serializableMap15);
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier21 = serializableMapDataCarrier5.consume(serializableMapIConsumer18, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.junit.Assert.assertNotEquals((java.lang.Object) "data", (java.lang.Object) (short) -1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.io.Serializable> serializableDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.io.Serializable>("data", "", (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.junit.Assert.assertEquals("hi!", (double) ' ', (double) ' ', (double) (short) -1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) ' ', (double) 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(sampleDataList0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Map<java.util.Map<java.io.Serializable, java.lang.CharSequence>, org.mockito.ArgumentMatchers> serializableMapMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(serializableMapMap0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray2, objArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber5 = org.mockito.Mockito.doReturn((java.lang.Object) (byte) 1, objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.IS_OCCUR_ERROR = true;
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("driver");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.List<org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<org.apache.skywalking.apm.commons.datacarrier.SampleData>> sampleDataIConsumerList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(sampleDataIConsumerList0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Set<org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>> objConsumerThreadSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(objConsumerThreadSet0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.never();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>> serializableMapDataCarrierDataCarrier2 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>>((int) (byte) 0, 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("consumerThreads");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        java.lang.Class<?> wildcardClass1 = consumerTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder1 = org.mockito.Mockito.inOrder(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.junit.Assert.assertNotEquals((long) 5, (long) (short) 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("", "consumer", 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = org.mockito.Mockito.spy(serializableMapDataCarrier4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer1.onExit();
        sampleConsumer1.i = ' ';
        org.junit.Assert.assertNotSame("data", (java.lang.Object) ' ', (java.lang.Object) (byte) 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.junit.Assert.assertEquals((double) 1.0f, (double) 1.0f, (double) 0.0f);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.nothingToConsume();
        java.lang.Class<?> wildcardClass2 = sampleConsumer0.getClass();
        java.lang.Class<?> wildcardClass3 = org.mockito.ArgumentMatchers.eq(wildcardClass2);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atMostOnce();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement5 = org.mockito.Mockito.verify((java.lang.reflect.AnnotatedElement) wildcardClass3, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.Mockito mockito1 = new org.mockito.Mockito();
        org.mockito.Mockito[] mockitoArray2 = new org.mockito.Mockito[] { mockito0, mockito1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoArray2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        sampleConsumer2_4.onError = false;
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int1 = sampleConsumer0.i;
        java.lang.Class<?> wildcardClass2 = sampleConsumer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        sampleConsumer2_4.i = (byte) 0;
        sampleConsumer2_4.init();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.Cloneable cloneable0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(cloneable0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        sampleConsumer2_4.i = (byte) 0;
        sampleConsumer2_4.onExit();
        sampleConsumer2_4.onExit();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        org.junit.Assert.assertNotNull("driver", (java.lang.Object) consumerTest1);
        consumerTest1.testConsumerMoreThanChannel();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.i = 1;
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("", "consumerThreads", 0, (int) (byte) 10, bufferStrategy4);
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier9 = serializableMapDataCarrier5.consume(serializableMapIConsumer6, (int) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.junit.Assert.assertNotEquals("", (double) (short) 10, 0.0d, (double) 1.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.junit.Assert.assertNotEquals("consumerThreads", (double) 10.0f, (double) '\000', (double) (short) 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>> sampleDataListDataCarrier3 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>>("", (int) ' ', 100);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.junit.Assert.assertNotNull(mockitoFramework0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer2 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread4 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer2, (long) (byte) 10);
        objConsumerThread4.shutdown();
        org.apache.skywalking.apm.commons.datacarrier.buffer.QueueBuffer<java.lang.Object> objQueueBuffer6 = null;
        objConsumerThread4.addDataSource(objQueueBuffer6);
        org.apache.skywalking.apm.commons.datacarrier.buffer.QueueBuffer<java.lang.Object> objQueueBuffer8 = null;
        objConsumerThread4.addDataSource(objQueueBuffer8);
        java.util.Set<java.util.Collection<java.lang.Object>> objCollectionSet10 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotEquals("data", (java.lang.Object) objQueueBuffer8, (java.lang.Object) objCollectionSet10);
        org.junit.Assert.assertNotNull(objCollectionSet10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.Iterable<java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>> sampleDataListIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(sampleDataListIterable0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) 10.0f, (double) 10L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int1 = sampleConsumer0.i;
        java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            sampleConsumer0.consume(sampleDataList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.MockSettings> mockSettingsDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.MockSettings>("hi!", "driver", (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int1 = sampleConsumer0.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer2.nothingToConsume();
        sampleConsumer2.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray5 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList6 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, sampleDataArray5);
        java.lang.Throwable throwable8 = null;
        sampleConsumer2.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, throwable8);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6);
        int int11 = sampleConsumer0.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer12 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer12.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer14 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer14.nothingToConsume();
        sampleConsumer14.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray17 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList18 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18, sampleDataArray17);
        java.lang.Throwable throwable20 = null;
        sampleConsumer14.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18, throwable20);
        sampleConsumer12.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18);
        java.lang.Throwable throwable23 = null;
        sampleConsumer0.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18, throwable23);
        org.mockito.MockingDetails mockingDetails25 = org.mockito.Mockito.mockingDetails((java.lang.Object) sampleDataList18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mockingDetails25);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier3 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>((int) (byte) -1, (int) ' ', bufferStrategy2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray1, booleanArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable4 = org.mockito.Mockito.spy((java.lang.Cloneable) booleanArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class [Z?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(sampleConsumer2_0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer1, (long) (byte) 10);
        objConsumerThread3.shutdown();
        java.lang.Thread thread5 = org.mockito.ArgumentMatchers.eq((java.lang.Thread) objConsumerThread3);
        org.junit.Assert.assertNull(thread5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.spy(verificationMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        org.junit.Assert.assertNotNull((java.lang.Object) serializableMapDataCarrier5);
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("data");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        org.junit.Assert.assertNotNull("driver", (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest4 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest4.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest4);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_7 = consumerTest4.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer8 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer8.nothingToConsume();
        sampleConsumer8.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray11 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList12 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList12, sampleDataArray11);
        java.lang.Throwable throwable14 = null;
        sampleConsumer8.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList12, throwable14);
        java.lang.Throwable throwable16 = null;
        sampleConsumer2_7.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList12, throwable16);
        sampleConsumer2_7.i = 'a';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer20 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer20.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer22 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer22.nothingToConsume();
        sampleConsumer22.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray25 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList26 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList26, sampleDataArray25);
        java.lang.Throwable throwable28 = null;
        sampleConsumer22.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList26, throwable28);
        sampleConsumer20.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList26);
        sampleConsumer2_7.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList26);
        org.junit.Assert.assertNotEquals((java.lang.Object) consumerTest1, (java.lang.Object) sampleDataList26);
        org.junit.Assert.assertNotNull(sampleDataArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sampleDataArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataQueue0 = org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.BUFFER;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.BUFFER = sampleDataQueue0;
        org.junit.Assert.assertNotNull(sampleDataQueue0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.nothingToConsume();
        sampleConsumer0.onExit();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer3.nothingToConsume();
        sampleConsumer3.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray6 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList7 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, sampleDataArray6);
        java.lang.Throwable throwable9 = null;
        sampleConsumer3.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, throwable9);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer12 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer12.onExit();
        sampleConsumer12.i = ' ';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer16 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int17 = sampleConsumer16.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer18 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer18.nothingToConsume();
        sampleConsumer18.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray21 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList22 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList22, sampleDataArray21);
        java.lang.Throwable throwable24 = null;
        sampleConsumer18.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList22, throwable24);
        sampleConsumer16.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList22);
        sampleConsumer12.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList22);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest29 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest29.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest29);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_32 = consumerTest29.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer33 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer33.nothingToConsume();
        sampleConsumer33.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray36 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList37 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList37, sampleDataArray36);
        java.lang.Throwable throwable39 = null;
        sampleConsumer33.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList37, throwable39);
        java.lang.Throwable throwable41 = null;
        sampleConsumer2_32.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList37, throwable41);
        sampleConsumer2_32.i = 'a';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer45 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer45.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer47 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer47.nothingToConsume();
        sampleConsumer47.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray50 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList51 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList51, sampleDataArray50);
        java.lang.Throwable throwable53 = null;
        sampleConsumer47.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList51, throwable53);
        sampleConsumer45.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList51);
        sampleConsumer2_32.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList51);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer57 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer57.nothingToConsume();
        sampleConsumer57.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray60 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList61 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList61, sampleDataArray60);
        java.lang.Throwable throwable63 = null;
        sampleConsumer57.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList61, throwable63);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer65 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer65.nothingToConsume();
        sampleConsumer65.onExit();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer68 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer68.nothingToConsume();
        sampleConsumer68.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray71 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList72 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList72, sampleDataArray71);
        java.lang.Throwable throwable74 = null;
        sampleConsumer68.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList72, throwable74);
        sampleConsumer65.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList72);
        java.util.RandomAccess[] randomAccessArray77 = new java.util.RandomAccess[] { sampleDataList7, sampleDataList22, sampleDataList51, sampleDataList61, sampleDataList72 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(randomAccessArray77);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sampleDataArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sampleDataArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sampleDataArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sampleDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(sampleDataArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(randomAccessArray77);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        boolean[] booleanArray0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(booleanArray0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.Mockito.after((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.LenientStubber lenientStubber3 = org.mockito.Mockito.verify(lenientStubber0, (org.mockito.verification.VerificationMode) verificationAfterDelay2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultLenientStubber and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNotNull(verificationAfterDelay2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.onExit();
        sampleConsumer0.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer3.nothingToConsume();
        sampleConsumer3.onExit();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer6 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer6.nothingToConsume();
        sampleConsumer6.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray9 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList10 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10, sampleDataArray9);
        java.lang.Throwable throwable12 = null;
        sampleConsumer6.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10, throwable12);
        sampleConsumer3.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10);
        org.junit.Assert.assertNotNull(sampleDataArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray1, objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) '#');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData>> sampleDataQueueChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData>> sampleDataQueueIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData>> sampleDataQueueConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData>>("driver", sampleDataQueueChannels1, sampleDataQueueIConsumer2, (int) (short) 100, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.junit.Assert.assertNotEquals((double) 0, 100.0d, (double) 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray6 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder7 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder0, strArray6);
        org.mockito.MockingDetails mockingDetails8 = org.mockito.Mockito.mockingDetails((java.lang.Object) mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(mockitoSessionBuilder7);
        org.junit.Assert.assertNotNull(mockingDetails8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<java.util.Set<java.lang.Object>> objSetChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Set<java.lang.Object>> objSetIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.util.Set<java.lang.Object>> objSetConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<java.util.Set<java.lang.Object>>("hi!", objSetChannels1, objSetIConsumer2, (int) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.mockito.ArgumentMatcher<java.lang.Float> floatArgumentMatcher0 = null;
        float float1 = org.mockito.ArgumentMatchers.floatThat(floatArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.mockito.ArgumentMatcher<java.lang.Character> charArgumentMatcher0 = null;
        char char1 = org.mockito.ArgumentMatchers.charThat(charArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.mockito.verification.VerificationMode[] verificationModeArray0 = new org.mockito.verification.VerificationMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(verificationModeArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationModeArray0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) '#');
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        int int1 = org.mockito.ArgumentMatchers.eq((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy13 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier14 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy13);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap15 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean16 = serializableMapDataCarrier14.produce(serializableMap15);
        boolean boolean17 = serializableMapDataCarrier5.produce(serializableMap15);
        serializableMapDataCarrier5.shutdownConsumers();
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("consumer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray1, booleanArray2);
        boolean[] booleanArray6 = new boolean[] {};
        boolean[] booleanArray7 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray6, booleanArray7);
        boolean[] booleanArray9 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray7, booleanArray9);
        org.junit.Assert.assertArrayEquals(booleanArray2, booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        java.lang.String[] strArray11 = new java.lang.String[] { "consumerThreads" };
        java.lang.String str12 = org.mockito.ArgumentMatchers.refEq("consumerThreads", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber13 = org.mockito.Mockito.doReturn((java.lang.Object) serializableMapDataCarrier5, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("hi!");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) '\000');
        org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Map<boolean[], java.util.Map<java.io.Serializable, java.lang.CharSequence>> booleanArrayMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(booleanArrayMap0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) '\000');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(objConsumerThread0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        sampleConsumer2_4.onError = true;
        sampleConsumer2_4.init();
        sampleConsumer2_4.nothingToConsume();
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier3 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("", (int) (byte) -1, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.MockSettings> mockSettingsDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<org.mockito.MockSettings>("hi!", "driver", (int) (byte) 100, (int) (short) 1);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", "driver" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, driver]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, driver]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest2.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest2);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_5 = consumerTest2.new SampleConsumer2();
        sampleConsumer2_5.i = (byte) 0;
        sampleConsumer2_5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer9 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer9.onExit();
        sampleConsumer9.i = ' ';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer13 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int14 = sampleConsumer13.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer15 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer15.nothingToConsume();
        sampleConsumer15.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray18 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList19 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList19, sampleDataArray18);
        java.lang.Throwable throwable21 = null;
        sampleConsumer15.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList19, throwable21);
        sampleConsumer13.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList19);
        sampleConsumer9.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList19);
        sampleConsumer9.nothingToConsume();
        org.mockito.MockingDetails mockingDetails27 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (byte) 10, sampleConsumer2_5, sampleConsumer9, mockingDetails27 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder29 = org.mockito.Mockito.inOrder(objArray28);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(mockingDetails27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.junit.Assert.assertNotEquals("consumer", (long) (-1), 1L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.junit.Assert.assertNotEquals((long) '#', (long) (short) 100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Collection<org.mockito.MockSettings> mockSettingsCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(mockSettingsCollection0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(sampleDataList0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer1, (long) (byte) 10);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atMostOnce();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Thread thread5 = org.mockito.Mockito.verify((java.lang.Thread) objConsumerThread3, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ConsumerThread and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int1 = sampleConsumer0.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer2.nothingToConsume();
        sampleConsumer2.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray5 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList6 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, sampleDataArray5);
        java.lang.Throwable throwable8 = null;
        sampleConsumer2.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, throwable8);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6);
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout12 = org.mockito.Mockito.timeout((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList13 = org.mockito.Mockito.verify((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, (org.mockito.verification.VerificationMode) verificationWithTimeout12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ArrayList and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(verificationWithTimeout12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.junit.Assert.assertEquals((float) (short) 1, (float) 0, (float) (byte) 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull((java.lang.Object) serializableMap0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) serializableMap0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) 0.0d);
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        float float1 = org.mockito.ArgumentMatchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) sampleConsumer1);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) sampleConsumer1, (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '\000');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.apache.skywalking.apm.commons.datacarrier.buffer.Channels<org.mockito.ArgumentMatchers> argumentMatchersChannels1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<org.mockito.ArgumentMatchers> argumentMatchersIConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<org.mockito.ArgumentMatchers> argumentMatchersConsumeDriver5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumeDriver<org.mockito.ArgumentMatchers>("", argumentMatchersChannels1, argumentMatchersIConsumer2, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        sampleConsumer2_4.onError = true;
        sampleConsumer2_4.onExit();
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.partition.IDataPartitioner<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIDataPartitioner9 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier10 = serializableMapDataCarrier5.setPartitioner(serializableMapIDataPartitioner9);
        dataCarrier10.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy16 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier17 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy16);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap18 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean19 = serializableMapDataCarrier17.produce(serializableMap18);
        serializableMapDataCarrier17.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy25 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier26 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy25);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap27 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean28 = serializableMapDataCarrier26.produce(serializableMap27);
        boolean boolean29 = serializableMapDataCarrier17.produce(serializableMap27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dataCarrier10.produce(serializableMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dataCarrier10);
        org.junit.Assert.assertNotNull(serializableMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableMap27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.List<java.lang.reflect.Type> typeList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(typeList0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        serializableMapDataCarrier5.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy13 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier14 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy13);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap15 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean16 = serializableMapDataCarrier14.produce(serializableMap15);
        boolean boolean17 = serializableMapDataCarrier5.produce(serializableMap15);
        org.apache.skywalking.apm.commons.datacarrier.partition.IDataPartitioner<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIDataPartitioner18 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier19 = serializableMapDataCarrier5.setPartitioner(serializableMapIDataPartitioner18);
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dataCarrier19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Set<org.mockito.verification.VerificationAfterDelay> verificationAfterDelaySet0 = org.mockito.ArgumentMatchers.anySet();
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.only();
        org.junit.Assert.assertNotSame((java.lang.Object) verificationAfterDelaySet0, (java.lang.Object) verificationMode1);
        org.junit.Assert.assertNotNull(verificationAfterDelaySet0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        org.apache.skywalking.apm.commons.datacarrier.partition.IDataPartitioner<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIDataPartitioner8 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier9 = serializableMapDataCarrier5.setPartitioner(serializableMapIDataPartitioner8);
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier12 = dataCarrier9.consume(serializableMapIConsumer10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dataCarrier9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer1, (long) (byte) 10);
        objConsumerThread3.shutdown();
        org.apache.skywalking.apm.commons.datacarrier.buffer.QueueBuffer<java.lang.Object> objQueueBuffer5 = null;
        objConsumerThread3.addDataSource(objQueueBuffer5);
        objConsumerThread3.shutdown();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(mockitoSessionBuilder0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        sampleConsumer2_4.onError = true;
        boolean boolean19 = sampleConsumer2_4.onError;
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        org.apache.skywalking.apm.commons.datacarrier.partition.IDataPartitioner<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIDataPartitioner8 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier9 = serializableMapDataCarrier5.setPartitioner(serializableMapIDataPartitioner8);
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier12 = dataCarrier9.consume(serializableMapIConsumer10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dataCarrier9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.Mockito mockito1 = org.mockito.ArgumentMatchers.eq(mockito0);
        org.junit.Assert.assertNull(mockito1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.lang.String> strDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.lang.String>("driver", (int) '4', 100);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer7 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer7.nothingToConsume();
        sampleConsumer7.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray10 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList11 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList11, sampleDataArray10);
        java.lang.Throwable throwable13 = null;
        sampleConsumer7.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList11, throwable13);
        sampleConsumer5.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList11);
        sampleConsumer5.init();
        org.junit.Assert.assertNotEquals("data", (java.lang.Object) '4', (java.lang.Object) sampleConsumer5);
        org.junit.Assert.assertNotNull(sampleDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        sampleConsumer2_4.init();
        sampleConsumer2_4.onExit();
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.nothingToConsume();
        sampleConsumer0.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray3 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList4 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList4, sampleDataArray3);
        java.lang.Throwable throwable6 = null;
        sampleConsumer0.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList4, throwable6);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer8 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer8.nothingToConsume();
        sampleConsumer8.onExit();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer11 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer11.nothingToConsume();
        sampleConsumer11.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray14 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList15 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList15, sampleDataArray14);
        java.lang.Throwable throwable17 = null;
        sampleConsumer11.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList15, throwable17);
        sampleConsumer8.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList15);
        java.lang.Throwable throwable20 = null;
        sampleConsumer0.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList15, throwable20);
        sampleConsumer0.init();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray23 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList24 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList24, sampleDataArray23);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList24);
        org.junit.Assert.assertNotNull(sampleDataArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sampleDataArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sampleDataArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int1 = sampleConsumer0.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer2.nothingToConsume();
        sampleConsumer2.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray5 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList6 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, sampleDataArray5);
        java.lang.Throwable throwable8 = null;
        sampleConsumer2.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6, throwable8);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList6);
        int int11 = sampleConsumer0.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer12 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer12.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer14 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer14.nothingToConsume();
        sampleConsumer14.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray17 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList18 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18, sampleDataArray17);
        java.lang.Throwable throwable20 = null;
        sampleConsumer14.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18, throwable20);
        sampleConsumer12.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18);
        java.lang.Throwable throwable23 = null;
        sampleConsumer0.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList18, throwable23);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer25 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer25.nothingToConsume();
        sampleConsumer25.onExit();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer28 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer28.nothingToConsume();
        sampleConsumer28.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray31 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList32 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList32, sampleDataArray31);
        java.lang.Throwable throwable34 = null;
        sampleConsumer28.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList32, throwable34);
        sampleConsumer25.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList32);
        java.lang.Throwable throwable37 = null;
        sampleConsumer0.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList32, throwable37);
        sampleConsumer0.i = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(sampleDataArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) sampleConsumer2);
        org.junit.Assert.assertNotSame("driver", (java.lang.Object) (byte) 100, (java.lang.Object) sampleConsumer2);
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int6 = sampleConsumer5.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer7 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer7.nothingToConsume();
        sampleConsumer7.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray10 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList11 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList11, sampleDataArray10);
        java.lang.Throwable throwable13 = null;
        sampleConsumer7.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList11, throwable13);
        sampleConsumer5.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList11);
        int int16 = sampleConsumer5.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer17 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer17.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer19 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer19.nothingToConsume();
        sampleConsumer19.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray22 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList23 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, sampleDataArray22);
        java.lang.Throwable throwable25 = null;
        sampleConsumer19.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, throwable25);
        sampleConsumer17.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23);
        java.lang.Throwable throwable28 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, throwable28);
        java.lang.Throwable throwable30 = null;
        sampleConsumer2.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, throwable30);
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Set<java.lang.Object>> objSetDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Set<java.lang.Object>>("", "consumer", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.onExit();
        sampleConsumer0.i = ' ';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer4 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int5 = sampleConsumer4.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer6 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer6.nothingToConsume();
        sampleConsumer6.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray9 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList10 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10, sampleDataArray9);
        java.lang.Throwable throwable12 = null;
        sampleConsumer6.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10, throwable12);
        sampleConsumer4.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10);
        sampleConsumer0.nothingToConsume();
        sampleConsumer0.onExit();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.calls(10);
        org.junit.Assert.assertNotNull("driver", (java.lang.Object) 10);
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 1);
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.ArgumentMatchers.eq(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNull(verificationMode2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray2, objArray3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray6, objArray7);
        org.junit.Assert.assertEquals("", objArray3, objArray7);
        java.lang.Object[] objArray10 = org.mockito.Mockito.ignoreStubs(objArray3);
        java.lang.Object[] objArray11 = org.mockito.Mockito.ignoreStubs(objArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier4 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("", "consumer", 10, (int) (short) 1);
        org.apache.skywalking.apm.commons.datacarrier.partition.IDataPartitioner<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIDataPartitioner5 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier6 = serializableMapDataCarrier4.setPartitioner(serializableMapIDataPartitioner5);
        org.junit.Assert.assertNotNull(dataCarrier6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer17 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer17.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer19 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer19.nothingToConsume();
        sampleConsumer19.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray22 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList23 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, sampleDataArray22);
        java.lang.Throwable throwable25 = null;
        sampleConsumer19.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, throwable25);
        sampleConsumer17.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23);
        sampleConsumer2_4.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23);
        sampleConsumer2_4.onExit();
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sampleDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray6 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder7 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder0, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(mockitoSessionBuilder7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.util.Map<org.mockito.verification.VerificationWithTimeout, java.lang.reflect.AnnotatedElement> verificationWithTimeoutMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(verificationWithTimeoutMap0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy4 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier5 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy4);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap6 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean7 = serializableMapDataCarrier5.produce(serializableMap6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Object> objOngoingStubbing8 = org.mockito.Mockito.when((java.lang.Object) serializableMap6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)?-> at randoop.util.MethodReflectionCode.runReflectionCodeRaw(MethodReflectionCode.java:54)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer17 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int18 = sampleConsumer17.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer19 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer19.nothingToConsume();
        sampleConsumer19.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray22 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList23 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, sampleDataArray22);
        java.lang.Throwable throwable25 = null;
        sampleConsumer19.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23, throwable25);
        sampleConsumer17.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList23);
        int int28 = sampleConsumer17.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer29 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer29.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer31 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer31.nothingToConsume();
        sampleConsumer31.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray34 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList35 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList35, sampleDataArray34);
        java.lang.Throwable throwable37 = null;
        sampleConsumer31.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList35, throwable37);
        sampleConsumer29.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList35);
        java.lang.Throwable throwable40 = null;
        sampleConsumer17.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList35, throwable40);
        sampleConsumer2_4.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList35);
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(sampleDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray2, objArray3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray6, objArray7);
        org.junit.Assert.assertEquals("", objArray3, objArray7);
        java.lang.Object[] objArray10 = org.mockito.Mockito.ignoreStubs(objArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.junit.Assert.assertNotNull((java.lang.Object) 100.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer1 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer1, (long) (byte) 10);
        org.apache.skywalking.apm.commons.datacarrier.buffer.QueueBuffer<java.lang.Object> objQueueBuffer4 = null;
        objConsumerThread3.addDataSource(objQueueBuffer4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mockitoFramework0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.mockito.MockSettings mockSettings0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockSettings0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.util.Map<org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2, java.lang.CharSequence> sampleConsumer2Map0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(sampleConsumer2Map0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray2, objArray3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray6, objArray7);
        org.junit.Assert.assertEquals("", objArray3, objArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier3 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("", 1, 10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.junit.Assert.assertEquals("hi!", (double) (byte) 0, 1.0d, (double) (short) 100);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        sampleConsumer2_4.i = (byte) 0;
        sampleConsumer2_4.i = (byte) -1;
        sampleConsumer2_4.onExit();
        int int10 = sampleConsumer2_4.i;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataQueue0 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.BUFFER = sampleDataQueue0;
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        sampleConsumer2_4.init();
        sampleConsumer2_4.onError = true;
        sampleConsumer2_4.init();
        org.junit.Assert.assertNotNull(sampleDataArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest0.testConsumerLessThanChannel();
        consumerTest0.testConsumerLessThanChannel();
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_3 = consumerTest0.new SampleConsumer2();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) 1.0d);
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.only();
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.ArgumentMatchers.same(verificationMode2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockingDetails mockingDetails4 = org.mockito.Mockito.verify(mockingDetails1, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultMockingDetails and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(verificationMode2);
        org.junit.Assert.assertNull(verificationMode3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int1 = sampleConsumer0.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer2 = org.mockito.ArgumentMatchers.eq(sampleConsumer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(sampleConsumer2);
    }
}
