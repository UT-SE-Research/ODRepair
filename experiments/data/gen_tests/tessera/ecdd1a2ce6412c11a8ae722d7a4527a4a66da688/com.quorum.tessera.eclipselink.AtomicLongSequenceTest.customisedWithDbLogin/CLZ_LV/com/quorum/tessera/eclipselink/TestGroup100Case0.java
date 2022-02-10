package com.quorum.tessera.eclipselink;

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
        char char0 = org.mockito.ArgumentMatchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("drop-and-create");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.mockito.ArgumentMatcher<java.lang.Integer> intArgumentMatcher0 = null;
        int int1 = org.mockito.ArgumentMatchers.intThat(intArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doCallRealMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.mockito.ArgumentMatcher<java.lang.Short> shortArgumentMatcher0 = null;
        short short1 = org.mockito.ArgumentMatchers.shortThat(shortArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(charSequenceCollection0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        double double1 = org.mockito.ArgumentMatchers.eq(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.regex.Pattern pattern0 = null;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        short short0 = org.mockito.ArgumentMatchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(charSequenceList0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        float float1 = org.mockito.ArgumentMatchers.eq((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Iterable<java.lang.CharSequence>> charSequenceIterableOngoingStubbing1 = org.mockito.Mockito.when((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(charSequenceList0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.util.List<java.lang.Iterable<java.lang.CharSequence>> charSequenceIterableList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(charSequenceIterableList0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(charSequenceCollection0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.mockito.ArgumentMatcher<java.lang.Byte> byteArgumentMatcher0 = null;
        byte byte1 = org.mockito.ArgumentMatchers.byteThat(byteArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        boolean boolean0 = org.mockito.ArgumentMatchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '#');
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.atMost(0);
        org.mockito.verification.VerificationMode verificationMode5 = org.mockito.Mockito.atMost((int) '#');
        org.mockito.verification.VerificationMode verificationMode7 = org.mockito.Mockito.atMost((int) '#');
        org.mockito.verification.VerificationMode verificationMode9 = org.mockito.Mockito.atMost(0);
        org.mockito.verification.VerificationMode verificationMode11 = org.mockito.Mockito.atMost((int) '#');
        org.mockito.verification.VerificationMode[] verificationModeArray12 = new org.mockito.verification.VerificationMode[] { verificationMode1, verificationMode3, verificationMode5, verificationMode7, verificationMode9, verificationMode11 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(verificationModeArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode3);
        org.junit.Assert.assertNotNull(verificationMode5);
        org.junit.Assert.assertNotNull(verificationMode7);
        org.junit.Assert.assertNotNull(verificationMode9);
        org.junit.Assert.assertNotNull(verificationMode11);
        org.junit.Assert.assertNotNull(verificationModeArray12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[100.0]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("junit");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockitoFramework0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.Throwable[] throwableArray0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(throwableArray0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.mockito.ArgumentMatcher<java.lang.Boolean> booleanArgumentMatcher0 = null;
        boolean boolean1 = org.mockito.ArgumentMatchers.booleanThat(booleanArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.Object obj1 = org.mockito.ArgumentMatchers.eq((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0 + "'", obj1, 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) 'a');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.mockito.ArgumentMatcher<java.lang.Character> charArgumentMatcher0 = null;
        char char1 = org.mockito.ArgumentMatchers.charThat(charArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.mockito.ArgumentMatcher<java.lang.Float> floatArgumentMatcher0 = null;
        float float1 = org.mockito.ArgumentMatchers.floatThat(floatArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.util.List<java.lang.Iterable<java.lang.CharSequence>> charSequenceIterableList2 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, "FINE", charSequenceIterableList2, "FINE", 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceIterableList2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, FINE, [], FINE, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, FINE, [], FINE, 10.0]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("eclipselink.session.customizer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEEP_STUBS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("javax.persistence.schema-generation.database.action");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.verifyNoInteractions(objArray1);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[10]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
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
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        java.lang.Throwable[] throwableArray2 = new java.lang.Throwable[] {};
        org.mockito.stubbing.Stubber stubber3 = null; // flaky: org.mockito.Mockito.doThrow(throwableArray2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, throwableArray2, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.verifyNoInteractions(objArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(throwableArray2);
// flaky:         org.junit.Assert.assertNotNull(stubber3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, [], 1, 0]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(mockitoSessionBuilder0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("eclipselink.logging.parameters");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("drop-and-create");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(objAnswer0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        byte byte0 = org.mockito.ArgumentMatchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("eclipselink.logging.logger", strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (byte) 100);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails5 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails7 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails[] mockingDetailsArray8 = new org.mockito.MockingDetails[] { mockingDetails1, mockingDetails3, mockingDetails5, mockingDetails7 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockingDetailsArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[10]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.util.List<java.lang.CharSequence> charSequenceList1 = org.mockito.ArgumentMatchers.same(charSequenceList0);
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNull(charSequenceList1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.Iterable<java.lang.String> strIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(strIterable0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.List<org.mockito.MockingDetails> mockingDetailsList0 = org.mockito.ArgumentMatchers.anyList();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) mockingDetailsList0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetailsList0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        double double1 = org.mockito.ArgumentMatchers.eq(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.Throwable[] throwableArray0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(throwableArray0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.mockito.ArgumentMatcher<java.lang.Long> longArgumentMatcher0 = null;
        long long1 = org.mockito.ArgumentMatchers.longThat(longArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.mockito.internal.progress.MockingProgress mockingProgress0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(mockingProgress0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        long long1 = org.mockito.ArgumentMatchers.eq(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.mockito.stubbing.Answer<java.lang.Object>[] objAnswerArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(objAnswerArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doThrow(throwableArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.BaseStubber> baseStubberOngoingStubbing2 = org.mockito.Mockito.when((org.mockito.stubbing.BaseStubber) stubber1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        float float0 = org.mockito.ArgumentMatchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        float float1 = org.mockito.ArgumentMatchers.eq(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        long long1 = org.mockito.ArgumentMatchers.eq(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.mockito.Mockito[] mockitoArray0 = new org.mockito.Mockito[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoArray0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.mockito.Mockito.verify((java.lang.CharSequence) "javax.persistence.jdbc.password");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("eclipselink.cache.shared.default");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        short short1 = org.mockito.ArgumentMatchers.eq((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray1 = org.mockito.ArgumentMatchers.same(objArray0);
        org.junit.Assert.assertNull(objArray1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("drop-and-create");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.Class<?> wildcardClass0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 100);
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.ArgumentMatchers.same(verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNull(verificationMode2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(verificationAfterDelay0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        double double0 = org.mockito.ArgumentMatchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(lenientStubber0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) ' ');
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("javax.persistence.jdbc.password");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.Iterable<java.lang.Object[]> objArrayIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(objArrayIterable0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.Object[] objArray2 = new java.lang.Object[] { 0L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Long");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, 0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("eclipselink.logging.level.sql");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("org.eclipse.persistence.logging.slf4j.SLF4JLogger");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) 'a');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        char char1 = org.mockito.ArgumentMatchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.Map<java.lang.Object[], org.mockito.stubbing.LenientStubber> objArrayMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(objArrayMap0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.same(objAnswer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
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
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.Iterable<org.mockito.stubbing.Stubber> stubberIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(stubberIterable0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.CharSequence charSequence0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        long long1 = org.mockito.ArgumentMatchers.eq((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.Iterable<org.mockito.verification.VerificationMode> verificationModeIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(verificationModeIterable0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        long long1 = org.mockito.ArgumentMatchers.eq((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.mockito.MockingDetails mockingDetails0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockingDetails0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.ArgumentMatchers.same(objAnswer1);
        java.lang.String[] strArray5 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj6 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer2, strArray5);
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer1 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer1.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.MockSettings> mockSettingsOngoingStubbing1 = org.mockito.Mockito.when(mockSettings0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails2 = org.mockito.ArgumentMatchers.eq(mockingDetails1);
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNull(mockingDetails2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails> serializableMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber9 = org.mockito.Mockito.doReturn((java.lang.Object) serializableMap0, (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap0);
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        char char1 = org.mockito.ArgumentMatchers.eq('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.Map<org.mockito.stubbing.Stubber, java.lang.Object> stubberMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(stubberMap0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray2 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray3 = new java.lang.Throwable[] {};
        java.lang.Throwable[][] throwableArray4 = new java.lang.Throwable[][] { throwableArray0, throwableArray1, throwableArray2, throwableArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(throwableArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (short) 100);
        java.lang.Class<?> wildcardClass2 = verificationAfterDelay1.getClass();
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.mockito.stubbing.Stubber stubber0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(stubber0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anySet();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.Set<java.lang.Comparable<java.lang.String>>> strComparableSetOngoingStubbing1 = org.mockito.Mockito.when(strComparableSet0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSet0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Map<org.mockito.internal.progress.MockingProgress, org.mockito.stubbing.BaseStubber> mockingProgressMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockingProgressMap0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(genericDeclarationSet0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(mockitoSessionBuilder0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_MOCKS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_MOCKS));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework1 = org.mockito.ArgumentMatchers.eq(mockitoFramework0);
        org.junit.Assert.assertNotNull(mockitoFramework0);
        org.junit.Assert.assertNull(mockitoFramework1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.mockito.ArgumentMatchers argumentMatchers0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(argumentMatchers0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder3 = org.mockito.Mockito.inOrder(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable1 = org.mockito.ArgumentMatchers.eq((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNull(charSequenceIterable1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.Iterable<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderIterable0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.lang.Object[] objArray0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(objArray0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.LenientStubber lenientStubber1 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.LenientStubber lenientStubber2 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.LenientStubber[] lenientStubberArray3 = new org.mockito.stubbing.LenientStubber[] { lenientStubber0, lenientStubber1, lenientStubber2 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(lenientStubberArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNotNull(lenientStubber1);
        org.junit.Assert.assertNotNull(lenientStubber2);
        org.junit.Assert.assertNotNull(lenientStubberArray3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.Set[] setArray2 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Comparable<java.lang.String>>[] strComparableSetArray3 = (java.util.Set<java.lang.Comparable<java.lang.String>>[]) setArray2;
        strComparableSetArray3[0] = strComparableSet0;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(strComparableSetArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSet0);
        org.junit.Assert.assertNotNull(setArray2);
        org.junit.Assert.assertNotNull(strComparableSetArray3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.Object obj0 = null;
        java.util.List<java.lang.CharSequence> charSequenceList1 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable2 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList1);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer4 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer5 = org.mockito.ArgumentMatchers.same(objAnswer4);
        java.lang.String[] strArray8 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj9 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer5, strArray8);
        java.lang.Object obj10 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray8);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable11 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable2, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber12 = org.mockito.Mockito.doReturn(obj0, (java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList1);
        org.junit.Assert.assertNull(charSequenceIterable2);
        org.junit.Assert.assertTrue("'" + objAnswer4 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer4.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(charSequenceIterable11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("org.eclipse.persistence.logging.slf4j.SLF4JLogger");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("eclipselink.logging.level");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.Answer<java.lang.Object>> objAnswerOngoingStubbing1 = org.mockito.Mockito.when(objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (short) 1);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("javax.persistence.jdbc.url");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("eclipselink.logging.parameters");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        char char1 = org.mockito.ArgumentMatchers.eq(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 10);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.mockito.stubbing.Answer answer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer(answer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray2 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0, mockitoSessionBuilder1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockitoSessionBuilderArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.session.DefaultMockitoSessionBuilder");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (byte) 100 };
        org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doReturn((java.lang.Object) "javax.persistence.jdbc.user", objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[100]");
        org.junit.Assert.assertNotNull(stubber3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.Map<org.mockito.session.MockitoSessionBuilder, org.mockito.verification.VerificationMode> mockitoSessionBuilderMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderMap0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("FINE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(0);
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationMode1);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Collection<org.mockito.Mockito> mockitoCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(mockitoCollection0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) 100);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atMost((int) (short) 100);
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray2, (short) 100, false, "true" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(verificationMode4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 100, false, true]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("org.eclipse.persistence.logging.slf4j.SLF4JLogger");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.util.Map<java.lang.Throwable[], org.mockito.MockitoFramework> throwableArrayMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(throwableArrayMap0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 10);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.Mockito.spy("eclipselink.logging.parameters");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.String?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doThrow(throwableArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) throwableArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray0);
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.atMost(0);
        org.mockito.MockingDetails mockingDetails4 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationMode3);
        org.mockito.MockingDetails mockingDetails6 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails7 = org.mockito.ArgumentMatchers.eq(mockingDetails6);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object[] objArray9 = org.mockito.Mockito.ignoreStubs(objArray8);
        java.lang.Object[] objArray10 = org.mockito.Mockito.ignoreStubs(objArray8);
        org.mockito.MockingDetails mockingDetails11 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray10);
        org.mockito.MockingDetails[] mockingDetailsArray12 = new org.mockito.MockingDetails[] { mockingDetails1, mockingDetails4, mockingDetails7, mockingDetails11 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockingDetailsArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(verificationMode3);
        org.junit.Assert.assertNotNull(mockingDetails4);
        org.junit.Assert.assertNotNull(mockingDetails6);
        org.junit.Assert.assertNull(mockingDetails7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(mockingDetails11);
        org.junit.Assert.assertNotNull(mockingDetailsArray12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.util.Collection<java.util.Map<java.io.Serializable, org.mockito.MockingDetails>> serializableMapCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(serializableMapCollection0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String str0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("eclipselink.cache.shared.default");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Map<org.mockito.Mockito, java.lang.Class<?>> mockitoMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoMap0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("javax.persistence.jdbc.user");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<java.lang.CharSequence> charSequenceIterable1 = org.mockito.Mockito.spy((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.mockito.stubbing.BaseStubber baseStubber0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(baseStubber0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Collection<org.mockito.stubbing.LenientStubber> lenientStubberCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(lenientStubberCollection0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.List<java.io.Serializable> serializableList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(serializableList0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.mockito.internal.progress.MockingProgress mockingProgress0 = org.mockito.internal.progress.ThreadSafeMockingProgress.mockingProgress();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        org.mockito.internal.progress.MockingProgress mockingProgress9 = org.mockito.ArgumentMatchers.refEq(mockingProgress0, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingProgress0);
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(mockingProgress9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder2 = org.mockito.Mockito.inOrder(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("javax.persistence.jdbc.password");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs(objArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs(objArray2);
        org.mockito.MockingDetails mockingDetails5 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray4);
        org.mockito.MockingDetails mockingDetails7 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails9 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails10 = org.mockito.ArgumentMatchers.eq(mockingDetails9);
        org.mockito.MockingDetails mockingDetails12 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails14 = org.mockito.Mockito.mockingDetails((java.lang.Object) false);
        org.mockito.MockingDetails mockingDetails15 = org.mockito.ArgumentMatchers.eq(mockingDetails14);
        org.mockito.MockingDetails[] mockingDetailsArray16 = new org.mockito.MockingDetails[] { mockingDetails1, mockingDetails5, mockingDetails7, mockingDetails9, mockingDetails12, mockingDetails15 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockingDetailsArray16);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(mockingDetails5);
        org.junit.Assert.assertNotNull(mockingDetails7);
        org.junit.Assert.assertNotNull(mockingDetails9);
        org.junit.Assert.assertNull(mockingDetails10);
        org.junit.Assert.assertNotNull(mockingDetails12);
        org.junit.Assert.assertNotNull(mockingDetails14);
        org.junit.Assert.assertNull(mockingDetails15);
        org.junit.Assert.assertNotNull(mockingDetailsArray16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.Map<java.util.Map<java.io.Serializable, org.mockito.MockingDetails>, java.lang.Throwable[]> serializableMapMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(serializableMapMap0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Set<org.mockito.stubbing.Stubber> stubberSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(stubberSet0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.List<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderList0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.Iterable<org.mockito.verification.VerificationWithTimeout> verificationWithTimeoutIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(verificationWithTimeoutIterable0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        int int0 = org.mockito.ArgumentMatchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable1 = org.mockito.Mockito.verify((java.io.Serializable) 100L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Long and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.same(objAnswer0);
        java.lang.String[] strArray4 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj5 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.Answer<java.lang.Object>> objAnswerOngoingStubbing1 = null; // flaky: org.mockito.Mockito.when(objAnswer0);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails> serializableMap0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        java.lang.String[] strArray5 = new java.lang.String[] { "false", "drop-and-create", "junit", "javax.persistence.jdbc.password" };
        org.mockito.Mockito mockito6 = org.mockito.ArgumentMatchers.refEq(mockito0, strArray5);
        org.mockito.verification.VerificationMode verificationMode8 = org.mockito.Mockito.times((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito mockito9 = org.mockito.Mockito.verify(mockito6, verificationMode8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(mockito6);
        org.junit.Assert.assertNotNull(verificationMode8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder2 = org.mockito.Mockito.inOrder(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) 1);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doThrow(throwableArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(charSequenceList0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Map<java.lang.Object[], java.lang.reflect.Type> objArrayMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(objArrayMap0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        java.lang.Comparable<java.lang.String> strComparable9 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.LenientStubber lenientStubber1 = org.mockito.Mockito.spy(lenientStubber0);
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNotNull(lenientStubber1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Collection<org.mockito.verification.VerificationMode> verificationModeCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(verificationModeCollection0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        java.lang.Comparable<java.lang.String> strComparable9 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (byte) 100 };
        org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doReturn((java.lang.Object) "javax.persistence.jdbc.user", objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[100]");
        org.junit.Assert.assertNotNull(stubber3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) 'a');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        long long0 = org.mockito.ArgumentMatchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("eclipselink.cache.shared.default");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.mockito.internal.progress.MockingProgress mockingProgress0 = org.mockito.internal.progress.ThreadSafeMockingProgress.mockingProgress();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        org.mockito.internal.progress.MockingProgress mockingProgress9 = org.mockito.ArgumentMatchers.refEq(mockingProgress0, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingProgress0);
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(mockingProgress9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.Iterable<java.lang.reflect.AnnotatedElement> annotatedElementIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(annotatedElementIterable0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Map<org.mockito.internal.progress.MockingProgress, java.lang.Throwable[]> mockingProgressMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockingProgressMap0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        java.lang.String[] strArray5 = new java.lang.String[] { "false", "drop-and-create", "junit", "javax.persistence.jdbc.password" };
        org.mockito.Mockito mockito6 = org.mockito.ArgumentMatchers.refEq(mockito0, strArray5);
        java.lang.Class<?> wildcardClass7 = mockito0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(mockito6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(charSequenceIterable0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("mypu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.List<org.mockito.Mockito> mockitoList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(mockitoList0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderOngoingStubbing1 = org.mockito.Mockito.when(mockitoSessionBuilder0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        java.lang.Comparable<java.lang.String> strComparable9 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.mockito.ArgumentMatchers argumentMatchers0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(argumentMatchers0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.mockito.Mockito.verify((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "eclipselink.cache.shared.default");
        boolean boolean18 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "drop-and-create");
        boolean boolean19 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "false");
        boolean boolean20 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "javax.persistence.schema-generation.database.action");
        boolean boolean22 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "eclipselink.logging.level.sql");
        boolean boolean23 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "eclipselink.logging.logger");
        boolean boolean24 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "mypu");
        boolean boolean25 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "eclipselink.cache.shared.default");
        boolean boolean26 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.url");
        boolean boolean27 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.url");
        boolean boolean28 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "junit");
        boolean boolean29 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "org.eclipse.persistence.logging.slf4j.SLF4JLogger");
        boolean boolean30 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.user");
        boolean boolean31 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "org.eclipse.persistence.logging.slf4j.SLF4JLogger");
        boolean boolean32 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.url");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet33 = org.mockito.Mockito.verify((java.util.Set<java.lang.Comparable<java.lang.String>>) strComparableSet16);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type LinkedHashSet and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("mypu");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) '\000');
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable1 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
        java.util.List<java.lang.CharSequence> charSequenceList2 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable3 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList2);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer5 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer6 = org.mockito.ArgumentMatchers.same(objAnswer5);
        java.lang.String[] strArray9 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj10 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer6, strArray9);
        java.lang.Object obj11 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable12 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable3, strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable13 = org.mockito.ArgumentMatchers.refEq((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNull(charSequenceIterable1);
        org.junit.Assert.assertNotNull(charSequenceList2);
        org.junit.Assert.assertNull(charSequenceIterable3);
        org.junit.Assert.assertTrue("'" + objAnswer5 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer5.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(charSequenceIterable12);
        org.junit.Assert.assertNull(charSequenceIterable13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.ArgumentMatchers argumentMatchers1 = org.mockito.Mockito.verify((org.mockito.ArgumentMatchers) mockito0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Mockito and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("jdbc:h2:mem:test");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(0L);
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.ArgumentMatchers.same(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNull(verificationWithTimeout2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(verificationAfterDelay0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.ArgumentMatchers.same(objAnswer1);
        java.lang.String[] strArray5 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj6 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer2, strArray5);
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder8 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer1 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer1.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.Set<org.mockito.MockSettings> mockSettingsSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockSettingsSet0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '\000');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.spy((org.mockito.verification.VerificationMode) verificationAfterDelay1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after(1L);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        int int1 = org.mockito.ArgumentMatchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '#');
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.util.List<java.lang.String> strList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(strList0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.Mockito mockito1 = new org.mockito.Mockito();
        java.lang.String[] strArray6 = new java.lang.String[] { "false", "drop-and-create", "junit", "javax.persistence.jdbc.password" };
        org.mockito.Mockito mockito7 = org.mockito.ArgumentMatchers.refEq(mockito1, strArray6);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = org.mockito.ArgumentMatchers.refEq(objAnswer0, strArray6);
        org.mockito.verification.VerificationMode verificationMode10 = org.mockito.Mockito.description("junit");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable11 = org.mockito.Mockito.verify((java.lang.Cloneable) strArray6, verificationMode10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String[] and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(mockito7);
        org.junit.Assert.assertNull(objAnswer8);
        org.junit.Assert.assertNotNull(verificationMode10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.BaseStubber baseStubber1 = org.mockito.ArgumentMatchers.eq((org.mockito.stubbing.BaseStubber) lenientStubber0);
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNull(baseStubber1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray2);
        java.lang.Cloneable cloneable4 = org.mockito.ArgumentMatchers.eq((java.lang.Cloneable) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNull(cloneable4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("javax.persistence.schema-generation.database.action");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockitoFramework> strComparableSetMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(strComparableSetMap0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.Throwable[] throwableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doThrow(throwableArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable1 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer4 = org.mockito.ArgumentMatchers.same(objAnswer3);
        java.lang.String[] strArray7 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer4, strArray7);
        java.lang.Object obj9 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray7);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable10 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNull(charSequenceIterable1);
        org.junit.Assert.assertTrue("'" + objAnswer3 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer3.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(charSequenceIterable10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.Object obj0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.spy(verificationMode1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray1);
        org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doReturn((java.lang.Object) (byte) 1, objArray2);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(stubber3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails> serializableMap0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        java.lang.String[] strArray5 = new java.lang.String[] { "false", "drop-and-create", "junit", "javax.persistence.jdbc.password" };
        org.mockito.Mockito mockito6 = org.mockito.ArgumentMatchers.refEq(mockito0, strArray5);
        org.mockito.Mockito[] mockitoArray7 = new org.mockito.Mockito[] { mockito6 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(mockito6);
        org.junit.Assert.assertNotNull(mockitoArray7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("javax.persistence.schema-generation.database.action");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) 0);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.util.Map<org.mockito.Mockito, org.mockito.session.MockitoSessionBuilder> mockitoMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoMap0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("eclipselink.logging.logger");
        java.lang.Class<?> wildcardClass2 = verificationMode1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.reflect.Type> typeOngoingStubbing3 = org.mockito.Mockito.when((java.lang.reflect.Type) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass1 = lenientStubber0.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList2 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable3 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList2);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer5 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer6 = org.mockito.ArgumentMatchers.same(objAnswer5);
        java.lang.String[] strArray9 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj10 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer6, strArray9);
        java.lang.Object obj11 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable12 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable3, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(charSequenceList2);
        org.junit.Assert.assertNull(charSequenceIterable3);
        org.junit.Assert.assertTrue("'" + objAnswer5 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer5.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(charSequenceIterable12);
        org.junit.Assert.assertNull(annotatedElement13);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails> serializableMap0 = org.mockito.ArgumentMatchers.anyMap();
        java.util.Map[] mapArray2 = new java.util.Map[1];
        @SuppressWarnings("unchecked")
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails>[] serializableMapArray3 = (java.util.Map<java.io.Serializable, org.mockito.MockingDetails>[]) mapArray2;
        serializableMapArray3[0] = serializableMap0;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(serializableMapArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableMap0);
        org.junit.Assert.assertNotNull(mapArray2);
        org.junit.Assert.assertNotNull(serializableMapArray3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.util.Map<java.lang.Class<?>, org.mockito.verification.VerificationAfterDelay> wildcardClassMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(wildcardClassMap0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.Mockito mockito1 = new org.mockito.Mockito();
        java.lang.String[] strArray6 = new java.lang.String[] { "false", "drop-and-create", "junit", "javax.persistence.jdbc.password" };
        org.mockito.Mockito mockito7 = org.mockito.ArgumentMatchers.refEq(mockito1, strArray6);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer8 = org.mockito.ArgumentMatchers.refEq(objAnswer0, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber9 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(mockito7);
        org.junit.Assert.assertNull(objAnswer8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.util.Set<org.mockito.MockitoFramework> mockitoFrameworkSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockitoFrameworkSet0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) '\000', objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        double double1 = org.mockito.ArgumentMatchers.eq((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.util.AbstractList<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(charSequenceList0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.util.Set<java.util.ArrayList<java.lang.CharSequence>> charSequenceListSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(charSequenceListSet0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray1 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockitoSessionBuilderArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray1 = org.mockito.ArgumentMatchers.same(throwableArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doThrow(throwableArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNull(throwableArray1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable1 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
        java.util.List<java.lang.CharSequence> charSequenceList2 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable3 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList2);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer5 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer6 = org.mockito.ArgumentMatchers.same(objAnswer5);
        java.lang.String[] strArray9 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj10 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer6, strArray9);
        java.lang.Object obj11 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable12 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable3, strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable13 = org.mockito.ArgumentMatchers.refEq((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNull(charSequenceIterable1);
        org.junit.Assert.assertNotNull(charSequenceList2);
        org.junit.Assert.assertNull(charSequenceIterable3);
        org.junit.Assert.assertTrue("'" + objAnswer5 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer5.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(charSequenceIterable12);
        org.junit.Assert.assertNull(charSequenceIterable13);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList0 = org.mockito.ArgumentMatchers.anyList();
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) charSequenceListList0);
        org.junit.Assert.assertNotNull(charSequenceListList0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework1 = org.mockito.ArgumentMatchers.eq(mockitoFramework0);
        org.mockito.MockitoFramework mockitoFramework2 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework3 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework4 = org.mockito.ArgumentMatchers.eq(mockitoFramework3);
        org.mockito.MockitoFramework mockitoFramework5 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework6 = org.mockito.ArgumentMatchers.eq(mockitoFramework5);
        org.mockito.MockitoFramework mockitoFramework7 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework8 = org.mockito.ArgumentMatchers.eq(mockitoFramework7);
        org.mockito.MockitoFramework[] mockitoFrameworkArray9 = new org.mockito.MockitoFramework[] { mockitoFramework1, mockitoFramework2, mockitoFramework4, mockitoFramework5, mockitoFramework7 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoFrameworkArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoFramework0);
        org.junit.Assert.assertNull(mockitoFramework1);
        org.junit.Assert.assertNotNull(mockitoFramework2);
        org.junit.Assert.assertNotNull(mockitoFramework3);
        org.junit.Assert.assertNull(mockitoFramework4);
        org.junit.Assert.assertNotNull(mockitoFramework5);
        org.junit.Assert.assertNull(mockitoFramework6);
        org.junit.Assert.assertNotNull(mockitoFramework7);
        org.junit.Assert.assertNull(mockitoFramework8);
        org.junit.Assert.assertNotNull(mockitoFrameworkArray9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.util.AbstractList[] abstractListArray1 = new java.util.AbstractList[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.lang.CharSequence>[] charSequenceListArray2 = (java.util.AbstractList<java.lang.CharSequence>[]) abstractListArray1;
// flaky:         org.mockito.Mockito.clearInvocations((java.util.AbstractList<java.lang.CharSequence>[]) abstractListArray1);
        org.junit.Assert.assertNotNull(abstractListArray1);
        org.junit.Assert.assertNotNull(charSequenceListArray2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.String str1 = org.mockito.ArgumentMatchers.same("javax.persistence.schema-generation.database.action");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.same(objAnswer0);
        java.lang.String[] strArray4 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj5 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.Mockito.after((long) '\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence3 = org.mockito.Mockito.verify((java.lang.CharSequence) "eclipselink.cache.shared.default", (org.mockito.verification.VerificationMode) verificationAfterDelay2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay2);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.same(objAnswer0);
        java.lang.String[] strArray4 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj5 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.String");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.util.Set<org.mockito.verification.VerificationMode> verificationModeSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(verificationModeSet0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.ArgumentMatchers.same(objAnswer1);
        java.lang.String[] strArray5 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj6 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer2, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber7 = org.mockito.Mockito.doReturn((java.lang.Object) "eclipselink.logging.level.sql", (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer1 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer1.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs(objArray1);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable1 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0);
        java.util.List<java.lang.CharSequence> charSequenceList2 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable3 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList2);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer5 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer6 = org.mockito.ArgumentMatchers.same(objAnswer5);
        java.lang.String[] strArray9 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj10 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer6, strArray9);
        java.lang.Object obj11 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable12 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable3, strArray9);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable13 = org.mockito.ArgumentMatchers.refEq((java.lang.Iterable<java.lang.CharSequence>) charSequenceList0, strArray9);
        java.util.Set<org.mockito.verification.VerificationAfterDelay> verificationAfterDelaySet14 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Object[] objArray15 = new java.lang.Object[] { strArray9, verificationAfterDelaySet14 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNull(charSequenceIterable1);
        org.junit.Assert.assertNotNull(charSequenceList2);
        org.junit.Assert.assertNull(charSequenceIterable3);
        org.junit.Assert.assertTrue("'" + objAnswer5 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer5.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(charSequenceIterable12);
        org.junit.Assert.assertNull(charSequenceIterable13);
        org.junit.Assert.assertNotNull(verificationAfterDelaySet14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[[eclipselink.logging.level, javax.persistence.jdbc.password], []]");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anySet();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet1 = org.mockito.ArgumentMatchers.eq(strComparableSet0);
        org.junit.Assert.assertNotNull(strComparableSet0);
        org.junit.Assert.assertNull(strComparableSet1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.mockito.MockSettings mockSettings0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(mockSettings0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.mockito.internal.progress.MockingProgress mockingProgress0 = org.mockito.internal.progress.ThreadSafeMockingProgress.mockingProgress();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        org.mockito.internal.progress.MockingProgress mockingProgress9 = org.mockito.ArgumentMatchers.refEq(mockingProgress0, strArray6);
        org.mockito.internal.progress.MockingProgress mockingProgress10 = org.mockito.ArgumentMatchers.eq(mockingProgress9);
        org.junit.Assert.assertNotNull(mockingProgress0);
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(mockingProgress9);
        org.junit.Assert.assertNull(mockingProgress10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer29 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer30 = org.mockito.ArgumentMatchers.same(objAnswer29);
        java.lang.String[] strArray33 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj34 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer30, strArray33);
        java.util.List<java.lang.CharSequence> charSequenceList35 = org.mockito.ArgumentMatchers.refEq((java.util.List<java.lang.CharSequence>) charSequenceList12, strArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray33);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor33.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor33.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertTrue("'" + objAnswer29 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer29.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(charSequenceList35);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.util.RandomAccess randomAccess0 = null;
        java.util.RandomAccess randomAccess1 = org.mockito.ArgumentMatchers.same(randomAccess0);
        org.junit.Assert.assertNull(randomAccess1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (byte) 10);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        org.mockito.verification.VerificationMode verificationMode29 = org.mockito.Mockito.never();
        // The following exception was thrown during execution in test generation
        try {
            java.util.RandomAccess randomAccess30 = org.mockito.Mockito.verify((java.util.RandomAccess) charSequenceList12, verificationMode29);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ArrayList and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertNotNull(verificationMode29);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) ' ');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.util.Map<org.mockito.verification.VerificationMode, java.lang.reflect.AnnotatedElement> verificationModeMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationModeMap0);
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationModeMap0);
        org.junit.Assert.assertNotNull(verificationModeMap0);
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        java.lang.Comparable<java.lang.String> strComparable9 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder10 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "eclipselink.session.customizer");
        boolean boolean19 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "false");
        boolean boolean20 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "FINE");
        boolean boolean21 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.user");
        boolean boolean22 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "true");
        boolean boolean23 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "mypu");
        boolean boolean24 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "eclipselink.logging.parameters");
        boolean boolean25 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.password");
        boolean boolean27 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "mypu");
        boolean boolean28 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.user");
        boolean boolean29 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "eclipselink.logging.logger");
        boolean boolean30 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "eclipselink.cache.shared.default");
        boolean boolean31 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "mypu");
        boolean boolean32 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "junit");
        boolean boolean33 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.password");
        boolean boolean34 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.password");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet35 = org.mockito.ArgumentMatchers.same((java.util.Set<java.lang.Comparable<java.lang.String>>) strComparableSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(strComparableSet35);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.util.Map<org.mockito.verification.VerificationWithTimeout, java.util.HashSet<java.lang.Comparable<java.lang.String>>> verificationWithTimeoutMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(verificationWithTimeoutMap0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.lang.Cloneable[] cloneableArray0 = new java.lang.Cloneable[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(cloneableArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloneableArray0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(charSequenceCollection0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        long long1 = org.mockito.ArgumentMatchers.eq((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        java.lang.Class<?> wildcardClass1 = mockitoSessionBuilder0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) mockitoSessionBuilder0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor33.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.util.Map<java.lang.Iterable<java.lang.CharSequence>, org.mockito.verification.VerificationWithTimeout> charSequenceIterableMap0 = org.mockito.ArgumentMatchers.anyMap();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) charSequenceIterableMap0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceIterableMap0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        float float1 = org.mockito.ArgumentMatchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Class<?> wildcardClass1 = charSequenceList0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.mockito.Mockito.verify((java.lang.reflect.AnnotatedElement) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.util.AbstractList[] abstractListArray0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(abstractListArray0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        char char1 = org.mockito.ArgumentMatchers.eq('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber4 = org.mockito.Mockito.doReturn((java.lang.Object) objArray0, objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.lang.Iterable<org.mockito.MockingDetails> mockingDetailsIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(mockingDetailsIterable0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '#');
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray1 = org.mockito.ArgumentMatchers.same(throwableArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) throwableArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNull(throwableArray1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.util.List<org.mockito.stubbing.BaseStubber> baseStubberList0 = org.mockito.ArgumentMatchers.anyList();
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) baseStubberList0);
        org.junit.Assert.assertNotNull(baseStubberList0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.util.Set<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(charSequenceCollectionSet0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(mockitoSessionBuilder0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.Set<java.lang.Comparable<java.lang.String>>> strComparableSetOngoingStubbing1 = org.mockito.Mockito.when(strComparableSet0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("junit");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray2);
        java.lang.Cloneable cloneable4 = org.mockito.ArgumentMatchers.same((java.lang.Cloneable) objArray2);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNull(cloneable4);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) '\000');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("drop-and-create");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("eclipselink.logging.logger");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        java.util.Set<java.lang.Class<?>> wildcardClassSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(wildcardClassSet0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        org.mockito.internal.progress.MockingProgress mockingProgress0 = org.mockito.internal.progress.ThreadSafeMockingProgress.mockingProgress();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer2 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer3 = org.mockito.ArgumentMatchers.same(objAnswer2);
        java.lang.String[] strArray6 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj7 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer3, strArray6);
        java.lang.Object obj8 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray6);
        org.mockito.internal.progress.MockingProgress mockingProgress9 = org.mockito.ArgumentMatchers.refEq(mockingProgress0, strArray6);
        org.mockito.internal.progress.MockingProgress mockingProgress10 = org.mockito.ArgumentMatchers.eq(mockingProgress0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.progress.MockingProgress mockingProgress11 = org.mockito.Mockito.verify(mockingProgress10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingProgress0);
        org.junit.Assert.assertTrue("'" + objAnswer2 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer2.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(mockingProgress9);
        org.junit.Assert.assertNull(mockingProgress10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        long long1 = org.mockito.ArgumentMatchers.eq(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.lang.Throwable[] throwableArray0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(throwableArray0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        java.util.AbstractList<java.lang.CharSequence> charSequenceList29 = org.mockito.ArgumentMatchers.eq((java.util.AbstractList<java.lang.CharSequence>) charSequenceList12);
        java.util.ArrayList<java.lang.CharSequence> charSequenceList30 = org.mockito.ArgumentMatchers.eq(charSequenceList12);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertNull(charSequenceList29);
        org.junit.Assert.assertNull(charSequenceList30);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Mockito.spy((java.lang.Comparable<java.lang.String>) "javax.persistence.jdbc.user");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.String?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.verify(mockSettings0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type MockSettingsImpl and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("javax.persistence.jdbc.url");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("hi!");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs(objArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs(objArray2);
        org.mockito.MockingDetails mockingDetails5 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray4);
        java.lang.Object[] objArray6 = org.mockito.Mockito.ignoreStubs(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber7 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode1, objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(mockingDetails5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '\000');
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.Mockito.spy(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationAfterDelay2);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(0);
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        int int1 = org.mockito.ArgumentMatchers.eq((int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray2);
        java.lang.Cloneable cloneable4 = org.mockito.ArgumentMatchers.eq((java.lang.Cloneable) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNull(cloneable4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        org.mockito.stubbing.BaseStubber baseStubber0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(baseStubber0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        java.lang.String[] strArray0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray1);
        java.lang.Object[] objArray3 = org.mockito.ArgumentMatchers.eq(objArray1);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(objArray3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
        java.lang.Object[] objArray2 = org.mockito.Mockito.ignoreStubs(objArray0);
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray2);
        java.lang.Object[] objArray4 = org.mockito.ArgumentMatchers.same(objArray2);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNull(objArray4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.util.List<org.mockito.MockingDetails> mockingDetailsList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Class<?> wildcardClass1 = mockingDetailsList0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.ArgumentMatchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.reflect.Type type3 = org.mockito.ArgumentMatchers.eq((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(mockingDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(mockitoFramework0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(charSequenceIterable0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails> serializableMap0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        java.util.AbstractList<java.lang.CharSequence> charSequenceList29 = org.mockito.ArgumentMatchers.eq((java.util.AbstractList<java.lang.CharSequence>) charSequenceList12);
        org.mockito.verification.VerificationMode verificationMode31 = org.mockito.Mockito.atLeast(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<java.lang.CharSequence> charSequenceIterable32 = org.mockito.Mockito.verify((java.lang.Iterable<java.lang.CharSequence>) charSequenceList29, verificationMode31);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertNull(charSequenceList29);
        org.junit.Assert.assertNotNull(verificationMode31);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        java.util.List<java.lang.CharSequence> charSequenceList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Class<?> wildcardClass1 = charSequenceList0.getClass();
        java.lang.reflect.Type type2 = org.mockito.ArgumentMatchers.same((java.lang.reflect.Type) wildcardClass1);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.description("javax.persistence.jdbc.url");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = org.mockito.Mockito.verify(wildcardClass1, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(1L);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        java.util.List<org.mockito.MockingDetails> mockingDetailsList0 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Class<?> wildcardClass1 = mockingDetailsList0.getClass();
        java.lang.reflect.Type type2 = org.mockito.ArgumentMatchers.same((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.ArgumentMatchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.Class<?> wildcardClass4 = org.mockito.ArgumentMatchers.eq(wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement5 = org.mockito.Mockito.spy((java.lang.reflect.AnnotatedElement) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        java.lang.Cloneable cloneable0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(cloneable0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("javax.persistence.jdbc.user");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray1 = org.mockito.ArgumentMatchers.same(throwableArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doThrow(throwableArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNull(throwableArray1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        java.lang.String[] strArray5 = new java.lang.String[] { "false", "drop-and-create", "junit", "javax.persistence.jdbc.password" };
        org.mockito.Mockito mockito6 = org.mockito.ArgumentMatchers.refEq(mockito0, strArray5);
        org.mockito.Mockito mockito7 = new org.mockito.Mockito();
        org.mockito.Mockito mockito8 = new org.mockito.Mockito();
        org.mockito.ArgumentMatchers[] argumentMatchersArray9 = new org.mockito.ArgumentMatchers[] { mockito6, mockito7, mockito8 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(argumentMatchersArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(mockito6);
        org.junit.Assert.assertNotNull(argumentMatchersArray9);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer29 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer30 = org.mockito.ArgumentMatchers.same(objAnswer29);
        java.lang.String[] strArray33 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj34 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer30, strArray33);
        java.util.RandomAccess randomAccess35 = org.mockito.ArgumentMatchers.refEq((java.util.RandomAccess) charSequenceList12, strArray33);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection36 = org.mockito.ArgumentMatchers.eq((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        org.mockito.verification.VerificationMode verificationMode38 = org.mockito.Mockito.atMost(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = org.mockito.Mockito.verify(charSequenceList12, verificationMode38);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ArrayList and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertTrue("'" + objAnswer29 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer29.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(randomAccess35);
        org.junit.Assert.assertNull(charSequenceCollection36);
        org.junit.Assert.assertNotNull(verificationMode38);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer29 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer30 = org.mockito.ArgumentMatchers.same(objAnswer29);
        java.lang.String[] strArray33 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj34 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer30, strArray33);
        java.util.RandomAccess randomAccess35 = org.mockito.ArgumentMatchers.refEq((java.util.RandomAccess) charSequenceList12, strArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray33);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor33.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertTrue("'" + objAnswer29 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer29.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(randomAccess35);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.same(objAnswer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        java.util.Map<java.util.ArrayList<java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> charSequenceListMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(charSequenceListMap0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.same(objAnswer0);
        java.lang.String[] strArray4 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj5 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer1, strArray4);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = org.mockito.Mockito.ignoreStubs(objArray6);
        java.lang.Object[] objArray8 = org.mockito.Mockito.ignoreStubs(objArray6);
        org.mockito.MockingDetails mockingDetails9 = org.mockito.Mockito.mockingDetails((java.lang.Object) objArray8);
        java.lang.Object[] objArray10 = org.mockito.Mockito.ignoreStubs(objArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber11 = org.mockito.Mockito.doReturn(obj5, objArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(mockingDetails9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(typeCollection0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        java.util.Map<org.mockito.stubbing.BaseStubber, java.lang.Comparable<java.lang.String>> baseStubberMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(baseStubberMap0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        java.util.Set<org.mockito.verification.VerificationAfterDelay> verificationAfterDelaySet0 = org.mockito.ArgumentMatchers.anySet();
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationAfterDelaySet0);
        org.junit.Assert.assertNotNull(verificationAfterDelaySet0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        java.util.Map<java.io.Serializable, org.mockito.MockingDetails> serializableMap0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(serializableMap0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("drop-and-create");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("eclipselink.logging.logger");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) verificationMode0);
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.mockito.Mockito.spy((java.lang.CharSequence) "jdbc:h2:mem:test");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.String?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("FINE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.only();
        java.util.List<java.lang.CharSequence> charSequenceList1 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable2 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList1);
        java.util.List<java.lang.CharSequence> charSequenceList3 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable4 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList3);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer6 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer7 = org.mockito.ArgumentMatchers.same(objAnswer6);
        java.lang.String[] strArray10 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj11 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer7, strArray10);
        java.lang.Object obj12 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray10);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable13 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable4, strArray10);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable14 = org.mockito.ArgumentMatchers.refEq((java.lang.Iterable<java.lang.CharSequence>) charSequenceList1, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber15 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode0, (java.lang.Object[]) strArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(charSequenceList1);
        org.junit.Assert.assertNull(charSequenceIterable2);
        org.junit.Assert.assertNotNull(charSequenceList3);
        org.junit.Assert.assertNull(charSequenceIterable4);
        org.junit.Assert.assertTrue("'" + objAnswer6 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer6.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(charSequenceIterable13);
        org.junit.Assert.assertNull(charSequenceIterable14);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer29 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer30 = org.mockito.ArgumentMatchers.same(objAnswer29);
        java.lang.String[] strArray33 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj34 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer30, strArray33);
        java.util.List<java.lang.CharSequence> charSequenceList35 = org.mockito.ArgumentMatchers.refEq((java.util.List<java.lang.CharSequence>) charSequenceList12, strArray33);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer38 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer39 = org.mockito.ArgumentMatchers.same(objAnswer38);
        java.lang.String[] strArray42 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj43 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer39, strArray42);
        java.lang.Object obj44 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray42);
        java.lang.Comparable<java.lang.String> strComparable45 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber46 = org.mockito.Mockito.doReturn((java.lang.Object) charSequenceList35, (java.lang.Object[]) strArray42);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertTrue("'" + objAnswer29 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer29.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(charSequenceList35);
        org.junit.Assert.assertTrue("'" + objAnswer38 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer38.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(strComparable45);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test422");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("FINE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test423");
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "FINE", "eclipselink.cache.shared.default", "javax.persistence.jdbc.password", "FINE", "eclipselink.logging.logger", "drop-and-create", "eclipselink.logging.parameters", "org.eclipse.persistence.logging.slf4j.SLF4JLogger", "eclipselink.logging.level", "eclipselink.logging.level", "FINE", "true", "false" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.AbstractList<java.lang.CharSequence>> charSequenceListOngoingStubbing16 = org.mockito.Mockito.when((java.util.AbstractList<java.lang.CharSequence>) charSequenceList14);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test424");
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "false", "eclipselink.session.customizer", "hi!", "javax.persistence.jdbc.url", "eclipselink.logging.parameters", "eclipselink.logging.level.sql", "junit", "eclipselink.logging.level.sql", "javax.persistence.jdbc.url", "jdbc:h2:mem:test", "javax.persistence.jdbc.user" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        org.mockito.stubbing.LenientStubber lenientStubber14 = org.mockito.Mockito.lenient();
        java.lang.Class<?> wildcardClass15 = lenientStubber14.getClass();
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.mockito.ArgumentMatchers.anyList();
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable17 = org.mockito.ArgumentMatchers.same((java.lang.Iterable<java.lang.CharSequence>) charSequenceList16);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer19 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer20 = org.mockito.ArgumentMatchers.same(objAnswer19);
        java.lang.String[] strArray23 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj24 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer20, strArray23);
        java.lang.Object obj25 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) "true", strArray23);
        java.lang.Iterable<java.lang.CharSequence> charSequenceIterable26 = org.mockito.ArgumentMatchers.refEq(charSequenceIterable17, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray23);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection28 = org.mockito.ArgumentMatchers.refEq((java.util.Collection<java.lang.CharSequence>) charSequenceList12, strArray23);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer29 = org.mockito.Mockito.CALLS_REAL_METHODS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer30 = org.mockito.ArgumentMatchers.same(objAnswer29);
        java.lang.String[] strArray33 = new java.lang.String[] { "eclipselink.logging.level", "javax.persistence.jdbc.password" };
        java.lang.Object obj34 = org.mockito.ArgumentMatchers.refEq((java.lang.Object) objAnswer30, strArray33);
        java.util.List<java.lang.CharSequence> charSequenceList35 = org.mockito.ArgumentMatchers.refEq((java.util.List<java.lang.CharSequence>) charSequenceList12, strArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.RandomAccess> randomAccessOngoingStubbing36 = org.mockito.Mockito.when((java.util.RandomAccess) charSequenceList12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at jdk.internal.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)?-> at jdk.internal.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lenientStubber14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceList16);
        org.junit.Assert.assertNull(charSequenceIterable17);
        org.junit.Assert.assertTrue("'" + objAnswer19 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer19.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequenceIterable26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(charSequenceCollection28);
        org.junit.Assert.assertTrue("'" + objAnswer29 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer29.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNull(objAnswer30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(charSequenceList35);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test425");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray1 = org.mockito.ArgumentMatchers.same(throwableArray0);
        java.lang.Throwable[] throwableArray2 = org.mockito.ArgumentMatchers.same(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertNull(throwableArray1);
        org.junit.Assert.assertNull(throwableArray2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test426");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(verificationAfterDelay0);
    }
}
